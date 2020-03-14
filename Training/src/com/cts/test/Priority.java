package com.cts.test;

import java.util.PriorityQueue;

public class Priority {
	public static void main(String[] args) {
		PriorityQueue<Integer> m = new PriorityQueue<Integer>();
		m.add(1);
		m.add(15);
		m.add(10);
		m.add(23);
		System.out.println(m.element());
		System.out.println(m);
		System.out.println(m.poll());
		System.out.println(m);
		System.out.println(m.peek());
		System.out.println(m);
	}

}
