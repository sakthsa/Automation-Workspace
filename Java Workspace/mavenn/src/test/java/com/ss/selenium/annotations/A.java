package com.ss.selenium.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.ss.selenium.annotations.*;

@Ignore
public class A extends B {
	
	@BeforeTest @Ignore
	public void beforeTest1() {
		System.out.println("Before Test");
	}
	
	@BeforeMethod @Ignore
	public void beforemethod1() {
		System.out.println("before method");
	}
	
	
	@Test(groups= {"Functional","Sanity"}) @Ignore
	@Parameters({"adminUser","adminPassword"})
	public void test1(String user,String password){
		System.out.println("Test 1");
		System.out.println(user);
		System.out.println(password);
	}
	
	

	@Test(dependsOnMethods= {"test3"})
	public void cat(){
		System.out.println("cat 1");
	}
	
	@Test(groups= {"Functional"}) 
	public void test2(){
		System.out.println("Test 2");
	}
	
	@Test(dependsOnMethods= {"m1"},alwaysRun=true) @Ignore 
	public void test3(){
		
		System.out.println("Test 3");
	}
	@AfterTest @Ignore
	public void afterTest1() {
		System.out.println("After Test");
	}
	
	@AfterMethod @Ignore
	public void aftermethod1() {
		System.out.println("after method");
	}
	
	

}
