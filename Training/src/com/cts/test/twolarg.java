package com.cts.test;
import java.util.*;
public class twolarg {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,max2=0,max=0,j=0;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		max=ar[0];
		for(int i=0;i<n;i++) {
			if(ar[i]>=max)
			{
				max=ar[i];
			}
		}
		while(ar[j]!=max && j<n) {
			if(ar[j]>=max2) {
				max2=ar[j];
			}
			j=j+1;
		}
		System.out.println("The 2nd largest element: "+ max2);
	}

}
