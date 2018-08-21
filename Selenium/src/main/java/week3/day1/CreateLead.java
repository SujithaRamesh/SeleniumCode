package week3.day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import week4.day1.LoginMethods;

public class CreateLead extends LoginMethods{
	@Test(dataProvider = "fetchData", groups= {"smoke"})
	//@Test(groups= {"smoke"})
	//@Test(invocationCount =2)
	//@Test
	public void createLead(String cName,String fName,String lName,String phnNo) {
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phnNo);
		click(locateElement("class", "smallSubmit"));
	}
}