/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.testcrud1.entity;

import com.example.testcrud1.entity.baseEntity.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 *
 * @author Tata
 */

@Entity
@Table(name = "product")
public class Product extends BaseEntity {
    
    @Column(name = "quantity", nullable = false, length = 225)
    private int quantity;
    @Column(name = "price", nullable = false, length = 225)
    private double price;

    public Product() {
        super();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
