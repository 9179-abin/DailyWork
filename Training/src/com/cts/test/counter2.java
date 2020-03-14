package com.cts.test;
import java.util.*;
public class counter2 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int a,b,n,count=0,p;
		System.out.println("Enter 1st Limit:");
		a=sc.nextInt();
		System.out.println("Enter 2nd Limit:");
		b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			n=i;
			while(n!=0) {
				p=n%10;
				n=n/10;
				if(p==1) {
					count+=1;
				}
			}
		}
		System.out.println("No.of ones="+count);
	}

}
