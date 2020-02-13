package com.stocks.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stocks.dao.SectorDao;
import com.stocks.datamodel.Sector;

@Transactional
@Repository(value = "sectDAO")
public class SectorDaoImpl implements SectorDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean saveOrUpdateSector(Sector sector) {
		try {
		sessionFactory.getCurrentSession().saveOrUpdate(sector);
		return true;
	} catch (HibernateException e) {
		e.printStackTrace();
		return false;
	}
	}

	@Override
	public boolean deleteSector(Sector sector) {
		try {
			sessionFactory.getCurrentSession().delete(sector);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Sector getSectorById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(Sector.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Sector> getAllSector() {
		try {
			List<Sector> sector = sessionFactory.getCurrentSession().createQuery("from Sector").list();
			return sector;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
