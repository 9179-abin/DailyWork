/*
1. Write a program in C to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 
*/

import java.util.*;
public class reverse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("The array elements in reverse are:");
		n=n-1;
		for(int i=n;i>=0;i--) {
			
			System.out.print(ar[i]+" ");
		}
	}

}
