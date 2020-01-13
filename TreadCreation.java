package com.cts.activity.dao;

public class TreadCreation {
	public static void main(String[] args) {
		System.out.println("Main thread starts------");
//		Thread t=Thread.currentThread();
//		t.setPriority(Thread.MAX_PRIORITY-2);
		Resource resource=new Resource();
		FirstThread firstThread=new FirstThread(resource);
		SecondThread secondThread=new SecondThread(resource);
		//firstThread.start();
		//secondThread.start();
		Thread threadOne=new Thread(firstThread);
		Thread threadTwo=new Thread(secondThread);
//		threadOne.setPriority(Thread.MIN_PRIORITY+2);
		threadOne.start();
		threadTwo.start();
//		System.out.println("1st thread Priority:"+threadOne.getPriority());
//		System.out.println("2nd thread Priority:"+threadTwo.getPriority());
//		for(int i=1;i<=10;i++) {
//			System.out.println("Main Thread :"+i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
class FirstThread implements Runnable
{
	Resource resource;
	public FirstThread(Resource resource) {
		this.resource=resource;
	}
	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("First Thread :"+i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		resource.display("First Thread");
	}
}

class SecondThread implements Runnable
{
	Resource resource;
	public SecondThread(Resource resource) {
		this.resource=resource;
	}
	public void run() {
//		for(int i=1;i<=10;i++) {
//			System.out.println("Second Thread :"+i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		resource.display("Second Thread");
	}
}
class Resource
{
	public void display(String message) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(message + " " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}