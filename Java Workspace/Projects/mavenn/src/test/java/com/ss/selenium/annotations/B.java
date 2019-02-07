package com.ss.selenium.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B {
	
	@BeforeSuite
	void suiteBefore() {
		System.out.println("before suite");
	}
	
	@BeforeMethod
	void methodBefore() {
		System.out.println("Before method");
	}
	
	@BeforeTest
	void testBefore() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	void classBefore() {
		System.out.println("Before Class");
	}
	
	@AfterSuite
	void suiteAfter() {
		System.out.println("After Suite");
	}
	@Test
	void m1() {
		System.out.println("m1111");
	}
	
	@Test
	void m2() {
		System.out.println("m22222");
	}



}
