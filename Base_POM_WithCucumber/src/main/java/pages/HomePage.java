package pages;

import base_confiq.Base_Config;

public class HomePage extends Base_Config{
	
	public HomePage() {
		
	}
	
	
	public MyHome clickCrmfaLink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHome();
	}

}
