/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.testcrud1.controller;

import com.example.testcrud1.entity.Product;
import com.example.testcrud1.service.impl.ProductServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author Tata
 */
@Controller
public class ProductController {
    @Autowired
    private ProductServiceImpl service;
    
    @RequestMapping(value = "/products")
    public String findAllProducts(Model model) throws Exception{
        List<Product> products = service.findAll();
        model.addAttribute("products", products);
        return "products";
    }
    
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) throws Exception {
        try {
            return service.save(product);
        } catch (Exception ex) {
            throw ex;
        }
    }

//    @PostMapping("/addProducts")
//    public List<Product> addProducts(@RequestBody List<Product> products) {
//        return service.saveProducts(products);
//    }
//
//    
//
//    @GetMapping("/productById/{id}")
//    public Product findProductById(@PathVariable int id) {
//        return service.getProductById(id);
//    }
//
//    @GetMapping("/product/{name}")
//    public Product findProductByName(@PathVariable String name) {
//        return service.getProductByName(name);
//    }
//
//    @PutMapping("/update")
//    public Product updateProduct(@RequestBody Product product) {
//        return service.updateProduct(product);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public String deleteProduct(@PathVariable int id) {
//        return service.deleteProduct(id);
//    }
}
