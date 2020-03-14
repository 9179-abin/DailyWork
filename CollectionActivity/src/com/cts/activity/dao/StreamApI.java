package com.cts.activity.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cts.activity.bean.Employ;

public class StreamApI {

	public static void main(String[] args) {
		List<Employ> employees=new ArrayList<Employ>();
		
		addEmployees(employees);
		System.out.println("\nEAll Employee Details:  \n");
		employees.forEach(System.out::println);
		//Employees with Age less than 22 and from 'Kerala'
		List<Employ> ageScale= employees.stream().filter(emp -> emp.getAge()<22 && emp.getAddress().equals("Kerala")).collect(Collectors.toList());
		System.out.println("\nEmployees with Age < 22: \n");
		ageScale.forEach(System.out::println);
		List<Employ> nameLenght = employees.stream().filter(emp -> emp.getName().length()>5).collect(Collectors.toList());
		System.out.println("\nThe name of Employees with name length greater than 5: \n");
		nameLenght.forEach(System.out::println);
		List<Employ> salIncrease=employees.stream().map(sal -> {
			sal.setSalary(sal.getSalary() * 1.1 ); 
			return sal; 
			}).collect(Collectors.toList());
		System.out.println("\nSalary After Increment :");
		salIncrease.forEach(System.out::println);
	}

	private static void addEmployees(List<Employ> employees) {
		// TODO Auto-generated method stub
		Employ emp1 = new Employ(288,"Abin","Kerala",22,123325252,676456.00);
		Employ emp2 = new Employ(267,"Kevin","Delhi",30,765825252,893546.00);
		Employ emp3 = new Employ(281,"Elizabeth","Chennai",19,424567852,126456.00);
		Employ emp4 = new Employ(296,"Kevin","Kerala",17,982325252,683946.00);
		Employ emp5 = new Employ(223,"Samson","Kolkata",28,982325252,564946.00);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}
}
