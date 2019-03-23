package homeWorks;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork_One_Week2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("jishnudevmdn");
		driver.findElementById("userRegistrationForm:password").sendKeys("Abcdefmj1@");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Abcdefmj1@");
		WebElement SecurityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select questiondd= new Select(SecurityQ);
		questiondd.selectByVisibleText("Who was your Childhood hero?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Sakthiman");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("JishnuDev");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement Date = driver.findElementById("userRegistrationForm:dobDay");
		Select date=new Select(Date);
		date.selectByValue("30");

		WebElement Month = driver.findElementById("userRegistrationForm:dobMonth");
		Select selectMonth=new Select(Month);
		selectMonth.selectByValue("12");
		WebElement Year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select selectYear=new Select(Year);
		selectYear.selectByValue("1991");
		
		WebElement ocupation = driver.findElementById("userRegistrationForm:occupation");
		Select selectocupation=new Select(ocupation);
		selectocupation.selectByVisibleText("Private");
		
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select selectCountry=new Select(country);
		selectCountry.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("jishunmdn@gmail.com");
		
		
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select selectnationality=new Select(nationality);
		selectnationality.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9843883868");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("16/9");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("610206",Keys.TAB);
		Thread.sleep(3000);
		
		WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
		Select selectCityName=new Select(cityName);
		selectCityName.selectByVisibleText("Tiruvarur");
		Thread.sleep(3000);
	
		WebElement postofficeName = driver.findElementById("userRegistrationForm:postofficeName");
		Select selectpostofficeName=new Select(postofficeName);
		
		selectpostofficeName.selectByVisibleText("Sendangudi B.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("9843276781");
		
		if(!driver.findElementById("userRegistrationForm:resAndOff:0").isSelected())
		
		{
		System.out.println("select");	
		}
		
	System.out.println("Until Captcha Automation Done");
	
		
		
		
		
		
		
		
        

	}

}
