package pages;

import base_confiq.Base_Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class Update_Lead extends Base_Config{
	
	public Update_Lead() {
		
	}
	
	
	public Update_Lead updateCompanyName(String cname)
	{
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cname);
		return this;
	}
	
	public Update_Lead updateFirstName(String fName)
	{
		driver.findElementById("updateLeadForm_firstName").clear();
		driver.findElementById("updateLeadForm_firstName").sendKeys(fName);
		return this;
	}
	
	
	public Update_Lead updateLastName(String lName)
	{   driver.findElementById("updateLeadForm_lastName").clear();
		driver.findElementById("updateLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	
	public ViewLeads clickUpdateLeadButton()
	{
		driver.findElementByXPath("//input[@value='Update']").click();
		return new ViewLeads();
	}


	
	
	

}
