package week4.day1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearAlert_Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Madhavan");
		alert.accept();
		String changeText = driver.findElementById("demo").getText();
		
		if(changeText.contains("madhavan")||changeText.contains("Madhavan"))
				{
			System.out.println("Name has been changed ");
				}
		else
		{
			System.out.println("Name not changed");
		}
		
		driver.switchTo().defaultContent();
		
		driver.findElementById("tryhome").click();

	}

}
