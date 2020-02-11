package com.stocks.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stocks.dao.CompanyDao;
import com.stocks.datamodel.Company;

public class CompanyUnitTest {
	
	private static AnnotationConfigApplicationContext context;
	private static CompanyDao companyDAO;
	private static Company company;
	
	@BeforeClass
	public static void init() {
		
		context= new AnnotationConfigApplicationContext();
		context.scan("com.stocks");
		context.refresh();
		company=(Company) context.getBean("company");
		companyDAO = (CompanyDao) context.getBean("companyDAO");
	}

//	@Test
//	public void testGetAllCompany() {
//		List<Company> company = companyDAO.getAllCompany();
//		assertEquals(2, company.size());
//	}
	
//	@Test
//	public void testSaveCompany() {
//		Company c = new Company(102, "Cognizant", "Shollinganalloor", "Tamil Nadu", 3534322, 9993331321.98,"Good Company","BSE","IT");
//		assertEquals(true, companyDAO.saveCompany(c));
//	}
	
//	@Test
//	public void testDeleteCompany() {
//		Company c = companyDAO.getCompanyById(62);
//		assertEquals(true, companyDAO.deleteCompany(c));
//	}
//	
//	@Test
//	public void testUpdateCompany() {
//		Company c = companyDAO.getCompanyById(67);
//		c.setCity("Guindy");
//		assertEquals(true, companyDAO.saveCompany(c));
//	}
//	
//	public void testGetCompanyById() {
//		
//		Company c = companyDAO.getCompanyById(50);
//		assertEquals(50, c.getId());
//	}
}
