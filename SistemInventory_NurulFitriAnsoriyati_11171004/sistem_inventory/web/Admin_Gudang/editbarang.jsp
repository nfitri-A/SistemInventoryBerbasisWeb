<%-- 
    Document   : editbarang
    Created on : May 14, 2020, 11:14:59 AM
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
    <title>edit barang</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>        
<%
    Koneksi kon = new Koneksi();
    String kd_brg=request.getParameter("kd_brg");
    String item=null;
    String nm_brg=null;
    String satuan=null;
    String qty=null;
    String harga_beli=null;
    String type=null;
    String nm_rak=null;
    String harga_jual=null;
   
    String sql = "SELECT* FROM barang WHERE kd_brg='" 
            +kd_brg+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_brg=rs.getString(1);
                item=rs.getString(2);
                nm_brg=rs.getString(3);
                satuan=rs.getString(4);
                qty=rs.getString(5);
                harga_beli=rs.getString(6);
                type=rs.getString(7);
                nm_rak=rs.getString(8);
                harga_jual=rs.getString(9);
                
            }
    
String no_kategori=request.getParameter("no_kategori");

            String kategori = type;
            if(no_kategori==null)
                kategori=type;
            else{
                sql = "SELECT * FROM kategori WHERE no_kategori='"
                        + no_kategori + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kategori = rs.getString(2);
            }

String no_lokasi=request.getParameter("no_lokasi");

            String kd_rak = nm_rak;
            if(no_lokasi==null)
                kd_rak=nm_rak;
            else{
                sql = "SELECT * FROM lokasi WHERE no_lokasi='"
                        + no_lokasi + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kd_rak = rs.getString(3);
            }
%>
        
<div class="container">
          <h2 class="alert alert-info text-center"  >DATA BARANG</h2>
          <a href="beranda.jsp?hal=tampilbarang"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST" action="../admbarangServlet" class="form-horizontal" role="form" >
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Kode</label>
                        <div class="col-sm-10">
                            <label><%=kd_brg%>
                                  <input type="hidden" class="form-control" name="kd_brg"  value="<%=kd_brg%>">
                            </label>
                         </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Item</label>
                        <div class="col-sm-10">
                        <input type="text" class="form-control" name="item" value="<%=item%>">
                        </div>
                    </div> 
                </div>  
            </div>
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Deskripsi</label>
                        <div class="col-sm-10">
                           <input type="text" class="form-control" name="nm_brg" value="<%=nm_brg%>">
                        </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Satuan</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" name="satuan" value="<%=satuan%>">
                        </div>
                    </div> 
                </div>  
            </div>
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Stok</label>
                        <div class="col-sm-10">
                            <input type="text" readonly="readonly" class="form-control" name="qty" value="<%=qty%>">
                        </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Harga Beli</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" name="harga_beli" value="<%=harga_beli%>">
                        </div>
                    </div> 
                </div>  
            </div>               
                 
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Harga Jual</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="harga_jual" value="<%=harga_jual%>">
                        </div>
                     </div> 
                </div>
<%
    sql = "select * from kategori";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Kategori</label>
                        <div class="col-sm-10">
                          <select class="form-control" name="no_kategori">
                              <option value="<%=type%>">
                                  <%=kategori%>
                              </option>
                              <% while(rs.next()){ %>
                            <option value="<%=rs.getString(2)%>">
                                <%=rs.getString(2)%>
                            </option>
                            <% } %>
                          </select>
                        </div>
                    </div> 
                </div>  
            </div>
                          
            <div class="row">
<%
    sql = "select * from lokasi";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Lokasi</label>
                        <div class="col-sm-10">
                          <select class="form-control" name="no_lokasi">
                              <option value="<%=nm_rak%>">
                                  <%=kd_rak%>
                              </option>
                              <% while(rs.next()){ %>
                            <option value="<%=rs.getString(3)%>">
                                <%=rs.getString(3)%>
                            </option>
                            <% } %>
                          </select>
                        </div>
                    </div> 
                </div>              
            </div>
              
              <tr>
                    <td></td>
                    <td></td>
                    <td>
                       
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
