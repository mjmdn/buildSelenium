package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ViewLeads extends Annotations{ 

	public ViewLeads() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.ID, using="viewLead_companyName_sp") WebElement ele_CreatedCompanyName;
	public ViewLeads verify_Company_Name(String data) {
		//WebElement eleLogout = locateElement("LINK_TEXT", "Create Lead");
		
		
		verifyPartialText(ele_CreatedCompanyName, data);
			
		return this;

	}
}







