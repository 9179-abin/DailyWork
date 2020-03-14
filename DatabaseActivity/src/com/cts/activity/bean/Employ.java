package com.cts.activity.bean;

import com.cts.activity.dao.EmployDao;
import com.cts.activity.daoimpl.EmployDAOImpl;

public class Employ {
	private int id;
	private String name;
	private String address;
	private int age;
	private double phone;
	private double salary;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployDao employDAO=new EmployDAOImpl();
		Employ emp = employDAO.getEmployById(1);
		System.out.println(emp);
	}
	public Employ() {
		
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
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone
				+ ", salary=" + salary + "]";
	}

}
