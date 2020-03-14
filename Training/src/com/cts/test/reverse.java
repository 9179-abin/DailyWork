package com.cts.test;
import java.util.*;
public class reverse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,m=0;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			m+=ar[i];
		}
		System.out.println("The  sum of all elements in array:"+m);
	}

}
