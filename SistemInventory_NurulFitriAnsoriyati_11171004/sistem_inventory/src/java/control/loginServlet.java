/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Vici Ramadhan
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        if (proses.equals("logout")){
            HttpSession sesi=request.getSession();
            sesi.invalidate();
            response.sendRedirect("login.jsp");
        }
 
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String proses = request.getParameter("proses");
         
         
        if (proses.equals("login")) {

            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            String hak_akses=request.getParameter("hak_akses");
            String no_user=request.getParameter("no_user");
            if (pass == null || pass.equals("")) {   //validasi apabila field belum diisi
                response.sendRedirect("login.jsp");
            } else {
                User pm = new User();
                List<User> datalogin = new ArrayList<User>();
                datalogin = pm.LoginUser(user, pass);
                if (datalogin.isEmpty()) { //validasi apabila username dan password salah
                    
                    response.sendRedirect("salahpassword.jsp");
                    
                    
                } else {
                    HttpSession session = request.getSession(true);
                    session.setAttribute("username", datalogin.get(0).getUsername());
                    session.setAttribute("hak_akses", datalogin.get(0).getHak_akses());
                    
                    if (datalogin.get(0).getHak_akses().equals("Kepala Gudang")) {
                        response.sendRedirect("beranda.jsp");
                        
                    }
                    else if (datalogin.get(0).getHak_akses().equals("Admin Gudang")){
                        response.sendRedirect("Admin_Gudang/beranda.jsp");
                        
                    }
                   
                    else {
                   System.out.println("NOT"); // Bila Hak Akses Kosong Atau Tak Sesuai
                   response.sendRedirect("login.jsp");
                    }                  
                }
            }
        }
              
    }
 
}
