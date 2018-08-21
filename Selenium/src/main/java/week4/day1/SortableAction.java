package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text() = 'Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text() = 'Item 3']");
		int x = item3.getLocation().getX();
		int y = item3.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		

}
}