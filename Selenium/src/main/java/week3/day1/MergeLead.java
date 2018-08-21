package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
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

		driver.findElementByLinkText("Merge Leads").click();

		//Click on icon near From Lead
		driver.findElementByXPath("//table[@id = 'widget_ComboBox_partyIdFrom']/following::img").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		//Move to new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input[1]").sendKeys("11286");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getTitle());

		driver.findElementByXPath("//table[@id = 'widget_ComboBox_partyIdTo']/following::img").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>();
		list1.addAll(windowHandles1);
		driver.switchTo().window(list1.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input[1]").sendKeys("11291");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();

		/*WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		*/
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(list1.get(0));
		System.out.println(driver.getTitle());

		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text() = 'Lead ID:']/following::input[1]").sendKeys("11286");
		driver.findElementByXPath("//button[text() = 'Find Leads']").click();
		String errMsg = driver.findElementByXPath("//div[text() = 'No records to display']").getText();
		String expectedErrMsg = "No records to display";
		if(errMsg.contentEquals(expectedErrMsg))
			System.out.println("Error message is verified");
		else
			System.out.println("Expected error message is missing");
		driver.close();
	}
}
