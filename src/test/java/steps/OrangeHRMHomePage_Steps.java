package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;

import actions.Common_actions;
import elements.OrangeHRMLoginPage_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMHomePage_Steps {
	
	WebDriver driver;
	OrangeHRMLoginPage_Elements loginpage;
	Common_actions Commonaction;
	
	public OrangeHRMHomePage_Steps(CommonSteps init) {
		this.driver = init.driver;
		this.loginpage = new OrangeHRMLoginPage_Elements(driver);
		Commonaction = new Common_actions(driver);
	}
	
	@Given("when the user launches the App")
	public void launchAPP() {
		Commonaction.NavigatetoURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("user lands in the Login page")
	public void HomePageURL() {
		String ActualTitle = Commonaction.GetCurrentTitle();
		if(!ActualTitle.equals("OrangeHRM")) {
			fail("The title of application is not matching");
		}
	}
	
	@Then("user could see and verify the Username and Password text boxes")
	public void VerifyUserNameandPassTextBox() throws InterruptedException {
		if(!loginpage.username.isDisplayed()) {
			fail("The username text box is not displayed");
		}
		if(!loginpage.password.isDisplayed()) {
			fail("The password text box is not displayed");
		}
		Thread.sleep(5000);
	}

}
