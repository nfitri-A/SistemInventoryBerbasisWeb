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
public class Supplier {
    private String kd_supplier;
    private String nm_supplier;
    private String alamat;
    private String no_tlp;
    private String email;

    public Supplier() {
    }

    public Supplier(String kd_supplier, String nm_supplier, String alamat, String no_tlp, String email) {
        this.kd_supplier = kd_supplier;
        this.nm_supplier = nm_supplier;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Supplier{" + "kd_supplier=" + kd_supplier + ", nm_supplier=" + nm_supplier + ", alamat=" + alamat + ", no_tlp=" + no_tlp + ", email=" + email + '}';
    }

    public String getKd_supplier() {
        return kd_supplier;
    }

    public void setKd_supplier(String kd_supplier) {
        this.kd_supplier = kd_supplier;
    }

    public String getNm_supplier() {
        return nm_supplier;
    }

    public void setNm_supplier(String nm_supplier) {
        this.nm_supplier = nm_supplier;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
