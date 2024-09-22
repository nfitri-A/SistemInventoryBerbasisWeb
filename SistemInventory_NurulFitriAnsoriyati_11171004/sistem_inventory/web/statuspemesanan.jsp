<%-- 
    Document   : statuspemesanan
    Created on : May 21, 2020, 9:32:52 AM
    Author     : fitri
--%>

<%@page import="java.sql.*"%>
<%@page import="control.Koneksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Status Pemesanan</title>
    </head>
    <body>
<%
    Koneksi kon = new Koneksi();
    String kd_pesan=request.getParameter("kd_pesan");
    String kd_supplier=null;
    String nm_supplier=null;
    String status=null;
    String tgl=null;
    String no_user=null;
    String username=null;
    String sql = "SELECT pemesanan_barang.kd_pesan, pemesanan_barang.kd_supplier, supplier.nm_supplier, pemesanan_barang.status, pemesanan_barang.tgl, pemesanan_barang.no_user, user.username FROM pemesanan_barang JOIN supplier ON pemesanan_barang.kd_supplier=supplier.kd_supplier JOIN user ON pemesanan_barang.no_user=user.no_user WHERE kd_pesan='" 
            +kd_pesan+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_pesan=rs.getString(1);
                kd_supplier=rs.getString(2);
                nm_supplier=rs.getString(3);
                status=rs.getString(4);
                tgl=rs.getString(5);
                no_user=rs.getString(6);
                username=rs.getString(7);
               
            }
%>
<div class="container">
    <h2 class="alert alert-info text-center" >Status Pemesanan</h2>
    <a href="beranda.jsp?hal=tampilpemesanan"><button type="button" class="btn btn-info">Lihat Data</button></a><br/><br/>
    <form method="POST" action="pemesananServlet" class="form-horizontal" role="form">
        <div class="form-group">
            <label  class="col-sm-2 control-label">Kode Pesan</label>
            <div class="col-sm-10">
                <label><%=kd_pesan%>
                    <input type="hidden" class="form-control" name="kd_pesan" value="<%=kd_pesan%>">
                </label>
            </div>
        </div>
              
        <div class="form-group">
            <label  class="col-sm-2 control-label">Supplier</label>
            <div class="col-sm-10">
                <input readonly="readonly" class="form-control" name=""  value="<%=nm_supplier%>" >
            </div>
         </div>
              
        <div class="form-group">
            <label  class="col-sm-2 control-label">Tanggal</label>
            <div class="col-sm-10">
                <input readonly="readonly" class="form-control" name="tgl"  value="<%=tgl%>" >
            </div>
        </div>
              
        <div class="form-group">
            <label  class="col-sm-2 control-label">Petugas</label>
            <div class="col-sm-10">
                <input readonly="readonly" class="form-control" name=""  value="<%=username%>" >
            </div>
        </div>
            
        <div class="form-group">
            <label  class="col-sm-2 control-label">Status</label>
            <div class="col-sm-10">
               <select class="form-control custom-select-value" name="status">
                    <% if (status.equalsIgnoreCase("Open")) { %>
                        <option value="Open" selected>Open</option>
                        <option value="Proses">Proses</option>
                    <% } else if (status.equalsIgnoreCase("Proses")) { %>
                        <option value="Open">Open</option>
                        <option value="Proses" selected>Proses</option>
                   <% } else if (status.equalsIgnoreCase("Close")) { %>    
                        <option value="Close">TIDAK DAPAT MERUBAH DATA CLOSE !!</option>
                    <% }%>
               </select>
            </div>
        </div>

            <input type="hidden" class="form-control" name="kd_supplier"  value="<%=kd_supplier%>" >
            <input type="hidden" class="form-control" name="no_user"  value="<%=no_user%>" >
              <tr>
                    <td></td>
                    <td></td>
                    <td>
                        <button type="submit" name="aksi" value="Update" class="btn btn-success">Simpan</button>
                    </td>
                </tr>
        </form>
</div>
    </body>
</html>
