package com.stocks.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stocks.dao.StockExchangesDao;
import com.stocks.dao.UserDao;
import com.stocks.datamodel.StockExchanges;
import com.stocks.datamodel.User;

public class StocksUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	private static StockExchangesDao stockExchangeDAO;
	private static StockExchanges stocks;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		stocks=(StockExchanges) context.getBean("stocks");
		stockExchangeDAO=(StockExchangesDao) context.getBean("stocksDAO");
		
		}
	
	@Test
	public void testSaveStocks() {
		StockExchanges stock = new StockExchanges(110, "BSE","trreg","tryryegfd");
		assertEquals(true, stockExchangeDAO.saveOrUpdateStocks(stock));
	}

}
