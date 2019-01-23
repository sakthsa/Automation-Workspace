package com.ss.selinium.script;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement monthDrop = driver.findElement(By.id("month"));
		Select selMonth = new Select(monthDrop);
		selMonth.selectByIndex(2);
		Thread.sleep(3000);
		selMonth.selectByValue("4");
		Thread.sleep(3000);
		selMonth.selectByVisibleText("May");
		System.out.println(selMonth.getFirstSelectedOption().getText());
		List<WebElement> lst = selMonth.getOptions();
		
		for (WebElement wb : lst) {
			
			System.out.println(wb.getText());
			
		}
		
	}

}
