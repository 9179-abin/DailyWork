package com.stocks.dao;

import java.util.List;

import com.stocks.datamodel.StockExchanges;

public interface StockExchangesDao {
	
	public boolean saveStocks(StockExchanges stocks);

	public boolean updateStocks(StockExchanges stocks);

	public boolean deleteStocks(StockExchanges stocks);

	public StockExchanges getStocksById(int id);

	public List<StockExchanges> getAllStocks();
	

}
