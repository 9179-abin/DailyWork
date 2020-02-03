package com.stocks.controller;
import java.util.*;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.stocks.dao.UserDao;
import com.stocks.dao.impl.UserDaoImpl;
import com.stocks.datamodel.User;

public class UserController {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		UserDao curd = new UserDaoImpl();
		
//		-----Add User Details----
		
//		User user = new User(107, "bobby", "idgittz", "idgittz", "bobby@gmail.com", 546432134, true);
//		curd.saveUser( user );
//		------------------------------
		
		
//		-----Update User Details-----
		
//		User getUser= session.get(User.class, 157);
//		getUser.setEnabled(true);
//		getUser.setUsername("Albin");
//		boolean b=curd.updateUser(getUser);
//		--------------------------------
		
//		---------------------------------
//		session.update(getUser);
//		session.save(user);
//		session.delete(getUser);
//		List<User>  users = session.createQuery("FROM User").list();
//		users.forEach(System.out::println);
//		----------------------------------
		
//		------Delete User By Id-------------
//		System.out.println("Enter the id of user to be deleted:");
//		int b=sc.nextInt();
//		User getUser= session.get(User.class,b);
//		boolean bb=curd.deleteUser(getUser);
//		------------------------------------
		
//		---------GetUserById----------------
//		System.out.println("Enter the id of user to be displayed:");
//		int b=sc.nextInt();
//		User getUser= session.get(User.class,b);
//		System.out.println(curd.getUserById(b));
//		---------------------------------------
		
//		------------GetAllUsers-----------------
//		System.out.println(curd.getAllUsers()+"\n");
		
		transaction.commit();
		session.close();

	}

}
