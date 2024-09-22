package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.*;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;
import java.sql.ResultSet;
import control.Koneksi;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(33);
    _jspx_dependants.add("/edituser.jsp");
    _jspx_dependants.add("/tampiluser.jsp");
    _jspx_dependants.add("/tambahuser.jsp");
    _jspx_dependants.add("/tambahlokasi.jsp");
    _jspx_dependants.add("/tampillokasi.jsp");
    _jspx_dependants.add("/editlokasi.jsp");
    _jspx_dependants.add("/tambahkategori.jsp");
    _jspx_dependants.add("/tampilkategori.jsp");
    _jspx_dependants.add("/editkategori.jsp");
    _jspx_dependants.add("/tambahsupplier.jsp");
    _jspx_dependants.add("/tampilsupplier.jsp");
    _jspx_dependants.add("/editsupplier.jsp");
    _jspx_dependants.add("/tambahkaryawan.jsp");
    _jspx_dependants.add("/tampilkaryawan.jsp");
    _jspx_dependants.add("/editkaryawan.jsp");
    _jspx_dependants.add("/tambahbarang.jsp");
    _jspx_dependants.add("/tampilbarang.jsp");
    _jspx_dependants.add("/editbarang.jsp");
    _jspx_dependants.add("/tambahpemesanan.jsp");
    _jspx_dependants.add("/tampilpemesanan.jsp");
    _jspx_dependants.add("/statuspemesanan.jsp");
    _jspx_dependants.add("/tambahstockin.jsp");
    _jspx_dependants.add("/tampilstockin.jsp");
    _jspx_dependants.add("/tambahstockout.jsp");
    _jspx_dependants.add("/tampilstockout.jsp");
    _jspx_dependants.add("/tambahretur.jsp");
    _jspx_dependants.add("/tampilretur.jsp");
    _jspx_dependants.add("/statusretur.jsp");
    _jspx_dependants.add("/tambahfinishretur.jsp");
    _jspx_dependants.add("/tampilfinishretur.jsp");
    _jspx_dependants.add("/tambahcancelstockout.jsp");
    _jspx_dependants.add("/tampilcancelstockout.jsp");
    _jspx_dependants.add("/home.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <title>beranda</title>\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write(" #header{\n");
      out.write("        width: 100%; /*ukuran lebar kesamping*/\n");
      out.write("        heigt: 100px; /*ukuran tinggi*/\n");
      out.write("        background: #269abc; /*untuk memberi warna pada header*/\n");
      out.write("  \t}\n");
      out.write("#navbar{\n");
      out.write("            margin-bottom: 0px;\n");
      out.write("        }\n");
      out.write(" \n");
      out.write("#sidebar {\n");
      out.write("        width: 100%; /*ukuran lebar kesamping*/\n");
      out.write("        heigt: 700px; /*ukuran tinggi*/\n");
      out.write("        background:white;   \n");
      out.write("        }\n");
      out.write(" #main-content {\n");
      out.write("    \theight: 700px;\n");
      out.write("        background: white; /*untuk memberi warna pada main content*/\n");
      out.write("    }               \n");
      out.write("            th, td{\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even) {background-color: #ffeaa7} /*untuk memberi warna tabel*/\n");
      out.write("\n");
      out.write("                    th{\n");
      out.write("                        color: black; /*untuk memberi warna pada judul isi tabel*/\n");
      out.write("                    }\n");
      out.write("                    label{\n");
      out.write("                        color: #d58512;\n");
      out.write("                    }\n");
      out.write("                    h2{\n");
      out.write("                        color: #ac2925;\n");
      out.write("                    }\n");
      out.write("                    .glyphicon {\n");
      out.write("                        color: black;\n");
      out.write("                    }\n");
      out.write("    /* Set black background color, white text and some padding */\n");
      out.write("    footer {\n");
      out.write("      background-color: #269abc; /*untuk memberi warna pada footer*/\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("  ");

            if ((session.getAttribute("username") == null) || (session.getAttribute("hak_akses"))== "Kepala Gudang" ){
                response.sendRedirect("login.jsp");
        
      out.write("\n");
      out.write("        ");

        }
        
      out.write(" \n");
      out.write("<body>\n");
      out.write("    <!--awal header -->\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!--untuk menyisipkan gambar-->\n");
      out.write("            <div class=\"col-md-10\"><img src=\"img/1.png\" style=\"width: 300px; height: 100px; padding-left: 40px;\"></div>\n");
      out.write("            <!--menampilkan jam-->\n");
      out.write("            <div class=\"col-md-2\"><h4>");
      out.print(new java.util.Date());
      out.write("</h4></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--akhir header-->\n");
      out.write("    <!--awal navbar-->\n");
      out.write(" <nav class=\"navbar-default\" role=\"navigation\" style=\"margin-bottom: 0px;\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\" >\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Sistem Inventory</a>\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("   \n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"beranda.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"Login?proses=logout\">Logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div><!-- /.navbar-collapse -->\n");
      out.write("  </div><!-- /.container-fluid -->\n");
      out.write("</nav>\n");
      out.write("<div class=\"row no-gutters\">\n");
      out.write("        <!--awal sidebar -->\n");
      out.write("        <div class=\"col-md-2\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("            <div id=\"sidebar\">\n");
      out.write("                <h3>Master Data</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampiluser\">User</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampillokasi\">Lokasi</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilkategori\">Kategori</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilsupplier\">Supplier</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilbarang\">Barang</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilkaryawan\">Karyawan</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                <h3>Transaksi</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilpemesanan\">Pemesanan</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilstockin\">Stock In</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilstockout\">Stock Out</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilcancelstockout\">Cancel Stock Out</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilretur\">Retur Barang</a></li>\n");
      out.write("                    <li><a href=\"beranda.jsp?hal=tampilfinishretur\">Finish Retur</a></li>\n");
      out.write("                </ul>\n");
      out.write("                \n");
      out.write("                <h3>Laporan</h3>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"report_inventory.jsp\" target=\"_blank\">Report Inventory</a></li>\n");
      out.write("                    <li><a href=\"report_stock_in.jsp\" target=\"_blank\">Report Stock In</a></li>\n");
      out.write("                    <li><a href=\"report_stock_out.jsp\" target=\"_blank\">Report Stock Out</a></li>\n");
      out.write("                    <li><a href=\"report_retur_barang.jsp\" target=\"_blank\">Report Retur Barang</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("            <!--akhir sidebar -->\n");
      out.write("            <!--awam maincontent -->\n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("                <div id=\"main-content\"> \n");
      out.write("                    <div id=\"left_column\">\n");
      out.write("                        <div class=\"text_area\" align=\"justify\">\n");
      out.write("                         <!--awal param -->\n");
      out.write("                         <!-- MULAI BUAT PARAM -->\n");
      out.write("                        ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='edituser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Edit User</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>        \n");

    Koneksi kon = new Koneksi();
    String no_user=request.getParameter("no_user");
    String username=null;
    String password=null;
    String hak_akses=null;
    String sql = "SELECT* FROM user WHERE no_user='" 
            +no_user+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                no_user=rs.getString(1);
                username=rs.getString(2);
                password=rs.getString(3);
                hak_akses=rs.getString(4);
            }

              out.write("\n");
              out.write("        \n");
              out.write("<div class=\"container\">\n");
              out.write("    <h2 class=\"alert alert-info text-center\" >EDIT DATA USER</h2>\n");
              out.write("        <a href=\"beranda.jsp?hal=tampiluser\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("        <form method=\"POST\" action=\"userServlet\" class=\"form-horizontal\" role=\"form\">\n");
              out.write("          <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nomor</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                  <label>");
              out.print(no_user);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"no_user\" value=\"");
              out.print(no_user);
              out.write("\">\n");
              out.write("                  </label>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Username</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"username\"  value=\"");
              out.print(username);
              out.write("\" >\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("              <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Password</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"password\"  value=\"");
              out.print(password);
              out.write("\">\n");
              out.write("              </div>\n");
              out.write("            </div> \n");
              out.write("              \n");
              out.write("              <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Hak Akses</label>\n");
              out.write("                        <div class=\"col-sm-10\">\n");
              out.write("                            ");

                            if (hak_akses.equalsIgnoreCase("Kepala Gudang"))
                            { 
              out.write("\n");
              out.write("                            <select name=\"hak_akses\" class=\"form-control\">\n");
              out.write("                                <option value=\"Kepala Gudang\" selected>Kepala Gudang</option>\n");
              out.write("                                <option value=\"Admin Gudang\">Admin Gudang</option>\n");
              out.write("                            </select>\n");
              out.write("                          ");
 } else { 
              out.write("\n");
              out.write("                          <select name=\"hak_akses\" class=\"form-control\">\n");
              out.write("                                <option value=\"Kepala Gudang\">Kepala Gudang</option>\n");
              out.write("                                <option value=\"Admin Gudang\" selected>Admin Gudang</option>\n");
              out.write("                            </select>\n");
              out.write("                          ");
 } 
              out.write("\n");
              out.write("                        </div>\n");
              out.write("                    </div>\n");
              out.write("              \n");
              out.write("              <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("        </form>\n");
              out.write("</div>\n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_1.setPageContext(_jspx_page_context);
          _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampiluser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
          if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data User</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select * from user";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA USER</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahuser\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</i></button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>NOMOR</th>\n");
              out.write("                          <th>USERNAME</th>\n");
              out.write("                          <th>PASSWORD</th>\n");
              out.write("                          <th>HAK AKSES</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"5\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=edituser&no_user=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Edit</button>\n");
              out.write("                        \n");
              out.write("                    </a>\n");
              out.write("                \n");
              out.write("               \n");
              out.write("                <a href=\"userServlet?no_user=");
              out.print( rs.getString(1) );
              out.write("&aksi=Delete\"><button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"../js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"../js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"../dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_2.setPageContext(_jspx_page_context);
          _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahuser'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
          if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tambah Data User</title>\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");
              out.write("     ");

            String no_user=null;
            String sql="select max(right(no_user,3)) FROM user";
            Koneksi kon = new Koneksi();
            ResultSet rs = kon.ambilData(sql);
            if(!rs.next())
                no_user="U001";
            else{
                rs.last();
                int autoKode = rs.getInt(1)+1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 3; a++) {
                   kode = "0" + kode; 
                }
                    no_user="U"+kode;
            }
            
     
              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h2 class=\"alert alert-danger text-center\"  >INPUT DATA USER</h2>\n");
              out.write("          <a href=\"beranda.jsp?hal=tampiluser\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("          <form method=\"POST\" action=\"userServlet\" class=\"form-horizontal\" role=\"form\" >\n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nomor</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                  <label>");
              out.print(no_user);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"no_user\"  value=\"");
              out.print(no_user);
              out.write("\">\n");
              out.write("                  </label>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Username</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Masukan Username Anda\">\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("              <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Password</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"password\" placeholder=\"Masukan Password Anda\">\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("                  \n");
              out.write("            \n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Hak Akses</label>\n");
              out.write("                        <div class=\"col-sm-10\">\n");
              out.write("                          <select name=\"hak_akses\" class=\"form-control\">\n");
              out.write("                                <option value=\"Kepala Gudang\">Kepala Gudang</option>\n");
              out.write("                                <option value=\"Admin Gudang\">Admin Gudang</option>\n");
              out.write("                            </select>\n");
              out.write("                        </div>\n");
              out.write("                    </div> \n");
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
              out.write("</html>");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_3.setPageContext(_jspx_page_context);
          _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahlokasi'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_4.setPageContext(_jspx_page_context);
          _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampillokasi'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
          if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data Lokasi</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select * from lokasi";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA LOKASI</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahlokasi\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>NOMOR</th>\n");
              out.write("                          <th>NAMA RAK</th>\n");
              out.write("                          <th>KODE RAK</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"4\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=editlokasi&no_lokasi=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
              out.write("                        \n");
              out.write("                    </a>\n");
              out.write("                \n");
              out.write("             \n");
              out.write("                <a href=\"lokasiServlet?no_lokasi=");
              out.print( rs.getString(1) );
              out.write("&aksi=Delete\"><button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_5.setPageContext(_jspx_page_context);
          _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='editlokasi'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
          if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Edit Lokasi</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>        \n");

    Koneksi kon = new Koneksi();
    String no_lokasi=request.getParameter("no_lokasi");
    String nm_rak=null;
    String kd_rak=null;
    String sql = "SELECT* FROM lokasi WHERE no_lokasi='" 
            +no_lokasi+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                no_lokasi=rs.getString(1);
                nm_rak=rs.getString(2);
                kd_rak=rs.getString(3);
            }

              out.write("\n");
              out.write("        \n");
              out.write("<div class=\"container\">\n");
              out.write("    <h2 class=\"alert alert-info text-center\" >EDIT DATA LOKASI</h2>\n");
              out.write("        <a href=\"beranda.jsp?hal=tampillokasi\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("        <form method=\"POST\" action=\"lokasiServlet\" class=\"form-horizontal\" role=\"form\">\n");
              out.write("          <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nomor</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                  <label>");
              out.print(no_lokasi);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"no_lokasi\" value=\"");
              out.print(no_lokasi);
              out.write("\">\n");
              out.write("                  </label>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nama Rak</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"nm_rak\"  value=\"");
              out.print(nm_rak);
              out.write("\" >\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("              <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Kode Rak</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"kd_rak\"  value=\"");
              out.print(kd_rak);
              out.write("\">\n");
              out.write("              </div>\n");
              out.write("              </div> \n");
              out.write("              \n");
              out.write("            \n");
              out.write("              \n");
              out.write("              <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("        </form>\n");
              out.write("</div>\n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_6.setPageContext(_jspx_page_context);
          _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahkategori'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
          if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tambah Data Kategori</title>\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");
              out.write("     ");

         String no_kategori=null;
         String sql="select max(right(no_kategori,4)) FROM kategori";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            no_kategori="1";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 4; a++) {
                 kode = "0" + kode;
             }
            no_kategori=""+kode;
         }
            
     
              out.write("\n");
              out.write("    <div class=\"container\">\n");
              out.write("        <h2 class=\"alert alert-danger text-center\"  >INPUT DATA KATEGORI</h2>\n");
              out.write("        <a href=\"beranda.jsp?hal=tampilkategori\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("        <form method=\"POST\" action=\"kategoriServlet\" class=\"form-horizontal\" role=\"form\" >\n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nomor</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                  <label>");
              out.print(no_kategori);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"no_kategori\"  value=\"");
              out.print(no_kategori);
              out.write("\">\n");
              out.write("                  </label>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Kategori</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"kategori\" placeholder=\"Masukan Kategori \">\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("                  \n");
              out.write("             <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Type</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"type\" placeholder=\"Masukan type\">\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("            <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <input type=\"hidden\" name=\"aksi\" value=\"Insert\">\n");
              out.write("                        <button type=\"submit\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("            </tr>\n");
              out.write("        </form>\n");
              out.write("    </div>\n");
              out.write("\n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_7.setPageContext(_jspx_page_context);
          _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilkategori'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
          if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data Kategori</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select * from kategori";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA KATEGORI</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahkategori\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>NOMOR</th>\n");
              out.write("                          <th>KATEGORI</th>\n");
              out.write("                          <th>TYPE</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"4\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=editkategori&no_kategori=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Edit</button>\n");
              out.write("                        \n");
              out.write("                    </a>\n");
              out.write("                \n");
              out.write("               \n");
              out.write("                <a href=\"kategoriServlet?no_kategori=");
              out.print( rs.getString(1) );
              out.write("&aksi=Delete\"><button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_8.setPageContext(_jspx_page_context);
          _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='editkategori'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
          if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Edit Kategori</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>        \n");

    Koneksi kon = new Koneksi();
    String no_kategori=request.getParameter("no_kategori");
    String kategori=null;
    String type=null;
    String sql = "SELECT* FROM kategori WHERE no_kategori='" 
            +no_kategori+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                no_kategori=rs.getString(1);
                kategori=rs.getString(2);
                type=rs.getString(3);
            }

              out.write("\n");
              out.write("        \n");
              out.write("<div class=\"container\">\n");
              out.write("    <h2 class=\"alert alert-info text-center\" >EDIT DATA KATGORI</h2>\n");
              out.write("        <a href=\"beranda.jsp?hal=tampilkategori\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("        <form method=\"POST\" action=\"kategoriServlet\" class=\"form-horizontal\" role=\"form\">\n");
              out.write("          <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nomor</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                  <label>");
              out.print(no_kategori);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"no_kategori\" value=\"");
              out.print(no_kategori);
              out.write("\">\n");
              out.write("                  </label>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Kategori</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"kategori\"  value=\"");
              out.print(kategori);
              out.write("\" >\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("               <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Type</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"type\"  value=\"");
              out.print(type);
              out.write("\">\n");
              out.write("              </div>\n");
              out.write("              </div> \n");
              out.write("              <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("        </form>\n");
              out.write("</div>\n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_9.setPageContext(_jspx_page_context);
          _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahsupplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
          if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tambah Data Supplier</title>\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");
              out.write("     ");

         String kd_supplier=null;
         String sql="select max(right(kd_supplier,6)) FROM supplier";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            kd_supplier="SP000001";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 6; a++) {
                 kode = "0" + kode;
             }
             kd_supplier="SP"+kode;
         }
            
     
              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h2 class=\"alert alert-danger text-center\"  >INPUT DATA SUPPLIER</h2>\n");
              out.write("          <a href=\"beranda.jsp?hal=tampilsupplier\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("          <form method=\"POST\" action=\"supplierServlet\" class=\"form-horizontal\" role=\"form\" >\n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Kode Supplier</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                  <label>");
              out.print(kd_supplier);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"kd_supplier\"  value=\"");
              out.print(kd_supplier);
              out.write("\">\n");
              out.write("                  </label>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nama</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"nm_supplier\" placeholder=\"Masukan Nama Supplier\">\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("              <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Alamat</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <textarea type=\"text\" class=\"form-control\" name=\"alamat\" row=5></textarea>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("                  \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Telpon</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"no_tlp\" placeholder=\"Masukan nomot telpon\">\n");
              out.write("              </div>\n");
              out.write("            </div>     \n");
              out.write("            \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">email</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"Masukan alamat email\">\n");
              out.write("              </div>\n");
              out.write("            </div>  \n");
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
              out.write("</html>");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_10.setPageContext(_jspx_page_context);
          _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilsupplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
          if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data User</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select * from supplier";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA SUPPLIER</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahsupplier\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</i></button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE SUPPLIER</th>\n");
              out.write("                          <th>NAMA</th>\n");
              out.write("                          <th>TELPON</th>\n");
              out.write("                          <th>EMAIL</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"5\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(5) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=editsupplier&kd_supplier=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Edit</button></a>\n");
              out.write("                \n");
              out.write("                \n");
              out.write("                <a href=\"supplierServlet?kd_supplier=");
              out.print( rs.getString(1) );
              out.write("&aksi=Delete\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"../js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"../js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"../dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_11.setPageContext(_jspx_page_context);
          _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='editsupplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
          if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
    String kd_supplier=request.getParameter("kd_supplier");
    String nm_supplier=null;
    String alamat=null;
    String no_tlp=null;
    String email=null;
    String sql = "SELECT* FROM supplier WHERE kd_supplier='" 
            +kd_supplier+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_supplier=rs.getString(1);
                nm_supplier=rs.getString(2);
                alamat=rs.getString(3);
                no_tlp=rs.getString(4);
                email=rs.getString(5);
            }

              out.write("\n");
              out.write("        \n");
              out.write("<div class=\"container\">\n");
              out.write("    <h2 class=\"alert alert-info text-center\" >EDIT DATA SUPPLIER</h2>\n");
              out.write("        <a href=\"beranda.jsp?hal=tampilsupplier\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("        <form method=\"POST\" action=\"supplierServlet\" class=\"form-horizontal\" role=\"form\">\n");
              out.write("          <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Kode Supplier</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                  <label>");
              out.print(kd_supplier);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"kd_supplier\" value=\"");
              out.print(kd_supplier);
              out.write("\">\n");
              out.write("                  </label>\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Nama</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"nm_supplier\"  value=\"");
              out.print(nm_supplier);
              out.write("\" >\n");
              out.write("              </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("              <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Alamat</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <textarea type=\"text\" class=\"form-control\" name=\"alamat\" row=5 > ");
              out.print(alamat);
              out.write("</textarea>\n");
              out.write("              </div>\n");
              out.write("            </div> \n");
              out.write("              \n");
              out.write("             <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Telpon</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"no_tlp\"  value=\"");
              out.print(no_tlp);
              out.write("\" >\n");
              out.write("              </div>\n");
              out.write("             </div>\n");
              out.write("              \n");
              out.write("              <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Email</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"email\"  value=\"");
              out.print(email);
              out.write("\" >\n");
              out.write("              </div>\n");
              out.write("              </div>\n");
              out.write("            \n");
              out.write("              <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("        </form>\n");
              out.write("</div>\n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_12.setPageContext(_jspx_page_context);
          _jspx_th_c_when_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahkaryawan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_12 = _jspx_th_c_when_12.doStartTag();
          if (_jspx_eval_c_when_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tambah Data Karyawan</title>\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");
              out.write("     ");

         String kd_karyawan=null;
         String sql="select max(right(kd_karyawan,5)) FROM karyawan";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            kd_karyawan="KRY0001";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 5; a++) {
                 kode = "0" + kode;
             }
             kd_karyawan="KRY"+kode;
         }
            
     
              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h2 class=\"alert alert-danger text-center\"  >INPUT DATA KARYAWAN</h2>\n");
              out.write("          <a href=\"beranda.jsp?hal=tampilkaryawan\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("          <form method=\"POST\" action=\"karyawanServlet\" class=\"form-horizontal\" role=\"form\" >\n");
              out.write("            <div class=\"form-group\">\n");
              out.write("                <label  class=\"col-sm-2 control-label\">Kode Karyawan</label>\n");
              out.write("                <div class=\"col-sm-10\">\n");
              out.write("                    <label>");
              out.print(kd_karyawan);
              out.write("\n");
              out.write("                        <input type=\"hidden\" class=\"form-control\" name=\"kd_karyawan\"  value=\"");
              out.print(kd_karyawan);
              out.write("\">\n");
              out.write("                    </label>\n");
              out.write("                </div>\n");
              out.write("            </div>\n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("                <label  class=\"col-sm-2 control-label\">Nama</label>\n");
              out.write("                <div class=\"col-sm-10\">\n");
              out.write("                    <input type=\"text\" class=\"form-control\" name=\"nama\" placeholder=\"Masukan Nama Karyawan\">\n");
              out.write("                </div>\n");
              out.write("            </div>\n");
              out.write("                  \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("                <label  class=\"col-sm-2 control-label\">Gender</label>\n");
              out.write("                <div class=\"col-sm-10\">\n");
              out.write("                    <select name=\"jk\" class=\"form-control\">\n");
              out.write("                        <option value=\"perempuan\">Perempuan</option>\n");
              out.write("                        <option value=\"laki-laki\">Laki-laki</option>\n");
              out.write("                    </select>\n");
              out.write("                </div>\n");
              out.write("            </div> \n");
              out.write("              \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("                <label  class=\"col-sm-2 control-label\">Alamat</label>\n");
              out.write("                <div class=\"col-sm-10\">\n");
              out.write("                  <textarea type=\"text\" class=\"form-control\" name=\"alamat\" row=5></textarea>\n");
              out.write("                </div>\n");
              out.write("            </div>\n");
              out.write("                  \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("                <label  class=\"col-sm-2 control-label\">Telpon</label>\n");
              out.write("                <div class=\"col-sm-10\">\n");
              out.write("                  <input type=\"text\" class=\"form-control\" name=\"no_tlp\" placeholder=\"Masukan nomot telpon\">\n");
              out.write("                </div>\n");
              out.write("            </div>     \n");
              out.write("            \n");
              out.write("            <div class=\"form-group\">\n");
              out.write("              <label  class=\"col-sm-2 control-label\">Divisi</label>\n");
              out.write("              <div class=\"col-sm-10\">\n");
              out.write("                <input type=\"text\" class=\"form-control\" name=\"divisi\" placeholder=\"Masukan Divisi\">\n");
              out.write("              </div>\n");
              out.write("            </div>  \n");
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
              out.write("</html>");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_13 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_13.setPageContext(_jspx_page_context);
          _jspx_th_c_when_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilkaryawan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_13 = _jspx_th_c_when_13.doStartTag();
          if (_jspx_eval_c_when_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data Karyawan</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select * from karyawan";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA KARYAWAN</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahkaryawan\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE KARYAWAN</th>\n");
              out.write("                          <th>NAMA</th>\n");
              out.write("                          <th>GENDER</th>\n");
              out.write("                          <th>TELPON</th>\n");
              out.write("                          <th>DIVISI</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"6\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(5) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(6) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=editkaryawan&kd_karyawan=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Edit</button>\n");
              out.write("                        \n");
              out.write("                    </a>\n");
              out.write("                \n");
              out.write("               \n");
              out.write("                <a href=\"karyawanServlet?kd_karyawan=");
              out.print( rs.getString(1) );
              out.write("&aksi=Delete\"><button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_13.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_13);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_14 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_14.setPageContext(_jspx_page_context);
          _jspx_th_c_when_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='editkaryawan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_14 = _jspx_th_c_when_14.doStartTag();
          if (_jspx_eval_c_when_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("        <a href=\"beranda.jsp?hal=tampilkaryawan\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
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
 if (jk.equalsIgnoreCase("perempuan")) { 
              out.write("\n");
              out.write("                        <select name=\"jk\" class=\"form-control\">\n");
              out.write("                            <option value=\"perempuan\" selected>Perempuan</option>\n");
              out.write("                            <option value=\"laki-laki\">Laki-laki</option>\n");
              out.write("                        </select>\n");
              out.write("                    ");
 } else { 
              out.write("\n");
              out.write("                        <select name=\"jk\" class=\"form-control\">\n");
              out.write("                            <option value=\"perempuan\">Perempuan</option>\n");
              out.write("                            <option value=\"laki-laki\" selected>Laki-laki</option>\n");
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
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_14.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_14);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_14);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_15 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_15.setPageContext(_jspx_page_context);
          _jspx_th_c_when_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahbarang'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_15 = _jspx_th_c_when_15.doStartTag();
          if (_jspx_eval_c_when_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("                            <input readonly=\"readonly\" class=\"form-control\" name=\"qty\" placeholder=\"0\" value=\"0\">\n");
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
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_15.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_15);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_15);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_16 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_16.setPageContext(_jspx_page_context);
          _jspx_th_c_when_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilbarang'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_16 = _jspx_th_c_when_16.doStartTag();
          if (_jspx_eval_c_when_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data Barang</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select * from barang";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA BARANG</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahbarang\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE BARANG</th>\n");
              out.write("                          <th>ITEM</th>\n");
              out.write("                          <th>NAMA</th>\n");
              out.write("                          <th>SATUAN</th>\n");
              out.write("                          <th>STOK</th>\n");
              out.write("                          <th>KATEGORI</th>\n");
              out.write("                          <th>LOKASI</th>\n");
              out.write("                          <th>HARGA JUAL</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"8\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(5) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(7) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(8) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(9) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=editbarang&kd_brg=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Edit</button>\n");
              out.write("                        \n");
              out.write("                    </a>\n");
              out.write("                \n");
              out.write("          \n");
              out.write("                <a href=\"barangServlet?kd_brg=");
              out.print( rs.getString(1) );
              out.write("&aksi=Delete\"><button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_16.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_16);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_16);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_17 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_17.setPageContext(_jspx_page_context);
          _jspx_th_c_when_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='editbarang'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_17 = _jspx_th_c_when_17.doStartTag();
          if (_jspx_eval_c_when_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>edit barang</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>        \n");

    Koneksi kon = new Koneksi();
    String kd_brg=request.getParameter("kd_brg");
    String item=null;
    String nm_brg=null;
    String satuan=null;
    String qty=null;
    String harga_beli=null;
    String type=null;
    String nm_rak=null;
    String harga_jual=null;
   
    String sql = "SELECT* FROM barang WHERE kd_brg='" 
            +kd_brg+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_brg=rs.getString(1);
                item=rs.getString(2);
                nm_brg=rs.getString(3);
                satuan=rs.getString(4);
                qty=rs.getString(5);
                harga_beli=rs.getString(6);
                type=rs.getString(7);
                nm_rak=rs.getString(8);
                harga_jual=rs.getString(9);
                
            }
    
String no_kategori=request.getParameter("no_kategori");

            String kategori = type;
            if(no_kategori==null)
                kategori=type;
            else{
                sql = "SELECT * FROM kategori WHERE no_kategori='"
                        + no_kategori + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kategori = rs.getString(2);
            }

String no_lokasi=request.getParameter("no_lokasi");

            String kd_rak = nm_rak;
            if(no_lokasi==null)
                kd_rak=nm_rak;
            else{
                sql = "SELECT * FROM lokasi WHERE no_lokasi='"
                        + no_lokasi + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kd_rak = rs.getString(3);
            }

              out.write("\n");
              out.write("        \n");
              out.write("<div class=\"container\">\n");
              out.write("          <h2 class=\"alert alert-info text-center\"  >EDIT DATA BARANG</h2>\n");
              out.write("          <a href=\"beranda.jsp?hal=tampilbarang\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("          <form method=\"POST\" action=\"barangServlet\" class=\"form-horizontal\" role=\"form\" >\n");
              out.write("            <div class=\"row\">\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Kode</label>\n");
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
              out.write("                        <input type=\"text\" class=\"form-control\" name=\"item\" value=\"");
              out.print(item);
              out.write("\">\n");
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
              out.write("                           <input type=\"text\" class=\"form-control\" name=\"nm_brg\" value=\"");
              out.print(nm_brg);
              out.write("\">\n");
              out.write("                        </div>\n");
              out.write("                     </div> \n");
              out.write("                </div>\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Satuan</label>\n");
              out.write("                        <div class=\"col-sm-10\">\n");
              out.write("                          <input type=\"text\" class=\"form-control\" name=\"satuan\" value=\"");
              out.print(satuan);
              out.write("\">\n");
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
              out.write("                            <input type=\"text\" readonly=\"readonly\" class=\"form-control\" name=\"qty\" value=\"");
              out.print(qty);
              out.write("\">\n");
              out.write("                        </div>\n");
              out.write("                     </div> \n");
              out.write("                </div>\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Harga Beli</label>\n");
              out.write("                        <div class=\"col-sm-10\">\n");
              out.write("                          <input type=\"text\" class=\"form-control\" name=\"harga_beli\" value=\"");
              out.print(harga_beli);
              out.write("\">\n");
              out.write("                        </div>\n");
              out.write("                    </div> \n");
              out.write("                </div>  \n");
              out.write("            </div>               \n");
              out.write("                 \n");
              out.write("            <div class=\"row\">\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Harga Jual</label>\n");
              out.write("                        <div class=\"col-sm-10\">\n");
              out.write("                            <input type=\"text\" class=\"form-control\" name=\"harga_jual\" value=\"");
              out.print(harga_jual);
              out.write("\">\n");
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
              out.print(type);
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
              out.write("            </div>\n");
              out.write("                          \n");
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
              out.print(nm_rak);
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
              out.write("              \n");
              out.write("              <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("        </form>\n");
              out.write("</div>\n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_17.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_17);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_17);
          out.write("\n");
          out.write("                            \n");
          out.write("                           ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_18 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_18.setPageContext(_jspx_page_context);
          _jspx_th_c_when_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahpemesanan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_18 = _jspx_th_c_when_18.doStartTag();
          if (_jspx_eval_c_when_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_18.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_18);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_18);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_19 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_19.setPageContext(_jspx_page_context);
          _jspx_th_c_when_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilpemesanan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_19 = _jspx_th_c_when_19.doStartTag();
          if (_jspx_eval_c_when_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data Pemesanan</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select kd_pesan, nm_supplier, status, tgl, no_user  FROM pemesanan_barang INNER JOIN supplier ON pemesanan_barang.kd_supplier=supplier.kd_supplier;";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA PEMESANAN</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahpemesanan\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE PESAN</th>\n");
              out.write("                          <th>SUPPLIER</th>\n");
              out.write("                          <th>TANGGAL</th>\n");
              out.write("                          <th>STATUS</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"5\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=statuspemesanan&kd_pesan=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Status</button>\n");
              out.write("                        \n");
              out.write("                    </a>\n");
              out.write("                \n");
              out.write("                \n");
              out.write("                <a href=\"faktur/cetakpemesanan.jsp?kd_pesan=");
              out.print(rs.getString(1));
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Cetak</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"../js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"../js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"../dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_19.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_19);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_19);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_20 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_20.setPageContext(_jspx_page_context);
          _jspx_th_c_when_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='statuspemesanan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_20 = _jspx_th_c_when_20.doStartTag();
          if (_jspx_eval_c_when_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Status Pemesanan</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");

    Koneksi kon = new Koneksi();
    String kd_pesan=request.getParameter("kd_pesan");
    String kd_supplier=null;
    String status=null;
    String tgl=null;
    String no_user=null;
    String sql = "SELECT* FROM pemesanan_barang WHERE kd_pesan='" 
            +kd_pesan+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_pesan=rs.getString(1);
                kd_supplier=rs.getString(2);
                status=rs.getString(3);
                tgl=rs.getString(4);
                no_user=rs.getString(5);
               
            }

              out.write("\n");
              out.write("<div class=\"container\">\n");
              out.write("    <h2 class=\"alert alert-info text-center\" >Status Pemesanan</h2>\n");
              out.write("    <a href=\"beranda.jsp?hal=tampilpemesanan\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("    <form method=\"POST\" action=\"pemesananServlet\" class=\"form-horizontal\" role=\"form\">\n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Kode Pesan</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <label>");
              out.print(kd_pesan);
              out.write("\n");
              out.write("                    <input type=\"hidden\" class=\"form-control\" name=\"kd_pesan\" value=\"");
              out.print(kd_pesan);
              out.write("\">\n");
              out.write("                </label>\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("              \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Supplier</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <input readonly=\"readonly\" class=\"form-control\" name=\"kd_supplier\"  value=\"");
              out.print(kd_supplier);
              out.write("\" >\n");
              out.write("            </div>\n");
              out.write("         </div>\n");
              out.write("              \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Tanggal</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <input readonly=\"readonly\" class=\"form-control\" name=\"tgl\"  value=\"");
              out.print(tgl);
              out.write("\" >\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("              \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Petugas</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <input readonly=\"readonly\" class=\"form-control\" name=\"no_user\"  value=\"");
              out.print(no_user);
              out.write("\" >\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("            \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Status</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("               <select class=\"form-control custom-select-value\" name=\"status\">\n");
              out.write("                    ");
 if (status.equalsIgnoreCase("Open")) { 
              out.write("\n");
              out.write("                        <option value=\"Open\" selected>Open</option>\n");
              out.write("                        <option value=\"Proses\">Proses</option>\n");
              out.write("                    ");
 } else if (status.equalsIgnoreCase("Proses")) { 
              out.write("\n");
              out.write("                        <option value=\"Open\">Open</option>\n");
              out.write("                        <option value=\"Proses\" selected>Proses</option>\n");
              out.write("                   ");
 } else if (status.equalsIgnoreCase("Close")) { 
              out.write("    \n");
              out.write("                        <option value=\"Close\">TIDAK DAPAT MERUBAH DATA CLOSE !!</option>\n");
              out.write("                    ");
 }
              out.write("\n");
              out.write("               </select>\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("\n");
              out.write("            \n");
              out.write("              <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("        </form>\n");
              out.write("</div>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_20.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_20);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_20);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_21 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_21.setPageContext(_jspx_page_context);
          _jspx_th_c_when_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahstockin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_21 = _jspx_th_c_when_21.doStartTag();
          if (_jspx_eval_c_when_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Tambah Stock In</title>\n");
              out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    </head>\n");
              out.write("    <body>\n");

            String kd_brg_msk=null;
            String sql="select max(right(kd_brg_msk,6)) FROM stock_in";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            kd_brg_msk="BM000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    kd_brg_msk ="BM"+ kode ;
            }
           String tgl=request.getParameter("tgl");
            if(tgl==null)
                tgl="";
            String pesan=request.getParameter("kd_pesan");
            if(pesan==null)
                pesan="";
            String kd_supplier=request.getParameter("kd_supplier");
            if(kd_supplier==null)
                kd_supplier="";
           

              out.write("\n");
              out.write("<script>\n");
              out.write("function ambilsup(){\n");

    sql = "select * from pemesanan_barang";
    rs = kon.ambilData(sql);

              out.write("\n");
              out.write("        var10 = document.getElementById(\"kp\").value;\n");
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
              out.write("          <h2 class=\"alert alert-info text-center\"  >INPUT DATA BARANG MASUK</h2>\n");
              out.write("          <a href=\"beranda.jsp?hal=tampilstockin\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("          <form method=\"POST\"  action=\"stockinServlet\" class=\"form-horizontal\" role=\"form\" >\n");
              out.write("            <div class=\"row\">\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-4 control-label\">Kode Barang Masuk</label>\n");
              out.write("                        <div class=\"col-sm-8\">\n");
              out.write("                            <label>");
              out.print(kd_brg_msk);
              out.write("\n");
              out.write("                                  <input type=\"hidden\" class=\"form-control\" name=\"kd_brg_msk\"  value=\"");
              out.print(kd_brg_msk);
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

    sql = "select * from pemesanan_barang where status='Proses'";
    rs = kon.ambilData(sql);

              out.write("\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-4 control-label\">Kode Pesan</label>\n");
              out.write("                        <div class=\"col-sm-8\">\n");
              out.write("                            <select class=\"form-control\" name=\"kd_pesan\" id=\"kp\" required=\"\" onchange=\"ambilsup()\">\n");
              out.write("                                <option value=\"");
              out.print(pesan);
              out.write("\">\n");
              out.write("                                Pilih Kode Pesan\n");
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
              out.write("                                          \n");
              out.write("                            \n");
              out.write("           \n");
              out.write("               \n");
              out.write("                   <button type=\"Submit\"  name=\"aksi\" value=\"Tambah\" class=\"btn btn-primary\">Lihat</button>\n");
              out.write("                 \n");
              out.write("\n");
              out.write("                            \n");
              out.write("           \n");
              out.write("                \n");
              out.write("\n");
              out.write("                 \n");
              out.write("              \n");
              out.write("<div class=\"row\">\n");

    sql = "select * from stock_in_sementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from stock_in_sementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;

              out.write("\n");
              out.write("\n");
              out.write("<div class=\"product-status-wrap\">\n");
              out.write("        <h4>Data Barang Pemesanan</h4>\n");
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
              out.write("                        <td>\n");
              out.write("                        <a href=\"stockinServlet?kode=");
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
              out.write("        <div class=\"form-group data-custon-pick\">\n");
              out.write("                            <div class=\"text-center mg-b-pro-edt custom-pro-edt-ds\" class=\"col-lg-6 col-md-6 col-sm-6 col-xs-6\">     \n");
              out.write("                                <button type=\"Submit\"  name=\"aksi\" value=\"Simpan\" class=\"btn btn-primary\">Simpan</button>\n");
              out.write("                                <button type=\"Submit\" name=\"aksi\" value=\"Cancel\" class=\"btn btn-danger\">Batal</button>\n");
              out.write("                            </div>\n");
              out.write("                                    <input type=\"hidden\" name=\"kd_brg_msk\"\n");
              out.write("                                           value=\"");
              out.print(kd_brg_msk);
              out.write("\"/>\n");
              out.write("                                    <input type=\"hidden\" name=\"tgl\"\n");
              out.write("                                           value=\"");
              out.print(tgl);
              out.write("\"/>\n");
              out.write("                                    <input type=\"hidden\" name=\"kd_pesan\"\n");
              out.write("                                           value=\"");
              out.print(pesan);
              out.write("\"/>\n");
              out.write("                                    <input type=\"hidden\" name=\"kd_supplier\"\n");
              out.write("                                           id=\"supplier\" value=\"");
              out.print(kd_supplier);
              out.write("\"/>\n");
              out.write("                            \n");
              out.write("        </div> \n");
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
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_21.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_21);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_21);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_22 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_22.setPageContext(_jspx_page_context);
          _jspx_th_c_when_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilstockin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_22 = _jspx_th_c_when_22.doStartTag();
          if (_jspx_eval_c_when_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Barang Masuk</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select kd_brg_msk, kd_pesan, nm_supplier, tgl FROM stock_in INNER JOIN supplier ON stock_in.kd_supplier=supplier.kd_supplier;";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA BARANG MASUK</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahstockin\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE STOCK IN</th>\n");
              out.write("                          <th>KODE PESAN</th>\n");
              out.write("                          <th>SUPPLIER</th>\n");
              out.write("                          <th>TANGGAL</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"4\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_22.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_22);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_22);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_23 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_23.setPageContext(_jspx_page_context);
          _jspx_th_c_when_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahstockout'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_23 = _jspx_th_c_when_23.doStartTag();
          if (_jspx_eval_c_when_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_23.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_23);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_23);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_24 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_24.setPageContext(_jspx_page_context);
          _jspx_th_c_when_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilstockout'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_24 = _jspx_th_c_when_24.doStartTag();
          if (_jspx_eval_c_when_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Barang Keluar</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"../dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select kd_brg_klr, nama, username, tgl FROM stock_out JOIN karyawan ON stock_out.kd_karyawan=karyawan.kd_karyawan JOIN user ON stock_out.no_user=user.no_user;";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA BARANG KELUAR</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahstockout\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</i></button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE STOCK OUT</th>\n");
              out.write("                          <th>KARYAWAN</th>\n");
              out.write("                          <th>PETUGAS</th>\n");
              out.write("                          <th>TANGGAL</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"5\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                    <td>\n");
              out.write("                        <a href=\"faktur/cetakstockout.jsp?kd_brg_klr=");
              out.print(rs.getString(1));
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Cetak</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("   <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"../js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"../js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"../dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_24.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_24);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_24);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_25 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_25.setPageContext(_jspx_page_context);
          _jspx_th_c_when_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahretur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_25 = _jspx_th_c_when_25.doStartTag();
          if (_jspx_eval_c_when_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>tambah retur</title>\n");
              out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    </head>\n");
              out.write("    <body>\n");

            String nomor=null;
            String sql="select max(right(kd_retur,6)) FROM retur_barang";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            nomor="RT000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    nomor ="RT"+ kode ;
            }
            String tgl=request.getParameter("tgl");
            String kd_supplier=request.getParameter("kd_supplier");
            if(tgl==null)
                tgl="";
            String nma = null;
            if(kd_supplier==null)
                nma="Pilih Supplier";
            else{
                sql = "SELECT * FROM supplier WHERE kd_supplier='"
                        + kd_supplier + "'";
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
            String aksi=request.getParameter("aksi");
            sql = "INSERT INTO retur_sementara VALUES('" 
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
              out.write("          <h2 class=\"alert alert-info text-center\"  >INPUT RETUR</h2>\n");
              out.write("          <a href=\"beranda.jsp?hal=tampilretur\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("          <form method=\"POST\"  class=\"form-horizontal\" role=\"form\" >\n");
              out.write("            <div class=\"row\">\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Kode Retur</label>\n");
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

    sql = "select * from supplier";
    rs = kon.ambilData(sql);

              out.write("\n");
              out.write("              <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\">\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Supplier</label>\n");
              out.write("                        <div class=\"col-sm-10\">\n");
              out.write("                          <select class=\"form-control\" name=\"kd_supplier\">\n");
              out.write("                              <option value=\"");
              out.print(kd_supplier);
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

    sql = "select * from retur_sementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from retur_sementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;

              out.write("\n");
              out.write("\n");
              out.write("<div class=\"product-status-wrap\">\n");
              out.write("        <h4>Data Barang Retur</h4>\n");
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
              out.write("                        <a href=\"returServlet?kode=");
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
              out.write("    <form method=\"POST\" action=\"returServlet\">\n");
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
              out.write("                                    <input type=\"hidden\" name=\"kd_retur\" value=\"");
              out.print(nomor);
              out.write("\"/>\n");
              out.write("                                    <input type=\"hidden\" name=\"tgl\" value=\"");
              out.print(tgl);
              out.write("\"/>\n");
              out.write("                                    <input type=\"hidden\" name=\"kd_supplier\" value=\"");
              out.print(kd_supplier);
              out.write("\"/>\n");
              out.write("                                    <input type=\"hidden\" name=\"no_user\" value=\"");
              out.print(no_user);
              out.write("\"/>\n");
              out.write("                                    <input type=\"hidden\" name=\"qty\" value=\"");
              out.print(qty);
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
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_25.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_25);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_25);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_26 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_26.setPageContext(_jspx_page_context);
          _jspx_th_c_when_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilretur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_26 = _jspx_th_c_when_26.doStartTag();
          if (_jspx_eval_c_when_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data Retur</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select kd_retur, nm_supplier, status, tgl, no_user  FROM retur_barang INNER JOIN supplier ON retur_barang.kd_supplier=supplier.kd_supplier;";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA RETUR</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahretur\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</i></button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE RETUR</th>\n");
              out.write("                          <th>SUPPLIER</th>\n");
              out.write("                          <th>TANGGAL</th>\n");
              out.write("                          <th>STATUS</th>\n");
              out.write("                          <th>AKSI</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"5\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                    <a href=\"beranda.jsp?hal=statusretur&kd_retur=");
              out.print( rs.getString(1) );
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Status</button>\n");
              out.write("                        \n");
              out.write("                    </a>\n");
              out.write("                \n");
              out.write("              \n");
              out.write("                <a href=\"faktur/cetakretur.jsp?kd_retur=");
              out.print(rs.getString(1));
              out.write("\"><button type=\"button\" class=\"btn btn-info\">Cetak</button>\n");
              out.write("                   \n");
              out.write("                </a>\n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_26.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_26);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_26);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_27 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_27.setPageContext(_jspx_page_context);
          _jspx_th_c_when_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='statusretur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_27 = _jspx_th_c_when_27.doStartTag();
          if (_jspx_eval_c_when_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("\n");
              out.write("<!DOCTYPE html>\n");
              out.write("<html>\n");
              out.write("    <head>\n");
              out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
              out.write("        <title>Status Retur</title>\n");
              out.write("    </head>\n");
              out.write("    <body>\n");

    Koneksi kon = new Koneksi();
    String kd_retur=request.getParameter("kd_retur");
    String kd_supplier=null;
    String status=null;
    String tgl=null;
    String no_user=null;
    String sql = "SELECT* FROM retur_barang WHERE kd_retur='" 
            +kd_retur+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_retur=rs.getString(1);
                kd_supplier=rs.getString(2);
                status=rs.getString(3);
                tgl=rs.getString(4);
                no_user=rs.getString(5);
               
            }

              out.write("\n");
              out.write("<div class=\"container\">\n");
              out.write("    <h2 class=\"alert alert-info text-center\" >Status Retur</h2>\n");
              out.write("    <a href=\"beranda.jsp?hal=tampilretur\"><button type=\"button\" class=\"btn btn-info\">Lihat Data</button></a><br/><br/>\n");
              out.write("    <form method=\"POST\" action=\"returServlet\" class=\"form-horizontal\" role=\"form\">\n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Kode Pesan</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <label>");
              out.print(kd_retur);
              out.write("\n");
              out.write("                    <input type=\"hidden\" class=\"form-control\" name=\"kd_retur\" value=\"");
              out.print(kd_retur);
              out.write("\">\n");
              out.write("                </label>\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("              \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Supplier</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <input readonly=\"readonly\" class=\"form-control\" name=\"kd_supplier\"  value=\"");
              out.print(kd_supplier);
              out.write("\" >\n");
              out.write("            </div>\n");
              out.write("         </div>\n");
              out.write("              \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Tanggal</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <input readonly=\"readonly\" class=\"form-control\" name=\"tgl\"  value=\"");
              out.print(tgl);
              out.write("\" >\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("              \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Petugas</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("                <input readonly=\"readonly\" class=\"form-control\" name=\"no_user\"  value=\"");
              out.print(no_user);
              out.write("\" >\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("            \n");
              out.write("        <div class=\"form-group\">\n");
              out.write("            <label  class=\"col-sm-2 control-label\">Status</label>\n");
              out.write("            <div class=\"col-sm-10\">\n");
              out.write("               <select class=\"form-control custom-select-value\" name=\"status\">\n");
              out.write("                    ");
 if (status.equalsIgnoreCase("Open")) { 
              out.write("\n");
              out.write("                        <option value=\"Open\" selected>Open</option>\n");
              out.write("                        <option value=\"Proses\">Proses</option>\n");
              out.write("                    ");
 } else if (status.equalsIgnoreCase("Proses")) { 
              out.write("\n");
              out.write("                        <option value=\"Open\">Open</option>\n");
              out.write("                        <option value=\"Proses\" selected>Proses</option>\n");
              out.write("                   ");
 } else if (status.equalsIgnoreCase("Close")) { 
              out.write("    \n");
              out.write("                        <option value=\"Close\">TIDAK DAPAT MERUBAH DATA CLOSE !!</option>\n");
              out.write("                    ");
 }
              out.write("\n");
              out.write("               </select>\n");
              out.write("            </div>\n");
              out.write("        </div>\n");
              out.write("\n");
              out.write("            \n");
              out.write("              <tr>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td></td>\n");
              out.write("                    <td>\n");
              out.write("                        <button type=\"submit\" name=\"aksi\" value=\"Update\" class=\"btn btn-success\">Simpan</button>\n");
              out.write("                    </td>\n");
              out.write("                </tr>\n");
              out.write("        </form>\n");
              out.write("</div>\n");
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_27.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_27);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_27);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_28 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_28.setPageContext(_jspx_page_context);
          _jspx_th_c_when_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahfinishretur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_28 = _jspx_th_c_when_28.doStartTag();
          if (_jspx_eval_c_when_28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("&aksi=Delete\" ><button data-toggle=\"tooltip\" title=\"Delete\" class=\"pd-setting-ed\">\n");
              out.write("                        <i class=\"fa fa-trash-o\" aria-hidden=\"true\"></i></button></a>\n");
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
              out.write("        </div> \n");
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
              out.write("    </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_28.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_28);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_28);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_29 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_29.setPageContext(_jspx_page_context);
          _jspx_th_c_when_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilfinishretur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_29 = _jspx_th_c_when_29.doStartTag();
          if (_jspx_eval_c_when_29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Finish Retur</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select kd_finish_retur, kd_retur, nm_supplier, tgl FROM finish_retur INNER JOIN supplier ON finish_retur.kd_supplier=supplier.kd_supplier;";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA FINISH RETUR</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahfinishretur\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE FINISH</th>\n");
              out.write("                          <th>KODE RETUR</th>\n");
              out.write("                          <th>SUPPLIER</th>\n");
              out.write("                          <th>TANGGAL</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"4\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(2) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                    <td>");
              out.print( rs.getString(4) );
              out.write("</td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_29.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_29);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_29);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_30 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_30.setPageContext(_jspx_page_context);
          _jspx_th_c_when_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tambahcancelstockout'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_30 = _jspx_th_c_when_30.doStartTag();
          if (_jspx_eval_c_when_30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("function hitung(){\n");
              out.write("        var1 = document.getElementById(\"item\").value;\n");
              out.write("        var2 = document.getElementById(\"nm_brg\").value;\n");
              out.write("    }\n");
              out.write("    function gantiHarga(){\n");

    sql = "select * from barang";
    rs = kon.ambilData(sql);

              out.write("\n");
              out.write("        var3 = document.getElementById(\"kd_brg\").value;\n");
              out.write("        var4 = \"\";\n");
              out.write("        ");
 while(rs.next()){ 
              out.write("\n");
              out.write("        if(var3===\"");
              out.print(rs.getString(1));
              out.write("\")\n");
              out.write("            var4=\"");
              out.print(rs.getString(2));
              out.write("\";\n");
              out.write("        if(var3===\"");
              out.print(rs.getString(1));
              out.write("\") \n");
              out.write("            var5=\"");
              out.print(rs.getString(3));
              out.write("\";\n");
              out.write("        \n");
              out.write("        ");
 } 
              out.write("\n");
              out.write("        document.getElementById(\"item\").value = var4;\n");
              out.write("        document.getElementById(\"nm_brg\").value = var5;\n");
              out.write("       \n");
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
              out.write("                             \n");
              out.write("                              <option value=\"");
              out.print(kd_karyawan);
              out.write("\">\n");
              out.write("                                  ");
              out.print(nama);
              out.write(" Pilih Karyawan\n");
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
              out.write("                          <select class=\"form-control\" name=\"kd_brg\" id=\"kd_brg\" onchange=\"gantiHarga()\">\n");
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
              out.write("                    <div class=\"form-group\" >\n");
              out.write("                        <label  class=\"col-sm-2 control-label\">Nama Barang</label>\n");
              out.write("                        <div class=\"col-sm-10\">\n");
              out.write("                          <input type=\"text\" class=\"form-control\" name=\"nm_brg\" id=\"nm_brg\" readonly=\"readonly\" >\n");
              out.write("                        </div>\n");
              out.write("                     </div> \n");
              out.write("                </div>\n");
              out.write("                <div class=\"col-md-6\">\n");
              out.write("                    <div class=\"form-group\" >\n");
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
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_30.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_30);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_30);
          out.write("\n");
          out.write("                            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_31 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_31.setPageContext(_jspx_page_context);
          _jspx_th_c_when_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='tampilcancelstockout'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_31 = _jspx_th_c_when_31.doStartTag();
          if (_jspx_eval_c_when_31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                                ");
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
              out.write("    <title>Tampil Data Cancel</title>\n");
              out.write("\n");
              out.write("    <!-- Bootstrap -->\n");
              out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
              out.write("    <link href=\"dataTables/datatables.min.css\" rel=\"stylesheet\">\n");
              out.write("  </head>\n");
              out.write("  <body>\n");

    Koneksi kon = new Koneksi();
    String sql = "select * from cancel_stock_out";
    ResultSet rs = kon.ambilData(sql);

              out.write("\n");
              out.write("      <div class=\"container\">\n");
              out.write("          <h4 class=\"alert alert-danger text-center\">DATA BARANG</h4> <br/>\n");
              out.write("          <a href=\"beranda.jsp?hal=tambahcancelstockout\"><button type=\"button\" class=\"btn btn-primary\">Tambah Data</button></a>\n");
              out.write("          <br><br>\n");
              out.write("          <div class=\"row\">\n");
              out.write("              <div class=\"col-md-12\">\n");
              out.write("                  <table class=\"table table-hover table-striped table-bordered\" id=\"datatable\">\n");
              out.write("                      <thead>\n");
              out.write("                      <tr>\n");
              out.write("                          <th>KODE CANCEL</th>\n");
              out.write("                          <th>DESKRIPSI</th>\n");
              out.write("                          <th>ITEM</th>\n");
              out.write("                          <th>NAMA</th>\n");
              out.write("                          <th>QTY</th>\n");
              out.write("                          <th>TGL</th>\n");
              out.write("                      </tr>\n");
              out.write("                      </thead>\n");
              out.write("                      <tbody>\n");

     if(!rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                    <td colspan=\"6\"> Data Kosong</td>\n");
              out.write("\n");
              out.write("                </tr>\n");
              out.write(" ");

     }
     rs.beforeFirst();
     while(rs.next()){
 
              out.write("\n");
              out.write("                <tr>\n");
              out.write("                <td>");
              out.print( rs.getString(1) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(3) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(5) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(6) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(7) );
              out.write("</td>\n");
              out.write("                <td>");
              out.print( rs.getString(8) );
              out.write("</td>\n");
              out.write("                <td>\n");
              out.write("                 \n");
              out.write("                \n");
              out.write("              \n");
              out.write("                </td>\n");
              out.write("                </tr>\n");
              out.write(" ");
 
     }
 
              out.write("\n");
              out.write("                  </tbody>\n");
              out.write("                  </table>\n");
              out.write("\n");
              out.write("\n");
              out.write("                  \n");
              out.write("              </div>\n");
              out.write("          </div>\n");
              out.write("       </div>\n");
              out.write("      \n");
              out.write("\n");
              out.write("    \n");
              out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
              out.write("    <script src=\"js/jquery.min.js\"></script>\n");
              out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
              out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
              out.write("    <!-- masukan plugins datatables -->\n");
              out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
              out.write("    <script type=\"text/javascript\">\n");
              out.write("    $(document).ready(function() {\n");
              out.write("    $('#datatable').DataTable();\n");
              out.write("} );\n");
              out.write("    </script>\n");
              out.write("  </body>\n");
              out.write("</html>\n");
              out.write("\n");
              out.write("\n");
              out.write("                            ");
              int evalDoAfterBody = _jspx_th_c_when_31.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_31);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_31);
          out.write("\n");
          out.write("                            \n");
          out.write("                            ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("                         <!--akhir param -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--akhir maincontent -->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("         <!--awal footer-->\n");
      out.write("        <footer >\n");
      out.write("            <div class=\"row text-center\">\n");
      out.write("                <p>&copy; copyright 2020 | Nurul Fitri Ansoriyati</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write(" <!--akhir footer -->\n");
      out.write("        \n");
      out.write("      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"dataTables/datatables.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function() {\n");
      out.write("    $('#datatable').DataTable();\n");
      out.write("        } );\n");
      out.write("    </script>   \n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<html>\n");
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>JSP Page</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <h1></h1>\n");
        out.write("    </body>\n");
        out.write("</html>\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
