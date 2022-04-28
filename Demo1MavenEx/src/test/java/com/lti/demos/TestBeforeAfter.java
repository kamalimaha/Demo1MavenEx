package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	@BeforeAll
	public static void testdbConn()
	{
		System.out.println("dp con is up");
	}

	/*@BeforeEach
	public static void test1()
	{
		System.out.println("dp con is Beforeeach");
	} */
	@Test
	public void testAddition()
	{
	System.out.println("test add method ");
	Calculator c= new Calculator();
	int result= c.addNos(100, 300);
	Assertions.assertEquals(400, result);
	}
	@Test
	public void testSub()
	{
	System.out.println("test sub method ");
	Calculator c= new Calculator();
	int result= c.subNos(100, 50) ;
	Assertions.assertEquals(50, result);
	}

	@AfterAll
	public static void testCloseCon()
	{
		System.out.println("dp con is closed");
	}
	/*@AfterEach
	public void testshuDown()
	{
		System.out.println("some var null");
	}*/

}
