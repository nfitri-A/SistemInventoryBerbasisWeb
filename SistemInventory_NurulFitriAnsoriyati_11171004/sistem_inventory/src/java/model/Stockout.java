/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fitri
 */
public class Stockout {
    private String kd_brg_klr;
    private String kd_karyawan;
    private String no_user;
    private String tgl;
    private String kd_brg;
    private String item;
    private String nm_brg;
    private String qty;

    public Stockout() {
    }

    public Stockout(String kd_brg_klr, String kd_karyawan, String no_user, String tgl, String kd_brg, String item, String nm_brg, String qty) {
        this.kd_brg_klr = kd_brg_klr;
        this.kd_karyawan = kd_karyawan;
        this.no_user = no_user;
        this.tgl = tgl;
        this.kd_brg = kd_brg;
        this.item = item;
        this.nm_brg = nm_brg;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Stockout{" + "kd_brg_klr=" + kd_brg_klr + ", kd_karyawan=" + kd_karyawan + ", no_user=" + no_user + ", tgl=" + tgl + ", kd_brg=" + kd_brg + ", item=" + item + ", nm_brg=" + nm_brg + ", qty=" + qty + '}';
    }

    public String getKd_brg_klr() {
        return kd_brg_klr;
    }

    public void setKd_brg_klr(String kd_brg_klr) {
        this.kd_brg_klr = kd_brg_klr;
    }

    public String getKd_karyawan() {
        return kd_karyawan;
    }

    public void setKd_karyawan(String kd_karyawan) {
        this.kd_karyawan = kd_karyawan;
    }

    public String getNo_user() {
        return no_user;
    }

    public void setNo_user(String no_user) {
        this.no_user = no_user;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getKd_brg() {
        return kd_brg;
    }

    public void setKd_brg(String kd_brg) {
        this.kd_brg = kd_brg;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getNm_brg() {
        return nm_brg;
    }

    public void setNm_brg(String nm_brg) {
        this.nm_brg = nm_brg;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
    
    
    
}
