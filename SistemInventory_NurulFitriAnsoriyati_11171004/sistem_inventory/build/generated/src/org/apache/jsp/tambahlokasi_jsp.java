package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.Koneksi;

public final class tambahlokasi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Tambah Data Lokasi</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("     ");

         String no_lokasi=null;
         String sql="select max(right(no_lokasi,4)) FROM lokasi";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            no_lokasi="1";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 4; a++) {
                 kode = "0" + kode;
             }
             no_lokasi=""+kode;
         }
            
     
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <h2 class=\"alert alert-danger text-center\"  >INPUT DATA LOKASI</h2>\n");
      out.write("          <a href=\"beranda.jsp?hal=tampillokasi\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
      out.write("          <form method=\"POST\" action=\"lokasiServlet\" class=\"form-horizontal\" role=\"form\" >\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label  class=\"col-sm-2 control-label\">Nomor</label>\n");
      out.write("              <div class=\"col-sm-10\">\n");
      out.write("                  <label>");
      out.print(no_lokasi);
      out.write("\n");
      out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"no_lokasi\"  value=\"");
      out.print(no_lokasi);
      out.write("\">\n");
      out.write("                  </label>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <label  class=\"col-sm-2 control-label\">Nama Rak</label>\n");
      out.write("              <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"nm_rak\" placeholder=\"Masukan Nama Rak \">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("              <div class=\"form-group\">\n");
      out.write("              <label  class=\"col-sm-2 control-label\">Kode Rak</label>\n");
      out.write("              <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"kd_rak\" placeholder=\"Masukan Kode Rak\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("              \n");
      out.write("            <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"hidden\" name=\"aksi\" value=\"Insert\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Simpan</button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("      </div>\n");
      out.write("\n");
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
