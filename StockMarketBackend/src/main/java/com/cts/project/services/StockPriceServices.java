package com.cts.project.services;

import java.util.List;

import com.cts.project.dto.StockPriceDTO;
import com.cts.project.models.StockPrice;

public interface StockPriceServices {

	public String insert(StockPriceDTO stockPriceDTO);
	public StockPrice getOne(int id);
	public List<StockPrice> getAll();
	public String alter(StockPriceDTO stockPriceDTO);
	public void remove(int id);
	
}
