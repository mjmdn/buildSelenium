package week5.day1.Learningtestng;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Create_Lead extends Base_Configuaration {
	
	@BeforeTest
	public void setFileName()
	{
		fileName="createLead";
	}
	@Test(dataProvider="inputdata")
	public void create_lead(String cmpny,String fname,String laname) throws InterruptedException
	{
	  	
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cmpny);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(laname);
		driver.findElementByName("submitButton").click();
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		driver.findElementByLinkText("Edit").click();
		//Drop Down
		WebElement industry = driver.findElementById("updateLeadForm_industryEnumId");
		Select dd1=new Select(industry);
		dd1.selectByVisibleText("Computer Software");//Select by visible text
		WebElement ownership = driver.findElementById("updateLeadForm_ownershipEnumId");
		Select dd2=new Select(ownership);
		List<WebElement> dropDown = dd2.getOptions();
		dd2.selectByIndex(dropDown.size()-1);//Select by index
		WebElement submitButton = driver.findElementByClassName("smallSubmit");
		WebElement currency = driver.findElementById("updateLeadForm_currencyUomId");
		Select dd3=new Select(currency);
		dd3.selectByValue("INR");//select by value
		submitButton.click();
		
}
}

