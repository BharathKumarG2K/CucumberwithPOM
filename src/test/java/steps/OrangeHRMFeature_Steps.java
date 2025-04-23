package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.Common_actions;
import actions.OrangeHRMLogin_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMFeature_Steps {
	
	WebDriver driver;
	Common_actions action;
	OrangeHRMLogin_actions loginaction;
	
	
	public OrangeHRMFeature_Steps(CommonSteps init) {
		this.driver = init.driver;
		this.action = new Common_actions(driver);
		this.loginaction = new OrangeHRMLogin_actions(driver);
	}
	
	@Given("The user logs in to the OrangeHRM using below TestCredential")
	public void OrangeHRM_LoginSteps(DataTable table) {
		action.NavigatetoURL("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		loginaction.OrangeHRMLogin(table.cell(1, 0),table.cell(1,1));
	}
	
    @When("user could see the Homepage")
    public void LandingatHomepage() {
    	if(!action.GetCurrentTitle().equals("OrangeHRM")) {
    		fail("The Title Exepected to have 'OrangeHRM' but has :" + action.GetCurrentTitle());
    	}
    }
    
    @Then("user could see the {string} in the left pallete")
    public void VerifyLeftNavigationOption(String opt) {
    	String Xpath = "//span[text()='"+ opt+ "']";
    	if(!driver.findElement(By.xpath(Xpath)).isDisplayed()) {
    		fail("The Expected Option is not found in the Left Palete");
    	}
    	
    	
    	
    }
    

}
