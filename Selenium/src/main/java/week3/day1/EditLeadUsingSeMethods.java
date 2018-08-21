package week3.day1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
import week4.day1.LoginMethods;

public class EditLeadUsingSeMethods extends LoginMethods {
	@Test(groups= {"regression"}, dependsOnGroups="smoke")
	//@Test(dependsOnMethods = "week3.day1.CreateLead.createLead" )
	//@Test(groups = {"smoke"})
	//@Test
	public void editLead() throws InterruptedException {
		//login();
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));*/
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "//label[text() = 'Lead ID:']/following::input[2]"), "Sujitha");
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));
		Thread.sleep(2000);
		click(locateElement("xpath", "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String expectedTitle = "View Lead | opentaps CRM";
		verifyTitle(expectedTitle);
		click(locateElement("linktext", "Edit"));
		type(locateElement("id", "updateLeadForm_companyName"), "TCS");
		click(locateElement("xpath", "//input[@value = 'Update']"));
		String expectedtext = "TCS";
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), expectedtext);
		//close();
		//closeBrowser();
	}
}