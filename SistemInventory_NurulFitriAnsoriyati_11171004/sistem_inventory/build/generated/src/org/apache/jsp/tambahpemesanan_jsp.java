package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.Koneksi;

public final class tambahpemesanan_jsp extends org.apache.jasper.runtime.HttpJspBase
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

            String kd_pesan=null;
            String sql="select max(right(kd_pesan,6)) FROM pemesanan_barang";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            kd_pesan="PS000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    kd_pesan ="PS"+ kode ;
            }
            String tgl=request.getParameter("tgl");
            String supp=request.getParameter("kd_supplier");
            if(tgl==null)
                tgl="";
            String nmsupp = null;
            if(supp==null)
                nmsupp="Pilih Supplier";
            else{
                sql = "SELECT * FROM supplier WHERE kd_supplier='"
                        + supp + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    nmsupp = rs.getString(2);
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
            String harga=request.getParameter("harga");
            String subtotal=request.getParameter("subtotal");
            String aksi=request.getParameter("aksi");
            sql = "INSERT INTO pesansementara VALUES('" 
                    + kd_pesan + "','" 
                    + kode + "','" 
                    + item + "','" 
                    + nama + "',"
                    + qty + ","
                    + harga + "," 
                    + subtotal + ")";
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
      out.write("  function hitung(){\n");
      out.write("        var1 = document.getElementById(\"qty\").value;\n");
      out.write("        var2 = document.getElementById(\"harga_beli\").value;\n");
      out.write("        var3 = parseInt(var1) * parseInt(var2);\n");
      out.write("        if(!isNaN(var3))\n");
      out.write("        document.getElementById(\"sub\").value = var3;\n");
      out.write("    }\n");
      out.write("    function gantiHarga(){\n");

    sql = "select * from barang";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("        var4 = document.getElementById(\"kb\").value;\n");
      out.write("        var5 = \"\";\n");
      out.write("\n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("        if(var4===\"");
      out.print(rs.getString(1));
      out.write("\")\n");
      out.write("             var5=\"");
      out.print(rs.getString(6));
      out.write("\";\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        document.getElementById(\"harga_beli\").value = var5;\n");
      out.write("        hitung();\n");
      out.write("    }\n");
      out.write("        function ambilitem(){\n");

    sql = "select * from barang";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("        var6 = document.getElementById(\"kb\").value;\n");
      out.write("        var7 = \"\";\n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("        if(var6===\"");
      out.print(rs.getString(1));
      out.write("\")\n");
      out.write("            var7=\"");
      out.print(rs.getString(2));
      out.write("\";\n");
      out.write("            \n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        document.getElementById(\"item\").value = var7;\n");
      out.write("        hitung();\n");
      out.write("    }\n");
      out.write("        function ambilnama(){\n");

    sql = "select * from barang";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("        var8 = document.getElementById(\"kb\").value;\n");
      out.write("        var9 = \"\";\n");
      out.write("\n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("        if(var8===\"");
      out.print(rs.getString(1));
      out.write("\")\n");
      out.write("             var9=\"");
      out.print(rs.getString(3));
      out.write("\";\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        document.getElementById(\"nama_barang\").value = var9;\n");
      out.write("        hitung();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<div class=\"container\">\n");
      out.write("          <h2 class=\"alert alert-info text-center\"  >INPUT DATA PEMESANAN</h2>\n");
      out.write("          <a href=\"beranda.jsp?hal=tampilpemesanan\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
      out.write("          <form method=\"POST\"  class=\"form-horizontal\" role=\"form\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Kode Pesan</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <label>");
      out.print(kd_pesan);
      out.write("\n");
      out.write("                                  <input type=\"hidden\" class=\"form-control\" name=\"kd_pesan\"  value=\"");
      out.print(kd_pesan);
      out.write("\">\n");
      out.write("                            </label>\n");
      out.write("                         </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");

    sql = "select * from supplier";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Supplier</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                          <select class=\"form-control\" name=\"kd_supplier\">\n");
      out.write("                              <option value=\"");
      out.print(supp);
      out.write("\">\n");
      out.write("                                  ");
      out.print(nmsupp);
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
      out.write("                          <select class=\"form-control\" name=\"kode\" id=\"kb\" required=\"\" onchange=\"gantiHarga()&ambilnama()&ambilitem()\">\n");
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
      out.write("                           <input type=\"hidden\" name=\"item\" id=\"item\" readonly=\"readonly\" >\n");
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
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-2 control-label\">Quantity</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"0\" required=\"\" name=\"qty\" id=\"qty\" onchange=\"hitung()\">\n");
      out.write("                            <input type=\"hidden\"  name=\"nama\" id=\"nama_barang\" readonly=\"readonly\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
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
      out.write("                        <label  class=\"col-sm-2 control-label\">Harga Beli</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Harga Barang\" required=\"\" name=\"harga\" id=\"harga_beli\" readonly=\"readonly\">\n");
      out.write("                            \n");
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
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label  class=\"col-sm-2 control-label\">Total</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Subtotal\" required=\"\" name=\"subtotal\" id=\"sub\" readonly=\"1\"> \n");
      out.write("                    </div>\n");
      out.write("                </div>              \n");
      out.write("            </div>\n");
      out.write("                  \n");
      out.write("         </form></br>\n");
      out.write("<div class=\"row\">\n");

    sql = "select * from pesansementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from pesansementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"product-status-wrap\">\n");
      out.write("        <h4>Data Barang Untuk Dipesan</h4>\n");
      out.write("            <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th data-field=\"Nomer\">Nomor</th>\n");
      out.write("                        <th data-field=\"Kode Barang\">Kode Barang</th>\n");
      out.write("                        <th data-field=\"Item \">Item</th>\n");
      out.write("                        <th data-field=\"Nama Barang\">Nama Barang</th>\n");
      out.write("                        <th data-field=\"Quantity\">Quantity</th>\n");
      out.write("                         <th data-field=\"Harga\">Harga</th>\n");
      out.write("                        <th data-field=\"Subtotal\">Subtotal</th>\n");
      out.write("                        <th data-field=\"Action\">Action</th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");

                        if(!rs.next()){
                    
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"8\">Data Kosong</td>\n");
      out.write("                                </tr>\n");
      out.write("                    ");

                        }
                        rs.beforeFirst();
                        while(rs.next()){
                        total = total + rs.getInt(7);
                    
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
      out.write("                        <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                        <a href=\"pemesananServlet?kode=");
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
      out.write("    <form method=\"POST\" action=\"pemesananServlet\">\n");
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
      out.write("                            <div class=\"text-center mg-b-pro-edt custom-pro-edt-ds\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">  \n");
      out.write("                                <label> Setelah Pemesanan Ubah Status Jadi Proses</label>\n");
      out.write("                            </div>\n");
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
      out.write("                           <div class=\"form-group data-custon-pick\">\n");
      out.write("                                <div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-6\">\n");
      out.write("                                    <label class=\"login2 pull-right pull-right-pro\">Jumlah Barang</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-group mg-b-pro-edt\" class=\"col-lg-4 col-md-4 col-sm-4 col-xs-6\">     \n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-tag\" aria-hidden=\"true\"></i></span>");
      out.print(jum);
      out.write("\n");
      out.write("                                    <input type=\"hidden\"  name=\"\" value=\"");
      out.print(jum);
      out.write("\" readonly=\"1\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group data-custon-pick\">\n");
      out.write("                                <div class=\"col-lg-2 col-md-2 col-sm-2 col-xs-6\">\n");
      out.write("                                    <label class=\"login2 pull-right pull-right-pro\">Total Harga</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"input-group mg-b-pro-edt\" class=\"col-lg-4 col-md-4 col-sm-4 col-xs-6\">     \n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"fa fa-usd\" aria-hidden=\"true\"></i></span>Rp. ");
      out.print(total);
      out.write("\n");
      out.write("                                    <input type=\"hidden\" id=\"t_harga\" name=\"total_bayar\" required=\"\" value=\"");
      out.print(total);
      out.write("\" readonly=\"1\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"kd_pesan\"\n");
      out.write("                                       value=\"");
      out.print(kd_pesan);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"tgl\"\n");
      out.write("                                           value=\"");
      out.print(tgl);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"kd_supplier\"\n");
      out.write("                                           value=\"");
      out.print(supp);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"no_user\"\n");
      out.write("                                           value=\"");
      out.print(no_user);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"status\" value=\"Open\">\n");
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
