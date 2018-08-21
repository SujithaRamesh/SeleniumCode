package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DailyQuestions2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/checkbox.html");
		WebElement checkbox = driver.findElementByXPath("//div[@id='contentblock']/section/div[1]/input[5]");
		WebElement checkbox1 = driver.findElementByXPath("//label[text()='Select the languages that you know?']/following :: input[4]");
		checkbox.click();
		checkbox1.click();
		if(checkbox.isSelected())
			System.out.println("The checkbox is selected");
		else
			System.out.println("The checkbox is not selected");
		//driver.close();
	}
}