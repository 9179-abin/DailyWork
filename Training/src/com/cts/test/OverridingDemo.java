package com.cts.test;

public class OverridingDemo {
	public static void main(String[] args) {
		Person employee = new Person2();
		employee.display();
	}

}
class Person
{
	void display() {
		System.out.println("Employee Class");
	}
}
class Person2 extends Person{
	void display() {
		System.out.println("The Manager Class");
	}
}
