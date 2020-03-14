package com.cts.test	;

import com.cts.data.Test;

public class Demo {
	public static void main(String[] args)
	{
		Test t=new Test()
		{
			@Override
			public void display()
			{
				System.out.println("Good Morning");
			}

		};
		t.display();
	}
}
