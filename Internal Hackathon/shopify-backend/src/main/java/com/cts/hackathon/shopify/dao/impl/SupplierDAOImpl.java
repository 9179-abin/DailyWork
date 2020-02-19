package com.cts.hackathon.shopify.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.hackathon.shopify.dao.SupplierDAO;
import com.cts.hackathon.shopify.model.SupplierEntity;

@Transactional
@Repository(value = "supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean saveSupplier(SupplierEntity supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean saveOrUpdateSupplier(SupplierEntity supplier) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	// @Override
	public boolean updateSupplier(SupplierEntity supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	// @Override
	public boolean deleteSupplier(SupplierEntity supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	// @Override
	public SupplierEntity getSupplierById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(SupplierEntity.class, id);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	// @Override
	public List<SupplierEntity> getAllSuppliers() {
		try {

			List<SupplierEntity> supplier = sessionFactory.getCurrentSession().createQuery("from SupplierEntity")
					.getResultList();

			return supplier;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}

	}

}
