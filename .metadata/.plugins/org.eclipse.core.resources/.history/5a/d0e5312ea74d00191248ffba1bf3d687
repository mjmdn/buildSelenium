package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLeadt";
		testcaseDec = "Login into leaftaps";
		author = "MD";
		category = "";
		excelFileName = "createLead";
	} 

	@Test(dataProvider="fetchData") 
	public void loginAndLogout(String uName, String pwd,String cname,String Fname,String Lname) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd)
		.clickLogin()
		.click_Link()
		.clickLeadLink()
		.clickCreateLeadLink()
		.enterCompnayName(cname)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.click_Submit_button()
		.verify_Company_Name(cname);
		System.out.println("Create Lead Successfully Created");
		
		
		
		
		/*LoginPage lp = new  LoginPage();
		lp.enterUserName();
		lp.enterPassWord();*/
		
	}
	
}






