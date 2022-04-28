package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCalc {

/*	@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	Calculator c=new Calculator();
	@Test
	public void testHello()
	{
		Assertions.assertEquals("Hello World!", c.sayHello());
	}

	@Test
	public void testAddition() {
	
	}
}
