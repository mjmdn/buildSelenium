package Daily_Question_Exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_one {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mpexsolutions.net/Mpex.web/Default.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("txtUserName_I").sendKeys("mpexadmin");
		driver.findElementById("txtPassword_I").sendKeys("Hexcorp1234!");
		driver.findElementById("btnLogin").click();
		
		/*//Finding Elements 
		List<WebElement>countOfCheckbox = driver.findElementsByXPath("//input[@type='checkbox']");
		 System.out.println(countOfCheckbox.size());
		 
		 //Looping checkbox elements,finding whether its is already selected or Not,uncheck it if its already selected
		for(WebElement checkebox:countOfCheckbox) {
				if(checkebox.isSelected()) {
					checkebox.click();
				}	
			}*/

		System.out.println("Succesfully Uncheked");
	}
}


