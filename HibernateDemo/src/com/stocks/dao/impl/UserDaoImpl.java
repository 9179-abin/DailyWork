package com.stocks.dao.impl;

import java.util.List;


import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.stocks.dao.UserDao;
import com.stocks.datamodel.User;
import com.stocks.hibernate.HibernateUtil;

public class UserDaoImpl implements UserDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@Override
	public boolean saveUser(User user) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			session.update(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteUser(User user) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			User user = session.get(User.class, id);

			tx.commit();
			session.close();
			return user;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			List<User> users = session.createQuery("from User").list();
			tx.commit();
			session.close();
			return users;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean isValidUser(String username, String password) {
		try {
			Session session = sessionFactory.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();
			Query query = session.createQuery("from User where username=:username and password1=:password"); 
			query.setString("username",username);
			query.setString("password",password);
			
			User user = (User) query.uniqueResult();
			if(user.getPassword1() !=null) {
				tx.commit();
				session.close();
				return true;
			}
			else {
				return false;
			}
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			
		}
		
	}


}
