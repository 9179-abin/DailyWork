package com.stocks.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stocks.dao.IPODao;
import com.stocks.datamodel.IPO;

@Transactional
@Repository(value="ipoDAO")
public class IPODaoImpl implements IPODao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean save(IPO ipo) {
		
		try {
			sessionFactory.getCurrentSession().save(ipo);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateIPO(IPO ipo) {
		try {
			sessionFactory.getCurrentSession().update(ipo);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteIPO(IPO ipo) {
		try {
			sessionFactory.getCurrentSession().delete(ipo);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public IPO getIPOById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(IPO.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<IPO> getAllIPO() {
		try {
			List<IPO> ipo = sessionFactory.getCurrentSession().createQuery("from IPO").list();
			return ipo;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
