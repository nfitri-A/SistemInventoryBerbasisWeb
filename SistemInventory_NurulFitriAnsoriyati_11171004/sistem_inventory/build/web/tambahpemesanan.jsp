<%-- 
    Document   : tambahpemesanan
    Created on : May 14, 2020, 3:45:44 PM
    Author     : fitri
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>tambah pemesanan</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    </head>
    <body>
<%
            String kd_pesan=null;
            String sql="select max(right(kd_pesan,6)) FROM pemesanan_barang";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            kd_pesan="PS000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    kd_pesan ="PS"+ kode ;
            }
            String tgl=request.getParameter("tgl");
            String supp=request.getParameter("kd_supplier");
            if(tgl==null)
                tgl="";
            String nmsupp = null;
            if(supp==null)
                nmsupp="Pilih Supplier";
            else{
                sql = "SELECT * FROM supplier WHERE kd_supplier='"
                        + supp + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    nmsupp = rs.getString(2);
            }
      
            String no_user=request.getParameter("no_user");
            String username = null;
            if(no_user==null)
                username="Pilih Petugas";
            else{
                sql = "SELECT * FROM user WHERE no_user='"
                        + no_user + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    username = rs.getString(2);
            }
            String kode=request.getParameter("kode");
            String item=request.getParameter("item");
            String nama=request.getParameter("nama");
            String qty=request.getParameter("qty");
            String harga=request.getParameter("harga");
            String subtotal=request.getParameter("subtotal");
            String aksi=request.getParameter("aksi");
            sql = "INSERT INTO pesansementara VALUES('" 
                    + kd_pesan + "','" 
                    + kode + "','" 
                    + item + "','" 
                    + nama + "',"
                    + qty + ","
                    + harga + "," 
                    + subtotal + ")";
            int eror=0;
            if(aksi!=null)
                if(aksi.equals("Tambah"))
                eror = kon.stmt.executeUpdate(sql);
            if(eror>0)
            out.print("<script>"
                    + "alert('Data Berhasil di "+aksi+"');"
                    
                    + "</script>");
%>
<script>

  function hitung(){
        var1 = document.getElementById("qty").value;
        var2 = document.getElementById("harga_beli").value;
        var3 = parseInt(var1) * parseInt(var2);
        if(!isNaN(var3))
        document.getElementById("sub").value = var3;
    }
    function gantiHarga(){
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
        var4 = document.getElementById("kb").value;
        var5 = "";

        <% while(rs.next()){ %>
        if(var4==="<%=rs.getString(1)%>")
             var5="<%=rs.getString(6)%>";
        <% } %>
        document.getElementById("harga_beli").value = var5;
        hitung();
    }
        function ambilitem(){
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
        var6 = document.getElementById("kb").value;
        var7 = "";
        <% while(rs.next()){ %>
        if(var6==="<%=rs.getString(1)%>")
            var7="<%=rs.getString(2)%>";
            
        <% } %>
        document.getElementById("item").value = var7;
        hitung();
    }
        function ambilnama(){
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
        var8 = document.getElementById("kb").value;
        var9 = "";

        <% while(rs.next()){ %>
        if(var8==="<%=rs.getString(1)%>")
             var9="<%=rs.getString(3)%>";
        <% } %>
        document.getElementById("nama_barang").value = var9;
        hitung();
    }
</script>
<div class="container">
          <h2 class="alert alert-info text-center"  >INPUT DATA PEMESANAN</h2>
          <a href="beranda.jsp?hal=tampilpemesanan"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST"  class="form-horizontal" role="form" >
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Kode Pesan</label>
                        <div class="col-sm-10">
                            <label><%=kd_pesan%>
                                  <input type="hidden" class="form-control" name="kd_pesan"  value="<%=kd_pesan%>">
                            </label>
                         </div>
                     </div> 
                </div>
<%
    sql = "select * from supplier";
    rs = kon.ambilData(sql);
%>
              <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Supplier</label>
                        <div class="col-sm-10">
                          <select class="form-control" name="kd_supplier">
                              <option value="<%=supp%>">
                                  <%=nmsupp%>
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
            </div>
                            
            <div class="row">
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Barang</label>
                        <div class="col-sm-10">
                          <select class="form-control" name="kode" id="kb" required="" onchange="gantiHarga()&ambilnama()&ambilitem()">
                              <option value="">Pilih Barang</option>
                              <% while(rs.next()){ %>
                              <option value="<%=rs.getString(1)%>">
                                             <%=rs.getString(2)%>
                                             <%=rs.getString(3)%>
                                             <%=rs.getString(5)%>
                              </option>
                                            <% } %>
                          </select>
                           <input type="hidden" name="item" id="item" readonly="readonly" >
                        </div>
                    </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Tanggal</label>
                        <div class="col-sm-10">
                          <input type="date" class="form-control" name="tgl" value="<%=tgl%>">
                        </div>
                    </div> 
                </div>  
            </div>
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Quantity</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="0" required="" name="qty" id="qty" onchange="hitung()">
                            <input type="hidden"  name="nama" id="nama_barang" readonly="readonly">

                        </div>
                     </div> 
                </div>
