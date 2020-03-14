package com.cts.test;
import java.util.*;

public class fetchDtails {
	static Scanner sc=new Scanner(System.in);
	public static String ss;
	public static int u;
	public static void main(String[] args) {
		System.out.println("Are you a Student or Employee(Student/Employee):");
		ss=sc.nextLine();
		getDetails gt=new getDetails(ss);
		gt.getVal();
		gt.display1();
		System.out.println("Enter which details you want to see(1.Student/2.Employee):");
	}

}
class getDetails{
	public static Scanner sc=new Scanner(System.in);
	public String b,n,m,desig,depart,crs;
	public int a,id,sal,f;
	getDetails(){
		
	}
	getDetails(String c){
		b=c;
	}
	getDetails(int a){
		f=a;
	}
	public void getVal() {
		System.out.println("Enter First name:");
		n=sc.nextLine();
		System.out.println("Enter Last name:");
		m=sc.nextLine();
		System.out.println("Enter Age:");
		a=Integer.parseInt(sc.nextLine());
		if(b.equals("Employee")) {
			employee.emp();
		}
		else
		{
			student.std();
		}
		if(f==1) {
			employee.display();
		}
		else {
			student.display();
		}
	}
}
class employee extends getDetails
{
	
	public static void emp() {
		System.out.println("Enter Employee ID:");
		id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Designation:");
		desig=sc.nextLine();
		System.out.println("Enter Employee Department:");
		depart=sc.nextLine();
		System.out.println("Enter Employee Salary:");
		sal=Integer.parseInt(sc.nextLine());
	}
	public static void display() {
		System.out.println("Employee ID:"+id);
		System.out.println("First Name:"+n);
		System.out.println("Last Name:"+m);
		System.out.println("Age:"+a);
		System.out.println("Designation:"+desig);
		System.out.println("Department:"+depart);
		System.out.println("Salary:"+sal);
	}
}
class student extends getDetails{
	public static void std() {
		super.getVal();
		System.out.println("Enter Student ID:");
		id=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Course:");
		crs=sc.nextLine();
	}public static void display() {
		System.out.println("Student ID:"+id);
		System.out.println("First Name:"+n);
		System.out.println("Last Name:"+m);
		System.out.println("Age:"+a);
		System.out.println("Course:"+crs);
	}
	
}