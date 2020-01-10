/*
Given a number we need to find the number of times its digits need
 to be added so it becomes a single digit number .
    Example 91=9+1=10
    10=1+0=1
    So two times.
    Sample Input
    91
    output
    2
*/

package com.cts.test;
import java.util.*;
public class counter {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int b,n=0,sum=0,r=0,count=0;
		System.out.println("Enter the numer to be check sum");
		b=Integer.parseInt(sc.nextLine());
		n=b;
		while(b>0 || sum>=10){
			if(b!=0) {
				count=count+1;
			}
			if(b==0){
				b=sum;
				sum=0;
			}
			r=b%10;
			sum=sum+r;
			b=b/10;
		}
		System.out.println("Sum="+sum+" "+count);
	}
}
