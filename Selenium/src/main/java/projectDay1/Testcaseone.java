package projectDay1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testcaseone {
	
	private int getTmrwDate() {
		// Get the current date
		
		Date date = new Date();

		// Get only the date (and not month, year, time etc)
				
		DateFormat sdf = new SimpleDateFormat("dd");
		 
		// Get today's date
				
		String today = sdf.format(date);

		// Convert to integer and add 1 to it
		 
		int tomorrow = Integer.parseInt(today)+1;

		// Print tomorrow's date
				
		
		return tomorrow;
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai/");
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[@class='searchHelper']//div[3]").click();
		driver.findElementByXPath("//button").click();
		Testcaseone getTmrwDate= new Testcaseone();
		
		String Startdate=String.valueOf(getTmrwDate);
		
		int tmrwDate = getTmrwDate.getTmrwDate();
		//System.out.println(tmrwDate);
		driver.findElementByXPath("//div[contains(text(),'"+tmrwDate+"' )]").click();
		driver.findElementByXPath("//button").click();
		String text = driver.findElementByXPath("//div[@class='days']/div[1]").getText();
		System.out.println(text);
		
		
		
		if(text.contains(Startdate))
		{
			System.out.println("Startdate Confirmed");
		}
		
		driver.findElementByXPath("//button").click();
		Thread.sleep(2000);
		//div[@class='car-item']
		List<WebElement> getAllCars = driver.findElementsByXPath("//div[@class='car-item']");
		System.out.println("Number of result "+getAllCars.size());
		List<WebElement> getALLCardPrice = driver.findElementsByXPath("//div[@class='price']");
		
		 List<Integer> getIntegerprice=new ArrayList<Integer>();
		// List<String> getStringPrice = new ArrayList<String>();
		  for (WebElement getprice : getALLCardPrice) {
			  
			  String getStringPriceValue= getprice.getText();
			  String saveReplacedvalue="";
			  getIntegerprice.add(Integer.parseInt(getStringPriceValue.replaceAll("\\D", "")));
			 // getIntegerprice.add(Integer.parseInt(getStringPriceValue.replace("₹", "")));
			 
			//  getStringPrice.add(saveReplacedvalue);
				
			
			}
			
		  Integer max = Collections.max(getIntegerprice);
		  System.out.println("car Highest values "+max);
		  
		  String highestPriceCarName = driver.findElementByXPath("//div[contains(text(),'"+max+"')]/preceding::h3[1]").getText();
		
		
	  	    System.out.println(highestPriceCarName);
	  	    
	  	    driver.findElementByXPath("//div[contains(text(),'"+max+"')]/following::button").click();
	  	    driver.close();
		
		
		
		

	}

	

}
