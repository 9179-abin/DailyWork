package com.stocks.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stocks.dao.IPODao;
import com.stocks.datamodel.IPO;



public class IPOUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	private static IPODao ipoDAO;
	private static IPO ipo;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		ipo=(IPO) context.getBean("IPO");
		ipoDAO=(IPODao) context.getBean("ipoDAO");
		
		}
	
	@Test
	public void testSaveIPO() {
		IPO p = new IPO(103, "Infosys", "NASDAQ", 3456789.09, 345,"ASV IT Park 3rd Floor, Andhra Pradesh","Mysore","Pune",786543,LocalDate.of(2020, 07, 13));
		assertEquals(true, ipoDAO.saveOrUpdate(p));
	}

}
