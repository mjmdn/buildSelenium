package runner;

import org.testng.annotations.BeforeTest;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/test/java/cucumber_Feature/login.feature/",glue="com.yalla",monochrome=true)
public class Runner extends Annotations
{
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_LoginAndLogout";
		testcaseDec = "Login into leaftaps";
		author = "MD";
		category = "smoke";
	
	} 
}