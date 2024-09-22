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
public class Pemesanan {
    private String kd_pesan;
    private String kd_supplier;
    private String status;
    private String tgl;
    private String no;
    private String kd_brg;
    private Integer qty;
    private Integer item;
    private String nm_brg;
    private double harga_beli;
    private double subtotal;

    public Pemesanan() {
    }

    public Pemesanan(String kd_pesan, String kd_supplier, String status, String tgl, String no, String kd_brg, Integer qty, Integer item, String nm_brg, double harga_beli, double subtotal) {
        this.kd_pesan = kd_pesan;
        this.kd_supplier = kd_supplier;
        this.status = status;
        this.tgl = tgl;
        this.no = no;
        this.kd_brg = kd_brg;
        this.qty = qty;
        this.item = item;
        this.nm_brg = nm_brg;
        this.harga_beli = harga_beli;
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Pemesanan{" + "kd_pesan=" + kd_pesan + ", kd_supplier=" + kd_supplier + ", status=" + status + ", tgl=" + tgl + ", no=" + no + ", kd_brg=" + kd_brg + ", qty=" + qty + ", item=" + item + ", nm_brg=" + nm_brg + ", harga_beli=" + harga_beli + ", subtotal=" + subtotal + '}';
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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getKd_brg() {
        return kd_brg;
    }

    public void setKd_brg(String kd_brg) {
        this.kd_brg = kd_brg;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public String getNm_brg() {
        return nm_brg;
    }

    public void setNm_brg(String nm_brg) {
        this.nm_brg = nm_brg;
    }

    public double getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(double harga_beli) {
        this.harga_beli = harga_beli;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    
    
}
