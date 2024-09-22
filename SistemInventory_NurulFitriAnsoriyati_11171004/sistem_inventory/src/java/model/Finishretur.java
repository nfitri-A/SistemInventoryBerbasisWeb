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
public class Finishretur {
   private String kd_finish_retur;  
   private String kd_retur;  
   private String kd_supplier;  
   private String tgl;  
   private String kd_brg;  
   private String item;  
   private String nm_brg;  
   private String qty;  

    public Finishretur() {
    }

    public Finishretur(String kd_finish_retur, String kd_retur, String kd_supplier, String tgl, String kd_brg, String item, String nm_brg, String qty) {
        this.kd_finish_retur = kd_finish_retur;
        this.kd_retur = kd_retur;
        this.kd_supplier = kd_supplier;
        this.tgl = tgl;
        this.kd_brg = kd_brg;
        this.item = item;
        this.nm_brg = nm_brg;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Finishretur{" + "kd_finish_retur=" + kd_finish_retur + ", kd_retur=" + kd_retur + ", kd_supplier=" + kd_supplier + ", tgl=" + tgl + ", kd_brg=" + kd_brg + ", item=" + item + ", nm_brg=" + nm_brg + ", qty=" + qty + '}';
    }

    public String getKd_finish_retur() {
        return kd_finish_retur;
    }

    public void setKd_finish_retur(String kd_finish_retur) {
        this.kd_finish_retur = kd_finish_retur;
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
