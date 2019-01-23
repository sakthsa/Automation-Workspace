package com.ss.selenium.annotations.assertion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ss.selinium.library.Utilities;

public class VerifyTitle {
	
	//@Test
	public void verifyPageTitle() {
		WebDriver driver = Utilities.setChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String Actual = driver.getTitle();
		String Expected = "Facebook – log in or sign";
		Assert.assertTrue(Actual.contains(Expected));
		System.out.println("Test pass");
		driver.quit();
	}
	
	@Test
	public void verifyPageTitleViaSource() {
		WebDriver driver = Utilities.setChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String PageSource = driver.getPageSource();
		String PageTitle = "Facebook – log in or sign";
		Assert.assertTrue(PageSource.contains(PageTitle));
		System.out.println("Test pass");
		driver.quit();
	}


}
