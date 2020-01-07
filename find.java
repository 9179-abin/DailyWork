/*
2. Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter?
   
Output:
		C:\Users\Lenovo\Desktop>java find.java
		Enter the length of rectangle:
		6
		Enter the breadth of rectangle:
		4
		Area=24
		Perimeter=20
*/

import java.util.*;
public class find{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Enter the length of rectangle:");
		a=sc.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		b=sc.nextInt();
		c=2*(a+b);
		d=a*b;
		System.out.println("Area="+d);
		System.out.println("Perimeter="+c);
	}
}