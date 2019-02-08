package com.ss.testNG.dataProvider;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ss.selinium.library.Utilities;

public class DataProviderr {
	
	WebDriver driver;
	@Test(dataProvider = "DataPro")
	public void logIn(String username, String password, String pageTitle) {
		driver = Utilities.setChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getTitle().contains(pageTitle),"Login failed");
		try {
			//Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider(name="DataPro")
	public Object[][] getData(){
		Object[][] data = new Object[3][3];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[0][2] = "OrangeHRM";
		data[1][0] = "Admin";
		data[1][1] = "admin123";
		data[1][2] = "OrangeRM";
		data[2][0] = "Admin";
		data[2][1] = "admin123";
		data[2][2] = "OrangeHRM";
		
		return data;
	}
	

}
