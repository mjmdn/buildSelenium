package week5.day1.Learningtestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Delete_Lead extends Base_Configuaration {
@Test
public void delete_Lead() throws InterruptedException
{
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByXPath("//a[text()='Find Leads']").click();	
	driver.findElementByXPath("//span[text()='Email']").click();
	driver.findElementByName("emailAddress").sendKeys("madhavanramlingam@gmail.com");
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(5000);
	String getFirstLeadid = driver.findElementByXPath("//td[@tabindex=0]//div[1]/a").getText();
	System.out.println(getFirstLeadid);
	driver.findElementByXPath("//td[@tabindex=0]//div[1]/a").click();
	Thread.sleep(2000);
	driver.findElementByLinkText("Delete").click();
	
	driver.findElementByXPath("//a[text()='Find Leads']").click();
		
	Thread.sleep(3000);
	driver.findElementByXPath("//input[@name='id']").sendKeys(getFirstLeadid);
	
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	Thread.sleep(2000);
	String Expectedtext = driver.findElementByXPath("//div[text()='No records to display']").getText();
	
	if (Expectedtext.equalsIgnoreCase("No records to display"))
	{
		System.out.println("No record Messge Appearing");
	}
	else
	{
		System.out.println("No records message Not Appearing");
	}
	driver.close();
}
}
