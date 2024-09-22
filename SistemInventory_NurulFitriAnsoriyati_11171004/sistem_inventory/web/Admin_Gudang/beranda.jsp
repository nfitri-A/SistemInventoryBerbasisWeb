<%-- 
    Document   : beranda
    Created on : May 1, 2020, 2:34:45 PM
    Author     : fitri
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>beranda</title>
<!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="../dataTables/datatables.min.css" rel="stylesheet">
<style>
 #header{
        width: 100%; /*ukuran lebar kesamping*/
        heigt: 100px; /*ukuran tinggi*/
        background: #269abc; /*untuk memberi warna pada header*/
  	}
#navbar{
            margin-bottom: 0px;
        }
 
#sidebar {
        width: 100%; /*ukuran lebar kesamping*/
        heigt: 500px; /*ukuran tinggi*/
        background:white;   
        }
 #main-content {
    	height: 500px;
        background: white; /*untuk memberi warna pada main content*/
    }               
            th, td{
                padding: 8px;
            }
            tr:nth-child(even) {background-color: #ffeaa7} /*untuk memberi warna tabel*/

                    th{
                        color: black; /*untuk memberi warna pada judul isi tabel*/
                    }
                    label{
                        color: #d58512;
                    }
                    h2{
                        color: #ac2925;
                    }
                    .glyphicon {
                        color: #00cec9;
                    }
    /* Set black background color, white text and some padding */
    footer {
      background-color: #269abc; /*untuk memberi warna pada footer*/
      color: white;
      padding: 15px;
    }
  </style>
</head>
  <%
            if ((session.getAttribute("username") == null) || (session.getAttribute("hak_akses"))== "Kepala Gudang" ){
                response.sendRedirect("login.jsp");
        %>
        <%
        }
        %> 
<body>
    <!--awal header -->
    <div id="header">
        <div class="row">
            <!--untuk menyisipkan gambar-->
            <div class="col-md-10"><img src="../img/1.png" style="width: 300px; height: 100px; padding-left: 40px;"></div>
            <!--menampilkan jam-->
            <div class="col-md-2"><h4><%=new java.util.Date()%></h4></div>
        </div>
    </div>
    <!--akhir header-->
    <!--awal navbar-->
 <nav class="navbar-default" role="navigation" style="margin-bottom: 0px;">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
    </div>
    <a class="navbar-brand" href="#">Sistem Inventory</a>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
   
      <ul class="nav navbar-nav navbar-right">
        <li><a href="beranda.jsp">Home</a></li>
         <li><a class="admin-name">Welcome <%=session.getAttribute("username")%></a></li>
        <li><a href="../Login?proses=logout">Logout</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="row no-gutters">
        <!--awal sidebar -->
        <div class="col-md-2">
            <div class="container">
            <div id="sidebar">
                <h3>Master Data</h3>
                <ul>
                    <li><a href="beranda.jsp?hal=tampilsupplier">Supplier</a></li>
                    <li><a href="beranda.jsp?hal=tampilbarang">Barang</a></li>
                </ul>
                
                <h3>Transaksi</h3>
                <ul>
                    <li><a href="beranda.jsp?hal=tampilpemesanan">Pemesanan</a></li>
                    <li><a href="beranda.jsp?hal=tampilstockin">Stock In</a></li>
                    <li><a href="beranda.jsp?hal=tampilstockout">Stock Out</a></li>
                    <li><a href="beranda.jsp?hal=tampilretur">Retur Barang</a></li>
                    <li><a href="beranda.jsp?hal=tampilfinishretur">Finish Retur</a></li>
                </ul>
                
                <h3>Report</h3>
                <ul>
                    <li><a href="report_inventory.jsp" target="_blank">Report Inventory</a></li>
                    <li><a href="report_stock_in.jsp" target="_blank">Report Stock In</a></li>
                    <li><a href="report_stock_out.jsp" target="_blank">Report Stock Out</a></li>
                    <li><a href="report_retur_barang.jsp" target="_blank">Report Retur Barang</a></li>
                </ul>
            </div>
            </div>
        </div>
                
            <!--akhir sidebar -->
            <!--awam maincontent -->
            <div class="col-md-10">
                <div id="main-content"> 
                    <div id="left_column">
                        <div class="text_area" align="justify">
                         <!--awal param -->
                         <!-- MULAI BUAT PARAM -->
                        <c:choose>
                            <c:when test="${param.hal=='tampilsupplier'}">
                                <%@include file="tampilsupplier.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='editsupplier'}">
                                <%@include file="editsupplier.jsp" %>
                            </c:when>
                            
                            <c:when test="${param.hal=='tampilbarang'}">
                                <%@include file="tampilbarang.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='editbarang'}">
                                <%@include file="editbarang.jsp" %>
                            </c:when>
                            
                           
                            <c:when test="${param.hal=='tampilpemesanan'}">
                                <%@include file="tampilpemesanan.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='statuspemesanan'}">
                                <%@include file="statuspemesanan.jsp" %>
                            </c:when>
                            
                            <c:when test="${param.hal=='tambahstockin'}">
                                <%@include file="tambahstockin.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='tampilstockin'}">
                                <%@include file="tampilstockin.jsp" %>
                            </c:when>
                            
                            <c:when test="${param.hal=='tambahstockout'}">
                                <%@include file="tambahstockout.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='tampilstockout'}">
                                <%@include file="tampilstockout.jsp" %>
                            </c:when>
                            
                            <c:when test="${param.hal=='tambahretur'}">
                                <%@include file="tambahretur.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='tampilretur'}">
                                <%@include file="tampilretur.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='statusretur'}">
                                <%@include file="statusretur.jsp" %>
                            </c:when>
                            
                            <c:when test="${param.hal=='tambahfinishretur'}">
                                <%@include file="tambahfinishretur.jsp" %>
                            </c:when>
                            <c:when test="${param.hal=='tampilfinishretur'}">
                                <%@include file="tampilfinishretur.jsp" %>
                            </c:when>
                            
                         
                            <c:otherwise>
                                <%@include file="home.jsp" %>
                            </c:otherwise>
                        </c:choose>
                         <!--akhir param -->
                        </div>
                    </div>
                </div>
            </div>
            <!--akhir maincontent -->
        </div>
    </div>
         <!--awal footer-->
        <footer >
            <div class="row text-center">
                <p>&copy; copyright 2020 | Nurul Fitri Ansoriyati</p>
            </div>
        </footer>
 <!--akhir footer -->
        
      <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="../js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../js/bootstrap.min.js"></script>
    <script src="../dataTables/datatables.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
    $('#datatable').DataTable();
        } );
    </script>   
</body>
</html>
