package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class MyHome extends Annotations{ 

	public MyHome() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.LINK_TEXT, using="Leads") WebElement ele_ClicklLead_Link;
	public MyLead clickLeadLink() {
		//WebElement eleLogout = locateElement("LINK_TEXT", "Leads");
		click(ele_ClicklLead_Link);  
		return new MyLead();

	}

}







