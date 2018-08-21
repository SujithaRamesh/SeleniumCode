package week4.day1;

import org.junit.Test;

public class MergeAccount extends LoginMethods{
	@Test
	public void mergeAcc() throws InterruptedException{
		login();
		click(locateElement("xpath","//a[text() = 'Accounts']"));
		click(locateElement("xpath","//a[text()='Merge Accounts']"));
		click(locateElement("xpath","//table[@id = 'widget_ComboBox_partyIdFrom']/following::img"));
		switchToWindow(1);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),"11492");
		type(locateElement("xpath","//label[text()='Account Name:']/following::input[1]"),"Aarthi Arumugam");
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		switchToWindow(0);
		click(locateElement("xpath","//table[@id = 'widget_ComboBox_partyIdTo']/following::img"));
		switchToWindow(1);
		type(locateElement("xpath","//label[text()='Account ID:']/following::input[1]"),"11537");
		type(locateElement("xpath","//label[text()='Account Name:']/following::input[1]"),"Aarthi a");
		click(locateElement("xpath","//button[text()='Find Accounts']"));
		Thread.sleep(1000);
		clickWithNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		switchToWindow(0);
		clickWithNoSnap(locateElement("xpath","//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("xpath", "//a[text() = 'Find Accounts']"));
		type(locateElement("xpath", "//input[@name = 'id']"), "11492");
		click(locateElement("xpath", "//button[text() = 'Find Accounts']"));
		String expectedErrorText = "No records found";
		verifyExactText(locateElement("xpath", "//div[@class = 'x-paging-info']"), expectedErrorText);
		closeBrowser();
		
		
	}
}
