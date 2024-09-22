<%-- 
    Document   : report_inventory
    Created on : Jun 3, 2020, 7:55:20 PM
    Author     : fitri
--%>

<%@page import="control.Koneksi"%>
<%@page import="java.io.*, java.util.*, java.sql.*"%>
<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="net.sf.jasperreports.view.JasperViewer.*" %>
<%@page import="javax.servlet.ServletResponse" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laporan Akun</title>
    </head>
    <body>
        <%
            Koneksi kon = new Koneksi();
            File reportFile = new File(application.getRealPath("laporan/report_retur_barang.jasper"));
            Map<String, Object> param = new HashMap<String, Object>();
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(),param, kon.stmt.getConnection());
            
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
            %>
            
            
    </body>
</html>
