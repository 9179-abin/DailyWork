package com.cts.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.ProductRepo;
import com.cts.training.bean.Product;

@RestController
public class ProductRestServiceController {

	@Autowired
	ProductRepo pr;

	@GetMapping("/prod")
	public List<Product> findAll() {
		return pr.findAll();
	}

	@GetMapping("/prod/{id}")
	public Product findOne(@PathVariable int id) {
		Optional<Product> pro = pr.findById(id);
		Product p = pro.get();
		return p;
	}

	@PostMapping("/prod")
	public Product save(@RequestBody Product pro) {
		Product prod = pr.save(pro);
		return prod;
	}

	@DeleteMapping("/prod/{id}")
	public void delete(@PathVariable int id) {
		pr.deleteById(id);
	}
	
	@PutMapping("/prod")
	public Product update(@RequestBody Product pro) {
		Product prod = pr.save(pro);
		return prod;
	}

}
