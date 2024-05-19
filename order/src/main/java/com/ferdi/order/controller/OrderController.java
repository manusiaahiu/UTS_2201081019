/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ferdi.order.controller;

import com.ferdi.order.entity.Order;
import com.ferdi.order.service.OrderService;
import com.ferdi.order.vo.ResponseTemplate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Long;
import java.lang.String;
/**
 *
 * @author muham
 */
@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @GetMapping
    public List<Order>getAll(){
        return orderService.getAll();
        
    }
    
    @GetMapping(path="{id}")
    public Order getOrderById(@PathVariable("id")Long id){
        return orderService.getOrderById(id);
    }
    
    @GetMapping(path ="/product/{id}")
    public List<ResponseTemplate> getOrderWithProdukById(@PathVariable("id") Long id) {
        return orderService.getOrderWithProdukById(id);
    }

    @PutMapping(path = "{id}")
    public void updateOrder(@PathVariable("id") Long id,
            @RequestParam(required = false) int jumlah,
            @RequestParam(required = false) String tanggal,
            @RequestParam(required = false) String status
    ) {
        orderService.update(id, jumlah, tanggal, status);
    }

}
