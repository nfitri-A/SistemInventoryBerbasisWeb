<%-- 
    Document   : tambahuser
    Created on : May 1, 2019, 3:37:04 PM
    Author     : Fitri.A
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
    <title>Tambah Data User</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
 
  <body>

     <%
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
            
     %>
      <div class="container">
          <h2 class="alert alert-danger text-center"  >INPUT DATA USER</h2>
          <a href="beranda.jsp?hal=tampiluser"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST" action="userServlet" class="form-horizontal" role="form" >
            <div class="form-group">
              <label  class="col-sm-2 control-label">Nomor</label>
              <div class="col-sm-10">
                  <label><%=no_user%>
                        <input type="hidden" class="form-control" name="no_user"  value="<%=no_user%>">
                  </label>
              </div>
            </div>
              
            <div class="form-group">
              <label  class="col-sm-2 control-label">Username</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="username" placeholder="Masukan Username Anda" required="">
              </div>
            </div>
              
              <div class="form-group">
              <label  class="col-sm-2 control-label">Password</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="password" placeholder="Masukan Password Anda" required="">
              </div>
            </div>
                  
            
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Hak Akses</label>
                        <div class="col-sm-10">
                          <select name="hak_akses" class="form-control">
                                <option value="Kepala Gudang">Kepala Gudang</option>
                                <option value="Admin Gudang">Admin Gudang</option>
                            </select>
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
                    </form>
      </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>