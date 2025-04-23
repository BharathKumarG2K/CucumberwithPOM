package actions;

import org.openqa.selenium.WebDriver;


public class Common_actions {
	
	WebDriver driver;
	
	public Common_actions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void NavigatetoURL(String URL) {
		driver.get(URL);
	}
	
	public void NavigateBack() {
		driver.navigate().back();
	}
	
	public String GetCurrentURL() {
		String URL = driver.getCurrentUrl();
		return URL;
	}
	
	public String GetCurrentTitle() {
		String Title = driver.getTitle();
		return Title;
	}

}
