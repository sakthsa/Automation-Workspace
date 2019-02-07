package PageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ss.selinium.library.Utilities;

public class Login {
	

	Login log;
	
	WebDriver driver;
	
	@FindBy(name="txtUsername")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement logIn;
	
	@FindBy(xpath="//a[contains(text(),'Welcome')]")
	WebElement userNameTitle;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logOut;
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void setUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}
	
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		logIn.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickonUserID() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userNameTitle.click();
	}
	
	public void clickLogoutButton() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logOut.click();
	}


	

}
