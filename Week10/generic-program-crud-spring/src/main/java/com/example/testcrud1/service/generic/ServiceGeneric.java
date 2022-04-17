/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.testcrud1.service.generic;

import com.example.testcrud1.entity.Product;
import com.example.testcrud1.entity.baseEntity.BaseEntity;
import java.util.List;

/**
 *
 * @author Tata
 */
public interface ServiceGeneric<T extends BaseEntity> {
        List<T> findAll() throws Exception;
        Product findByName(String name) throws Exception;
	T save(T entity) throws Exception;
	void delete(int id) throws Exception;
}
