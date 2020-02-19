

package com.cts.hackathon.shopify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.hackathon.shopify.dao.ProductDAO;
import com.cts.hackathon.shopify.model.ProductEntity;

@Controller
public class ProductController {
	
	  @Autowired 
	  ProductDAO productDAO;
	 
	
	@RequestMapping("/product-home")
	public String productPage(Model model)
	{
		List<ProductEntity> products=productDAO.getAllProducts();
		model.addAttribute("list", products);
		model.addAttribute("product", new ProductEntity());
		return "product";
	}
	
	@RequestMapping(value="/user/save",method=RequestMethod.POST)
	public String addUser(@ModelAttribute("product") ProductEntity product)
	{
		productDAO.saveProduct(product);
		return "redirect:/company-home";
	}
	@RequestMapping("/remove")//{}----path variable
	public String deleteUser(@RequestParam("id")int id) {
		ProductEntity product=productDAO.getProductById(id);
		productDAO.deleteProduct(product);
		return "redirect:/product-home";
		
	}
	@RequestMapping("/product/update/{id}")
	public String updateProduct(@PathVariable("id")int id,Model model)
	{
		ProductEntity product=productDAO.getProductById(id);
		model.addAttribute("company", product);
		List<ProductEntity> products= productDAO.getAllProducts();
		model.addAttribute("list", products);
		
		return "productoperations";
		
	}
}


