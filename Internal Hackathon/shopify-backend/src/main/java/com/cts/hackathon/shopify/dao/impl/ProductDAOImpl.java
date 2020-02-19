package com.cts.hackathon.shopify.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.hackathon.shopify.dao.ProductDAO;
import com.cts.hackathon.shopify.model.ProductEntity;


@Transactional
@Repository(value = "productDAO")

public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveProduct(ProductEntity product) {
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean saveOrUpdateProduct(ProductEntity product) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(ProductEntity product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(ProductEntity product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ProductEntity getProductById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(ProductEntity.class, id);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<ProductEntity> getAllProducts() {
		try {

			List<ProductEntity> product = sessionFactory.getCurrentSession().createQuery("from ProductEntity").getResultList();

			return product;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
