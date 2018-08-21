package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropdownIrctc
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement countries = driver.findElementById("userRegistrationForm:countries");
		Select drop = new Select(countries);
		List<WebElement> options = drop.getOptions();
		int size = options.size()-1;
		System.out.println("Total values in the country dropdown: "+size);
		for(WebElement eachoption : options)
		{
			System.out.println(eachoption.getText());
		}
		driver.close();
	}
}
