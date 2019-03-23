package projectDay1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testcase_Two {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("skywalkmj@gmail.com");
		driver.findElementById("pass").sendKeys("abcdefmj");
		driver.findElementByXPath("//input[@value='Log In']").click();
		driver.findElementByName("q").sendKeys("testleaf");
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(1500);
		driver.findElementByXPath("//div[text()='Places']").click();
		System.out.println("after");
		String getPageName = driver.findElementByLinkText("TestLeaf").getText();
		if(getPageName.equalsIgnoreCase("testleaf"))
		{
			System.out.println("PageName Matched");
		}
		
		else {
			System.out.println("PageName Not Matched");
		}
		String getLikeText = driver.findElementByXPath("//button[contains(text(),'Like')]").getText();
		
		if(getLikeText.equalsIgnoreCase("like"))
		{
			driver.findElementByXPath("//button[contains(text(),'Like')]").click();
		}
		else
		{
			System.out.println("Already Liked");
		}
		
		String getCurrentUrl = driver.getCurrentUrl();
		
		if(getCurrentUrl.equalsIgnoreCase("testleaf"))
		{
			System.out.println("Title contains the text testleaf");
		}
		else
		{
			System.out.println("Title Not contains the text testleaf");
		}
		String getLikes = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();
		System.out.println("Likes Count: "+getLikes);
		driver.close();
	}

}
