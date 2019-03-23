package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/cucumber_Feature/Create_Lead.feature/",glue="testCase_Implements",monochrome=true)
public class Start_Runner extends AbstractTestNGCucumberTests
{
	
	
}
