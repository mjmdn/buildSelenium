package homeWorks;


import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Homework_Testcases {
	//Find Leads | opentaps CRM
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
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
		
	}

	
		
		/*//Testcase 1
		driver.findElementByXPath("//td[@tabindex=0]//div[1]/a").click();
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="View Lead | opentaps CRM";
		Assert.assertEquals(expectedTitle,actualTitle);
		WebElement beforUpdateValue= driver.findElementById("viewLead_companyName_sp");
		Thread.sleep(2000);
		System.out.println("Value is"+ beforUpdateValue.getText());
		driver.findElementByLinkText("Edit").click();

		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Kaaylabs");
		driver.findElementByName("submitButton").click();
		WebElement afterUpdateValue = driver.findElementById("viewLead_companyName_sp");
		if(afterUpdateValue !=beforUpdateValue)
		{
			System.out.println("Company Name changed");
		}
		else
		{
			System.out.println("Company Name is not changed");

		}

*/


	}







