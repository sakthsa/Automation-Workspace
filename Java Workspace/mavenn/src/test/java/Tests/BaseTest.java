package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.ss.selinium.library.ConfigReader;
import com.ss.selinium.library.Utilities;

public class BaseTest {
	
	WebDriver driver;
	ConfigReader con = new ConfigReader();
	
	
	@BeforeTest
	public void setUp() {
		driver = Utilities.setChromeDriver();
		driver.get(con.getURL());
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void testTearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			Utilities.captureScreenShot(driver, result.getTestName());
		}
		driver.quit();
		Reporter.log("Driver connection closed", true);
	}

}
