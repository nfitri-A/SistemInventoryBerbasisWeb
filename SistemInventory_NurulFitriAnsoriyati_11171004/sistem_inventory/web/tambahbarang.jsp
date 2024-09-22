<%-- 
    Document   : tambahbarang
    Created on : May 14, 2020, 9:26:48 AM
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
    <title>Tambah Data Barang</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
  </head>
  <body>
     <%
         String kd_brg=null;
         String sql="select max(right(kd_brg,5)) FROM barang";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            kd_brg="BR00001";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 5; a++) {
                 kode = "0" + kode;
             }
             kd_brg="BR"+kode;
         }
            String type=request.getParameter("type");
            String no_kategori=request.getParameter("no_kategori");
            if(type==null)
                type="";
            String kategori = null;
            if(no_kategori==null)
                kategori="Pilih kategori";
            else{
                sql = "SELECT * FROM kategori WHERE no_kategori='"
                        + no_kategori + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kategori = rs.getString(2);
            }
        
            String nm_rak=request.getParameter("nm_rak");
            String no_lokasi=request.getParameter("no_lokasi");
            if(nm_rak==null)
                nm_rak="";
            String kd_rak = null;
            if(no_lokasi==null)
                kd_rak="Pilih lokasi";
            else{
                sql = "SELECT * FROM lokasi WHERE no_lokasi='"
                        + no_lokasi + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    kd_rak = rs.getString(3);
            } 
     %>
      <div class="container">
          <h2 class="alert alert-info text-center"  >INPUT DATA BARANG</h2>
          <a href="beranda.jsp?hal=tampilbarang"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST" action="barangServlet" class="form-horizontal" role="form" >
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">KODE</label>
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
                        <input type="text" class="form-control" name="item" placeholder="Masukan Item" required="">
                        </div>
                    </div> 
                </div>  
            </div>
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Deskripsi</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="nm_brg" placeholder="Masukan Nama Barang" required="">
                        </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Satuan</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" name="satuan" placeholder="Masukan Satuan" required="">
                        </div>
                    </div> 
                </div>  
            </div>
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Stok</label>
                        <div class="col-sm-10">
                            <input readonly="readonly" class="form-control" name="qty" placeholder="0" value="0">
                        </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Harga Beli</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" name="harga_beli" placeholder="Masukan harga beli" required="">
                        </div>
                    </div> 
                </div>  
            </div>   
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Harga Jual</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="harga_jual" placeholder="Masukan harga jual" required="">
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
                              <option value="<%=no_kategori%>">
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
                              <option value="<%=no_lokasi%>">
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
                  
                            <br/>
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

