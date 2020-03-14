package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Product;


public interface ProductRepo extends JpaRepository<Product, Integer> {
}