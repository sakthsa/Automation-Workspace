package com.ss.selinium.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ss.selinium.library.*;

public class FirstProgram {
	
	WebDriver driver;
	
	@BeforeMethod
	@Parameters({"Browser"})
	void setDriver(String browser) {
		if (browser.equalsIgnoreCase("ff")) {
			driver = Utilities.setFirefoxDriver();
		}
		if (browser.equalsIgnoreCase("chrome")) {
			driver = Utilities.setChromeDriver();
		}
		
		
	}
	
	
	
	@Test
	void test1() {
		System.out.println("inside testcase 1");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void test2() {
		System.out.println("inside testcase 2");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void test3() {
		System.out.println("inside testcase 3");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	void test4() {
		System.out.println("inside testcase 4");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void test5() {
		System.out.println("inside testcase 5");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	void teardown() {
		driver.close();
	}

}
