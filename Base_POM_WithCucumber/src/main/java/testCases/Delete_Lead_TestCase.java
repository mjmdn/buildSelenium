package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_confiq.Base_Config;
import pages.LoginPage;

public class Delete_Lead_TestCase extends Base_Config {
	
	@BeforeTest
	public void setData() {
		excelfileName="deleteLead";
	}
	
	@Test(dataProvider="inputdata")
	public void delet_Lead(String uName, String pswd,String email) throws InterruptedException
	{

	new LoginPage()
	.enterUserName(uName)
	.enterPassword(pswd)
	.clickLoginButton()
	.clickCrmfaLink()
	.CickLeadLink()
	.clickFindLead()
	.clickEmailTab()
	.enterEmail_Address(email)
	.click_FindLead_Button()
	.click_FirstValue()
	.click_Delete_Button()
	.clickFindLead()
	.enter_LeadId()
	.click_FindLead_Button()
	.verify_DeletLeadID();
	
	System.out.println("deleted sucessfully");
	}
	
	
}
