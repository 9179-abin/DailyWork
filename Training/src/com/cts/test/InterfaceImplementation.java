package com.cts.test;

public class InterfaceImplemenation {
	public static void main(String[] args)
	{
		TestImpl t1=new TestImpl();
		int sum=t1.add(2, 3);
		int sub=t1.sub(2, 3);
		System.out.println(sum);
		System.out.println(sub);
	}
}