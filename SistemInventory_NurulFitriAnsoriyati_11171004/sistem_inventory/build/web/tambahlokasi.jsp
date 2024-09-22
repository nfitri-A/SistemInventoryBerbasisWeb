<%-- 
    Document   : tambahlokasi
    Created on : May 5, 2020, 6:59:19 PM
    Author     : fitri
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Tambah Data Lokasi</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>
     <%
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
            
     %>
      <div class="container">
          <h2 class="alert alert-danger text-center"  >INPUT DATA LOKASI</h2>
          <a href="beranda.jsp?hal=tampillokasi"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST" action="lokasiServlet" class="form-horizontal" role="form" >
            <div class="form-group">
              <label  class="col-sm-2 control-label">Nomor</label>
              <div class="col-sm-10">
                  <label><%=no_lokasi%>
                        <input type="hidden" class="form-control" name="no_lokasi"  value="<%=no_lokasi%>">
                  </label>
              </div>
            </div>
              
            <div class="form-group">
              <label  class="col-sm-2 control-label">Nama Rak</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="nm_rak" placeholder="Masukan Nama Rak " required="">
              </div>
            </div>
              
              <div class="form-group">
              <label  class="col-sm-2 control-label">Kode Rak</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="kd_rak" placeholder="Masukan Kode Rak" required="">
              </div>
            </div>
                  
                 
              
            <tr>
                    <td></td>
                    <td></td>
                    <td>
                        <input type="hidden" name="aksi" value="Insert">
                        <button type="submit" class="btn btn-success">Simpan</button>
                    </td>
                </tr>
      </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
