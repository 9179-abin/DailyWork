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

import com.stocks.dao.StockExchangesDao;
import com.stocks.datamodel.IPO;
import com.stocks.datamodel.StockExchanges;
import com.stocks.datamodel.User;

@Controller
public class StocksController {
	
	@Autowired
	private StockExchangesDao stocksDAO;
	
	@RequestMapping("/stocks-home")
	public String Stockshome(Model model) {
		
		List<StockExchanges> stock = stocksDAO.getAllStocks();
		model.addAttribute("stocksview", stock);
		model.addAttribute("stock", new StockExchanges());
		
		return "stocks";
		
	}
	
	@PostMapping("/stocks/savestocks")
	public String addStocks(@ModelAttribute("stocks") StockExchanges stock) {
		stocksDAO.saveOrUpdateStocks(stock);
		return "redirect:/stocks-home";
	}
	
	@GetMapping("/removestocks/{id}")
	public String deleteCompany(@PathVariable("id") int id) {
		
		StockExchanges stock = stocksDAO.getStocksById(id);
		stocksDAO.deleteStocks(stock);
		return "redirect:/stocks-home";
	}
	
	@GetMapping("/updatestocks/{id}")
	public String updateIPO(@PathVariable("id") int id,Model model) {
		
		List<StockExchanges> stock = stocksDAO.getAllStocks();
		model.addAttribute("stocksview", stock);
		StockExchanges p = stocksDAO.getStocksById(id);
		model.addAttribute("stock", p);
		return "stocks";	
		
	}
	
	

}
