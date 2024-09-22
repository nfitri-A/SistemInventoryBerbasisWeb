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
public class Retur {
     private String kd_retur;
     private String kd_supplier;
     private String status;
     private String tgl;
     private String no_user;
     private String kd_brg;
     private String item;
     private String nm_brg;
     private String qty;

    public Retur() {
    }

    public Retur(String kd_retur, String kd_supplier, String status, String tgl, String no_user, String kd_brg, String item, String nm_brg, String qty) {
        this.kd_retur = kd_retur;
        this.kd_supplier = kd_supplier;
        this.status = status;
        this.tgl = tgl;
        this.no_user = no_user;
        this.kd_brg = kd_brg;
        this.item = item;
        this.nm_brg = nm_brg;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Retur{" + "kd_retur=" + kd_retur + ", kd_supplier=" + kd_supplier + ", status=" + status + ", tgl=" + tgl + ", no_user=" + no_user + ", kd_brg=" + kd_brg + ", item=" + item + ", nm_brg=" + nm_brg + ", qty=" + qty + '}';
    }

    public String getKd_retur() {
        return kd_retur;
    }

    public void setKd_retur(String kd_retur) {
        this.kd_retur = kd_retur;
    }

    public String getKd_supplier() {
        return kd_supplier;
    }

    public void setKd_supplier(String kd_supplier) {
        this.kd_supplier = kd_supplier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getNo_user() {
        return no_user;
    }

    public void setNo_user(String no_user) {
        this.no_user = no_user;
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
