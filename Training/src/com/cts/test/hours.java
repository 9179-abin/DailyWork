package com.cts.test;

import java.util.Scanner;

public class hours {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the number of hours:");
		a=sc.nextInt();
		System.out.println("Enter the no. of products:");
		b=sc.nextInt();
		System.out.println("The no. of productive hours: "+a*b);
	}
}