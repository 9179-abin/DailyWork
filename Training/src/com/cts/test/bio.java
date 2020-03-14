package com.cts.test;

import java.util.Scanner;

public class bio {

	public static void main(String[] args) {
		System.out.println("Choose to enter the details:(1.Student Details  2. Employee Details) ");
		Scanner scann=new Scanner(System.in);
		int choice=scann.nextInt();
		switch(choice)
		{
			case 1:
				StudentDetails student=new StudentDetails();
				student.getdetails();
				student.display();
				break;
			case 2:EmployeeDetails emp=new EmployeeDetails();
				emp.getdetails();
				emp.display();
				break;
		}
		

	}
}

class Details
{
	String fname;
	String lname;
	int age;
	
	public void display()
	{
		System.out.println("First name: " +fname);
		System.out.println("Last name:" +lname);
		System.out.println("Age:" +age);
	}
	public void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name:");
		fname=sc.nextLine();
		System.out.println("Enter the last name:");
		lname=sc.nextLine();
		System.out.println("Enter the age:");
		age=sc.nextInt();
	}
}

class StudentDetails extends Details
{
	String course;
	String studentid;
	
	public void display()
	{	
		super.display();
		System.out.println("Course: " +course+ "Student ID: " +studentid);
	}
	public void getdetails()
	{
		super.getdetails();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Course:");
		course=scanner.nextLine();
		System.out.println("Enter the Student ID:");
		studentid=scanner.nextLine();
	}
}

class EmployeeDetails extends Details
{
	int salary;
	String deptname;
	String designation;
	String employeeid;
	
	public void display()
	{
		super.display();
		System.out.println("Salary: " +salary+ "Department Name: " +deptname+ "Designation: " +designation+ "Employee ID: " +employeeid);
	}
	public void getdetails()
	{
		super.getdetails();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Salary:");
		salary=Integer.parseInt(scan.nextLine());
		System.out.println("Enter the Department Name:");
		deptname=scan.nextLine();
		System.out.println("Enter the Designation:");
		designation=scan.nextLine();
		System.out.println("Enter the Employee ID:");
		employeeid=scan.nextLine();
	}
}
