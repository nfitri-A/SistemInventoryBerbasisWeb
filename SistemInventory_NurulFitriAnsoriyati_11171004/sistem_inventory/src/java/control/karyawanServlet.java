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
public class karyawanServlet extends HttpServlet {

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
            String kd_karyawan = request.getParameter("kd_karyawan");
            String nama = request.getParameter("nama");
            String jk = request.getParameter("jk");
            String alamat = request.getParameter("alamat");
            String no_tlp = request.getParameter("no_tlp");
            String divisi = request.getParameter("divisi");
            String aksi = request.getParameter("aksi");
            String sql = null;
            switch(aksi){
                case "Insert":
                    sql="Insert Into karyawan values('"+
                            kd_karyawan+"','"+
                            nama+"','"+
                            jk+"','"+
                            alamat+"','"+
                            no_tlp+"','"+
                            divisi+"')";
                    
                    break;
                case "Update":
                    sql="Update karyawan Set "+
                            "nama='"+nama+"',"+
                            "jk='"+jk+"',"+
                            "alamat='"+alamat+"',"+
                            "no_tlp='"+no_tlp+"',"+
                            "divisi='"+divisi+"' Where "+
                            "kd_karyawan='"+kd_karyawan+"'";
                    break;
                case "Delete":
                   sql="Delete from karyawan where "+
                            "kd_karyawan='"+kd_karyawan+"'";
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
                    + "window.location='beranda.jsp?hal=tampilkaryawan';"
                    + "</script>");
            else
            out.print("<script>"
                    + "alert('Data Gagal di "+aksi+"');"
                    + "window.location='beranda.jsp?hal=tampilkaryawan';"
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
            Logger.getLogger(karyawanServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(karyawanServlet.class.getName()).log(Level.SEVERE, null, ex);
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
