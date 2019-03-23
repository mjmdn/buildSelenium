package week5.day1.Learningtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit_Lead extends Base_Configuaration{
	@Test(dependsOnMethods="week5.day1.Learningtestng.Create_Lead.create_lead")
	public void edit_Lead() throws InterruptedException
	{
	
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByXPath("(//div[@class='frameSectionBody']//a)[3]").click();
	driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[3]").click();
	driver.findElementByName("emailAddress").sendKeys("madhavanram1@gmail.com");
	//driver.findElementByName("emailAddress").clear();
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(5000);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	System.out.println("The Page title is- "+ driver.getTitle());
	driver.findElementByLinkText("Edit").click();
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.findElementById("updateLeadForm_companyName").sendKeys("TestLeaf");
	driver.findElementByXPath("//input[@value='Update']").click();
	String attribute = driver.findElementById("viewLead_companyName_sp").getText();
	System.out.println("Comapny Name "+attribute);
	if(attribute.contains("TestLeaf"))
		System.out.println("Company name Updated");
	else
		System.out.println("Company name not updated");
	
}
}

