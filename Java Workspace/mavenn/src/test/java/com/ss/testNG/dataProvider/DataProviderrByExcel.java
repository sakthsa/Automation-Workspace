package com.ss.testNG.dataProvider;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ss.selenium.Excel.ExcelLib;
import com.ss.selinium.library.Utilities;

public class DataProviderrByExcel {
	
	WebDriver driver;
	@Test(dataProvider = "DataPro")
	public void logIn(String username, String password) {
		driver = Utilities.setChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getTitle().contains("OrangeHRM"),"Login failed/Title mismatch");
		try {
			//Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@DataProvider(name="DataPro")
	public Object[][] getData(){
		
		ExcelLib excLib = new ExcelLib("D:\\Git Folder\\Automation-Workspace\\Java Workspace\\mavenn\\TestData\\DataProvider.xls");
		int row = excLib.getRowCount(0);
		Object[][] data = new Object[row][2];
		for (int i=1; i<row; i++) {
			data[i][0] = excLib.getStringData(0, i, 0);
			data[i][1] = excLib.getStringData(0, i, 1);
			//data[i][2] = excLib.getStringData(0, i, 2);
			System.out.println("Pass");
		}
		return data;
	}
	

}
