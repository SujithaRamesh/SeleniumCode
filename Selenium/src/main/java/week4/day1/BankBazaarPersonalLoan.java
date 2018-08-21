package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BankBazaarPersonalLoan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2 , TimeUnit.SECONDS);
		driver.get("https://www.bankbazaar.com/personal-loan.html");
		driver.findElementByXPath("//p[text() = 'Custom quote']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[@class='second-icon fui-radio-checked'])[2]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[@class='second-icon fui-radio-checked'])[4]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@class = 'js-question-item  validate  tt-input']").sendKeys("TestLeaf");
		driver.findElementByXPath("(//button[text() = 'Continue'])[2]").click();
		Thread.sleep(2000);
		WebElement slider = driver.findElementByXPath("(//div[@class = 'slider-track'])[2]");
		slider.click();
		
		int x = slider.getLocation().getX();
		System.out.println("Xcoord: "+x);
		int y = slider.getLocation().getY();
		System.out.println("Ycoord: "+y);
		
		int width = slider.getSize().getWidth();
		System.out.println("Width: "+width);
		
		Actions move = new Actions(driver);
		move.dragAndDropBy(slider, (width*25)/100, 0).perform();
		String amount ="25000";
		String text = slider.getText();
		System.out.println("Text is:"+text);
		//if(
		
		/*if(text != null && text.isEmpty()) {
			System.out.println("true");
		}
		int i = Integer.parseInt(text.replaceAll(",", ""));
		
		System.out.println("Text:"+i);*/
	}
}
