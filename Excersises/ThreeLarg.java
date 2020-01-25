package basics;

import java.util.Scanner;

public class ThreeLarg {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter the 1st number:");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		b=sc.nextInt();
		System.out.println("Enter the 3rd number:");
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				System.out.println(a+" is the largest of all");
			}
			else {
				System.out.println(c+" is the largest of all");
			}
		}
		else if(b>c) {
			System.out.println(b+" is the largest of all");
		}
		else {
			System.out.println(c+" is the largest of all");
		}
	}

}