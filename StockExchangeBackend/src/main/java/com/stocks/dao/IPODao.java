package com.stocks.dao;

import java.util.List;

import com.stocks.datamodel.IPO;

public interface IPODao {
	
	public boolean save(IPO ipo);

	public boolean updateIPO(IPO ipo);

	public boolean deleteIPO(IPO ipo);

	public IPO getIPOById(int id);

	public List<IPO> getAllIPO();
	
	

}
