package com.cts.training;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.bean.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
