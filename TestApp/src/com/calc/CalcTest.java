package com.calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	Calculator calculator;
	@Before
	public void init()
	{
		calculator = new Calculator();
		System.out.println("Calculator object created");
	}
	@After
	public void distroy()
	{
		calculator = null;
		System.out.println("Calculator object destroyed");
	}
	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
	}
	@Test
	public void testSub() {
		assertEquals(-1, calculator.sub(2, 3));
	}

}
