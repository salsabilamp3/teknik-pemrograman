/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.testcrud1.repository.generic;

import com.example.testcrud1.entity.Product;
import com.example.testcrud1.entity.baseEntity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tata
 */
public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, Integer> {
    Product findByName(String name);
}
