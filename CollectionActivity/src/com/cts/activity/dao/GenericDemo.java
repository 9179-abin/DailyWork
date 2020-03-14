package com.cts.activity.dao;

public class GenericDemo<T> {
	private T t;
	public T get() {
		return this.t;
	}
	public void set(T t1) {
		this.t=t1;
		System.out.println(t);
	}
	public static void main(String[] args) {
		GenericDemo<String> type=new GenericDemo<>();
		type.set("Abin");
		String n=type.get();
//		System.out.println(n);
		GenericDemo type1=new GenericDemo();
		type1.set(10);
//		GenericDemo<Integer> type=new GenericDemo<>();

	}

}
