package com.cts.test;
import java.util.Scanner;

class ThrowException
{
	public static void logic() throws ArrayIndexOutOfBoundsException, NumberFormatException, NullPointerException
	{
		System.out.println("Start");
		String name="David";
		name=null;
		System.out.println(name.length());
		System.out.println("Stop");
	}
   public static void main(String [] my)
   {
	   try {
		   logic();
	   }
	   catch(Exception  ex)
	   {
		 System.out.println("Caught in Main");
	   }
	 
	 
	  finally
	  {
		  
		System.out.println("This Must be Executed.....");  
	  }
   }
}
