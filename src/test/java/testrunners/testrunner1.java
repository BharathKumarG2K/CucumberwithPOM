package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue = {"steps"},
		plugin = {"pretty","html:target/Report.html"},
		monochrome = true,
		tags = "@SC1 or @SC2"
		)

public class testrunner1 {
		

}
