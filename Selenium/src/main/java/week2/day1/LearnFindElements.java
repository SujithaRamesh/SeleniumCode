package week2.day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
	
	//open the browser
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
	//Load the URL
	driver.get("https://www.google.co.in/");
	driver.findElementByXPath("//input[@id = 'lst-ib']").sendKeys("Sujitha",Keys.ENTER);
	List<WebElement> parLinkTest = driver.findElementsByPartialLinkText("Sujitha");
	System.out.println(parLinkTest.size());
	int size = parLinkTest.size();
	parLinkTest.get(size-1).click();
	//parLinkTest.get(0).click();
	driver.close();
	}

}
