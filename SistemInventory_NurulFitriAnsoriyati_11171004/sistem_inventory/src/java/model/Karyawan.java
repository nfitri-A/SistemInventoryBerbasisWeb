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
public class Karyawan {
    private String kd_karyawan;
    private String nama;    
    private String jk;    
    private String alamat;    
    private String no_tlp;    
    private String divisi;

    public Karyawan() {
    }

    public Karyawan(String kd_karyawan, String nama, String jk, String alamat, String no_tlp, String divisi) {
        this.kd_karyawan = kd_karyawan;
        this.nama = nama;
        this.jk = jk;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
        this.divisi = divisi;
    }

    @Override
    public String toString() {
        return "Karyawan{" + "kd_karyawan=" + kd_karyawan + ", nama=" + nama + ", jk=" + jk + ", alamat=" + alamat + ", no_tlp=" + no_tlp + ", divisi=" + divisi + '}';
    }

    public String getKd_karyawan() {
        return kd_karyawan;
    }

    public void setKd_karyawan(String kd_karyawan) {
        this.kd_karyawan = kd_karyawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    
}
