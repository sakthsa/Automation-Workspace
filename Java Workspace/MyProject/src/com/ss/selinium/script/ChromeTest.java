package com.ss.selinium.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
