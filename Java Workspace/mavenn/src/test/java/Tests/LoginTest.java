package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ss.selinium.library.ConfigReader;
import com.ss.selinium.library.Utilities;

import PageFactory.Login;
import jdk.nashorn.internal.runtime.regexp.joni.Config;


//@Listeners(com.ss.testNG.listener.Listener.class)
public class LoginTest extends BaseTest {
	
	
	@Test
	public void test1() throws InterruptedException {
		logObj.setUserName(configObj.getAdminUsername());
		logObj.setPassword(configObj.getAdminPassword());
		logObj.clickLogin();
		assertEquals(logObj.getPageTitle(), "OrangeHRM");
		Thread.sleep(2000);
		clickonLogout();		
		
	}
	
	@Test
	public void test2() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(file)
		driver.navigate().to(configObj.getURL());
		logObj.setUserName(configObj.getAdminUsername());
		logObj.setPassword(configObj.getAdminPassword());
		logObj.clickLogin();
		assertEquals(logObj.getPageTitle(), "OrangeHRM");
	}
	
}
