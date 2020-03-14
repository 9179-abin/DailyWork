package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.Employ;

public interface EmployDao {
	public boolean addEmploy(Employ employee);
	public boolean updateEmploy(Employ employee);
	public boolean deleteEmploy(Employ employee);
	
	public Employ getEmployById(int id);
	
	public List<Employ> getAllEmploy();
	
}
