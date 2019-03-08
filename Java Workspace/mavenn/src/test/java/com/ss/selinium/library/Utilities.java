package com.ss.selinium.library;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Utilities extends ConfigReaderrr{
	
	public static void captureScreenShot(WebDriver driver,String FileName ) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("./ScreenShot/"+FileName+".png"));
			System.out.println("Screenshot Taken");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static WebDriver setChromeDriver(){
		ConfigReaderrr con = new ConfigReaderrr();
		System.setProperty("webdriver.chrome.driver", con.getChromePath());
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	
	public static WebDriver setFirefoxDriver() {
		ConfigReaderrr con = new ConfigReaderrr();
		System.setProperty("webdriver.gecko.driver",con.getFirefoxPath());
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static Wait fluentWait(WebDriver driver, WebElement webEle) {
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
			WebElement foo = fwait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) {
			  return webEle;
			}
			});
			return fwait;
	}
	
	public static void verifyURL(String webURL) {
		try {
			HttpURLConnection urlConnect = (HttpURLConnection)new URL(webURL).openConnection();
			urlConnect.setConnectTimeout(3000);
			
			urlConnect.connect();
			if(urlConnect.getResponseCode()==200) {
				System.out.println(webURL+"--"+urlConnect.getResponseCode());
			}
			else if(urlConnect.getResponseCode()==401) {
				System.out.println(webURL+"--"+urlConnect.getResponseCode());
			}
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void clickByMouse(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		
		
	}
	

	

}
