package com.cts.activity.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import com.cts.activity.bean.Employ;
import com.cts.activity.dao.EmployDao;

public class EmployDAOImpl implements EmployDao {
	static ArrayList<Employ> list = null;
	static {
		list = new ArrayList<Employ>();
		Employ emp1 = new Employ(281,"Abin","Kerala",30,424325252,546456.00);
		Employ emp2 = new Employ(250,"Kevin","Delhi",29,876825252,543546.00);
		list.add(emp1);
		list.add(emp2);
	}

	@Override
	public boolean addEmploy(Employ employee) {
		// TODO Auto-generated method stub
		try {
			list.add(employee);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean deleteEmploy(Employ employee) {
		// TODO Auto-generated method stub
		for(Employ emp : list) {
			if(emp.getId() == employee.getId())
			{
		     list.remove(list.indexOf(emp));
		     return true;
			}
		}
		return false;
	}

	@Override
	public Employ getEmployById(int id) {
		// TODO Auto-generated method stub
		for(Employ emp : list) {
			if(emp.getId()==id) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public List<Employ> getAllEmploy() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public boolean updateEmploy(Employ employee) {
		// TODO Auto-generated method stub
		for(Employ emp : list) {
			if(emp.getId() == employee.getId())
			{
		     list.set(list.indexOf(emp), employee);
		     return true;
			}
		}
		return false;
	}

}
