package classRoompractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PractiseTwo {
	
	                 //Mouse Activities

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/draggable/");

		driver.switchTo().frame(0);
		WebElement drag = driver.findElementById("draggable");
		int x = drag.getLocation().getX();
		int y =drag.getLocation().getY();
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).perform();



	}

}
