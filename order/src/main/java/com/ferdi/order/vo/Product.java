/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.order.vo;

/**
 *
 * @author muham
 */

public class Product {
   
    private Long id;
    private String kode;
    private long harga;
    private long stok;
    
    public Product(){
    }

    public Product(Long id, String kode, long harga, long stok) {
        this.id = id;
        this.kode = kode;
        this.harga = harga;
        this.stok = stok;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public long getStok() {
        return stok;
    }

    public void setStok(long stok) {
        this.stok = stok;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    
    
    
}
