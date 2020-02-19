package com.cts.hackathon.shopify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.hackathon.shopify.dao.CategoryDAO;
import com.cts.hackathon.shopify.model.CategoryEntity;
import com.cts.hackathon.shopify.model.ProductEntity;

@Controller
public class CatogeryController {
	
		@Autowired
	    private CategoryDAO categoryDAO;
		
		@RequestMapping("/category-home")
		public String productPage(Model model)
		{
			List<CategoryEntity> category=categoryDAO.getAllCategories();
			model.addAttribute("list", category);
			model.addAttribute("product", new CategoryEntity());//user will work as a model attribute in a form
			return "category";
		}
		
		@RequestMapping("/category/save")
		//or @RequestMapping(value="/user/save",method=RequestMethod.post)
		public String addCategory(@ModelAttribute("category") CategoryEntity category)
		{
			categoryDAO.saveCategory(category);
			return "redirect:/category-home";
		}
		@RequestMapping("/removecategory")//{}----path variable
		public String deleteUser(@RequestParam("id")int id) {
			CategoryEntity category=categoryDAO.getCategoryById(id);
			categoryDAO.deleteCategory(category);
			return "redirect:/category-home";
			
		}
		@RequestMapping("/category/updatecategory/{id}")
		public String updateProduct(@PathVariable("id")int id,Model model)
		{
			CategoryEntity category=categoryDAO.getCategoryById(id);
			model.addAttribute("category", category);
			List<CategoryEntity> categories= categoryDAO.getAllCategories();
			model.addAttribute("list", categories);
			
			return "category";
			
		}
	}




