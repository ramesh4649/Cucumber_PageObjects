package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;





@CucumberOptions(features="FeatureFiles",
					glue ="stepDefinitions", 
					dryRun = false,
					monochrome = true,
					plugin = {"pretty", "html:target/cucmberreports"})


public class new_Account_Registration  extends AbstractTestNGCucumberTests{

}
