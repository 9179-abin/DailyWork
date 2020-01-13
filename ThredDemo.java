package com.cts.activity.dao;

public class ThredDemo {
//Daemon thread
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		System.out.println("thred name:"+thread.getName());
		thread.setName("CTS Thread");
		System.out.println("thred name:"+thread.getName());
		System.out.println("Is thred daemon:"+thread.isDaemon());
		System.out.println("Is thred Alive:"+thread.isAlive());
		System.out.println("thred state:"+thread.getState());
		System.out.println("thred Id:"+thread.getId());
	}

}
