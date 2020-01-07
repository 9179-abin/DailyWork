/*
5. Write a program in C to find the maximum and minimum element in an array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 45 
element - 1 : 25 
element - 2 : 21 
Expected Output : 
Maximum element is : 45 
Minimum element is : 21 
*/
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
