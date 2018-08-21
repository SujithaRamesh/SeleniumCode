package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DailyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement findElementById = driver.findElementById("dropdown1");
		Select dd = new Select(findElementById);
		List<WebElement> options = dd.getOptions();
		//dd.selectByIndex(options.size()-1);
		int lastoption = options.size()-1;
		int i = 0;
		for(WebElement eachop : options)
		{
			if(i == lastoption)
			{
				eachop.click();
			}
			i++;
		}
	}
}