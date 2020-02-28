package com.cts.project.services;

import java.util.List;

import com.cts.project.dto.CompanyDTO;
import com.cts.project.models.Company;

public interface CompanyServices {
	
	public String insert(CompanyDTO company);
	public Company getOne(int id);
	public List<Company> getAll();
	public String alter(CompanyDTO company);
	public void remove(int id);

}
