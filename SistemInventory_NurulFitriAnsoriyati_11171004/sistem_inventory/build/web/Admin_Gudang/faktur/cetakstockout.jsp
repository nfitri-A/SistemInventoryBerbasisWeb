<%-- 
    Document   : cetakstockout
    Created on : Jun 2, 2020, 8:22:58 PM
    Author     : fitri
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="control.Koneksi"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title> Stock Out</title>
    <link rel="stylesheet" href="style.css" media="all" />
  </head>

  <body>
<%
    Koneksi kon = new Koneksi();
    String kd_brg_klr=request.getParameter("kd_brg_klr");
    String nama=null;
    String username=null;
    String tgl=null;
 
    
    String sql ="select kd_brg_klr, nama, username, tgl FROM stock_out JOIN karyawan ON stock_out.kd_karyawan=karyawan.kd_karyawan JOIN user ON stock_out.no_user=user.no_user WHERE kd_brg_klr='" 
            +kd_brg_klr+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_brg_klr=rs.getString(1);
                nama=rs.getString(2);
                username=rs.getString(3);
                tgl=rs.getString(4);
                
                
            }
            %>
<script>
function myFunction() {
  window.print();
}


</script>
    <header class="clearfix">
      <div id="logo">
        <img src="logo.png" onclick="myFunction()">
      </div>
      <div id="company">
        <h2 class="name">PT XYZ</h2>
        <div>Jl. Raya Narogong Km 26 - Cileungsi</div>
        <div>Tlp. 089999999999</div>
        <div><a href="#">ptxyz@gmail.com</a></div>
      </div>
      </div>
    </header>
    <main>
      <div id="details" class="clearfix">
          <div><center><h1>Stock Out</h1></center></div>
        <div id="client">
            <h3><div class="to">Diambil Oleh:<%=nama%></div></h3>
          
            <h3><div class="to">Petugas:<%=username%></div></h3>
          <div class="email"><a href="#"></a></div>
        </div>
        <div id="invoice">
          <h1><%=kd_brg_klr%></h1>
          <div class="date">Tanggal Out : <%=tgl%></div>
          <div > </div>
        </div>
      </div>
<%
    sql = "select * from detail_stock_out WHERE kd_brg_klr='" 
            + kd_brg_klr + "'";
    rs = kon.ambilData(sql);
    int no=0;
%>
      <table border="0" cellspacing="0" cellpadding="0">
        <thead>
          <tr>
              <th class="no">NO</th>
            <th class="desc">ITEM</th>
            <th class="unit">NAMA BARANG</th>
             <th class="desc">QUANTITY</th>

          </tr>
        </thead>
        
        <tbody>
            <%
                    if(!rs.next()){
                %>
                            <tr>
                                <td colspan="4">Data Kosong</td>
                            </tr>
                 <%
                    }
                   rs.beforeFirst();
                    while(rs.next()){
                    no++;
                    
                %>
                <tr>
                    <td><%=no%></td>
                    <td><center><%=rs.getString(3)%></center></td>
                     <td align="left"><center><%=rs.getString(4)%></center></td>
                    <td align="left"><center><%=rs.getString(5)%></center></td>
                    
                </tr>
              <%}%>
            
        </tbody>
       
      </table>
         
      
   
    </main>
    <footer>
       Sistem Inventory PT XYZ
    </footer>
    <script src="../css/jquery-1.11.3.min.js"></script>
  </body>
</html>