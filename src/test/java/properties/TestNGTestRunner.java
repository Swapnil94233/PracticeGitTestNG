package properties;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(features = "src/test/java/features" , glue = "stepDefination" , monochrome = true, plugin = {
"html:target/cucumber.html" } )
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
 
	
}
