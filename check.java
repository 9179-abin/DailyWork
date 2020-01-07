/*
1. Write a Program that accepts a number and checks whether it's positive, negative, or
   zero?

Output:
	C:\Users\Lenovo\Desktop>java check.java
	Enter your number:
	2
	2 is a positive number
   
*/


import java.util.*;
public class check{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your number:");
		int b=sc.nextInt();
		if(b<0) {
			System.out.println(b+" is a negative number");
		}
		else
		{
			System.out.println(b+" is a positive number");
		}
		
	}
}