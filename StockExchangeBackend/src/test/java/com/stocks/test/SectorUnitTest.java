package com.stocks.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stocks.dao.SectorDao;
import com.stocks.datamodel.Sector;



public class SectorUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	private static SectorDao sectorDAO;
	private static Sector sector;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		sector=(Sector) context.getBean("sect");
		sectorDAO=(SectorDao) context.getBean("sectDAO");
		
		}

	@Test
	public void testSaveSector() {
		Sector u = new Sector(110, "BSE", "yuiop");
		assertEquals(true, sectorDAO.saveOrUpdateSector(u));
	}

}
