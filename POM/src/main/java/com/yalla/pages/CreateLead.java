package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class CreateLead extends Annotations{ 

	public CreateLead() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.ID, using="createLeadForm_companyName") WebElement ele_CompnayName;
	public CreateLead enterCompnayName(String data) {
		//WebElement eleLogout = locateElement("ID", "ele_CompnayName");
		clearAndType(ele_CompnayName, data);
		return this;

	}
	@FindBy(how=How.ID, using="createLeadForm_firstName") WebElement ele_FirstName;
	public CreateLead enterFirstName(String data) {
		//WebElement ele_FirstName = locateElement("ID", "createLeadForm_firstName");
		clearAndType(ele_FirstName, data);  
		return this;

	}
	@FindBy(how=How.ID, using="createLeadForm_lastName") WebElement ele_LastName;
	public CreateLead enterLastName(String data) {
		//WebElement ele_LastName = locateElement("ID", "createLeadForm_lastName");
		clearAndType(ele_LastName, data);
		return this;

	}
	
	@FindBy(how=How.NAME, using="submitButton") WebElement ele_SubmitButton;
	public ViewLeads click_Submit_button() {
		//WebElement ele_SubmitButton = locateElement("NAME", "submitButton");
		click(ele_SubmitButton); 
		takeSnap();
		return new ViewLeads();

	}
	

}







