package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
	
	//open the browser
	ChromeDriver driver = new ChromeDriver();
	
	//Maximize the browser
	driver.manage().window().maximize();
	
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
		
	//Click Create Lead
		driver.findElementByLinkText("Create Lead").click();
		
	//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
	//Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Sujitha");
		
	//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Ramesh");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
				dd.selectByVisibleText("Employee");
				
				WebElement marCampId = driver.findElementById("createLeadForm_marketingCampaignId");
				Select campaign = new Select(marCampId);
				
				List<WebElement> allOptions = campaign.getOptions();
				campaign.selectByIndex(allOptions.size()-2);
				
	//Click Create Lead button
		driver.findElementByClassName("smallSubmit").click();
			
	/*Thread.sleep(5000);
	
	//Click Logout button
		driver.findElementByClassName("decorativeSubmit").click();
*/
	}

}
