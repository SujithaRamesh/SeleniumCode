package week3.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;
import week4.day1.LoginMethods;

public class MergeLeadUsingSeMethods extends LoginMethods {
	//@Test
	@Test(groups= {"sanity"},dependsOnGroups = "smoke")
	//@Test(enabled = false)
	public void mergeLead() throws InterruptedException {
	/*	startApp("chrome", "http://www.leaftaps.com/opentaps");
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));*/
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Merge Leads"));
		click(locateElement("xpath", "//table[@id = 'widget_ComboBox_partyIdFrom']/following::img"));
		String expectedTitle = "Merge Leads | opentaps CRM";
		verifyTitle(expectedTitle);
		switchToWindow(1);
		String expectedTitle1 = "Find Leads";
		verifyTitle(expectedTitle1);
		type(locateElement("xpath", "//label[text() = 'Lead ID:']/following::input[1]"), "11138");
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));	
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		verifyTitle(expectedTitle);
		click(locateElement("xpath", "//table[@id = 'widget_ComboBox_partyIdTo']/following::img"));
		verifyTitle(expectedTitle);
		switchToWindow(1);
		verifyTitle(expectedTitle1);
		type(locateElement("xpath", "//label[text() = 'Lead ID:']/following::input[1]"), "11145");
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a"));
		switchToWindow(0);
		verifyTitle(expectedTitle);
		clickWithNoSnap(locateElement("linktext", "Merge"));
		acceptAlert();
		click(locateElement("linktext", "Find Leads"));
		type(locateElement("xpath", "//label[text() = 'Lead ID:']/following::input[1]"), "11138");
		click(locateElement("xpath", "//button[text() = 'Find Leads']"));
		String expectedErrMsg = "No records to display";
		verifyPartialText(locateElement("xpath", "//div[text() = 'No records to display']"), expectedErrMsg);
		closeBrowser();
	}
}