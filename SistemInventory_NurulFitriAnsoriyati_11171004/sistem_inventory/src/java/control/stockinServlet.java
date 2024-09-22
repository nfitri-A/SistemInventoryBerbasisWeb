/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author fitri
 */
public class stockinServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
            String kode = request.getParameter("kode");
            String kd_brg_msk = request.getParameter("kd_brg_msk");
            String kd_pesan = request.getParameter("kd_pesan");
            String kd_supplier = request.getParameter("kd_supplier");
            String tgl = request.getParameter("tgl");
            String kd_brg = request.getParameter("kd_brg");
            String item = request.getParameter("item");
            String nm_brg = request.getParameter("nm_brg");
            String qty = request.getParameter("qty"); 
            String harga_beli = request.getParameter("harga_beli"); 
            String sub_total = request.getParameter("sub_total"); 
            String aksi = request.getParameter("aksi");
            String sql = null;
            String sql2 = null;
            switch(aksi){
                case "Delete":
                    sql="DELETE FROM stock_in_sementara WHERE kode='" 
                            + kode + "'";
                    break;
                case "Cancel":
                   sql="TRUNCATE TABLE stock_in_sementara";
                    break;
                case "Simpan":
                    sql="INSERT INTO stock_in VALUES('" 
                            + kd_brg_msk + "','" 
                            + kd_pesan + "','" 
                            + kd_supplier + "','" 
                            + tgl + ")";
                    break;
            }
            Koneksi kon = new Koneksi();
            Koneksi kon2 = new Koneksi();
            boolean eror = false;
            ResultSet rs;
            if(aksi.equals("Tambah")){
                sql2 = "select * from detail_pesan where kd_pesan='" 
                        + kd_pesan + "'";
                rs = kon.ambilData(sql2);
                while(rs.next()){
                    sql2 = "INSERT INTO stock_in_sementara VALUES('" 
                    + rs.getString(1) + "','"
                    + rs.getString(2) + "','"         
                    + rs.getString(3) + "','" 
                    + rs.getString(4) + "',"
                    + rs.getString(5) + ","
                    + rs.getString(6) + ","
                    + rs.getString(7) + ")";
                    try {
                        kon2.stmt.executeUpdate(sql2);
                    } catch (SQLException ex) {
                        eror = true;
                    }
                }
            } else
            if(!aksi.equals("Simpan")){
                try {
                    kon.stmt.executeUpdate(sql);
                } catch (SQLException ex) {
                    eror = true;
                }
            } else {
                sql2 = "SELECT * FROM stock_in_sementara";
                rs = kon.ambilData(sql2);
                while(rs.next()){
                    sql2 = "INSERT INTO detail_stock_in VALUES('" 
                    + rs.getString(1) + "','"
                    + rs.getString(2) + "','"         
                    + rs.getString(3) + "','" 
                    + rs.getString(4) + "'," 
                    + rs.getString(5) + "," 
                    + rs.getString(6) + "," 
                    + rs.getString(7) + ")";
                    kd_pesan = rs.getString(1);
                    sql="INSERT INTO stock_in VALUES('" 
                            + kd_brg_msk + "','" 
                            + kd_pesan + "','" 
                            + kd_supplier + "','" 
                            + tgl + "')";
                    try {
                        kon2.stmt.executeUpdate(sql2);
                    } catch (SQLException ex) {
                        eror = true;
                    }
                }
                if(!eror){
                    sql2="TRUNCATE TABLE stock_in_sementara";
                    try {
                        kon2.stmt.executeUpdate(sql2);
                        kon.stmt.executeUpdate(sql);
                    } catch (SQLException ex) {
                        eror = true;
                    }
                }
            }
            if(!eror)
            out.print("<script>"
                    + "alert('Data Berhasil di "+aksi+"');"
                    + "window.location='beranda.jsp?hal=tambahstockin';"
                    + "</script>");
            else
            out.print(sql+"<script>"
                    + "alert('Data Gagal di "+aksi+"');"
                    + "</script>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(stockinServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(stockinServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
