/*
A cash dispenser can dispense currency notes of valuation 2000,500,200,100. It should be configured to dispense minimal number of currency notes. Write a program to help me on this. Assume amount will be given as multiple of 100.  
Sample Input 4500 Sample Output 2000 2 500 1  
Sample Input 3700 Sample Output 2000 1 500 3 200 1  

*/

package com.cts.test;
import java.util.*;
public class CashDispencer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long money;
		int p=0,q=0,r=0,s=0;
		System.out.println("Enter the amount you want to withdraw:");
		money=sc.nextLong();
		long bb=money;
		
		while(money>0)
		{
			if(bb>=2000)
			{
				bb=bb-2000;
				money=money-2000;
				p+=1;
			}
			else if(bb>=500) {
				bb=bb-500;
				money=money-500;
				q+=1;
			}
			else if(bb>=200) {
				bb=bb-200;
				money=money-200;
				r+=1;
			}
			else if(bb>=100) {
				bb=bb-100;
				money=money-100;
				s+=1;
			}
		}
		System.out.println("The no. of 2000 notes:"+p);
		System.out.println("The no. of 500 notes:"+q);
		System.out.println("The no. of 200 notes:"+r);
		System.out.println("The no. of 100 notes:"+s);
	}
}
