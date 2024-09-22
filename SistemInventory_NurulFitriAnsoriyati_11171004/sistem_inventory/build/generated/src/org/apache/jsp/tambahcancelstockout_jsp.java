package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.Koneksi;

public final class tambahcancelstockout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Tambah Data Barang</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("     ");

         String kd_cancel=null;
         String sql="select max(right(kd_cancel,5)) FROM cancel_stock_out";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            kd_cancel="CL00001";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 5; a++) {
                 kode = "0" + kode;
             }
             kd_cancel="CL"+kode;
         }
            String nama=request.getParameter("nama");
            String item=request.getParameter("item");
            String kode=request.getParameter("kode");
            String kd_karyawan=request.getParameter("kd_karyawan");
            if(nama==null)
                nama="";
            String kategori = null;
            if(kd_karyawan==null)
                kategori="Pilih Karyawan";
            else{
                sql = "SELECT * FROM karyawan WHERE kd_karyawan='"
                        + kd_karyawan + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    nama = rs.getString(2);
            }
     
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("        function ambilitem(){\n");

    sql = "select * from barang";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("        var1 = document.getElementById(\"kb\").value;\n");
      out.write("        var2 = \"\";\n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("        if(var1===\"");
      out.print(rs.getString(1));
      out.write("\")\n");
      out.write("            var2=\"");
      out.print(rs.getString(2));
      out.write("\";\n");
      out.write("            \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        document.getElementById(\"itm\").value = var2;\n");
      out.write("        hitung();\n");
      out.write("    }\n");
      out.write("        function ambilnama(){\n");

    sql = "select * from barang";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("        var3 = document.getElementById(\"kb\").value;\n");
      out.write("        var4 = \"\";\n");
      out.write("\n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("        if(var3===\"");
      out.print(rs.getString(1));
      out.write("\")\n");
      out.write("             var4=\"");
      out.print(rs.getString(3));
      out.write("\";\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        document.getElementById(\"nm_brg\").value = var4;\n");
      out.write("        hitung();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <h2 class=\"alert alert-info text-center\"  >INPUT DATA CANCEL</h2>\n");
      out.write("          <a href=\"beranda.jsp?hal=tampilcancelstockout\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
      out.write("          <form method=\"POST\" action=\"cancelstockoutServlet\" class=\"form-horizontal\" role=\"form\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Kode Cancel</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <label>");
      out.print(kd_cancel);
      out.write("\n");
      out.write("                                  <input type=\"hidden\" class=\"form-control\" name=\"kd_cancel\"  value=\"");
      out.print(kd_cancel);
      out.write("\">\n");
      out.write("                            </label>\n");
      out.write("                         </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Deskripsi</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"deskripsi\" placeholder=\"Masukan Nomor Stock Out\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");

    sql = "select * from karyawan";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Di Kembalikan Oleh</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                           <select class=\"form-control\" name=\"kd_karyawan\">\n");
      out.write("                              <option value=\"");
      out.print(kd_karyawan);
      out.write("\">\n");
      out.write("                                  ");
      out.print(nama);
      out.write("\n");
      out.write("                              </option>\n");
      out.write("                              ");
 while(rs.next()){ 
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("                            </option>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                          </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");

    sql = "select * from barang";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Barang</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <select class=\"form-control\" name=\"kode\" id=\"kb\" required=\"\" onchange=\"ambilnama()&ambilitem()\">\n");
      out.write("                              <option value=\"\">Pilih Barang</option>\n");
      out.write("                              ");
 while(rs.next()){ 
      out.write("\n");
      out.write("                              <option value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                             ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("                                             ");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("                                             ");
      out.print(rs.getString(5));
      out.write("\n");
      out.write("                              </option>\n");
      out.write("                                            ");
 } 
      out.write("\n");
      out.write("                          </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\"  name=\"kode\" id=\"kb\" required=\"\" onchange=\"ambilnama()&ambilitem()\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Nama Barang</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" name=\"nama\" id=\"nm_brg\" readonly=\"readonly\" >\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\"  name=\"kode\" id=\"kb\" required=\"\" onchange=\"ambilnama()&ambilitem()\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Item</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" name=\"item\" id=\"item\" readonly=\"readonly\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                          \n");
      out.write("           <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Quantity</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" name=\"qty\" placeholder=\"0\">\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Tanggal</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"date\" class=\"form-control\" name=\"tgl\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("                  \n");
      out.write("                            <br/>\n");
      out.write("                 <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"hidden\" name=\"aksi\" value=\"Insert\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Simpan</button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
