package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import control.Koneksi;

public final class editkaryawan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Edit Supplier</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>        \n");

    Koneksi kon = new Koneksi();
    String kd_karyawan=request.getParameter("kd_karyawan");
    String nama=null;
    String jk=null;
    String alamat=null;
    String no_tlp=null;
    String divisi=null;
    String sql = "SELECT* FROM karyawan WHERE kd_karyawan='" 
            +kd_karyawan+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_karyawan=rs.getString(1);
                nama=rs.getString(2);
                jk=rs.getString(3);
                alamat=rs.getString(4);
                no_tlp=rs.getString(5);
                divisi=rs.getString(6);
            }

      out.write("\n");
      out.write("        \n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2 class=\"alert alert-info text-center\" >EDIT DATA Karyawan</h2>\n");
      out.write("        <a href=\"tampilkaryawan.jsp\">Lihat Data </a><br/><br/>\n");
      out.write("        <form method=\"POST\" action=\"karyawanServlet\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label  class=\"col-sm-2 control-label\">Kode Karyawan</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                  <label>");
      out.print(kd_karyawan);
      out.write("\n");
      out.write("                    <input type=\"hidden\" class=\"form-control\" name=\"kd_karyawan\" value=\"");
      out.print(kd_karyawan);
      out.write("\">\n");
      out.write("                  </label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label  class=\"col-sm-2 control-label\">Nama</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"nama\"  value=\"");
      out.print(nama);
      out.write("\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label  class=\"col-sm-2 control-label\">Gender</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    ");
 if (jk.equalsIgnoreCase("Perempuan")) { 
      out.write("\n");
      out.write("                        <select name=\"jk\" class=\"form-control\">\n");
      out.write("                            <option value=\"Perempuan\" selected>Perempuan</option>\n");
      out.write("                            <option value=\"Laki-laki\">Laki-laki</option>\n");
      out.write("                        </select>\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                        <select name=\"jk\" class=\"form-control\">\n");
      out.write("                            <option value=\"Perempuan\">Perempuan</option>\n");
      out.write("                            <option value=\"Laki-laki\" selected>Laki-laki</option>\n");
      out.write("                         </select>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label  class=\"col-sm-2 control-label\">Alamat</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <textarea type=\"text\" class=\"form-control\" name=\"alamat\" row=5 > ");
      out.print(alamat);
      out.write("</textarea>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("              \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label  class=\"col-sm-2 control-label\">Telpon</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"no_tlp\"  value=\"");
      out.print(no_tlp);
      out.write("\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label  class=\"col-sm-2 control-label\">Divisi</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"divisi\"  value=\"");
      out.print(divisi);
      out.write("\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("            <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
      out.write("                    </td>\n");
      out.write("            </tr>\n");
      out.write("        </form>\n");
      out.write("</div>\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
