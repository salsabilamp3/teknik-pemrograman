/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.testcrud1.service;

import com.example.testcrud1.entity.Product;
import com.example.testcrud1.service.generic.ServiceGeneric;
import java.util.List;

/**
 *
 * @author Tata
 */
public interface ProductService extends ServiceGeneric<Product> {
    @Override
    List<Product> findAll() throws Exception;
    @Override
    Product findByName(String name) throws Exception;
    @Override
    Product save(Product entity) throws Exception;
    @Override
    void delete(int id) throws Exception;
}
