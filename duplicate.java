/*
4. Write a program in C to count a total number of duplicate elements in an array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 5 
element - 1 : 1 
element -
Expected Output : 
Total number of duplicate elements found in the array is : 1 
*/
package com.cts.test;
import java.util.*;
public class duplicate {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,count=0,j=0,g=0;
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
				    if(ar[i]!=0 && ar[i]!=g)
					{
					    count+=1;
					}
					g=ar[i];
					ar[j]=0;
					ar[i]=0;
					j=j+1;
				}
				else {
					j=j+1;
				}
			}
		}
		System.out.println("The Total no. of duplicate elements in array:"+ count);
	}
}