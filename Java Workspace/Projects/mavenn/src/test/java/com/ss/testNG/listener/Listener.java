package com.ss.testNG.listener;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ss.selinium.library.Utilities;

public class Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +" : Test cases is getting started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +" : Test cases is PASSED");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() +" : Test cases is FAILED");
		
	     
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() +" : Test cases is SKIPPED");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
