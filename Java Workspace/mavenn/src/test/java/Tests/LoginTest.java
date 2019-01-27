package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ss.selinium.library.Utilities;

import PageFactory.Login;


//@Listeners(com.ss.testNG.listener.Listener.class)
public class LoginTest extends BaseTest {
	
	
	
	
	
	
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
	
	
	
	
}
