package com.cts.activity.main;

import java.util.List;

import com.cts.activity.bean.Employ;
import com.cts.activity.dao.EmployDao;
import com.cts.activity.daoimpl.EmployDAOImpl;

public class EmployMain {

	public static void main(String[] args) {
		
		EmployDao employeeDAO = new EmployDAOImpl();
		
		
		Employ employee = new Employ(103, "Akhil", "Pune", 22, 567576576L, 456456.00);
		
		boolean status = employeeDAO.addEmploy(employee);
		
     	if(status)
		{
			System.out.println("Employee Added Successfully");
		}else
		{
			System.out.println("Try Again");
		}
		
	List<Employ> list = employeeDAO.getAllEmploy();
		for(Employ employee2 : list)
		{
			System.out.println(employee2);
		}
		Employ employee2 = new Employ(103, "Raj", "Karnataka", 27, 567576576L, 456456.00);
		Employ  empl = employeeDAO.getEmployById(281);
		empl.setAddress("Ghaziabad");
		boolean status2 = employeeDAO.updateEmploy(empl);
		System.out.println("\nAfter update");
		for(Employ employee3 : list)
		{
			System.out.println(employee3);
		}
		Employ emp = employeeDAO.getEmployById(103);
		System.out.println("\nDetails of person @ id:103\n"+emp);
		
		Employ emp3 = employeeDAO.getEmployById(103);
		employeeDAO.deleteEmploy(emp3);
		System.out.println("\nAfter Deletion");
		for(Employ employee3 : list)
		{
			System.out.println(employee3);
		}
		
		
		
		
		
		

	}

}