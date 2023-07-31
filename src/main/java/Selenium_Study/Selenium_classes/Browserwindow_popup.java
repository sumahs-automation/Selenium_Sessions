package Selenium_Study.Selenium_classes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserwindow_popup {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@title=\"Accept Cookies\"]")));
	    String parentwindow=driver.getWindowHandle();/// To get the Window id
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//img[contains(@src,\"facebook\")]")).click();
		Thread.sleep(2000);
        Set<String> s=driver.getWindowHandles();
        Iterator<String> it =s.iterator();
        it.next();
        String ChildWindowId=it.next();
        driver.switchTo().window(ChildWindowId);
		
		
}

}
