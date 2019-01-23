package com.ss.selinium.script;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ss.selinium.library.Utilities;

public class BrokenLinks {
	
	@Test
	void verifyBrokenLinks() {
		WebDriver driver = Utilities.setChromeDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/");
		List<WebElement> lst = driver.findElements(By.cssSelector("a"));
		System.out.println("*******************  "+lst.size()+"  ***************");
		
		for (WebElement webElement : lst) {
			String url = webElement.getAttribute("href");
			Utilities.verifyURL(url);
		}
		
		
	}
	
		
	

}
