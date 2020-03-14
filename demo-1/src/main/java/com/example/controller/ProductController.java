package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProductRepo;
import com.example.demo.Product;

@RestController
public class ProductController {

	@Autowired
	ProductRepo pr;
	
	@GetMapping(value = "/prod",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAll(){
//		System.out.println("prodel..");
		return pr.findAll();
	}
	
	@GetMapping("/prod/{id}")
	public Product findOne(@PathVariable int id) {
		
		Optional<Product> pro = pr.findById(id);
		Product p = pro.get();
		return p;
	}
	
	@PostMapping("/prod")
	public Product saveProduct(@RequestBody Product pro) {
		
		Product prod = pr.save(pro);
		return prod;
	}
	
	@DeleteMapping("/prod/{id}")
	public void deleteProduct(@PathVariable int id) {
		pr.deleteById(id);
	}
	
	
}
