package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestGreeting {

	Greeting grtObj=null;
	
	
	@BeforeClass
	public static void setUp() {
		System.out.println("SETUP Method Called");
	}
	
	@Before
	public void  beforeEachMethod() {
		 grtObj = new Greeting();

		System.out.println("Before Method called");
	}
	
	@Test
	public void testGreet() {
		
		
		assertEquals("Unit Testing", grtObj.greet());
	}
	
	@Test
	public void testGreetMessageLength() {
		
		
		int actualLength = grtObj.greet().length();
		
		assertEquals(12, actualLength);
	}

	
	@Ignore
	@Test(expected = RuntimeException.class)
	public void testGreetForNotNull() {
		
		fail("Not yet implemented");
	}
	@After
	public void  AfterEachMethod() {
		 grtObj = null;

		System.out.println("After  Method called");
	}


	
	@AfterClass
	public static void tearDown() {
		System.out.println("Tear Down Method Called");
	}
}
