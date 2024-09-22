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
public class Lokasi {
    private String no_lokasi;
    private String nm_rak;
    private String kd_rak;

    public Lokasi() {
    }

    public Lokasi(String no_lokasi, String nm_rak, String kd_rak) {
        this.no_lokasi = no_lokasi;
        this.nm_rak = nm_rak;
        this.kd_rak = kd_rak;
    }

    @Override
    public String toString() {
        return "Lokasi{" + "no_lokasi=" + no_lokasi + ", nm_rak=" + nm_rak + ", kd_rak=" + kd_rak + '}';
    }

    public String getNo_lokasi() {
        return no_lokasi;
    }

    public void setNo_lokasi(String no_lokasi) {
        this.no_lokasi = no_lokasi;
    }

    public String getNm_rak() {
        return nm_rak;
    }

    public void setNm_rak(String nm_rak) {
        this.nm_rak = nm_rak;
    }

    public String getKd_rak() {
        return kd_rak;
    }

    public void setKd_rak(String kd_rak) {
        this.kd_rak = kd_rak;
    }

    
    
    
 
    
}
