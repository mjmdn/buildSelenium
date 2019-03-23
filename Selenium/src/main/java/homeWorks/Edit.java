package homeWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		

	}

}
