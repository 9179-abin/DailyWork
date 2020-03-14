package com.cts.test;

public class area {
	public static final double pi=3.14;
	public static void main(String args[]) {
		area(2.0,3);
	}
	public static void area(double a) {
		System.out.println("The area of square:"+(a*a));
	}
	public static void area(double a,double b) {
		System.out.println("The are of rectangle:"+(a*b));
	}
	public static void area(int a, double b) {
		System.out.println("The area of triangle:"+(a*b/2));
		
	}
	public static void area(int a) {
		System.out.println("The area of circle:"+(pi*a*a));
		
	}
	
}
