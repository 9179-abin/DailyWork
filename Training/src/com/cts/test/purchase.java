package com.cts.test;
import java.util.*;

public class purchase {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		long count=0;
		System.out.println("\tCourses");
		System.out.println("1.Java\t\t5000");
		System.out.println("2.C\t\t3000");
		System.out.println("3.C++\t\t2000");
		System.out.println("4.Python\t10000");
		System.out.println("5.Angular\t20000");
		System.out.println("Enter the courses you want to purchase:");
	    String ss=sc.nextLine();
        if(ss.contains("Java")) {
        	System.out.println("Java\t\t5000");
        	count+=5000;
        }
        if(ss.contains("C")) {
        	System.out.println("C\t\t3000");
        	count+=3000;
        }
        if(ss.contains("C++")) {
        	System.out.println("C++\t\t2000");
        	count+=2000;
        }
        if(ss.contains("Python")) {
        	System.out.println("Python\t10000");
        	count+=10000;
        }
        if(ss.contains("Angular")) {
        	System.out.println("Angular\t20000");
        	count+=20000;
        }
        System.out.println("TOTAL\t\t"+count);
	}

}
