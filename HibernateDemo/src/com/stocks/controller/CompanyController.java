package com.stocks.controller;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.stocks.dao.CompanyDao;
import com.stocks.dao.UserDao;
import com.stocks.dao.impl.CompanyDaoImpl;
import com.stocks.dao.impl.UserDaoImpl;
import com.stocks.datamodel.Company;
import com.stocks.datamodel.StockExchange;

public class CompanyController {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		CompanyDao curd = new CompanyDaoImpl();
		
//		-----Add User Details----
		
//		Company company = new Company(102, "Cognizant", "Shollinganalloor", "Tamil Nadu", 623468, 965431321.98,"Good Company","NSE","IT");
//		curd.saveCompany( company );
//		------------------------------
		
		
//		-----Update User Details-----
		
//		Company getCompany= session.get(Company.class, 100);
//		getCompany.setCompanyName("Wipro");
//		boolean b=curd.updateCompany(getCompany);
//		--------------------------------
		
//		---------------------------------
//		session.update(getCompany);
//		session.save(company);
//		session.delete(getCompany);
//		List<Company>  company = session.createQuery("FROM User").list();
//		users.forEach(System.out::println);
//		----------------------------------
		
//		------Delete User By Id-------------
//		System.out.println("Enter the id of Company to be deleted:");
//		int b=sc.nextInt();
//		Company getCompany= session.get(Company.class,b);
//		boolean bb=curd.deleteCompany(getCompany);
//		------------------------------------
		
//		---------GetUserById----------------
//		System.out.println("Enter the id of Company to be displayed:");
//		int b=sc.nextInt();
//		Company getCompany= session.get(Company.class,b);
//		System.out.println(curd.getCompanyById(b));
//		---------------------------------------
		
//		------------GetAllUsers-----------------
//		System.out.println(curd.getAllCompany()+"\n");
		
		
		transaction.commit();
		session.close();

	}  

}
