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
public class pemesananServlet extends HttpServlet {

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
            String kd_pesan = request.getParameter("kd_pesan");
            String kd_supplier = request.getParameter("kd_supplier");
            String status = request.getParameter("status");
            String tgl = request.getParameter("tgl"); 
            String no_user = request.getParameter("no_user"); 
            String aksi = request.getParameter("aksi");
            String sql = null;
            String sql2 = null;
            switch(aksi){
                
                case "Delete":
                    sql="DELETE FROM pesansementara WHERE kode='" 
                            + kode + "'";
                    break;
                case "Cancel":
                   sql="TRUNCATE TABLE pesansementara";
                    break;
                case "Update":
                    sql="Update pemesanan_barang Set "+
                            "kd_supplier='"+kd_supplier+"',"+
                            "status='"+status+"',"+
                            "tgl='"+tgl+"',"+
                            "no_user='"+no_user+"' Where "+
                            "kd_pesan='"+kd_pesan+"'";
                    break;
                case "Simpan":
                    sql="INSERT INTO pemesanan_barang VALUES('" 
                            + kd_pesan + "','" 
                            + kd_supplier + "','" 
                            + status + "','"
                            + tgl + "','" 
                            + no_user + "')";
                    break;
            }
            Koneksi kon = new Koneksi();
            Koneksi kon2 = new Koneksi();
            boolean eror = false;
            if(!aksi.equals("Simpan")){
                try {
                    kon.stmt.executeUpdate(sql);
                } catch (SQLException ex) {
                    eror = true;
                }
            } else {
                sql2 = "SELECT * FROM pesansementara";
                ResultSet rs = kon.ambilData(sql2);
                while(rs.next()){
                    sql2 = "INSERT INTO detail_pesan VALUES('" 
                    + rs.getString(1) + "','" 
                    + rs.getString(2) + "','" 
                    + rs.getString(3) + "','"
                    + rs.getString(4) + "','"        
                    + rs.getString(5) + "',"        
                    + rs.getString(6) + ","        
                    + rs.getString(7) + ")";
                    try {
                        kon2.stmt.executeUpdate(sql2);
                    } catch (SQLException ex) {
                        eror = true;
                    }
                }
                if(!eror){
                    sql2="TRUNCATE TABLE pesansementara";
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
                    + "window.location='beranda.jsp?hal=tampilpemesanan';"
                    + "</script>");
            else
            out.print(sql+"<script>"
                    + "alert('Data Gagal di "+aksi+"');"
                    + "window.location='beranda.jsp?hal=tambahpemesanan';"
                    + "</script>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pemesananServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pemesananServlet.class.getName()).log(Level.SEVERE, null, ex);
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
