/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.product.service;

import com.ferdi.product.entity.Product;
import com.ferdi.product.repository.ProductRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author manusiahiu
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    
    public Product getProductById(long id){
        return productRepository.findById(id).get();
    }
    
    public void insert(Product product){
        productRepository.save(product);
    }
    
    public void update(Long id, String kode, String nama, String satuan, Double harga){
        Product product = productRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalStateException("Produk tidak ada")
                );
        
        if(kode != null && kode.length()>0
                && !Objects.equals(product.getKode(), kode)){
            product.setKode(kode);
        }
        if(nama != null && nama.length()>0
                && !Objects.equals(product.getNama(), nama)){
            product.setNama(nama);
        }
        if(satuan != null && satuan.length()>0
                && !Objects.equals(product.getSatuan(), satuan)){
            product.setSatuan(satuan);
        }
        if(harga != 0
                && !Objects.equals(product.getHarga(), harga)){
            product.setHarga(harga);
        }
    }
    
    public void delete(Long id){
        productRepository.deleteById(id);
    }
}
