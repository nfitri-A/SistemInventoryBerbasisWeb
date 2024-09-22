<%-- 
    Document   : tambahsupplier
    Created on : May 7, 2020, 10:42:04 AM
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
    <title>Tambah Data Supplier</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>
     <%
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
            
     %>
      <div class="container">
          <h2 class="alert alert-danger text-center"  >INPUT DATA SUPPLIER</h2>
          <a href="beranda.jsp?hal=tampilsupplier"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST" action="supplierServlet" class="form-horizontal" role="form" >
            <div class="form-group">
              <label  class="col-sm-2 control-label">Kode Supplier</label>
              <div class="col-sm-10">
                  <label><%=kd_supplier%>
                        <input type="hidden" class="form-control" name="kd_supplier"  value="<%=kd_supplier%>">
                  </label>
              </div>
            </div>
              
            <div class="form-group">
              <label  class="col-sm-2 control-label">Nama</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="nm_supplier" placeholder="Masukan Nama Supplier" required="">
              </div>
            </div>
              
              <div class="form-group">
              <label  class="col-sm-2 control-label">Alamat</label>
              <div class="col-sm-10">
                <textarea type="text" class="form-control" name="alamat" required="" row=5></textarea>
              </div>
            </div>
                  
            <div class="form-group">
              <label  class="col-sm-2 control-label">Telpon</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="no_tlp" placeholder="Masukan nomot telpon" required="">
              </div>
            </div>     
            
            <div class="form-group">
              <label  class="col-sm-2 control-label">email</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="email" placeholder="Masukan alamat email" required="">
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