/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
public class kategoriServlet extends HttpServlet {

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
            String no_kategori = request.getParameter("no_kategori");
            String kategori = request.getParameter("kategori");
            String type = request.getParameter("type");
            String aksi = request.getParameter("aksi");
            String sql = null;
            switch(aksi){
                case "Insert":
                    sql="Insert Into kategori values("+
                            no_kategori+",'"+
                            kategori+"','"+
                            type+"')";
                    
                    break;
                case "Update":
                        sql="Update kategori Set "+
                                "kategori='"+kategori+"',"+
                                "type='"+type+"' Where "+
                                "no_kategori='"+no_kategori+"'";
                    break;
                case "Delete":
                   sql="Delete from kategori where "+
                            "no_kategori='"+no_kategori+"'";
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
                    + "window.location='beranda.jsp?hal=tampilkategori';"
                    + "</script>");
            else
            out.print("<script>"
                    + "alert('Data Gagal di "+aksi+"');"
                    + "window.location='beranda.jsp?hal=tampilkategori';"
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
            Logger.getLogger(kategoriServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(kategoriServlet.class.getName()).log(Level.SEVERE, null, ex);
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
