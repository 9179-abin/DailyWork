package com.cts.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneralUnitTest {
	static GeneralAPI api=null;
	@BeforeClass
	public static void start() {
		api=new GeneralAPI();
		System.out.println("GeneralAPI object created");
	}

	@Test
	public void testAddNumbers() {
		assertEquals(12,api.add(4,8));
	}
	
	@Test
	public void testCheckEven() {
		assertEquals(true,api.CheckEven(12));
	}
	@Test
	public void testFactorial() {
		assertEquals(120,api.Factorial(5));
	}
	@Test
	public void testCheckPrime() {
		assertEquals(true,api.CheckPrime(5));
	}
	@AfterClass
	public static void destroy() {
		api=null;
		System.out.println("API object destroyed");
	}
	

}
