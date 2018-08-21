package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");

		//open the browser
		ChromeDriver driver = new ChromeDriver();

		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Load the URL
		driver.get("http://www.leaftaps.com/opentaps");

		//Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter password
		driver.findElementById("password").sendKeys("crmsfa");

		//Click Login button
		driver.findElementByClassName("decorativeSubmit").click();

		//Click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();

		//Click Leads
		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("91" , Keys.TAB);

		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9940708894");

		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();

		driver.findElementByLinkText("Delete").click();

		driver.findElementByLinkText("Find Leads").click();

		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("11611");

		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		driver.findElementByXPath("//div[text()='No records to display']");

		driver.close();
	}
}
