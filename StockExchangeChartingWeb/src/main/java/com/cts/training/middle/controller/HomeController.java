package com.cts.training.middle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stocks.dao.CompanyDao;
import com.stocks.dao.IPODao;
import com.stocks.dao.UserDao;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.IPO;
import com.stocks.datamodel.User;

@Controller
public class HomeController {
	
	@Autowired
	private UserDao userDAO;
	
	@Autowired
	private CompanyDao companyDAO;
	
	@Autowired
	private IPODao ipoDAO;
	
//	@GetMapping("/")//any one you can use
	@RequestMapping(value= {"/","home"})
	public String indexPage(Model model) {
		
		model.addAttribute("message", "Welcome to Spring MVC");
//		List<String> names= new ArrayList<String>();
		
		List<User> users = userDAO.getAllUsers();
		
		model.addAttribute("list", users);
		
//		addNames(names);
//		model.addAttribute("list",name);
		return "index";
		
	}
	
	@RequestMapping("company")
	public String showCompany(Model model) {
		
		List<Company> company = companyDAO.getAllCompany();
		model.addAttribute("companyview", company);
		
		return "viewCompany";
	}
	
	@RequestMapping("ipo")
	public String showIPO(Model model) {
		
		List<IPO> ipo = ipoDAO.getAllIPO();
		model.addAttribute("ipoview", ipo);
		
		return "viewIPO";
		
	}
	
	private void addNames(List<String> names) {
		names.add("abin");
		names.add("albin");
		names.add("kiran");
		names.add("amith");
		names.add("aravind");
		names.add("abraham");
		
	}
}
