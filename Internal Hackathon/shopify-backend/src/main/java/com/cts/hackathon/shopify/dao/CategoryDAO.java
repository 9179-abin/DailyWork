package com.cts.hackathon.shopify.dao;

import java.util.List;

import com.cts.hackathon.shopify.model.CategoryEntity;
import com.cts.hackathon.shopify.model.ProductEntity;

public interface CategoryDAO {
	
	public boolean saveCategory(CategoryEntity category);
	
	public boolean saveOrUpdateCategory(CategoryEntity category);
	
	public boolean deleteCategory(CategoryEntity category);
	
	public boolean updateCategory(CategoryEntity category);
	
	public CategoryEntity getCategoryById(int id);
	
	public List<CategoryEntity> getAllCategories();

}
