package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		// load url
		driver.get("http://testleaf.herokuapp.com/");

		// implicitwait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//click Checkbox link
		driver.findElementByLinkText("Checkbox").click();

		// Identify the element and store in boolean variable
		boolean x = driver.findElementByXPath("//label[text() = 'Confirm Selenium is checked']/following::input[1]").isSelected();
		
		//Uncheck the checkbox
		if(x == true)
			driver.findElementByXPath("//label[text() = 'Confirm Selenium is checked']/following::input[1]").click();
		System.out.println("Unchecked the checkbox successfully");
		
		//close browser
		driver.close();
	}
}
