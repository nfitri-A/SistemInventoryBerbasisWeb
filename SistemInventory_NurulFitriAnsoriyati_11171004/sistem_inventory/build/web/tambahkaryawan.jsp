<%-- 
    Document   : tambahkaryawan
    Created on : May 7, 2020, 12:27:08 PM
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
    <title>Tambah Data Karyawan</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>
     <%
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
            
     %>
      <div class="container">
          <h2 class="alert alert-danger text-center"  >INPUT DATA KARYAWAN</h2>
          <a href="beranda.jsp?hal=tampilkaryawan"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST" action="karyawanServlet" class="form-horizontal" role="form" >
            <div class="form-group">
                <label  class="col-sm-2 control-label">Kode Karyawan</label>
                <div class="col-sm-10">
                    <label><%=kd_karyawan%>
                        <input type="hidden" class="form-control" name="kd_karyawan"  value="<%=kd_karyawan%>">
                    </label>
                </div>
            </div>
              
            <div class="form-group">
                <label  class="col-sm-2 control-label">Nama</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="nama" placeholder="Masukan Nama Karyawan" required="">
                </div>
            </div>
                  
            <div class="form-group">
                <label  class="col-sm-2 control-label">Gender</label>
                <div class="col-sm-10">
                    <select name="jk" class="form-control">
                        <option value="perempuan">Perempuan</option>
                        <option value="laki-laki">Laki-laki</option>
                    </select>
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
              <label  class="col-sm-2 control-label">Divisi</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="divisi" placeholder="Masukan Divisi" required="">
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