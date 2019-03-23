package classRoompractise;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOne {
	
	
//
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

		/*		//T1
		List<WebElement> noOfcolumn = driver.findElementsByXPath("//table[@cellspacing=0]//th");
		System.out.println(noOfcolumn.size());

		//T2
		List<WebElement> noOfRow = driver.findElementsByXPath("//table[@cellspacing=0]//tr[2]/td");
		System.out.println(noOfRow.size());
	    //WebElement value1 = driver.findElementByXPath("//font[contains(text(),'Learn to interact' )]");

		//T3
		WebElement value1 = driver.findElementByXPath("//font[contains(text(),'Learn to interact' )]/following::font");
		String Value2= value1.getText();
		String replacedval=Value2.replace("%", "");
		System.out.println(replacedval);
		Integer updatedVal=Integer.parseInt(replacedval);
		System.out.println(updatedVal);*/



		//T4

		//Find the Xpath to  get the result of contains % values and get the elements to get the Size
		
		List<WebElement> getAllStringValue= driver.findElementsByXPath("//font[contains(text(),'%')]");
		String saveReplacedvalue="";
		int[] covertedArravalue=new int [3];
		
		//For Loop to get the text,replace the %,parsing the value and stored it in the array list
		for(int i=0;i<=getAllStringValue.size()-1;i++)
		{

			String getTheStringValue= getAllStringValue.get(i).getText(); 
			saveReplacedvalue=getTheStringValue.replace("%", "");
			int parsedvalue = Integer.parseInt(saveReplacedvalue);
			covertedArravalue[i]=parsedvalue;	 

		}

		//sorting Array to find lowest value
		Arrays.sort(covertedArravalue);
		System.out.println(covertedArravalue[0]);

		//dynamically passed the lowest value to the Xpath
		WebElement findElementOftext = driver.findElementByXPath("(//font[contains(text(),'"+covertedArravalue[0]+"')]/preceding::font)[8]");
		System.out.println(findElementOftext.getText());


	}




}





