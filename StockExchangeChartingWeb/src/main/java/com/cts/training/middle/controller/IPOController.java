package com.cts.training.middle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stocks.dao.IPODao;

import com.stocks.datamodel.IPO;

@Controller
public class IPOController {
	
	@Autowired
	private IPODao ipoDAO;
	
	@RequestMapping("ipo-home")
	public String showIPO(Model model) {
		
		List<IPO> ipo = ipoDAO.getAllIPO();
		model.addAttribute("ipoview", ipo);
		model.addAttribute("ipo", new IPO());
		
		return "IPO";
		
	}
	
	@PostMapping("/ipo/saveipo")
	public String addIPO(@ModelAttribute("ipo") IPO ipo) {
		ipoDAO.saveOrUpdate(ipo);
		return "redirect:/ipo-home";
	}
	
	@GetMapping("/removeipo/{id}")
	public String deleteCompany(@PathVariable("id") int id) {
		
		IPO ipo = ipoDAO.getIPOById(id);
		ipoDAO.deleteIPO(ipo);
		return "redirect:/ipo-home";
	}
	
	@GetMapping("/updateipo/{id}")
	public String updateIPO(@PathVariable("id") int id,Model model) {
		
		List<IPO> ipo = ipoDAO.getAllIPO();
		model.addAttribute("ipoview", ipo);
		IPO p = ipoDAO.getIPOById(id);
		model.addAttribute("ipo", p);
		return "IPO";	
		
	}
	
	

}
