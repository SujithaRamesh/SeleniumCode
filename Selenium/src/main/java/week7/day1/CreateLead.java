package week7.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public static RemoteWebDriver driver;
	
	
	@Before()
	public void openLeafTaps(Scenario sc)
	{
		System.out.println(sc.getName());
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@And("Enter the username as (.*)")
	public void enterUsername(String uName)
	{
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter the password as (.*)")
	public void enterPassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}

	@And("Click on login button")
	public void clickLogin()
	{
	driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click on CRM/ SFA")
	public void clickCRMSFA()
	{
	driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on leads")
	public void clickLeads()
	{
	driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click on Create Lead")
	public void clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter the Company Name as (.*)")
	public void enterCName(String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("Enter the First Name as (.*)")
	public void enterFName(String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter the Last Name as (.*)")
	public void enterLName(String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When("Click on CreateButton")
	public void clickCreateButton()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Verify Lead is Created")
	public void login() {
		System.out.println("Lead created");
	}
	
	@But("Login is incorrect")
	public void loginFailed() {
		System.out.println("Login failed");
	}
	@After()
	public void closeBrowser(Scenario sc)
	{
		System.out.println(sc.getStatus());
	}
}
