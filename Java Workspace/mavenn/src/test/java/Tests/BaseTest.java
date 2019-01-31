package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ss.selinium.library.ConfigReader;
import com.ss.selinium.library.Utilities;

import PageFactory.Login;

public class BaseTest {
	
	static WebDriver driver;
	ConfigReader configObj;
	Login logObj;
	
	public ConfigReader getConfigReaderObj()
	{
		return configObj;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@BeforeSuite
	public void suiteSetUp() {
		driver = Utilities.setChromeDriver();
		configObj = new ConfigReader();
		driver.get(configObj.getURL());
		driver.manage().window().maximize();
		logObj = new Login(driver);
		
	}
	
	
	
	@AfterMethod
	public void testTearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			System.out.println("Test Case name : "+result.getName());
			Utilities.captureScreenShot(driver, result.getName());
		}
		
	}
	
	public void clickonLogout() {
		
		
		System.out.println("going to click username");
		logObj.clickonUserID();
		System.out.println("Going to click logout");
		logObj.clickLogoutButton();
		
	}
	
	
	@AfterSuite
	public void suiteTearDown() {
		driver.quit();
		//Reporter.log("Driver connection closed", true);
	}

}
