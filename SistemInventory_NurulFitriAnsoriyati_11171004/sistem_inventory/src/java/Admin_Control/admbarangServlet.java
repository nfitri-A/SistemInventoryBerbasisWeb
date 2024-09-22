/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_Control;

import control.Koneksi;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fitri.A
 */
public class admbarangServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String kd_brg = request.getParameter("kd_brg");
            String item = request.getParameter("item");
            String nm_brg = request.getParameter("nm_brg");
            String satuan = request.getParameter("satuan");
            String qty = request.getParameter("qty");
            String harga_beli = request.getParameter("harga_beli");
            String no_kategori = request.getParameter("no_kategori");
            String no_lokasi = request.getParameter("no_lokasi");
            String harga_jual = request.getParameter("harga_jual");
            String aksi = request.getParameter("aksi");
            String sql = null;
            switch(aksi){
                
                    
                    
                case "Update":
                    sql="Update barang Set "+
                            "item='"+item+"',"+
                            "nm_brg='"+nm_brg+"',"+
                            "satuan='"+satuan+"',"+
                            "qty="+qty+","+
                            "harga_beli="+harga_beli+","+
                            "no_kategori='"+no_kategori+"',"+
                            "no_lokasi='"+no_lokasi+"',"+
                            "harga_jual="+harga_jual+" Where "+
                            "kd_brg='"+kd_brg+"'";
                    break;
                 
            }
            Koneksi kon = new Koneksi();
            boolean eror = false;
            try {
                kon.stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                eror = true;
            }
            if(!eror)
            out.print("<script>"
                    + "alert('Data Berhasil di "+aksi+"');"
                    + "window.location='Admin_Gudang/beranda.jsp?hal=tampilbarang';"
                    + "</script>");
            else
            out.print("<script>"
                    + "alert('Data Gagal di "+aksi+"');"
                    + "window.location='Admin_Gudang/beranda.jsp?hal=tampilbarang';"
                    + "</script>");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admbarangServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admbarangServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
