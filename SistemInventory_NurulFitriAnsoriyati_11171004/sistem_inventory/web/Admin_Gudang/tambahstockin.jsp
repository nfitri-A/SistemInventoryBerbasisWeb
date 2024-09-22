<%-- 
    Document   : tambahstockin
    Created on : May 21, 2020, 11:42:08 AM
    Author     : fitri
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Stock In</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    </head>
    <body>
<%
            String kd_brg_msk=null;
            String sql="select max(right(kd_brg_msk,6)) FROM stock_in";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            kd_brg_msk="BM000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    kd_brg_msk ="BM"+ kode ;
            }
           String tgl=request.getParameter("tgl");
            if(tgl==null)
                tgl="";
            String pesan=request.getParameter("kd_pesan");
            if(pesan==null)
                pesan="";
            String kd_supplier=request.getParameter("kd_supplier");
            if(kd_supplier==null)
                kd_supplier="";
           
%>
<script>
function ambilsup(){
<%
    sql = "select * from pemesanan_barang";
    rs = kon.ambilData(sql);
%>
        var10 = document.getElementById("kp").value;
        var11 = "";
        <% while(rs.next()){ %>
        if(var10==="<%=rs.getString(1)%>")
            var11="<%=rs.getString(2)%>";
        <% } %>
        document.getElementById("supplier").value = var11;
        
    }
  
</script>
<div class="container">
          <h2 class="alert alert-info text-center"  >INPUT DATA BARANG MASUK</h2>
          <a href="beranda.jsp?hal=tampilstockin"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST"  action="../admstockinServlet" class="form-horizontal" role="form" >
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">Kode Barang Masuk</label>
                        <div class="col-sm-8">
                            <label><%=kd_brg_msk%>
                                  <input type="hidden" class="form-control" name="kd_brg_msk"  value="<%=kd_brg_msk%>">
                            </label>
                         </div>
                     </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">Tanggal</label>
                        <div class="col-sm-8">
                            <input type="date" class="form-control"required="" name="tgl" value="<%=tgl%>">
                        </div>
                     </div> 
                </div>
            </div>
                        
            <div class="row">
<%
    sql = "select * from pemesanan_barang where status='Proses'";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">Kode Pesan</label>
                        <div class="col-sm-8">
                            <select class="form-control" name="kd_pesan" id="kp" required="" onchange="ambilsup()">
                                <option value="<%=pesan%>">
                                Pilih Kode Pesan
                                </option>
                                <% while(rs.next()){ %>
                                <option value="<%=rs.getString(1)%>">
                                <%=rs.getString(1)%>
                                </option>
                                       <% } %>
                            </select>
                        </div>
                    </div> 
                </div>
                <div class="col-md-6">
                     <div class="form-group">
                        <label  class="col-sm-4 control-label">Kode Supplier</label>
                        <div class="col-sm-8">
                            <input type="text" class="form-control" placeholder="Kode Supplier" required="" name="kd_supplier" id="supplier"  value="<%=kd_supplier%>"
                                          readonly="readonly">
                        </div>
                    </div>
                </div> 
            </div>

                                          <br></br>
                                          
                            
           
               
                   <button type="Submit"  name="aksi" value="Tambah" class="btn btn-primary">Lihat</button>
                 

                            
           
                

                 
              
<div class="row">
<%
    sql = "select * from stock_in_sementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from stock_in_sementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;
%>

<div class="product-status-wrap">
        <h4>Data Barang Pemesanan</h4>
           <table class="table table-hover table-striped table-bordered" id="datatable">
                    
                    <tr>
                        <th data-field="Nomer">Nomor</th>
                        <th data-field="Kode Barang">Kode Barang</th>
                        <th data-field="Item ">Item</th>
                        <th data-field="Nama Barang">Nama Barang</th>
                        <th data-field="Quantity">Quantity</th>
                        <th data-field="Action">Action</th>
                    </tr>

                    <%
                        if(!rs.next()){
                    %>
                                <tr>
                                    <td colspan="6">Data Kosong</td>
                                </tr>
                    <%
                        }
                        rs.beforeFirst();
                        while(rs.next()){
                        total = total + rs.getInt(7);
                    %>
                    <tr>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        <td>
                        <a href="../admstockinServlet?kode=<%=rs.getString(2)%>&aksi=Delete" ><button type="button" class="btn btn-danger">Delete</button></a>
                        </td>
                    </tr>
                  <%}%>
            
                </table>
        <div class="form-group data-custon-pick">
                            <div class="text-center mg-b-pro-edt custom-pro-edt-ds" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">     
                                <button type="Submit"  name="aksi" value="Simpan" class="btn btn-primary">Simpan</button>
                                <button type="Submit" name="aksi" value="Cancel" class="btn btn-danger">Batal</button>
                            </div>
                                    <input type="hidden" name="kd_brg_msk"
                                           value="<%=kd_brg_msk%>"/>
                                    <input type="hidden" name="tgl"
                                           value="<%=tgl%>"/>
                                    <input type="hidden" name="kd_pesan"
                                           value="<%=pesan%>"/>
                                    <input type="hidden" name="kd_supplier"
                                           id="supplier" value="<%=kd_supplier%>"/>
                            
        </div> 
</div>
</div>
 </form></br>

</div>                
</div>
      

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>

    </body>
</html>
