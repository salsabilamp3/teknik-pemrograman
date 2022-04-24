/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.testcrud1.repository;

import com.example.testcrud1.entity.Product;
import com.example.testcrud1.repository.generic.GenericRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tata
 */
@Repository
public interface ProductRepository extends GenericRepository<Product> {
   
}
