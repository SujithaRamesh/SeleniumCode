package week4.day1;

import org.testng.annotations.Test;

public class DeactivateAccount extends LoginMethods{
@Test
	public void deactivate() throws InterruptedException {
	login();
	click(locateElement("xpath", "//a[text() = 'Accounts']"));
	click(locateElement("xpath", "//a[text() = 'Find Accounts']"));
	type(locateElement("xpath", "(//input[@name = 'accountName'])[2]"), "Sujitha");
	type(locateElement("xpath", "//input[@name = 'id']"), "11476");
	click(locateElement("xpath", "//button[text() = 'Find Accounts']"));
	Thread.sleep(2000);
	String text = getText(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
System.out.println(text);	
click(locateElement("xpath", "//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
String expectedTitle = "Account Details | opentaps CRM";
verifyTitle(expectedTitle);
clickWithNoSnap(locateElement("xpath", "//a[text() = 'Deactivate Account']"));
String alertText = getAlertText();
System.out.println(alertText);
acceptAlert();
String expectedText = "This account was deactivated";
verifyPartialText(locateElement("xpath" , "//span[@class = 'subSectionWarning']"), expectedText);
click(locateElement("xpath", "//a[text() = 'Find Accounts']"));
type(locateElement("xpath", "(//input[@name = 'accountName'])[2]"), "Sujitha");
type(locateElement("xpath", "//input[@name = 'id']"), "11476");
click(locateElement("xpath", "//button[text() = 'Find Accounts']"));
String expectedErrorText = "No records to display";
verifyExactText(locateElement("xpath", "//div[@class = 'x-paging-info']"), expectedErrorText);
closeBrowser();
}

}
