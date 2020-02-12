package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.stocks.dao.CompanyDao;
import com.stocks.datamodel.Company;

@Controller
public class CompanyController {
	
	@Autowired
	CompanyDao companyDAO;

	@GetMapping("/company-home")
	public String companyPage(Model model) {
		
		
		List<Company> company = companyDAO.getAllCompany();
		model.addAttribute("companyview", company);
		
		model.addAttribute("company", new Company());
		
		
		return "company";
	}
	
	@PostMapping("/company/savecompany")
	public String addCompany(@ModelAttribute("company") Company company) {
		companyDAO.saveOrUpdateCompany(company);
		return "redirect:/company-home";
	}
	
	@GetMapping("/removecompany/{id}")
	public String deleteCompany(@PathVariable("id") int id) {
		
		Company company = companyDAO.getCompanyById(id);
		companyDAO.deleteCompany(company);
		return "redirect:/company-home";
	}
	
	@GetMapping("/updatecompany/{id}")
	public String updateCompany(@PathVariable("id") int id,Model model) {
		
		List<Company> company = companyDAO.getAllCompany();
		model.addAttribute("companyview", company);
		Company comp = companyDAO.getCompanyById(id);
		model.addAttribute("company", comp);
		return "company";	
		
	}
	

}
