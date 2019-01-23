package com.ss.selinium.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		List<WebElement> wblst = driver.findElements(By.xpath("//ul[@aria-labelledby='menu1']/li/a"));
		
		for (WebElement wb : wblst) {
			String value = wb.getAttribute("innerHTML");
			if(value.contentEquals("CSS")) {
				System.out.println(value);
				wb.click();
				break;
			}
		
		}
		driver.quit();
	}
	

}
