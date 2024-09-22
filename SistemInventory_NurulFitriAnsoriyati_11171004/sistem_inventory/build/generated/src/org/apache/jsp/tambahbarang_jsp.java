package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.Koneksi;

public final class tambahbarang_jsp extends org.apache.jasper.runtime.HttpJspBase
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

         String kd_brg=null;
         String sql="select max(right(kd_brg,5)) FROM barang";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            kd_brg="BR00001";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 5; a++) {
                 kode = "0" + kode;
             }
             kd_brg="BR"+kode;
         }
            String type=request.getParameter("type");
            String no_kategori=request.getParameter("no_kategori");
            if(type==null)
                type="";
            String kategori = null;
            if(no_kategori==null)
                kategori="Pilih kategori";
            else{
                sql = "SELECT * FROM kategori WHERE no_kategori='"
                        + no_kategori + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kategori = rs.getString(2);
            }
        
            String nm_rak=request.getParameter("nm_rak");
            String no_lokasi=request.getParameter("no_lokasi");
            if(nm_rak==null)
                nm_rak="";
            String kd_rak = null;
            if(no_lokasi==null)
                kd_rak="Pilih lokasi";
            else{
                sql = "SELECT * FROM lokasi WHERE no_lokasi='"
                        + no_lokasi + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kd_rak = rs.getString(3);
            } 
     
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <h2 class=\"alert alert-info text-center\"  >INPUT DATA BARANG</h2>\n");
      out.write("          <a href=\"beranda.jsp?hal=tampilbarang\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
      out.write("          <form method=\"POST\" action=\"barangServlet\" class=\"form-horizontal\" role=\"form\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">KODE</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <label>");
      out.print(kd_brg);
      out.write("\n");
      out.write("                                  <input type=\"hidden\" class=\"form-control\" name=\"kd_brg\"  value=\"");
      out.print(kd_brg);
      out.write("\">\n");
      out.write("                            </label>\n");
      out.write("                         </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Item</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"item\" placeholder=\"Masukan Item\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Deskripsi</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"nm_brg\" placeholder=\"Masukan Nama Barang\">\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Satuan</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" name=\"satuan\" placeholder=\"Masukan Satuan\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Stok</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"qty\" placeholder=\"0\">\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Harga Beli</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"text\" class=\"form-control\" name=\"harga_beli\" placeholder=\"Masukan harga beli\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>   \n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Harga Jual</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"harga_jual\" placeholder=\"Masukan harga jual\">\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");

    sql = "select * from kategori";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Kategori</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <select class=\"form-control\" name=\"no_kategori\">\n");
      out.write("                              <option value=\"");
      out.print(no_kategori);
      out.write("\">\n");
      out.write("                                  ");
      out.print(kategori);
      out.write("\n");
      out.write("                              </option>\n");
      out.write("                              ");
 while(rs.next()){ 
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString(2));
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
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");

    sql = "select * from lokasi";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Lokasi</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <select class=\"form-control\" name=\"no_lokasi\">\n");
      out.write("                              <option value=\"");
      out.print(no_lokasi);
      out.write("\">\n");
      out.write("                                  ");
      out.print(kd_rak);
      out.write("\n");
      out.write("                              </option>\n");
      out.write("                              ");
 while(rs.next()){ 
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString(3));
      out.write("\">\n");
      out.write("                                ");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("                            </option>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                          </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>              \n");
      out.write("            </div>\n");
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
