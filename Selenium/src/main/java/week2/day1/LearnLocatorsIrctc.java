package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnLocatorsIrctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

//Registration Details
driver.findElementById("userRegistrationForm:userName").sendKeys("SujithaRamesh");
driver.findElementById("userRegistrationForm:password").sendKeys("Thigalvan13");
driver.findElementById("userRegistrationForm:confpasword").sendKeys("Thigalvan13");
WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
Select dd = new Select(securityQ);
dd.selectByVisibleText("Where did you first meet your spouse?");
driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Aashif & Brothers");
WebElement prelan = driver.findElementById("userRegistrationForm:prelan");
Select dd1 = new Select(prelan);
dd1.selectByIndex(0);
Thread.sleep(2000);

//Personal Details
driver.findElementById("userRegistrationForm:firstName").sendKeys("Sujitha");
driver.findElementById("userRegistrationForm:middleName").sendKeys("Chinnasamy");
driver.findElementById("userRegistrationForm:lastName").sendKeys("Ramesh");
driver.findElementById("userRegistrationForm:gender:1").click();
driver.findElementById("userRegistrationForm:maritalStatus:0").click();
WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
Select dd2 = new Select(dobDay);
dd2.selectByVisibleText("28");
WebElement dobMonth = driver.findElementById("userRegistrationForm:dobMonth");
Select dd3 = new Select(dobMonth);
dd3.selectByIndex(0);
dd3.selectByVisibleText("JAN");
WebElement dateOfBirth = driver.findElementById("userRegistrationForm:dateOfBirth");
Select dd4 = new Select(dateOfBirth);
dd4.selectByVisibleText("1987");
WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
Select dd5 = new Select(occupation);
dd5.selectByValue("3");
driver.findElementById("userRegistrationForm:uidno").sendKeys("303204165856");
driver.findElementById("userRegistrationForm:idno").sendKeys("DCDPS9787J");
Thread.sleep(1000);
driver.findElementById("userRegistrationForm:countries").sendKeys("E",Keys.ARROW_DOWN,Keys.ENTER);
Thread.sleep(1000);
//driver.findElementByXPath("//select [ @id='userRegistrationForm:countries'] //option[starts-with(text(),'E')][2]");
/*WebElement countries = driver.findElementById("userRegistrationForm:countries");
Select dd6 = new Select(countries);
dd6.selectByVisibleText("India");*/
driver.findElementById("userRegistrationForm:email").sendKeys("csujimca@gmail.com");
//driver.findElementById("userRegistrationForm:isdCode").sendKeys("+521");
driver.findElementById("userRegistrationForm:mobile").sendKeys("9940708894");
WebElement nationalityId = driver.findElementById("userRegistrationForm:nationalityId");
Select dd7 = new Select(nationalityId);
	dd7.selectByVisibleText("India");
	Thread.sleep(2000);
	
	//Residential Address
	driver.findElementById("userRegistrationForm:address").sendKeys("18B");
	driver.findElementById("userRegistrationForm:street").sendKeys("Kanniamman kovil street");
	driver.findElementById("userRegistrationForm:area").sendKeys("Pudupakkam");
	driver.findElementById("userRegistrationForm:pincode").sendKeys("603103",Keys.TAB);
	Thread.sleep(2000);
	WebElement cityName = driver.findElementById("userRegistrationForm:cityName");
	Select dd8 = new Select(cityName);
	dd8.selectByIndex(1);
	Thread.sleep(2000);
	WebElement postoffName = driver.findElementById("userRegistrationForm:postofficeName");
	Select dd9 = new Select(postoffName);
	dd9.selectByValue("Pudupakkam B.O");
	driver.findElementById("userRegistrationForm:landline").sendKeys("2304566");
	
}

}
