package com.cts.test;

public class abstractDemo {
	public static void main(String[] args) {
		
	}

}
abstract class vechicle{
	//declared and defined
	public void display() {
		System.out.println("Display Method");	
	}
	//declared only
	abstract public void show();
		
}
abstract class car extends Vechicle{
	public void show() {
		System.out.println();
	}
}