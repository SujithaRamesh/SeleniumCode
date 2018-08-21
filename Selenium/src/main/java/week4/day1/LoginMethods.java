package week4.day1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;
import week6.day1.LearningExcelDataProvider;

public class LoginMethods extends SeMethods {
@Parameters({"url", "username", "password"})
@BeforeMethod
	//@BeforeMethod(groups = {"common"})
	public void login(String url, String username, String password)
	{
		startApp("chrome", url);
		type(locateElement("id", "username"), username);
		type(locateElement("id", "password"), password);
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		
	}
@AfterMethod
//@AfterMethod(groups = {"common"})
	public void close()
	{
		closeBrowser();
		//closeAllBrowsers();
	}

@DataProvider(name="fetchData")
public Object[][] getData() throws IOException{
	
	LearningExcelDataProvider learnExcel = new LearningExcelDataProvider();
	Object [][] inputdata = learnExcel.readExcel();
	return inputdata;
	
}
}
