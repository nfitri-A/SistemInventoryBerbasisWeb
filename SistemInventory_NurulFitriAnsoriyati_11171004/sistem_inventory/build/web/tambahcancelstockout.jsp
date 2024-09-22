<%-- 
    Document   : tambahcancelstockout
    Created on : May 28, 2020, 11:51:48 AM
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
         String kd_cancel=null;
         String sql="select max(right(kd_cancel,5)) FROM cancel_stock_out";
         Koneksi kon = new Koneksi();
         ResultSet rs = kon.ambilData(sql);
         if(!rs.next())
            kd_cancel="CL00001";
         else{
             rs.last();
             int autoKode = rs.getInt(1)+1;
             String kode = String.valueOf(autoKode);
             int panjang = kode.length();
             for (int a = panjang; a < 5; a++) {
                 kode = "0" + kode;
             }
             kd_cancel="CL"+kode;
         }
            String nama=request.getParameter("nama");
            String item=request.getParameter("item");
            String kode=request.getParameter("kode");
            String kd_karyawan=request.getParameter("kd_karyawan");
            if(nama==null)
                nama="";
            String kategori = null;
            if(kd_karyawan==null)
                kategori="Pilih Karyawan";
            else{
                sql = "SELECT * FROM karyawan WHERE kd_karyawan='"
                        + kd_karyawan + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    nama = rs.getString(2);
            }
     %>
<script>
function hitung(){
        var1 = document.getElementById("item").value;
        var2 = document.getElementById("nm_brg").value;
    }
    function gantiHarga(){
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
        var3 = document.getElementById("kd_brg").value;
        var4 = "";
        <% while(rs.next()){ %>
        if(var3==="<%=rs.getString(1)%>")
            var4="<%=rs.getString(2)%>";
        if(var3==="<%=rs.getString(1)%>") 
            var5="<%=rs.getString(3)%>";
        
        <% } %>
        document.getElementById("item").value = var4;
        document.getElementById("nm_brg").value = var5;
       
    }
</script>
        <div class="container">
          <h2 class="alert alert-info text-center"  >INPUT DATA CANCEL</h2>
          <a href="beranda.jsp?hal=tampilcancelstockout"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST" action="cancelstockoutServlet" class="form-horizontal" role="form" >
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Kode Cancel</label>
                        <div class="col-sm-10">
                            <label><%=kd_cancel%>
                                  <input type="hidden" class="form-control" name="kd_cancel"  value="<%=kd_cancel%>">
                            </label>
                         </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Deskripsi</label>
                        <div class="col-sm-10">
                        <input type="text" class="form-control" name="deskripsi" placeholder="Masukan Nomor Stock Out" required="">
                        </div>
                    </div> 
                </div>  
            </div>
                            
            <div class="row">
<%
    sql = "select * from karyawan";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Di Kembalikan Oleh</label>
                        <div class="col-sm-10">
                           <select class="form-control" name="kd_karyawan">
                             
                              <option value="<%=kd_karyawan%>">
                                  <%=nama%> Pilih Karyawan
                              </option>
                              <% while(rs.next()){ %>
                            <option value="<%=rs.getString(1)%>">
                                <%=rs.getString(2)%>
                            </option>
                            <% } %>
                          </select>
                        </div>
                    </div>
                </div>
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Barang</label>
                        <div class="col-sm-10">
                          <select class="form-control" name="kd_brg" id="kd_brg" onchange="gantiHarga()">
                              <option value="">Pilih Barang</option>
                              <% while(rs.next()){ %>
                              <option value="<%=rs.getString(1)%>">
                                             <%=rs.getString(2)%>
                                             <%=rs.getString(3)%>
                                             <%=rs.getString(5)%>
                              </option>
                                            <% } %>
                          </select>
                        </div>
                    </div> 
                </div>  
            </div>
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group" >
                        <label  class="col-sm-2 control-label">Nama Barang</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" name="nm_brg" id="nm_brg" readonly="readonly" >
                        </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group" >
                        <label  class="col-sm-2 control-label">Item</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" name="item" id="item" readonly="readonly" >
                        </div>
                    </div> 
                </div>  
            </div>
                          
           <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Quantity</label>
                        <div class="col-sm-10">
                          <input type="text" class="form-control" name="qty" placeholder="0" required="">
                        </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Tanggal</label>
                        <div class="col-sm-10">
                          <input type="date" class="form-control" name="tgl" required="">
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
          </form>
      </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>

