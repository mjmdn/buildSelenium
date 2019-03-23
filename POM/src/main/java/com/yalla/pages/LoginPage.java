package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.bytebuddy.asm.Advice.Enter;

public class LoginPage extends Annotations{ 
	
	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.ID, using="username")  WebElement eleUserName;
	@FindBy(how=How.ID, using="password")  WebElement elePassWord;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit") WebElement eleLogin;
	
	@Given("Enter the username as (.*)")
	public LoginPage enterUserName(String data) {
		//WebElement eleUserName = locateElement("id", "username");
		clearAndType(eleUserName, data);  
		return this; 
	}
	@And("Enter the password as (.*)")
	public LoginPage enterPassWord(String data) {
		//WebElement elePassWord = locateElement("id", "password");
		clearAndType(elePassWord, data); 
		return this; 
	}
	@When("clicking Login")
	public HomePage clickLogin() {
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
          click(eleLogin);  
          takeSnap();
          return new HomePage();
	}
	
}







