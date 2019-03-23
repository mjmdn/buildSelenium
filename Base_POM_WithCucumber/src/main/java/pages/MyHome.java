package pages;

import base_confiq.Base_Config;

public class MyHome extends Base_Config{
	
	public MyHome() {
		
	}
	
	
	public MyLeads CickLeadLink()
	{
		driver.findElementByLinkText("Leads").click();
		return new MyLeads();
	}

}
