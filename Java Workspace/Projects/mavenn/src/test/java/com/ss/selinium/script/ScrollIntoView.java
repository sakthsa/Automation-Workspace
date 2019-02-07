package com.ss.selinium.script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ss.selinium.library.Utilities;

public class ScrollIntoView {
	
	@org.testng.annotations.Test
	void Test() {
		WebDriver driver = Utilities.setChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		WebElement wb =driver.findElement(By.xpath("//textarea[text()='textarea']"));
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true);", wb);
		wb.clear();
		wb.sendKeys("Helloooo");
		
		
		
	}

}
