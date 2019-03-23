package week5.day1.Learningtestng;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
@Listeners(ExtentITestListenerClassAdapter.class)
public class Base_Configuaration {
  public ChromeDriver driver;
  ExtentReports extent;
  public String fileName;
    @BeforeMethod @Parameters({"url","uname","pswd"})
	public void login_Confiquaration(String url,String uname,String pswd)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(url);
		WebElement userName=driver.findElementById("username");
	    userName.sendKeys(uname);
		driver.findElementById("password").sendKeys(pswd);
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
	@DataProvider(name="inputdata")
	public String[][] getdata() throws IOException
	
	
	{
		return Read_Excel.get_Read_ExcelData(fileName);
		
		/*String[][] create_Lead_Data=new String [2][3];
		create_Lead_Data[0][0]="Hexacorp";
		create_Lead_Data[0][1]="Sai";
		create_Lead_Data[0][2]="krishan";
		create_Lead_Data[1][0]="Hexacorp";
		create_Lead_Data[1][1]="Vikrem";
		create_Lead_Data[1][2]="vehda";
		return create_Lead_Data;*/
		
	}
	
	    
	    
}

