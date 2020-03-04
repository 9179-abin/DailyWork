package com.cts.training.stockpriceservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
public class StockPriceController {
	
	@Autowired
	StockPriceRepo stockPriceRepo;
	
	@Autowired
	StockPriceService stockPriceServices;
	
	@GetMapping("/stockprice")
	public List<StockPrice> findAll() {
		return stockPriceServices.getAll();
	}
//	@GetMapping("/stockprice")
//	public List<StockPrice> findAll() {
//		return spr.findAll();
//	}
	
	@GetMapping("/stockprice/{id}")
	public StockPrice findOne(@PathVariable int id) {
		StockPrice stockPrice = stockPriceServices.getOne(id);
		return stockPrice;
	}
	
	
//	@GetMapping("/stockprice/{id}")
//	public StockPrice findOne(@PathVariable int id) {
//		Optional<StockPrice> sp = spr.findById(id);
//		StockPrice sep = sp.get();
//		return sep;
//	}
	
	@PostMapping("/stockprice")
	public String save(@RequestBody StockPriceDTO stockPriceDTO ) {
		String b;
		b = stockPriceServices.insert(stockPriceDTO);
		return b;
	}
	
	
//	@PostMapping("/stockprice")
//	public StockPrice save(@RequestBody StockPrice sp) {
//		StockPrice sep = spr.save(sp);
//		return sep;
//	}
	
	@DeleteMapping("/stockprice/{id}")
	public void delete(@PathVariable int id) {
		stockPriceServices.remove(id);
	}
	
//	@DeleteMapping("/stockprice/{id}")
//	public void delete(@PathVariable int id) {
//		spr.deleteById(id);
//	}
	
	@PutMapping("/stockprice")
	public String update(@RequestBody StockPriceDTO stockPriceDTO) {
		String b;
		b = stockPriceServices.alter(stockPriceDTO);
		return b;
	}
	
	
//	@PutMapping("/stockprice")
//	public StockPrice update(@RequestBody StockPrice sp) {
//		StockPrice sep = spr.save(sp);
//		return sep;
//	}
	

}
