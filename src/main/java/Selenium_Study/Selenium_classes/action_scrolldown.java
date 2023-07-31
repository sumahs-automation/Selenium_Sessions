package Selenium_Study.Selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_scrolldown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	Actions act=new Actions(driver);
//	act.sendKeys(Keys.PAGE_DOWN).perform();////Keyboard action
//	Thread.sleep(5000);
//	act.sendKeys(Keys.PAGE_DOWN).perform();////Keyboard action
//	Thread.sleep(5000);
//	act.sendKeys(Keys.PAGE_UP).perform();////Keyboard action
//	Thread.sleep(5000);
	WebElement movevalue=driver.findElement(By.linkText("Help"));
//	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	
	
/// scroll to Element
	act.scrollToElement(movevalue).click(movevalue).build()
	.perform();
	
//	act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform() ; will no t work
	driver.navigate().refresh();

	}
}
