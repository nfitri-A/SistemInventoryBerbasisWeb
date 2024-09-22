package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.Koneksi;

public final class tambahstockout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>tambah pemesanan</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");

            String nomor=null;
            String sql="select max(right(kd_brg_klr,6)) FROM stock_out";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            nomor="BK000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    nomor ="BK"+ kode ;
            }
            String tgl=request.getParameter("tgl");
            String kd_karyawan=request.getParameter("kd_karyawan");
            if(tgl==null)
                tgl="";
            String nma = null;
            if(kd_karyawan==null)
                nma="Pilih Karyawan";
            else{
                sql = "SELECT * FROM karyawan WHERE kd_karyawan='"
                        + kd_karyawan + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    nma = rs.getString(2);
            }
      
            String no_user=request.getParameter("no_user");
            String username = null;
            if(no_user==null)
                username="Pilih Petugas";
            else{
                sql = "SELECT * FROM user WHERE no_user='"
                        + no_user + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    username = rs.getString(2);
            }
            String kode=request.getParameter("kode");
            String item=request.getParameter("item");
            String nama=request.getParameter("nama");
            String qty=request.getParameter("qty");
            String subtotal=request.getParameter("subtotal");
            String aksi=request.getParameter("aksi");
            sql = "INSERT INTO stock_out_sementara VALUES('" 
                    + nomor + "','" 
                    + kode + "','" 
                    + item + "','" 
                    + nama + "',"
                    + qty + ")";
            int eror=0;
            if(aksi!=null)
                if(aksi.equals("Tambah"))
                eror = kon.stmt.executeUpdate(sql);
            if(eror>0)
            out.print("<script>"
                    + "alert('Data Berhasil di "+aksi+"');"
                    
                    + "</script>");

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
      out.write("<div class=\"container\">\n");
      out.write("          <h2 class=\"alert alert-info text-center\"  >INPUT STOCK OUT</h2>\n");
      out.write("          <a href=\"beranda.jsp?hal=tampilstockout\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
      out.write("          <form method=\"POST\"  class=\"form-horizontal\" role=\"form\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Kode Stock Out</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <label>");
      out.print(nomor);
      out.write("\n");
      out.write("                                  <input type=\"hidden\" class=\"form-control\" name=\"nomor\"  value=\"");
      out.print(nomor);
      out.write("\">\n");
      out.write("                            </label>\n");
      out.write("                         </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");

    sql = "select * from karyawan";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Di keluarkan oleh</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <select class=\"form-control\" name=\"kd_karyawan\">\n");
      out.write("                              <option value=\"");
      out.print(kd_karyawan);
      out.write("\">\n");
      out.write("                                  ");
      out.print(nma);
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
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");

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
      out.write("                           <input type=\"hidden\" name=\"nama\" id=\"nm_brg\" readonly=\"readonly\" >\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Tanggal</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <input type=\"date\" class=\"form-control\" name=\"tgl\" value=\"");
      out.print(tgl);
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                     \n");
      out.write("                </div>\n");

    sql = "select * from user";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Petugas</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <select class=\"form-control\" name=\"no_user\">\n");
      out.write("                              <option value=\"");
      out.print(no_user);
      out.write("\">\n");
      out.write("                                  ");
      out.print(username);
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
      out.write("                </div>  \n");
      out.write("            </div>   \n");
      out.write("                            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Quantity</label>\n");
      out.write("                        <div class=\"col-sm-10\"class=\"form-control\" name=\"kode\" id=\"kb\" required=\"\" onchange=\"ambilitem()\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"0\" required=\"\" name=\"qty\" id=\"qty\">\n");
      out.write("                            <input type=\"hidden\" name=\"item\" id=\"itm\" readonly=\"readonly\" >\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <input type=\"hidden\" name=\"aksi\" value=\"Tambah\">\n");
      out.write("                     <button type=\"submit\" class=\"btn btn-success\">Tambah</button>\n");
      out.write("                </div>  \n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("           \n");
      out.write("                  \n");
      out.write("         </form></br>\n");
      out.write("<div class=\"row\">\n");

    sql = "select * from stock_out_sementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from stock_out_sementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"product-status-wrap\">\n");
      out.write("        <h4>Data Barang Out</h4>\n");
      out.write("            <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th data-field=\"Nomer\">Nomor</th>\n");
      out.write("                        <th data-field=\"Kode Barang\">Kode Barang</th>\n");
      out.write("                        <th data-field=\"Item \">Item</th>\n");
      out.write("                        <th data-field=\"Nama Barang\">Nama Barang</th>\n");
      out.write("                        <th data-field=\"Quantity\">Quantity</th>\n");
      out.write("                        <th data-field=\"Action\">Action</th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        if(!rs.next()){
                    
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"6\">Data Kosong</td>\n");
      out.write("                                </tr>\n");
      out.write("                    ");

                        }
                        rs.beforeFirst();
                        while(rs.next()){
                     
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                        <a href=\"stockoutServlet?kode=");
      out.print(rs.getString(2));
      out.write("&aksi=Delete\" ><button data-toggle=\"tooltip\" title=\"Delete\" class=\"pd-setting-ed\">\n");
      out.write("                        <i class=\"fa fa-trash-o\" aria-hidden=\"true\"></i></button></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("            \n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    <form method=\"POST\" action=\"stockoutServlet\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"review-content-section\">\n");
      out.write("                       <div class=\"form-group data-custon-pick\" id=\"data_1\">\n");
      out.write("                            <div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-6\">\n");
      out.write("                                <label> &nbsp; &nbsp; </label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group mg-b-pro-edt\" class=\"col-lg-4 col-md-4 col-sm-4 col-xs-6\">     \n");
      out.write("                                    &nbsp; &nbsp;\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group data-custon-pick\">\n");
      out.write("                            <div class=\"text-center mg-b-pro-edt custom-pro-edt-ds\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">     \n");
      out.write("                                <button type=\"Submit\"  name=\"aksi\" value=\"Simpan\" class=\"btn btn-primary waves-effect waves-light m-r-10\">Simpan</button>\n");
      out.write("                                <button type=\"Submit\" name=\"aksi\" value=\"Cancel\" class=\"btn btn-warning waves-effect waves-light\">Batal</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"review-content-section\">\n");
      out.write("                       <div class=\"form-group data-custon-pick\">\n");
      out.write("                            <div class=\"form-group data-custon-pick\">\n");
      out.write("                                <div class=\"input-group mg-b-pro-edt\" class=\"col-lg-4 col-md-4 col-sm-4 col-xs-6\">     \n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-usd\" aria-hidden=\"true\"></i></span>\n");
      out.write("                                   \n");
      out.write("                                    <input type=\"hidden\" name=\"kd_brg_klr\"\n");
      out.write("                                       value=\"");
      out.print(nomor);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"tgl\"\n");
      out.write("                                           value=\"");
      out.print(tgl);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"kd_karyawan\"\n");
      out.write("                                           value=\"");
      out.print(kd_karyawan);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"no_user\"\n");
      out.write("                                           value=\"");
      out.print(no_user);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"qty\"\n");
      out.write("                                           value=\"");
      out.print(qty);
      out.write("\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                       </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>              \n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
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
