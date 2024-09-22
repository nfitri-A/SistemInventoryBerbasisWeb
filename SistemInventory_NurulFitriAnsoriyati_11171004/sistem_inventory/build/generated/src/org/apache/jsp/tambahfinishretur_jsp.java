package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import control.Koneksi;

public final class tambahfinishretur_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tambah Finish Retur</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");

            String kd_finish_retur=null;
            String sql="select max(right(kd_finish_retur,6)) FROM finish_retur";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            kd_finish_retur="FR000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    kd_finish_retur ="FR"+ kode ;
            }
           String tgl=request.getParameter("tgl");
            if(tgl==null)
                tgl="";
            String kd_retur=request.getParameter("kd_retur");
            if(kd_retur==null)
                kd_retur="";
            String kd_supplier=request.getParameter("kd_supplier");
            if(kd_supplier==null)
                kd_supplier="";
           

      out.write("\n");
      out.write("<script>\n");
      out.write("function ambilsup(){\n");

    sql = "select * from retur_barang";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("        var10 = document.getElementById(\"kr\").value;\n");
      out.write("        var11 = \"\";\n");
      out.write("        ");
 while(rs.next()){ 
      out.write("\n");
      out.write("        if(var10===\"");
      out.print(rs.getString(1));
      out.write("\")\n");
      out.write("            var11=\"");
      out.print(rs.getString(2));
      out.write("\";\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        document.getElementById(\"supplier\").value = var11;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("  \n");
      out.write("</script>\n");
      out.write("<div class=\"container\">\n");
      out.write("          <h2 class=\"alert alert-info text-center\"  >INPUT DATA FINISH RETUR</h2>\n");
      out.write("          <a href=\"beranda.jsp?hal=tampilfinishretur\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
      out.write("          <form method=\"POST\"  action=\"finish_retur_Servlet\" class=\"form-horizontal\" role=\"form\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-4 control-label\">Kode Finish Retur</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <label>");
      out.print(kd_finish_retur);
      out.write("\n");
      out.write("                                  <input type=\"hidden\" class=\"form-control\" name=\"kd_finish_retur\"  value=\"");
      out.print(kd_finish_retur);
      out.write("\">\n");
      out.write("                            </label>\n");
      out.write("                         </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-4 control-label\">Tanggal</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"date\" class=\"form-control\"required=\"\" name=\"tgl\" value=\"");
      out.print(tgl);
      out.write("\">\n");
      out.write("                        </div>\n");
      out.write("                     </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                        \n");
      out.write("            <div class=\"row\">\n");

    sql = "select * from retur_barang where status='Proses'";
    rs = kon.ambilData(sql);

      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-4 control-label\">Kode Retur</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <select class=\"form-control\" name=\"kd_retur\" id=\"kr\" required=\"\" onchange=\"ambilsup()\">\n");
      out.write("                                <option value=\"");
      out.print(kd_retur);
      out.write("\">\n");
      out.write("                                Pilih Kode Retur\n");
      out.write("                                </option>\n");
      out.write("                                ");
 while(rs.next()){ 
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(rs.getString(1));
      out.write("\">\n");
      out.write("                                ");
      out.print(rs.getString(1));
      out.write("\n");
      out.write("                                </option>\n");
      out.write("                                       ");
 } 
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label  class=\"col-sm-4 control-label\">Kode Supplier</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Kode Supplier\" required=\"\" name=\"kd_supplier\" id=\"supplier\"  value=\"");
      out.print(kd_supplier);
      out.write("\"\n");
      out.write("                                          readonly=\"readonly\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                                          <br></br>\n");
      out.write("\n");
      out.write("                   <button type=\"Submit\"  name=\"aksi\" value=\"Tambah\" class=\"btn btn-primary\">Lihat</button>\n");
      out.write("          \n");
      out.write("<div class=\"row\">\n");

    sql = "select * from finish_retur_sementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from finish_retur_sementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"product-status-wrap\">\n");
      out.write("        <h4>Data Barang Retur</h4>\n");
      out.write("           <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
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
      out.write("                        <a href=\"finish_retur_Servlet?kode=");
      out.print(rs.getString(2));
      out.write("&aksi=Delete\" ><button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                  ");
}
      out.write("\n");
      out.write("            \n");
      out.write("                </table>\n");
      out.write("        <div class=\"form-group data-custon-pick\">\n");
      out.write("                            <div class=\"text-center mg-b-pro-edt custom-pro-edt-ds\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">     \n");
      out.write("                                <button type=\"Submit\"  name=\"aksi\" value=\"Simpan\" class=\"btn btn-primary\">Simpan</button>\n");
      out.write("                                <button type=\"Submit\" name=\"aksi\" value=\"Cancel\" class=\"btn btn-danger\">Batal</button>\n");
      out.write("                            </div>\n");
      out.write("                                    <input type=\"hidden\" name=\"kd_finish_retur\"\n");
      out.write("                                           value=\"");
      out.print(kd_finish_retur);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"tgl\"\n");
      out.write("                                           value=\"");
      out.print(tgl);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"kd_retur\"\n");
      out.write("                                           value=\"");
      out.print(kd_retur);
      out.write("\"/>\n");
      out.write("                                    <input type=\"hidden\" name=\"kd_supplier\"\n");
      out.write("                                           id=\"supplier\" value=\"");
      out.print(kd_supplier);
      out.write("\"/>\n");
      out.write("                            \n");
      out.write("       </div> \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" </form></br>\n");
      out.write("\n");
      out.write("</div>                \n");
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
