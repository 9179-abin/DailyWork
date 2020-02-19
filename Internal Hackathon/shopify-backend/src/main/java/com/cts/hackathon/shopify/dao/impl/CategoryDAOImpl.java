package com.cts.hackathon.shopify.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.hackathon.shopify.dao.CategoryDAO;
import com.cts.hackathon.shopify.model.CategoryEntity;
import com.cts.hackathon.shopify.model.ProductEntity;

@Transactional
@Repository(value = "categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean saveCategory(CategoryEntity category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean saveOrUpdateCategory(CategoryEntity category) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteCategory(CategoryEntity product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateCategory(CategoryEntity product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public CategoryEntity getCategoryById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(CategoryEntity.class, id);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public List<CategoryEntity> getAllCategories() {
		try {

			List<CategoryEntity> product = sessionFactory.getCurrentSession().createQuery("from CategoryEntity")
					.getResultList();

			return product;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
