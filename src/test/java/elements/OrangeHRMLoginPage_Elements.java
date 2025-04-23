package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrangeHRMLoginPage_Elements {
	
	WebDriver driver;
	
	@FindBy(name = "username") public WebElement username; 
	@FindBy(name = "password") public WebElement password;
	@FindBy(xpath = "//button[text()=' Login ']") public WebElement btnLogin;
	
	public OrangeHRMLoginPage_Elements (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
