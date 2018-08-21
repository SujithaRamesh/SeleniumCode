package learningselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.in/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.in%2F");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Sujitha");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Ramesh");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("csujimca@gmail.com");
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys("thigalvan123");
		//driver.findElement(By.cssSelector("#ppaFormSbtBtn")).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ppaFormSbtBtn"))).click().perform();
		//driver.findElement(By.id("ppaFormSbtBtn")).click();
		
	}

}
