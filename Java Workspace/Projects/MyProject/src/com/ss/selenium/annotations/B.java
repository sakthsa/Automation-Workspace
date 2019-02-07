package com.ss.selenium.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class B {
	
	@BeforeSuite
	void suiteBefore() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	void suiteAfter() {
		System.out.println("After Suite");
	}
	@Test
	void m1() {
		System.out.println("m1111");
	}


}
