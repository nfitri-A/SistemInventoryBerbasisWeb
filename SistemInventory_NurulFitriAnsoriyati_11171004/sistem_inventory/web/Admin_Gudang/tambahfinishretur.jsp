<%-- 
    Document   : tambahfinishretur
    Created on : May 27, 2020, 9:13:42 PM
    Author     : fitri
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Finish Retur</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    </head>
    <body>
<%
            String kd_finish_retur=null;
            String sql="select max(right(kd_finish_retur,6)) FROM finish_retur";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            kd_finish_retur="FR000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    kd_finish_retur ="FR"+ kode ;
            }
           String tgl=request.getParameter("tgl");
            if(tgl==null)
                tgl="";
            String kd_retur=request.getParameter("kd_retur");
            if(kd_retur==null)
                kd_retur="";
            String kd_supplier=request.getParameter("kd_supplier");
            if(kd_supplier==null)
                kd_supplier="";
           
%>
<script>
function ambilsup(){
<%
    sql = "select * from retur_barang";
    rs = kon.ambilData(sql);
%>
        var10 = document.getElementById("kr").value;
        var11 = "";
        <% while(rs.next()){ %>
        if(var10==="<%=rs.getString(1)%>")
            var11="<%=rs.getString(2)%>";
        <% } %>
        document.getElementById("supplier").value = var11;
        
    }
  
</script>
<div class="container">
          <h2 class="alert alert-info text-center"  >INPUT DATA FINISH RETUR</h2>
          <a href="beranda.jsp?hal=tampilfinishretur"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST"  action="../admfinish_retur_Servlet" class="form-horizontal" role="form" >
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">Kode Finish Retur</label>
                        <div class="col-sm-8">
                            <label><%=kd_finish_retur%>
                                  <input type="hidden" class="form-control" name="kd_finish_retur"  value="<%=kd_finish_retur%>">
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
    sql = "select * from retur_barang where status='Proses'";
    rs = kon.ambilData(sql);
%>
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">Kode Retur</label>
                        <div class="col-sm-8">
                            <select class="form-control" name="kd_retur" id="kr" required="" onchange="ambilsup()">
                                <option value="<%=kd_retur%>">
                                Pilih Kode Retur
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
    sql = "select * from finish_retur_sementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from finish_retur_sementara";
    ResultSet rs2 = kon.ambilData(sql);
    String jum="0";
    if(rs2.next())
        jum=rs2.getString(1);
    int total=0;
%>

<div class="product-status-wrap">
        <h4>Data Barang Retur</h4>
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
                    
                    %>
                    <tr>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        <td>
                        <a href="../admfinish_retur_Servlet?kode=<%=rs.getString(2)%>&aksi=Delete" ><button type="button" class="btn btn-danger">Delete</button></a>
                        </td>
                    </tr>
                  <%}%>
            
                </table>
        <div class="form-group data-custon-pick">
                            <div class="text-center mg-b-pro-edt custom-pro-edt-ds" class="col-lg-6 col-md-6 col-sm-6 col-xs-6">     
                                <button type="Submit"  name="aksi" value="Simpan" class="btn btn-primary">Simpan</button>
                                <button type="Submit" name="aksi" value="Cancel" class="btn btn-danger">Batal</button>
                            </div>
                                    <input type="hidden" name="kd_finish_retur"
                                           value="<%=kd_finish_retur%>"/>
                                    <input type="hidden" name="tgl"
                                           value="<%=tgl%>"/>
                                    <input type="hidden" name="kd_retur"
                                           value="<%=kd_retur%>"/>
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
