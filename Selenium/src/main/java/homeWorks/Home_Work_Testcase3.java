package homeWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Work_Testcase3 {

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
		driver.findElementByName("emailAddress").sendKeys("madhavanram1@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(5000);
		String firstCapturedName = driver.findElementByLinkText("Madhavan").getText();
		System.out.println(firstCapturedName);
		driver.findElementByXPath("//td[@tabindex=0]//div[1]/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		if(driver.getTitle().equalsIgnoreCase("Duplicate Lead | opentaps CRM"))
		{
			System.out.println("Iam Living Duplicate lead Page ");
		}
		
		else
		{
			System.out.println("Iam Not living Duplicate lead Page");
		}
		
		driver.findElementByName("submitButton").click();
		
		if(firstCapturedName.equalsIgnoreCase(driver.findElementById("viewLead_firstName_sp").getText()))
		{
			System.out.println("Both Names are Same");
		}
		
		else {
			System.out.println("both Names are Not Same");
		}
		
		
	}

}
