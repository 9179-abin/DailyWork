package com.cts.project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.project.dto.StockPriceDTO;
import com.cts.project.models.StockPrice;
import com.cts.project.repo.StockPriceRepo;
import com.cts.project.services.StockPriceServices;


@Service
public class StockPriceServiceImpl implements StockPriceServices {

	
	@Autowired
	StockPriceRepo stockPriceRepo;
	
	@Override
	public String insert(StockPriceDTO stockPriceDTO) {
		StockPrice stockPrice = new StockPrice();
		BeanUtils.copyProperties(stockPriceDTO, stockPrice);
		stockPrice=stockPriceRepo.save(stockPrice);
		if(stockPrice!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	@Override
	public StockPrice getOne(int id) {
		Optional<StockPrice> optional = stockPriceRepo.findById(id);
		StockPrice stockPrice = optional.get();
		return stockPrice;
	}

	@Override
	public List<StockPrice> getAll() {
		
		return stockPriceRepo.findAll();
	}

	@Override
	public String alter(StockPriceDTO stockPriceDTO) {
		StockPrice stockPrice = new StockPrice();
		BeanUtils.copyProperties(stockPriceDTO, stockPrice);
		stockPrice=stockPriceRepo.save(stockPrice);
		if(stockPrice!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	@Override
	public void remove(int id) {
		stockPriceRepo.deleteById(id);
		
	}

}
