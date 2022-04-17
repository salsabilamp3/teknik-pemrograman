/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.testcrud1.service.generic.impl;

import com.example.testcrud1.entity.Product;
import com.example.testcrud1.entity.baseEntity.BaseEntity;
import com.example.testcrud1.repository.ProductRepository;
import com.example.testcrud1.repository.generic.GenericRepository;
import com.example.testcrud1.service.generic.ServiceGeneric;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Tata
 */
public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {

    @Autowired
    protected GenericRepository<T> genericRepository;
    @Override
    public List<T> findAll() throws Exception {
        try {
            return genericRepository.findAll(); 
	} catch (Exception e) {
            throw e;
	}
    }
    
    @Override
    public Product findByName(String name) throws Exception {
        try {
            return genericRepository.findByName(name);
	} catch (Exception e) {
            throw e;
	}
    }

    @Override
    public T save(T entity) throws Exception {
        try {
            return genericRepository.save(entity); 
	} catch (Exception e) {
            throw e;
	}
    }

    @Override
    public void delete(int id) throws Exception {
        try {
            genericRepository.deleteById(id); 
	} catch (Exception e) {
            throw e;
	}
    }
    
}
