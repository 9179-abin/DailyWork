package com.stocks.dao;

import java.util.List;

import com.stocks.datamodel.Sector;

public interface SectorDao {
	
	public boolean saveOrUpdateSector(Sector sector);

	public boolean deleteSector(Sector sector);

	public Sector getSectorById(int id);

	public List<Sector> getAllSector();

}
