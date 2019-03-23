package pages;

import base_confiq.Base_Config;

public class MyLeads extends Base_Config{
	
	public MyLeads() {
		
	}
	
	
	public CreateLeads clickCreateLeadLink()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeads();
	}

	
	public Find_Leads clickFindLead() {
		driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
		return new Find_Leads();
	}
}
