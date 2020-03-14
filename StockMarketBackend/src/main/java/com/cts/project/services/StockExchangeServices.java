package com.cts.project.services;

import java.util.List;


import com.cts.project.dto.StockExchangeDTO;
import com.cts.project.models.StockExchange;

public interface StockExchangeServices {
	
	public String insert(StockExchangeDTO stockExchangeDTO);
	public StockExchange getOne(int id);
	public List<StockExchange> getAll();
	public String alter(StockExchangeDTO stockExchangeDTO);
	public void remove(int id);

}
