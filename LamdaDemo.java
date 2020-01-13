package com.cts.activity.dao;

public class LamdaDemo {
	public static void main(String[] args) {
//		Hello hello=new Hello() {
//
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				System.out.println("This is inner class");
//			}
//			
//		};
//		Hello h=() ->{
//			System.out.println("This lamda expression");
//			System.out.println("This lamda expression");
//			System.out.println("This lamda expression");
//		};
//		h.display();
//		Runnable r=() -> System.out.println("I am runnable interface");
//		Thread t=new Thread(r);
//		t.start();
		Hello h=(a,b) -> a+b;
		System.out.println(h.add(10, 20));
	}
}
 
@FunctionalInterface
interface Hello {
//	void display();
	public int add(int a,int b);
}