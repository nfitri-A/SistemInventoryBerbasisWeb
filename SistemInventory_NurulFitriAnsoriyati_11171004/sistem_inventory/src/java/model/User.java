/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.Koneksi;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fitri.A
 */
public class User {
    String no_user,username,password,hak_akses;
    Koneksi db= null;
    
    public User(){
        try {
            db =new Koneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getNo_user() {
        return no_user;
    }

    public void setId(String no_user) {
        this.no_user = no_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHak_akses() {
        return hak_akses;
    }

    public void setHak_akses(String hak_akses) {
        this.hak_akses = hak_akses;
    }
        public List LoginUser(String user, String password) {
        List data = new ArrayList();
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM USER where username='" + user + "' and password='" + password + "'";
            rs = db.ambilData(sql);
 
            while (rs.next()) {
                User am = new User();
                am.setId(rs.getString("no_user"));
                am.setUsername(rs.getString("username"));               
                am.setPassword(rs.getString("password"));
                am.setHak_akses(rs.getString("hak_akses"));
                data.add(am);
            }
            db.diskonek(rs);
        } catch (Exception a) {
            System.out.println("Terjadi kesalahaan cari login user, pada :\n" + a);
        }
        return data;
    }
} 
