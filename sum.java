/*
2. Write a program in C to find the sum of all elements of the array.
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15 
*/
import java.util.*;
public class sum {
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

