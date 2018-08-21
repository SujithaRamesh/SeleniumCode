package learningselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FramesConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/a/font"))).click().perform();
		
		//driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/a/font")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.linkText("Pricing")).click();
		/*Select dd = new Select(driver.findElement(By.id("payment_plan_id")));
		dd.selectByValue("Free Edition");
		
		driver.findElement(By.name("first_name")).sendKeys("Sujitha");
		driver.findElement(By.name("surname")).sendKeys("Ramesh");
		driver.findElement(By.name("email")).sendKeys("csujimca@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("csujimca@gmail.com");
		
		driver.findElement(By.name("username")).sendKeys("sujitha");
		driver.findElement(By.name("password")).sendKeys("thigalvan123");
		driver.findElement(By.name("passwordconfirm")).sendKeys("thigalvan123");
		driver.findElement(By.name("agreeTerms")).sendKeys("agreeTerms");*/
		
		//driver.findElement(By.name("submitButton")).click();
		
		
	}

}