<%
    sql = "select * from user";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                     <div class="form-group">
                        <label  class="col-sm-2 control-label">Petugas</label>
                        <div class="col-sm-10">
                        <input type="text" readonly="readonly" name="no_user" value=<%=session.getAttribute("username")%>
                        </div>
                    </div>
                </div>  
            </div>   
                            
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Harga Beli</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" placeholder="Harga Barang" required="" name="harga" id="harga_beli" readonly="readonly">
                            
                        </div>
                     </div> 
                </div>

                <div class="col-md-6">
                    <input type="hidden" name="aksi" value="Tambah">
                     <button type="submit" class="btn btn-success">Tambah</button>
                </div>  
            </div> 
            
            <div class="row">
                <div class="col-md-6">
                    <label  class="col-sm-2 control-label">Total</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Subtotal" required="" name="subtotal" id="sub" readonly="1"> 
                    </div>
                </div>              
            </div>
                  
         </form></br>  
         <form method="POST" action="pemesananServlet">
<div class="row">
<%
    sql = "select * from pesansementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from pesansementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;
%>

<div class="product-status-wrap">
        <h4>Data Barang Untuk Dipesan</h4>
            <table class="table table-hover table-striped table-bordered" id="datatable">
                    
                    <tr>
                        <th data-field="Nomer">Nomor</th>
                        <th data-field="Kode Barang">Kode Barang</th>
                        <th data-field="Item ">Item</th>
                        <th data-field="Nama Barang">Nama Barang</th>
                        <th data-field="Quantity">Quantity</th>
                         <th data-field="Harga">Harga</th>
                        <th data-field="Subtotal">Subtotal</th>
                        <th data-field="Action">Action</th>
                    </tr>

                    <%
                        if(!rs.next()){
                    %>
                                <tr>
                                    <td colspan="8">Data Kosong</td>
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
                        <td><%=rs.getString(6)%></td>
                        <td><%=rs.getString(7)%></td>
                        <td>
                        <a href="pemesananServlet?kode=<%=rs.getString(2)%>&aksi=Delete" ><button type="button" class="btn btn-danger">Delete</button>
                        </td>
                    </tr>
                  <%}%>
            
                </table>
        </div>
    </div>
</div>
 
            <div class="row">
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                    <div class="review-content-section">
                       <div class="form-group data-custon-pick" id="data_1">
                            <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                                <label> &nbsp; &nbsp; </label>
                            </div>
                            <div class="input-group mg-b-pro-edt" class="col-lg-4 col-md-4 col-sm-4 col-xs-6">     
                                    &nbsp; &nbsp;
                            </div>
                        </div>
                        <div class="form-group data-custon-pick">
                            <div class="text-center mg-b-pro-edt custom-pro-edt-ds" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">  
                                <label> Setelah Pemesanan Ubah Status Jadi Proses</label>
                            </div>
                            <div class="text-center mg-b-pro-edt custom-pro-edt-ds" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">     
                                <button type="Submit"  name="aksi" value="Simpan" class="btn btn-primary waves-effect waves-light m-r-10">Simpan</button>
                                <button type="Submit" name="aksi" value="Cancel" class="btn btn-warning waves-effect waves-light">Batal</button>
                            </div>
                        </div>  
                    </div>
                </div>
                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                    <div class="review-content-section">
                       <div class="form-group data-custon-pick">
                           <div class="form-group data-custon-pick">
                                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                                    <label class="login2 pull-right pull-right-pro">Jumlah Barang</label>
                                </div>
                                <div class="input-group mg-b-pro-edt" class="col-lg-4 col-md-4 col-sm-4 col-xs-6">     
                                    <span class="input-group-addon"><i class="fa fa-tag" aria-hidden="true"></i></span><%=jum%>
                                    <input type="hidden"  name="" value="<%=jum%>" readonly="1"/>
                                </div>
                            </div>
                            <div class="form-group data-custon-pick">
                                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                                    <label class="login2 pull-right pull-right-pro">Total Harga</label>
                                </div>
                                <div class="input-group mg-b-pro-edt" class="col-lg-4 col-md-4 col-sm-4 col-xs-6">     
                                    <span class="input-group-addon"><i class="fa fa-usd" aria-hidden="true"></i></span>Rp. <%=total%>
                                    <input type="hidden" id="t_harga" name="total_bayar" required="" value="<%=total%>" readonly="1"/>
                                    <input type="hidden" name="kd_pesan"
                                       value="<%=kd_pesan%>"/>
                                    <input type="hidden" name="tgl"
                                           value="<%=tgl%>"/>
                                    <input type="hidden" name="kd_supplier"
                                           value="<%=supp%>"/>
                                    <input type="hidden" name="no_user"
                                           value="<%=no_user%>"/>
                                    <input type="hidden" name="status" value="Open">
                                </div>
                            </div>
                       </div>
                    </div>
                </div>
            </div>
        </form>              
</div>
      

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>

    </body>
</html>
