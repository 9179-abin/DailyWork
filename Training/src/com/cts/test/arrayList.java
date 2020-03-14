package com.cts.test;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("hello");
		list.add(2020);
		System.out.println("now:");
		list.add(sc.nextLine().split(" "));
		System.out.println(list);
	}
	

}
