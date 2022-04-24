/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.testcrud1.service.impl;

import com.example.testcrud1.entity.Product;
import com.example.testcrud1.repository.ProductRepository;
import com.example.testcrud1.repository.generic.GenericRepository;
import com.example.testcrud1.service.ProductService;
import com.example.testcrud1.service.generic.impl.ServiceGenericImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tata
 */
@Service
public class ProductServiceImpl extends ServiceGenericImpl<Product> implements ProductService {
    @Autowired
    protected ProductRepository productRepository;
    
    @Override
    public List<Product> findAll() throws Exception {
        try {
            List<Product> products = new ArrayList<Product>();
            productRepository.findAll().forEach(products::add);
            return products;
	} catch (Exception e) {
            throw e;
	}
    }
    
    @Override
    public Product save(Product product) throws Exception {
        try {
            return productRepository.save(product);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
//    public List<Product> saveProducts(List<Product> products) {
//        return repository.saveAll(products);
//    }
//
//    public Product getProductById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    public Product getProductByName(String name) {
//        return repository.findByName(name);
//    }
//
//    public String deleteProduct(int id) {
//        repository.deleteById(id);
//        return "product removed !! " + id;
//    }
//    
//    public Product updateProduct(Product product) {
//        Product existingProduct = repository.findById(product.getId()).orElse(null);
//        existingProduct.setName(product.getName());
//        existingProduct.setQuantity(product.getQuantity());
//        existingProduct.setPrice(product.getPrice());
//        return repository.save(existingProduct);
//    }
}
