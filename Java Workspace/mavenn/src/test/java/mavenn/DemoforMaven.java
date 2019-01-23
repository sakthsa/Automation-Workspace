package mavenn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoforMaven {
	
	@Test
	public void test1() {
		System.out.println("Hello baby");
}
	@Test
	public void chromeTest() {
		
			System.setProperty("webdriver.chrome.driver", "D:\\JAR\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			driver.quit();
	}
	
}