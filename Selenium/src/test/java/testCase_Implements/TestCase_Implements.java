package testCase_Implements;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase_Implements{
	public ChromeDriver driver;
	
	@Given("launch Browser")
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 
	}
	
	@And("Max Browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}

	@And("Set Timeout")
	public void setTimeOut()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@And("URL passing")
	public void passingUrl()
	{
		driver.get("http://www.leaftaps.com/opentaps/control/main");
	}
	
	
	@And("Enter username as (.*)")
	public void passinguserName(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}
	
	@And("Enter password as (.*)")
	public void passingpassword(String pswd)
	{
		driver.findElementById("password").sendKeys(pswd);
	}
	
	@And("Click Login button")
	public void clickbutton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click Link CRMFA")
	public void clickLink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click Create Lead")
	public void click_Create_lead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter CompanyName as(.*)")
	public void passcompanyName(String cmpny)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cmpny);
	}
	@And("Enter FirstName as(.*)")
	public void passnameName(String fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}
	
	@And("Enter LastName as(.*)")
	public void passlnameName(String lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}
	@When("click Create Lead button")
	public void click_createLead_Button()
	{
		driver.findElementByName("submitButton").click();
	}
	
	@Then("Verfy Create Lead Succesfully")
	public void checkingSuccess()
	{
		System.out.println("Lead Created Successfully");
	}
}
