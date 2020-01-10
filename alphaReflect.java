/*
Given a string say "abcdef" all the characters need to be replaced
 by their reflections . Like a is replaced with z , b with y etc. The
 input string is guaranteed to have all lowercase characters.
    Sample Input:
     abcd
     Output:
     zyxw

*/
package com.cts.test;
import java.util.*;
public class alphaReflect {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int x,y,n;
		String alp;
		System.out.println("Enter the alphabet to find reflection");
		alp=sc.nextLine();
		int l;
		char[] c=new char[alp.length()];
		for(int i=0;i<alp.length();i++ ) {
			x=97;
			y=122;
			n=alp.charAt(i);
			n=n-x;
			n=y-n;
			c[i]=(char)n;
		}
		for(int i=0;i<alp.length();i++) {
			System.out.print(c[i]+" ");
		}
	}

}
