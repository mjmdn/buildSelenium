package pages;

import base_confiq.Base_Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CreateLeads extends Base_Config{
	
	public CreateLeads() {
		
	}
	
	
	public CreateLeads enterCompanyName(String cname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		return this;
	}
	
	public CreateLeads enterFirstName(String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	
	public CreateLeads enterLastName(String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	
	public ViewLeads clickcreateLeadButton()
	{
		driver.findElementByName("submitButton").click();
		return new ViewLeads();
	}


	
	
	

}
