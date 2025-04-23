package actions;

import org.openqa.selenium.WebDriver;

import elements.OrangeHRMLoginPage_Elements;

public class OrangeHRMLogin_actions {
	
	WebDriver driver;
	OrangeHRMLoginPage_Elements loginelements;
	
	public OrangeHRMLogin_actions(WebDriver driver) {
		this.driver = driver;
		this.loginelements = new OrangeHRMLoginPage_Elements(driver);
	}
	
	public void OrangeHRMLogin (String UsrName , String Pass) {	
		try {
		loginelements.username.sendKeys(UsrName);
		loginelements.password.sendKeys(Pass);
		loginelements.btnLogin.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
