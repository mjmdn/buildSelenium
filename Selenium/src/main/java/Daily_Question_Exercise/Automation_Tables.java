package Daily_Question_Exercise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		    //Url
			driver.get("http://www.leafground.com/pages/table.html");

			//Q1 - Print Headers in the Table
		
			List<WebElement> getAllHeadersText= driver.findElementsByXPath(".//tr/th");
			System.out.println(getAllHeadersText.size());
			for (WebElement allHeaders : getAllHeadersText) {
			System.out.println(allHeaders.getText());

			}
			//Q2 - Print All the data in the table

			List<WebElement> getAllDataValues= driver.findElementsByXPath(".//td");
			System.out.println(getAllDataValues.size());
			for (WebElement allData : getAllDataValues) {
				System.out.println(allData.getText());
				

			}


		}

	}


