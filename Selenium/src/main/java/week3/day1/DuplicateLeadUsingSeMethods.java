package week3.day1;

import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DuplicateLeadUsingSeMethods extends SeMethods {
	@Test
	//@Test(enabled = false)
	public void duplicateLead() throws InterruptedException {
		startApp("chrome", "http://www.leaftaps.com/opentaps");
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("name", "emailAddress"),"aarthia2@gmail.com");
		click(locateElement("linktext", "Find Leads"));
		click(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		click(locateElement("linktext", "Duplicate Lead"));
		//verifyTitle(driver.getTitle());
		click(locateElement("name","submitButton"));
	}
}