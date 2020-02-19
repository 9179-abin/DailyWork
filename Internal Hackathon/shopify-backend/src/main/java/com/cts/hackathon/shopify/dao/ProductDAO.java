package com.cts.hackathon.shopify.dao;

import java.util.List;

import com.cts.hackathon.shopify.model.ProductEntity;



public interface ProductDAO {
	
	public boolean saveProduct(ProductEntity product);
	
	public boolean saveOrUpdateProduct(ProductEntity product);
	
	public boolean deleteProduct(ProductEntity product);
	
	public boolean updateProduct(ProductEntity product);
	
	public ProductEntity getProductById(int id);
	
	public List<ProductEntity> getAllProducts();

}
