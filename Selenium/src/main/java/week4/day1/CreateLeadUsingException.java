package week4.day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateLeadUsingException extends SeMethods{
	@Test
	public void loginLeaftaps() {
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"), "");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), "Testleaf");
		type(locateElement("id", "createLeadForm_firstName"), "Sujitha");
		type(locateElement("id", "createLeadForm_lastName"), "Ramesh");
		click(locateElement("class", "smallSubmit"));
	}
}





