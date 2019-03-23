package pages;

import base_confiq.Base_Config;

public class LoginPage extends Base_Config {
	
	public LoginPage(){
		
	}
	
	
	public LoginPage enterUserName(String uName)
	{
		System.out.println("userName"+uName);
		driver.findElementById("username").sendKeys(uName);
		return this;
	}

	
	public LoginPage enterPassword(String pswd)
	{
		
		driver.findElementById("password").sendKeys(pswd);
		return this;
		
	}
	
	public HomePage clickLoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		
		return new HomePage();
		
	}
	
}
