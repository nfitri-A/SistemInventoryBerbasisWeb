<%-- 
    Document   : editlokasi
    Created on : May 5, 2020, 7:09:51 PM
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
    <title>Edit Lokasi</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>        
<%
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
%>
        
<div class="container">
    <h2 class="alert alert-info text-center" >EDIT DATA LOKASI</h2>
        <a href="beranda.jsp?hal=tampillokasi"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
        <form method="POST" action="lokasiServlet" class="form-horizontal" role="form">
          <div class="form-group">
              <label  class="col-sm-2 control-label">Nomor</label>
              <div class="col-sm-10">
                  <label><%=no_lokasi%>
                        <input type="hidden" class="form-control" name="no_lokasi" value="<%=no_lokasi%>">
                  </label>
              </div>
            </div>
              
            <div class="form-group">
              <label  class="col-sm-2 control-label">Nama Rak</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="nm_rak"  value="<%=nm_rak%>" >
              </div>
            </div>
              
              <div class="form-group">
              <label  class="col-sm-2 control-label">Kode Rak</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="kd_rak"  value="<%=kd_rak%>">
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
