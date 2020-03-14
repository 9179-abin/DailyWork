package com.cts.test;

public class ConstructorDemo {
	public static void main(String[] args) {
		Human hh=new Human();
		Human h=new Human(2,3);
		h.display();
	}

}
class Human{
	//instance variables
	int a,b;
	public Human() {
		System.out.println("I am called Automatically");
	}
	public Human(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Parameyterised");
	}
	public void display() {
		System.out.println(a+" "+b);
	}
}
