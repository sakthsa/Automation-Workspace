package com.ss.selinium.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.ss.selinium.library.Utilities;

public class WaitFunction {
	
	@Test
	void ExplicitWait() {
		WebDriver driver = Utilities.setChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.cssSelector("button[onclick='timedText()']")).click();
		WebDriverWait wait =  new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		System.out.println("Pass");
		driver.close();
		
	}
	
	@Test
	void FluentWaitFunction() {
		WebDriver driver = Utilities.setChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.cssSelector("button[onclick='timedText()']")).click();
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
			WebElement foo = fwait.until(new Function<WebDriver, WebElement>() 
			
			{
			  public WebElement apply(WebDriver driver) {
			  return driver.findElement(By.id("foo"));
			}
			});
	}

}
