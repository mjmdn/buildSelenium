package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class MyLead extends Annotations{ 

	public MyLead() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.LINK_TEXT, using="Create Lead") WebElement ele_createlead_Link;
	public CreateLead clickCreateLeadLink() {
		//WebElement eleLogout = locateElement("LINK_TEXT", "Create Lead");
		click(ele_createlead_Link);  
		return new CreateLead();

	}

}







