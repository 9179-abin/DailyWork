package com.cts.hackathon.shopify.dao;

import java.util.List;

import com.cts.hackathon.shopify.model.SupplierEntity;


public interface SupplierDAO {
	
public boolean saveSupplier(SupplierEntity supplier);
	
	public boolean deleteSupplier(SupplierEntity supplier);
	
	public boolean saveOrUpdateSupplier(SupplierEntity supplier);
	
	public boolean updateSupplier(SupplierEntity supplier);
	
	public SupplierEntity getSupplierById(int id);
	
	public List<SupplierEntity> getAllSuppliers();

}
