package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text() = 'Try it']").click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	
		String text1 = "aarthi";
		driver.switchTo().alert().sendKeys(text1);
	//	String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String text2 = driver.findElementById("demo").getText();
		if(text2.contains(text1))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
}
