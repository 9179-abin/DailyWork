/*
7. Write a program in C to sort elements of array in ascending order.
Test Data : 
Input the size of array : 5 
Input 5 elements in the array : 
element - 0 : 2 
element - 1 : 7 
element - 2 : 4 
element - 3 : 5 
element - 4 : 9 
Expected Output : 
Elements of array in sorted ascending order: 
2 4 5 7 9
*/

import java.util.*;
public class arraysort {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ar[],n,temp=0,small=0;
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
