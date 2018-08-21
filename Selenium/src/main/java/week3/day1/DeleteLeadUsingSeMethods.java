package week3.day1;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DeleteLeadUsingSeMethods extends SeMethods {
	@Test(groups = {"sanity"}, dependsOnGroups = "smoke")	
	//@Test
	//@Test(dependsOnMethods = "week3.day1.CreateLead.createLead" )
		public void deleteLead() throws InterruptedException {
			startApp("chrome", "http://www.leaftaps.com/opentaps");
			type(locateElement("username"), "DemoSalesManager");
			type(locateElement("password"), "crmsfa");
			click(locateElement("class", "decorativeSubmit"));
			click(locateElement("linktext", "CRM/SFA"));
			click(locateElement("linktext", "Leads"));
			click(locateElement("linktext", "Find Leads"));
			click(locateElement("xpath", "//span[text()='Phone']"));
			type(locateElement("xpath", "//input[@name='phoneAreaCode']"), "91");
			Thread.sleep(1000);
			type(locateElement("xpath", "//input[@name='phoneNumber']"), "9940708894");
			click(locateElement("xpath", "//button[text() = 'Find Leads']"));
			Thread.sleep(2000);
			click(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
			click(locateElement("linktext", "Delete"));
			click(locateElement("linktext", "Find Leads"));
			//click(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
			type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"),"11662");
			click(locateElement("xpath", "//button[text() = 'Find Leads']"));
			String expectedErrMsg = "No records to display";
			verifyPartialText(locateElement("xpath", "//div[text() = 'No records to display']"), expectedErrMsg);
			closeBrowser();
		}
	}
