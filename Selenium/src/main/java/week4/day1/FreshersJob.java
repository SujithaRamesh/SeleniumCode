package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FreshersJob {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.indeed.co.in/Fresher-jobs");
		WebElement title1 = driver.findElementByXPath("//a[@id='jobPostingsAnchor']/following::a[1]");
		Actions builder = new Actions(driver);
		title1.click();
		builder.sendKeys(title1,Keys.CONTROL).click().perform();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		//driver.switchTo().window(0);
		//driver.switchTo().defaultContent();
	}

}
