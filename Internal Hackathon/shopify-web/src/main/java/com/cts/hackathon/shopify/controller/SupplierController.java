package com.cts.hackathon.shopify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.hackathon.shopify.dao.SupplierDAO;
import com.cts.hackathon.shopify.model.SupplierEntity;



@Controller
public class SupplierController {
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("/supplierhome")
	public String SupplierHome(Model model) {
		
		List<SupplierEntity> supplier = supplierDAO.getAllSuppliers();
		
		model.addAttribute("supplier", new SupplierEntity());//user will work as a model attribute in users.jsp
		
		model.addAttribute("list", supplier);
		
		return "supplier";
	}
	
	@RequestMapping("/supplier/savesupplier")
	public String addSupplier(@ModelAttribute("supplier") SupplierEntity supplier) {
		supplierDAO.saveOrUpdateSupplier(supplier);
		
		return "redirect:/supplierhome";
		
		
	}
	
	@RequestMapping("/removesupplier/{id}")
	public String deleteSupplier(@PathVariable("id") int id) {
		
		SupplierEntity supplier = supplierDAO.getSupplierById(id);
		supplierDAO.deleteSupplier(supplier);
		return "redirect:/supplierhome";
	}
	
	@RequestMapping("/updatesupplier/{id}")
	public String updateSupplier(@PathVariable("id") int id,Model model) {
		
		List<SupplierEntity> suppliers = supplierDAO.getAllSuppliers();
		model.addAttribute("list", suppliers);
		SupplierEntity supplier = supplierDAO.getSupplierById(id);
		model.addAttribute("supplier", supplier);
		return "supplier";	
		
	}

}
