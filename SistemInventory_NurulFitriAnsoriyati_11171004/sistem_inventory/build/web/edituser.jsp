<%-- 
    Document   : edituser
    Created on : May 4, 2020, 3:45:55 PM
    Author     : Fitri.A
--%>

<%@page import="java.sql.*"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Edit User</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>        
<%
    Koneksi kon = new Koneksi();
    String no_user=request.getParameter("no_user");
    String username=null;
    String password=null;
    String hak_akses=null;
    String sql = "SELECT* FROM user WHERE no_user='" 
            +no_user+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                no_user=rs.getString(1);
                username=rs.getString(2);
                password=rs.getString(3);
                hak_akses=rs.getString(4);
            }
%>
        
<div class="container">
    <h2 class="alert alert-info text-center" >EDIT DATA USER</h2>
        <a href="beranda.jsp?hal=tampiluser"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
        <form method="POST" action="userServlet" class="form-horizontal" role="form">
          <div class="form-group">
              <label  class="col-sm-2 control-label">Nomor</label>
              <div class="col-sm-10">
                  <label><%=no_user%>
                        <input type="hidden" class="form-control" name="no_user" value="<%=no_user%>">
                  </label>
              </div>
            </div>
              
            <div class="form-group">
              <label  class="col-sm-2 control-label">Username</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="username"  value="<%=username%>" >
              </div>
            </div>
              
              <div class="form-group">
              <label  class="col-sm-2 control-label">Password</label>
              <div class="col-sm-10">
                <input type="text" class="form-control" name="password"  value="<%=password%>">
              </div>
            </div> 
              
              <div class="form-group">
                        <label  class="col-sm-2 control-label">Hak Akses</label>
                        <div class="col-sm-10">
                            <%
                            if (hak_akses.equalsIgnoreCase("Kepala Gudang"))
                            { %>
                            <select name="hak_akses" class="form-control">
                                <option value="Kepala Gudang" selected>Kepala Gudang</option>
                                <option value="Admin Gudang">Admin Gudang</option>
                            </select>
                          <% } else { %>
                          <select name="hak_akses" class="form-control">
                                <option value="Kepala Gudang">Kepala Gudang</option>
                                <option value="Admin Gudang" selected>Admin Gudang</option>
                            </select>
                          <% } %>
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
