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
public class Stockin {
    private String kd_brg_msk;
    private String kd_pesan;
    private String kd_supplier;
    private String tgl;
    private String kd_brg;
    private String item;
    private String nm_brg;
    private String qty;
    private String harga_beli;
    private String sub_total;

    public Stockin() {
    }

    public Stockin(String kd_brg_msk, String kd_pesan, String kd_supplier, String tgl, String kd_brg, String item, String nm_brg, String qty, String harga_beli, String sub_total) {
        this.kd_brg_msk = kd_brg_msk;
        this.kd_pesan = kd_pesan;
        this.kd_supplier = kd_supplier;
        this.tgl = tgl;
        this.kd_brg = kd_brg;
        this.item = item;
        this.nm_brg = nm_brg;
        this.qty = qty;
        this.harga_beli = harga_beli;
        this.sub_total = sub_total;
    }

    @Override
    public String toString() {
        return "Stockin{" + "kd_brg_msk=" + kd_brg_msk + ", kd_pesan=" + kd_pesan + ", kd_supplier=" + kd_supplier + ", tgl=" + tgl + ", kd_brg=" + kd_brg + ", item=" + item + ", nm_brg=" + nm_brg + ", qty=" + qty + ", harga_beli=" + harga_beli + ", sub_total=" + sub_total + '}';
    }

    public String getKd_brg_msk() {
        return kd_brg_msk;
    }

    public void setKd_brg_msk(String kd_brg_msk) {
        this.kd_brg_msk = kd_brg_msk;
    }

    public String getKd_pesan() {
        return kd_pesan;
    }

    public void setKd_pesan(String kd_pesan) {
        this.kd_pesan = kd_pesan;
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

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getSub_total() {
        return sub_total;
    }

    public void setSub_total(String sub_total) {
        this.sub_total = sub_total;
    }

    
    
}
