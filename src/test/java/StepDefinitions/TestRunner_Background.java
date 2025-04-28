package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features//Background_demo.feature", glue = "background", 
monochrome = true,
plugin = {"html:target/HtmlReports"}	
		)



public class TestRunner_Background {

}
