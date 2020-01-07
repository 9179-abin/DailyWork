/*
3. Write a program in C to copy the elements of one array into another array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 15 
element - 1 : 10 
element - 2 : 12 
Expected Output : 
The elements stored in the first array are : 
15 10 12 
The elements copied into the second array are : 
15 10 12 

*/

import java.util.*;
public class copy {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],av[],n;
		System.out.println("Enter the size of array:");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		av=new int[n];
		for(int i=0;i<n;i++) {
			av[i]=ar[i];
		}
		System.out.print("The element stored in 1st array:");
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println(" ");
		System.out.print("The element stored in 2nd array:");
		for(int i=0;i<n;i++) {
			System.out.print(av[i]+" ");
		}
	}

}
