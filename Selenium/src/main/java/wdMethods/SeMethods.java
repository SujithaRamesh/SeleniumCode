package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
		} catch (NullPointerException e) {
			System.err.println("Null pointer exception occurred");
			e.printStackTrace();
		}catch(WebDriverException e)
		{
			System.err.println("Web driver exception occurred");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.err.println(" Exception occurred");
			e.printStackTrace();
		}
		finally {
		takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "linktext":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "tagname":
				ele = driver.findElementByTagName(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "cssselector":
				ele = driver.findElementByCssSelector(locValue);
				break;
			}
			
		}
		
		catch(NoSuchElementException e)
		{
			System.err.println("No Such Element Exception occurred");
			e.printStackTrace();
		}
		catch(WebDriverException e)
		{
			System.err.println("Web driver exception occurred");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.err.println("Null Pointer Exception occurred");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.err.println("Exception occurred");
						e.printStackTrace();
		}
		finally
		{
			takeSnap();
		}
		return ele;
	}

	//only for Id locator
	public WebElement locateElement(String locValue) throws NoSuchElementException, WebDriverException {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The given value is entered: "+data);
		}
		catch(NullPointerException e)
		{
			System.err.println("Null pointer exception occurred");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
		takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} 
		catch(TimeoutException e)
		{
			System.err.println("TIme Out Exception occurred");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		takeSnap();
		}
	}

	public void clickWithNoSnap(WebElement ele)
	{
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} 
		catch(TimeoutException e)
		{
			System.err.println("TIme Out Exception occurred");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println("Text saved successfully");
		takeSnap();
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		new Select(ele).selectByVisibleText(value);
		System.out.println("Value selected from Dropdown using visible text");
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		new Select(ele).selectByIndex(index);
		System.out.println("Value selected from Dropdown using index");
		takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		String title = driver.getTitle();
		if(title.equalsIgnoreCase(expectedTitle))
			System.out.println("Title verified");
		else
			System.out.println("Incorrect title");
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if(ele.getText().equals(expectedText))
			System.out.println("The text: "+ele.getText()+" is matched with: "+expectedText);
		else
			System.out.println("Text is not matched");
		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if(ele.getText().contains(expectedText))
			System.out.println("The text: "+ele.getText()+" is verified with: "+expectedText);
		else
			System.out.println("Text is not verified");
		takeSnap();
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value))
			System.out.println("The attribute "+ele.getAttribute(attribute)+" is matched with "+value);
		else
			System.out.println("Attribute is not matched");
		takeSnap();
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).contains(value))
			System.out.println("The attribute "+ele.getAttribute(attribute)+" is verified with "+value);
		else
			System.out.println("Attribute is not verified");
		takeSnap();
	}

	public void verifySelected(WebElement ele) {
		if(ele.isSelected())
			System.out.println("Checkbox is checked");
		else
			System.out.println("Checkbox is not checked");
		takeSnap();
	}

	public void verifyDisplayed(WebElement ele) {
		ele.isDisplayed();
		System.out.println("Element is displayed");
		takeSnap();
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>();
			winList.addAll(allwindows);
			driver.switchTo().window(winList.get(index));
			System.out.println("Switched to window successfully");
		} 
		catch(NoSuchWindowException e)
		{
			System.err.println("No Such Windoe Exception occurred");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		takeSnap();
		}
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("Switched to frame successfully");
		takeSnap();
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert accepted");
		} 
		catch(UnhandledAlertException e)
		{
			System.err.println("Unhandled Alert Exception occurred");
			e.printStackTrace();
		}
		catch(NoAlertPresentException e)
		{
			System.err.println("No Alert Present Exception occurred");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert dismissed");
		} 
		catch(UnhandledAlertException e)
		{
			System.err.println("Unhandled Alert Exception occurred");
			e.printStackTrace();
		}
		catch(NoAlertPresentException e)
		{
			System.err.println("No Alert Present Exception occurred");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getAlertText() {
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert text stored successfully");
		return text;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Active window closed successfully");
	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("Closed all the windows successfully");
	}

}
