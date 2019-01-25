package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ss.selinium.library.Utilities;

import PageFactory.Login;


//@Listeners(com.ss.testNG.listener.Listener.class)
public class LoginTest {
	
	
	WebDriver driver;
	
	@BeforeSuite
	public void suiteSetup() {
		driver = Utilities.setChromeDriver();
	}
	
	@Test
	public void test1() {
		Login logObj = new Login(driver);
		logObj.setUserName("Admin");
		logObj.setPassword("admin123");
		logObj.clickLogin();
	}
	
	//@Test
	public void test2() {
		Login logObj = new Login(driver);
		logObj.setUserName("Admin");
		logObj.setPassword("admin123 ");
		logObj.clickLogin();
	}
	
	@AfterTest
	public void testTearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			Utilities.captureScreenShot(driver, result.getTestName());
		}
		driver.quit();
	}
	
	
}