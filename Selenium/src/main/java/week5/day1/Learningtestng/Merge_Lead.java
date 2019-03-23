package week5.day1.Learningtestng;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Merge_Lead extends Base_Configuaration{
	static String fromLead="10386";
	static String toLead="10384";
	@Test(enabled=false)
 public void merge_Lead() throws InterruptedException
 
 {
 
	


		driver.findElementByLinkText("Leads").click();
		
		//Getting the from lead values from the another window 
		String ParentWindow = driver.getWindowHandle();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif']").click();
		Set<String> getallwindows = driver.getWindowHandles();
		List<String> allListwindows= new ArrayList<String>();
		allListwindows.addAll(getallwindows);

		driver.switchTo().window(allListwindows.get(1));

		driver.findElementByName("id").sendKeys(fromLead);

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(1000);
		driver.findElementByXPath("//td[@tabindex=0]//div[1]/a").click();
		
		//Came to primary window
		driver.switchTo().window(allListwindows.get(0));
		
		//Getting the To lead values from the another window 
		
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> getallwindowsNew = driver.getWindowHandles();
		List<String> allListwindowsNew= new ArrayList<String>();
		allListwindowsNew.addAll(getallwindowsNew);
		driver.switchTo().window(allListwindowsNew.get(1));
		driver.findElementByName("id").sendKeys(toLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//td[@tabindex=0]//div[1]/a").click();
		//Moving Primary window
		driver.switchTo().window(allListwindowsNew.get(0));
		
		//Merge two Account
		driver.findElementByLinkText("Merge").click();
		
		//Handle the Alert
		Alert focus=driver.switchTo().alert();
		focus.accept();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(fromLead);
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(2000);
		//Verify the error Message
		String Expectedtext = driver.findElementByXPath("//div[text()='No records to display']").getText();

		if (Expectedtext.equalsIgnoreCase("No records to display"))
		{
			System.out.println("No record Messge Appearing");
		}
		else
		{
			System.out.println("No records message Not Appearing");
		}


		System.out.println("Merge completed Sucessfully ");
	}

 }

