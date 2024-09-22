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
public class Barang {
    private String kd_brg;
    private String item;
    private String nm_brg;
    private String satuan;
    private double qty;
    private double harga_beli;
    private String no_kategori;
    private String no_lokasi;
    private double harga_jual;

    public Barang() {
    }

    public Barang(String kd_brg, String item, String nm_brg, String satuan, double qty, double harga_beli, String no_kategori, String no_lokasi, double harga_jual) {
        this.kd_brg = kd_brg;
        this.item = item;
        this.nm_brg = nm_brg;
        this.satuan = satuan;
        this.qty = qty;
        this.harga_beli = harga_beli;
        this.no_kategori = no_kategori;
        this.no_lokasi = no_lokasi;
        this.harga_jual = harga_jual;
    }

    @Override
    public String toString() {
        return "Barang{" + "kd_brg=" + kd_brg + ", item=" + item + ", nm_brg=" + nm_brg + ", satuan=" + satuan + ", qty=" + qty + ", harga_beli=" + harga_beli + ", no_kategori=" + no_kategori + ", no_lokasi=" + no_lokasi + ", harga_jual=" + harga_jual + '}';
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

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(double harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getNo_kategori() {
        return no_kategori;
    }

    public void setNo_kategori(String no_kategori) {
        this.no_kategori = no_kategori;
    }

    public String getNo_lokasi() {
        return no_lokasi;
    }

    public void setNo_lokasi(String no_lokasi) {
        this.no_lokasi = no_lokasi;
    }

    public double getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(double harga_jual) {
        this.harga_jual = harga_jual;
    }

    
        
}
