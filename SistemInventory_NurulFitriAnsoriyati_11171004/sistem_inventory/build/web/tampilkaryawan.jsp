<%-- 
    Document   : tampilkaryawan
    Created on : May 7, 2020, 12:22:05 PM
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
    <title>Tampil Data Karyawan</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="dataTables/datatables.min.css" rel="stylesheet">
  </head>
  <body>
<%
    Koneksi kon = new Koneksi();
    String sql = "select * from karyawan";
    ResultSet rs = kon.ambilData(sql);
%>
      <div class="container">
          <h4 class="alert alert-danger text-center">DATA KARYAWAN</h4> <br/>
          <a href="beranda.jsp?hal=tambahkaryawan"><button type="button" class="btn btn-primary">Tambah Data</button></a>
          <br><br>
          <div class="row">
              <div class="col-md-12">
                  <table class="table table-hover table-striped table-bordered" id="datatable">
                      <thead>
                      <tr>
                          <th>KODE KARYAWAN</th>
                          <th>NAMA</th>
                          <th>GENDER</th>
                          <th>TELPON</th>
                          <th>DIVISI</th>
                          <th>AKSI</th>
                      </tr>
                      </thead>
                      <tbody>
<%
     if(!rs.next()){
 %>
                <tr>
                    <td colspan="6"> Data Kosong</td>

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
                <td><%= rs.getString(5) %></td>
                <td><%= rs.getString(6) %></td>
                <td>
                    <a href="beranda.jsp?hal=editkaryawan&kd_karyawan=<%= rs.getString(1) %>"><button type="button" class="btn btn-info">Edit</button>
                        
                    </a>
                
               
                <a href="karyawanServlet?kd_karyawan=<%= rs.getString(1) %>&aksi=Delete"><button type="button" class="btn btn-danger">Delete</button>
                   
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
