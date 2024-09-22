<%-- 
    Document   : editsupplier
    Created on : May 7, 2020, 10:55:31 AM
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
    <title>Edit Supplier</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>        
<%
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
%>
        
<div class="container">
    <h2 class="alert alert-info text-center" >DATA SUPPLIER</h2>
        <a href="beranda.jsp?hal=tampilsupplier"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
        <form method="POST" action="../admsupplierServlet" class="form-horizontal" role="form">
          <div class="form-group">
              <label  class="col-sm-2 control-label">Kode Supplier</label>
              <div class="col-sm-10">
                  <label><%=kd_supplier%>
                        <input type="hidden" class="form-control" name="kd_supplier" value="<%=kd_supplier%>">
                  </label>
              </div>
            </div>
              
            <div class="form-group">
              <label  class="col-sm-2 control-label">Nama</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="nm_supplier"  value="<%=nm_supplier%>" >
              </div>
            </div>
              
              <div class="form-group">
              <label  class="col-sm-2 control-label">Alamat</label>
              <div class="col-sm-10">
                <textarea type="text" class="form-control" name="alamat" row=5 > <%=alamat%></textarea>
              </div>
            </div> 
              
             <div class="form-group">
              <label  class="col-sm-2 control-label">Telpon</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="no_tlp"  value="<%=no_tlp%>" >
              </div>
             </div>
              
              <div class="form-group">
              <label  class="col-sm-2 control-label">Email</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="email"  value="<%=email%>" >
              </div>
              </div>
            
              <tr>
                    <td></td>
                    <td></td>
                   
                </tr>
        </form>
</div>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
