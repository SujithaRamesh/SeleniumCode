package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

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
		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input[2]").sendKeys("sujitha");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "View Lead | opentaps CRM";
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Title is matching: "+actualTitle);
		}
		else
			System.out.println("Title of the page is mismatched");
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("TCS");
		driver.findElementByXPath("//input[@value = 'Update']").click();
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		String expectedtext = "TCS (10146)";
		if(text.contentEquals(expectedtext))
		{
			System.out.println("EditLead Test Cases passed");
		}
		else
			System.out.println("Check the steps");
		driver.close();
	}
}
