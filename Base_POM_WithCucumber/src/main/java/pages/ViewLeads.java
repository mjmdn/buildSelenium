package pages;


import base_confiq.Base_Config;

public class ViewLeads extends Base_Config{
	
	public ViewLeads() {
		
	}
	
	

public ViewLeads  verifyName()
{
	String Cname= driver.findElementById("viewLead_companyName_sp").getText();
	if(Cname.contains(companyName))
	{
		System.out.println("Profile Created or Update");
	}
	else
	{
		System.out.println("Not Created Or Not Updated");
	}
	
	return new ViewLeads();
}




public Update_Lead click_Edit_Button()
{
	
	System.out.println("The Page title is- "+ driver.getTitle());
	driver.findElementByLinkText("Edit").click();
	return new Update_Lead();
	
}

public MyLeads click_Delete_Button()
{
	driver.findElementByLinkText("Delete").click();
	return new MyLeads();
}
}


