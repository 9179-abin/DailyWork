0package com.cts.test;
import java.util.*;
public class counter {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int count = 0,a,b;
		System.out.println("Enter 1st Limit:");
		a=sc.nextInt();
		System.out.println("Enter 2nd Limit:");
		b=sc.nextInt();
	    for(int i = a; i<=b; i++)
	    {
	        String number = String.valueOf(i);
	        while(number.contains("1"))
	        {
	            number= number.substring(number.indexOf("1")+1);
	            count ++;
	        }
	    }
	    System.out.println(count);
	}

}
