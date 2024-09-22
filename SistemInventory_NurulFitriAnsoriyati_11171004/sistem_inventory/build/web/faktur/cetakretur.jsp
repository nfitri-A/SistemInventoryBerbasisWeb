<%@page import="java.sql.ResultSet"%>
<%@page import="control.Koneksi"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Faktur Retur</title>
    <link rel="stylesheet" href="style.css" media="all" />
  </head>

  <body>
<%
    Koneksi kon = new Koneksi();
    String kd_retur=request.getParameter("kd_retur");
    String nm_supplier=null;
    String alamat=null;
    String tgl=null;
 
    
    String sql = "SELECT kd_retur, nm_supplier, alamat, tgl FROM retur_barang INNER JOIN supplier ON retur_barang.kd_supplier=supplier.kd_supplier WHERE kd_retur='" 
            +kd_retur+ "'";
    ResultSet rs= kon.ambilData(sql);
    if(rs.next())
            {
                kd_retur=rs.getString(1);
                nm_supplier=rs.getString(2);
                alamat=rs.getString(3);
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
          <div><center><h1>Faktur Retur</h1></center></div>
        <div id="client">
          <div class="to">INVOICE TO:</div>
          <h2 class="name"><%=nm_supplier%></h2>
          <div class="address"><%=alamat%></div>
          <div class="email"><a href="#"></a></div>
        </div>
        <div id="invoice">
          <h1><%=kd_retur%></h1>
          <div class="date">Tanggal Retur : <%=tgl%></div>
          <div > </div>
        </div>
      </div>
<%
    sql = "select * from detail_retur_barang WHERE kd_retur='" 
            +kd_retur+ "'";
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
          <div id="thanks">Terima Kasih!</div><h3 align="right">Di Setujui oleh &nbsp; &nbsp; &nbsp;</h3>
      <div id="notices">
        <div>NOTICE:</div>
        <div class="notice">Meminta pengembalian berupa barang baru.</div> 
            
      </div>
      
      <h3 align="right">(&nbsp; Kepala Gudang &nbsp;) &nbsp;</h3>
    </main>
    <footer>
        Invoice was created on a computer and is valid without the signature and seal.
    </footer>
    <script src="../css/jquery-1.11.3.min.js"></script>
  </body>
</html>