package com.cts.test;
import java.util.*;
public class minmax {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,min=0,max=0;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		min=ar[0];
		max=ar[0];
		for(int i=0;i<n;i++) {
			if(ar[i]>=max)
			{
				max=ar[i];
			}
			if(ar[i]<=min) {
				min=ar[i];
			}
		}
		System.out.println("The maximum element is:"+max);
		System.out.println("The minimum element is:"+min);
	}

}
