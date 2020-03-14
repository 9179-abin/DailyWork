package com.cts.test;
import java.util.*;
public class arraysort {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,small=0;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			small=ar[i];
			for(int j=i+1;j<n;j++) {
				if(small>=ar[j]) {
					small=ar[j];
					ar[j]=ar[i];
					ar[i]=small;
							
				}
			}
		}
		System.out.print("Elements of array in sorted ascending order: ");
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
		
	}

}
