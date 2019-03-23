package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginAndFindelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Create Lead").click();
		

		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Madhavan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramalingam");
		driver.findElementByName("submitButton").click();
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElementByLinkText("Edit").click();
		
		// Select Dropdown value Using visible text
		WebElement dropdownElement1 = driver.findElementById("updateLeadForm_industryEnumId");
		Select dd1= new Select(dropdownElement1);
		dd1.selectByVisibleText("Computer Software");
		
		//Select Dropdown value Using index
		
		WebElement dropdownElement2 = driver.findElementById("updateLeadForm_ownershipEnumId");
		
		Select dd2= new Select(dropdownElement2);
		List<WebElement> Listofvalue = dd2.getOptions();
		System.out.println(Listofvalue.size());
		dd2.selectByIndex(Listofvalue.size()-1);
		














	}

}
