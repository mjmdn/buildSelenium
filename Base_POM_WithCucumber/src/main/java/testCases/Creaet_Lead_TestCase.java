package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_confiq.Base_Config;
import pages.LoginPage;

public class Creaet_Lead_TestCase extends Base_Config {
	
	@BeforeTest
	public void setData() {
		excelfileName="createLead";
	}

	@Test(dataProvider="inputdata")
	public void CreateLeads(String uName, String pswd, String cName,String fName,String lName)
	{
		System.out.println("Begin");
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pswd)
		.clickLoginButton()
		.clickCrmfaLink()
		.CickLeadLink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickcreateLeadButton();
		
		
	
		
		
	}
}
