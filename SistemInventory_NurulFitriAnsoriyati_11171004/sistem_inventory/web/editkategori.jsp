<%-- 
    Document   : editkategori
    Created on : May 6, 2020, 11:34:48 AM
    Author     : fitri
--%>

<%@page import="java.sql.*"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit Kategori</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>        
<%
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
%>
        
<div class="container">
    <h2 class="alert alert-info text-center" >EDIT DATA KATGORI</h2>
        <a href="beranda.jsp?hal=tampilkategori"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
        <form method="POST" action="kategoriServlet" class="form-horizontal" role="form">
          <div class="form-group">
              <label  class="col-sm-2 control-label">Nomor</label>
              <div class="col-sm-10">
                  <label><%=no_kategori%>
                        <input type="hidden" class="form-control" name="no_kategori" value="<%=no_kategori%>">
                  </label>
              </div>
            </div>
              
            <div class="form-group">
              <label  class="col-sm-2 control-label">Kategori</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="kategori"  value="<%=kategori%>" >
              </div>
            </div>
              
               <div class="form-group">
              <label  class="col-sm-2 control-label">Type</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="type"  value="<%=type%>">
              </div>
              </div> 
              <tr>
                    <td></td>
                    <td></td>
                    <td>
                        <button type="submit" name="aksi" value="Update" class="btn btn-success">Simpan</button>
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
