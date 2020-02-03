package com.stocks.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.stocks.datamodel.Developer;
import com.stocks.datamodel.Technology;

public class TechDevController {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Developer developer1= new Developer();
		developer1.setName("Vishal");

		Developer developer2= new Developer();
		developer2.setName("Yogesh");

		Developer developer3= new Developer();
		developer3.setName("Virendra");

		Technology technology1=new Technology();
		technology1.setLanguage("Java");
		technology1.setExpertise("Intermediate");

		Technology technology2=new Technology();
		technology2.setLanguage("Bigdata");
		technology2.setExpertise("Expert");

		Set<Technology> technologies= new HashSet<Technology>();
		technologies.add(technology1);
		technologies.add(technology2);

		developer1.setTechnology(technologies);
		developer2.setTechnology(technologies);
		developer3.setTechnology(technologies);
		
		session.save(developer1);
		session.save(developer2);
		session.save(developer3);
		session.save(technology1);
		session.save(technology2);
		
//		Criteria criteria = session.createCriteria(Developer.class);
//		criteria.add(Restrictions.eq("id", 55));
//
//		Developer developer = (Developer) criteria.uniqueResult();
//		System.out.println(developer.toString());
//
//		Set<Technology> tech = developer.getTechnology();
//		for(Technology technology : tech){
//		  System.out.println(technology.toString());
//		}

		
		
		transaction.commit();
		session.close();
		
		
	}

}
