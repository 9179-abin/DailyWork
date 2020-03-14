package com.cts.test;
import java.util.*;
public class interview {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String a;
		int c,b,d;
		System.out.println("Enter your name:");
		a=sc.nextLine();
		System.out.println("Enter your 1st test mark:");
		c=sc.nextInt();
		if(c>=75) {
			System.out.println("Enter your 2nd test mark:");
			b=sc.nextInt();
			if(b>=75) {
				d=(c+b)/2;
				if(d>80) {
					System.out.println(c+", You are selected for interview");
				}
				else {
					System.out.println(c+", Your criterias are not sufficient");
				}
			}
		}
	}

}
