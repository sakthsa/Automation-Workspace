package PageFactory;

<<<<<<< HEAD
=======
import org.openqa.selenium.WebDriver;
>>>>>>> 12ae0808844c1ec79e309dfe9cb339800d60c7e4
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
<<<<<<< HEAD
	@FindBy(xpath="//input[@id ='txtUsername']")
	
	
	String sass;
	
	
	WebElement LoginUsername;
=======
	Login log;
	
	WebDriver driver;
	
	@FindBy(name="txtUsername")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement logIn;
	
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
	
	

	
>>>>>>> 12ae0808844c1ec79e309dfe9cb339800d60c7e4
	
	

}
