package com.cts.hackathon.shopify.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.hackathon.shopify.dao.UserDAO;
import com.cts.hackathon.shopify.model.UserEntity;

@Transactional
@Repository(value="userDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean saveUser(UserEntity user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean saveOrUpdateUser(UserEntity user) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	//@Override
	public boolean updateUser(UserEntity user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	//@Override
	public boolean deleteUser(UserEntity user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	//@Override
	public UserEntity getUserById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(UserEntity.class,id);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	

	//@Override
	public List<UserEntity> getAllUsers() {
		try {
			
			List<UserEntity> users = sessionFactory.getCurrentSession().createQuery("from UserEntity").getResultList();
			
			return users;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	

}
