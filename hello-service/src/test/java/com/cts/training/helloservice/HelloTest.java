package com.cts.training.helloservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void test() {
		HelloController h = new HelloController();
		assertEquals(h.display(), "Hello");
	}

}
