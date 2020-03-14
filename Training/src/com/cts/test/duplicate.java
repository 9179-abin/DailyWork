package com.cts.test;
import java.util.*;
public class duplicate {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,count=0,j=0,m=0;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			j=i+1;
			while(j<n) {
				if(ar[i]==ar[j])
				{
					if(i==0) {
						m=ar[i];
						count+=1;
						j=j+1;
					}
					else
					{
						if(m!=ar[j])
							count+=1;
							j=j+1;
					}
				}
				else {
					j=j+1;
				}
			}
		}
		System.out.println("The no. of duplicate elements in array:"+ count);
	}

}
