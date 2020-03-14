package com.cts.test;

import java.time.Duration;
import java.util.Scanner;

public class inheritanceDemo {
	public static void main(String[] args) {
		Manager emp = new Manager();
		emp.getData1();
		emp.display1();
		emp.getData();
		emp.display();
		Developer emp1 = new Developer();
		emp1.getData2();
		emp1.display2();
	}

}
class Employee{
	
	int id;
	String name;
	String company;
	
	public void display()
	{
		System.out.println(id+":"+name+":"+company);
	}
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
		id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Company:");
		company=sc.nextLine();
		
	}
}
class Manager extends Employee{
	//5
	
	String [] team;
	String Department;
	int a=0;
	public void getData1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Team members:");
		a=sc.nextInt();
		System.out.println("Enter name of Team members:");
		team = new String[a];
		for(int i=0;i<=a;i++) {
			team[i]=sc.nextLine();
		}
		System.out.println("Enter Department name:");
		Department=sc.nextLine();
		
	}
	public void display1() {
		System.out.println(Department);
		System.out.println("The team members are:");
		for(int i=0;i<a;i++) {
			System.out.println(team[i]);
		}
	}
	
}

class Developer extends Employee{
	String projectName;
	String duration;
	String domain;
	public void getData2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Project Name:");
		projectName=sc.nextLine();
		System.out.println("Enter Project duration:");
		duration=sc.nextLine();
		System.out.println("Enter Project Domain:");
		domain=sc.nextLine();
		sc.close();
	}
	public void display2()
	{
		System.out.println(projectName+":"+duration+":"+domain);
	}
	
}