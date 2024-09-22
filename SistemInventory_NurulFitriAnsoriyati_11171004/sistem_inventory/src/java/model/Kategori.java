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
public class Kategori {
    private String no_kategori;
    private String kategori;
    private String type;

    public Kategori() {
    }

    public Kategori(String no_kategori, String kategori, String type) {
        this.no_kategori = no_kategori;
        this.kategori = kategori;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Kategori{" + "no_kategori=" + no_kategori + ", kategori=" + kategori + ", type=" + type + '}';
    }

    public String getNo_kategori() {
        return no_kategori;
    }

    public void setNo_kategori(String no_kategori) {
        this.no_kategori = no_kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
    
}
