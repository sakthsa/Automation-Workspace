package com.ss.selenium.annotations.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
	
	@Test
	public void assertTest() {
		Assert.assertEquals(12, 13,"not equals");
	}

}
