package com.stocks.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.stocks.datamodel.ContractualEmployee;
import com.stocks.datamodel.Employee;
import com.stocks.datamodel.PermanentEmployee;

public class EmployeeController {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		PermanentEmployee pe=new PermanentEmployee();
		ContractualEmployee ce = new ContractualEmployee();
		
		employee.setName("David");
		pe.setSalary(324324);
		pe.setBonus(213112F);
		ce.setPayPerHour(2000);
	    ce.setContractPeriod(12);
//		Set<String> emails=new HashSet<String>();
//		
//		emails.add("david@gmail.com");
//		emails.add("david@yahoo.in");
//		emails.add("david@cts.com");
//		employee.setEmails(emails);
//		
		session.save(employee);
		session.save(pe);
		session.save(ce);

		
		transaction.commit();
		session.close();


	}

}
