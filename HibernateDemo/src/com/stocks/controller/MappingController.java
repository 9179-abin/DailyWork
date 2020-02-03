package com.stocks.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.stocks.datamodel.PassportDetails;
import com.stocks.datamodel.Person;



public class MappingController {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Person person = new Person();
//		person.setName("Hameemsha");
//		PassportDetails pd=new PassportDetails();
//		pd.setPassportNumber("B36545764754");
//		pd.setPerson(person);
//		person.setPassport(pd);
//		session.save(person);
		
		Criteria criteria = session.createCriteria(Person.class);
//		Person p = (Person) criteria.uniqueResult();
//		System.out.println(p.getName());
		
		List<Person> persons = criteria.add(Restrictions.eq("name","hameemsha")).list();
		for(Person p : persons) {
			System.out.println(p.getPassport().getPassportNumber());
		}

		transaction.commit();
		session.close();

		
	}

}
