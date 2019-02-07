package com.ss.selinium.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.ss.selinium.library.Utilities;

import PageFactory.Login;

public class SampleTest {
	
	@Test
	public void loginApp() throws Exception {
		WebDriver driver = Utilities.setChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");;
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	
	
	
	
	@FindBy(name="Submit")
	WebElement logIn;
	
	@FindBy(xpath="//a[contains(text(),'Welcome')]")
	WebElement userNameTitle;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logOut;
	

}
