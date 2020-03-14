package com.cts.test;
import java.util.*;
public class NestedClass {
	public static void main(String[] args) {
		Outer out=new Outer();
		out.display();
	}
}
class Outer{
	int x=10;
	static int y=20;
	public void display() {
		class Inner{
			public void show() {
				System.out.println(y);
				System.out.println(x);
			}
		}	
	Inner in=new Inner();
	in.show();
	}
}