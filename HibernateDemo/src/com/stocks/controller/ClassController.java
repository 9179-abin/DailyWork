package com.stocks.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.stocks.datamodel.Person;
import com.stocks.datamodel.Student;
import com.stocks.datamodel.Teacher;

public class ClassController {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Teacher teacher = new Teacher();
		teacher.setName("Sam");
		teacher.setSubject("Maths");
		
		Student std1 = new Student();
		std1.setName("David");
		std1.setTeacher(teacher);
		
		Student std2 = new Student();
		std2.setName("Dexter");
		std2.setTeacher(teacher);	
		
		Set<Student> students = new HashSet<>();
		students.add(std1);
		students.add(std2);
		teacher.setStudents(students);
		session.save(std1);
		session.save(std2);
		session.save(teacher);
		

		transaction.commit();
		session.close();


	}

}
