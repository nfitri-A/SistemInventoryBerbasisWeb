<%-- 
    Document   : tambahretur
    Created on : May 27, 2020, 8:24:31 PM
    Author     : fitri
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>tambah retur</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    </head>
    <body>
<%
            String nomor=null;
            String sql="select max(right(kd_retur,6)) FROM retur_barang";
            Koneksi kon = new Koneksi();
            ResultSet rs =kon.ambilData(sql);
            if(!rs.next())
            nomor="RT000001";
            else{
                rs.last();
                int autoKode = rs.getInt(1) +1;
                String kode = String.valueOf(autoKode);
                int panjang = kode.length();
                for (int a = panjang; a < 6; a++){
                    kode = "0" + kode;
                
            }
                    nomor ="RT"+ kode ;
            }
            String tgl=request.getParameter("tgl");
            String kd_supplier=request.getParameter("kd_supplier");
            if(tgl==null)
                tgl="";
            String nma = null;
            if(kd_supplier==null)
                nma="Pilih Supplier";
            else{
                sql = "SELECT * FROM supplier WHERE kd_supplier='"
                        + kd_supplier + "'";
                rs = kon.ambilData(sql);
                if(rs.next())
                    nma = rs.getString(2);
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
            String aksi=request.getParameter("aksi");
            sql = "INSERT INTO retur_sementara VALUES('" 
                    + nomor + "','" 
                    + kode + "','" 
                    + item + "','" 
                    + nama + "',"
                    + qty + ")";
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

        function ambilitem(){
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
        var1 = document.getElementById("kb").value;
        var2 = "";
        <% while(rs.next()){ %>
        if(var1==="<%=rs.getString(1)%>")
            var2="<%=rs.getString(2)%>";
            
        <% } %>
        document.getElementById("itm").value = var2;
        hitung();
    }
        function ambilnama(){
<%
    sql = "select * from barang";
    rs = kon.ambilData(sql);
%>
        var3 = document.getElementById("kb").value;
        var4 = "";

        <% while(rs.next()){ %>
        if(var3==="<%=rs.getString(1)%>")
             var4="<%=rs.getString(3)%>";
        <% } %>
        document.getElementById("nm_brg").value = var4;
        hitung();
    }
</script>
<div class="container">
          <h2 class="alert alert-info text-center"  >INPUT RETUR</h2>
          <a href="beranda.jsp?hal=tampilretur"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
          <form method="POST"  class="form-horizontal" role="form" >
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Kode Retur</label>
                        <div class="col-sm-10">
                            <label><%=nomor%>
                                  <input type="hidden" class="form-control" name="nomor"  value="<%=nomor%>">
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
                              <option value="<%=kd_supplier%>">
                                  <%=nma%>
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
                          <select class="form-control" name="kode" id="kb" required="" onchange="ambilnama()&ambilitem()">
                              <option value="">Pilih Barang</option>
                              <% while(rs.next()){ %>
                              <option value="<%=rs.getString(1)%>">
                                             <%=rs.getString(2)%>
                                             <%=rs.getString(3)%>
                                             <%=rs.getString(5)%>
                              </option>
                                            <% } %>
                          </select>
                           <input type="hidden" name="nama" id="nm_brg" readonly="readonly" >
                           
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
                     
                </div>
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
                        <label  class="col-sm-2 control-label">Quantity</label>
                        <div class="col-sm-10"class="form-control" name="kode" id="kb" required="" onchange="ambilitem()">
                            <input type="text" class="form-control" placeholder="0" required="" name="qty" id="qty">
                            <input type="hidden" name="item" id="itm" readonly="readonly" >
                        </div>
                     </div> 
                </div>

                <div class="col-md-6">
                    <input type="hidden" name="aksi" value="Tambah">
                     <button type="submit" class="btn btn-success">Tambah</button>
                </div>  
            </div> 
            
           
                  
         </form></br>
<div class="row">
<%
    sql = "select * from retur_sementara";
    rs = kon.ambilData(sql);
    sql = "select count(*) from retur_sementara";
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
                        <a href="../admreturServlet?kode=<%=rs.getString(2)%>&aksi=Delete" ><button type="button" class="btn btn-danger">Delete</button></a>
                        </td>
                    </tr>
                  <%}%>
            
                </table>
        </div>
    </div>
</div>
    <form method="POST" action="../admreturServlet">
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
                                <div class="input-group mg-b-pro-edt" class="col-lg-4 col-md-4 col-sm-4 col-xs-6">     
                                    <span class="input-group-addon"><i class="fa fa-usd" aria-hidden="true"></i></span>
                                   
                                    <input type="hidden" name="kd_retur" value="<%=nomor%>"/>
                                    <input type="hidden" name="tgl" value="<%=tgl%>"/>
                                    <input type="hidden" name="kd_supplier" value="<%=kd_supplier%>"/>
                                    <input type="hidden" name="no_user" value="<%=no_user%>"/>
                                    <input type="hidden" name="qty" value="<%=qty%>"/>
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
