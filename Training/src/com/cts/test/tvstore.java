package com.cts.test;

import java.util.*;
public class tvstore {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String c;
		int v,size;
		double prize,f;
		System.out.println("Enter the TV type:");
		c=sc.nextLine();
		if(c.equals("CRT")) {
			System.out.println("Enter the Selling prize:");
			v=sc.nextInt();
			f= v*0.05;
			prize=(v-f);
			System.out.println("The discounted prize of "+c+" : "+prize);
		}
		else if(c.equals("LCD")) {
			System.out.println("Enter the size of "+c+" TV:");
			size=sc.nextInt();
			if(size==14) {
				System.out.println("Enter the Selling prize:");
				v=sc.nextInt();
				f= v*0.08;
				prize=(v-f);
				System.out.println("The discounted prize of "+c+" : "+prize);
			}
			else if(size==21) {
				System.out.println("Enter the Selling prize:");
				v=sc.nextInt();
				f= v*0.10;
				prize=(v-f);
				System.out.println("The discounted prize of "+c+" : "+prize);
			}
		}
		
		
	}

}
