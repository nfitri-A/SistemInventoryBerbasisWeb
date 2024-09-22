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
public class Cancelstockout {
    private String kd_cancel;
    private String kd_karyawan;
    private String deskripsi;
    private String kd_brg;
    private String item;
    private String nm_brg;
    private String qty;
    private String tgl;

    public Cancelstockout() {
    }

    public Cancelstockout(String kd_cancel, String kd_karyawan, String deskripsi, String kd_brg, String item, String nm_brg, String qty, String tgl) {
        this.kd_cancel = kd_cancel;
        this.kd_karyawan = kd_karyawan;
        this.deskripsi = deskripsi;
        this.kd_brg = kd_brg;
        this.item = item;
        this.nm_brg = nm_brg;
        this.qty = qty;
        this.tgl = tgl;
    }

    @Override
    public String toString() {
        return "Cancelstockout{" + "kd_cancel=" + kd_cancel + ", kd_karyawan=" + kd_karyawan + ", deskripsi=" + deskripsi + ", kd_brg=" + kd_brg + ", item=" + item + ", nm_brg=" + nm_brg + ", qty=" + qty + ", tgl=" + tgl + '}';
    }

    public String getKd_cancel() {
        return kd_cancel;
    }

    public void setKd_cancel(String kd_cancel) {
        this.kd_cancel = kd_cancel;
    }

    public String getKd_karyawan() {
        return kd_karyawan;
    }

    public void setKd_karyawan(String kd_karyawan) {
        this.kd_karyawan = kd_karyawan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    
    
    
}
