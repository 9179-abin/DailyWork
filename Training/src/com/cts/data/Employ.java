package com.cts.data;

import java.util.Comparator;

public class Employ implements Comparable<Employ> {
	private int id;
	private String name ;
	private String address;
	private int age;
	private double phone;
	private double salary;
	public Employ(){
		
	}
	public Employ(int id, String name, String address, int age, double phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+" : "+name+" : "+age+" : "+phone+" : "+salary;
	}
	@Override
	public int compareTo(Employ emp) {
		// TODO Auto-generated method stub
		if(this.age>emp.age)
		{
			return -1;//if return 1 then ascending, if -1 descending
		}
		else if(this.age==emp.age) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
	
class SortById implements Comparator<Employ>
{

	@Override
	public int compare(Employ o1, Employ o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else if(o1.getId()==o2.getId()){
			return 0;
		}
		else {
			return -1;
		}
	}
		
}

class SortByName implements Comparator<Employ>
{

	@Override
	public int compare(Employ o1, Employ o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}