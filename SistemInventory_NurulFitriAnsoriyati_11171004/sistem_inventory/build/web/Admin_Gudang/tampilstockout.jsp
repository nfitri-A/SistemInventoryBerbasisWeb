<%-- 
    Document   : tampilstockout
    Created on : May 21, 2020, 8:01:56 PM
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
    <title>Tampil Barang Keluar</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="dataTables/datatables.min.css" rel="stylesheet">
  </head>
  <body>
<%
    Koneksi kon = new Koneksi();
    String sql = "select kd_brg_klr, nama, username, tgl FROM stock_out JOIN karyawan ON stock_out.kd_karyawan=karyawan.kd_karyawan JOIN user ON stock_out.no_user=user.no_user;";
    ResultSet rs = kon.ambilData(sql);
%>
      <div class="container">
          <h4 class="alert alert-danger text-center">DATA BARANG KELUAR</h4> <br/>
          <a href="beranda.jsp?hal=tambahstockout"><button type="button" class="btn btn-primary">Tambah Data</button></a>
          <br><br>
          <div class="row">
              <div class="col-md-12">
                  <table class="table table-hover table-striped table-bordered" id="datatable">
                      <thead>
                      <tr>
                          <th>KODE STOCK OUT</th>
                          <th>KARYAWAN</th>
                          <th>PETUGAS</th>
                          <th>TANGGAL</th>
                          <th>AKSI</th>
                      </tr>
                      </thead>
                      <tbody>
<%
     if(!rs.next()){
 %>
                <tr>
                    <td colspan="5"> Data Kosong</td>

                </tr>
 <%
     }
     rs.beforeFirst();
     while(rs.next()){
 %>
                <tr>
                    <td><%= rs.getString(1) %></td>
                    <td><%= rs.getString(2) %></td>
                    <td><%= rs.getString(3) %></td>
                    <td><%= rs.getString(4) %></td>
                    <td>
                        <a href="../faktur/cetakstockout.jsp?kd_brg_klr=<%=rs.getString(1)%>"><button type="button" class="btn btn-info">VIEW</button>

                        </a>
                    </td>
                </tr>
 <% 
     }
 %>
                  </tbody>
                  </table>


                  
              </div>
          </div>
       </div>
      

    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <!-- masukan plugins datatables -->
    <script src="dataTables/datatables.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
    $('#datatable').DataTable();
} );
    </script>
  </body>
</html>
