
package com.ss.selenium.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.ss.selinium.library.Utilities;

public class FacebookScreenShot {
	public static void main(String args[]) throws Exception {
		WebDriver driver = Utilities.setChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Utilities.captureScreenShot(driver, "BeforeEmail");
		driver.findElement(By.cssSelector("#email")).sendKeys("Santhosh");;
		Utilities.captureScreenShot(driver, "AfterEmail");
		driver.close();
		
	}

}
