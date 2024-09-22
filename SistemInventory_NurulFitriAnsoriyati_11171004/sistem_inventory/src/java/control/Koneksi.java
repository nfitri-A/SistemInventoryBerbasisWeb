/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kelas
 */
public class Koneksi {
    Connection conn = null;
    public Statement stmt = null;
    ResultSet rs;
    
    public Koneksi() throws ClassNotFoundException{
        String dbName = "inventoryxyz";
        String uName = "root";
        String pass = "";
        String URL = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        
        try {
            conn = DriverManager.getConnection(URL,uName,pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void bukaKoneksi() throws ClassNotFoundException{
        String dbName = "inventoryxyz";
        String uName = "root";
        String pass = "";
        String URL = "jdbc:mysql://localhost/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        
        try {
            conn = DriverManager.getConnection(URL,uName,pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public void diskonek(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            stmt.close();
            conn.close();
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan diskoneksi : " + x);
        }
    }
    public ResultSet ambilData(String sql){
        try {
            bukaKoneksi();
            rs = stmt.executeQuery(sql);
        } catch (Exception x) {
            System.out.println("Terjadi Kesalahan Ambil Data" + x);        
        }
        return rs;
    }
    
    public void close() throws SQLException{
        rs.close();
        stmt.close();
        conn.close();
    }
    
}










