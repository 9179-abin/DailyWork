package com.stocks.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stocks.dao.StockExchangesDao;
import com.stocks.datamodel.IPO;
import com.stocks.datamodel.StockExchanges;

@Transactional
@Repository(value="stocksDAO")
public class StockExchangesDaoImpl implements StockExchangesDao {
	
	@Autowired
	SessionFactory sessionFactory;

//	@Override
//	public boolean saveStocks(StockExchanges stocks) {
//		try {
//			sessionFactory.getCurrentSession().save(stocks);
//			return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}	}
//
//	@Override
//	public boolean updateStocks(StockExchanges stocks) {
//		try {
//			sessionFactory.getCurrentSession().update(stocks);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
	
	@Override
	public boolean saveOrUpdateStocks(StockExchanges stocks) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(stocks);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	}
	

	@Override
	public boolean deleteStocks(StockExchanges stocks) {
		try {
			sessionFactory.getCurrentSession().delete(stocks);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public StockExchanges getStocksById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockExchanges.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<StockExchanges> getAllStocks() {
		try {
			List<StockExchanges> ipo = sessionFactory.getCurrentSession().createQuery("from StockExchanges").list();
			return ipo;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
