package Selenium_Study.Selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gogglesearch_utility {
 static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Naveen Automation labs");
		List<WebElement> el= driver.findElements(By.xpath("//ul[@role=\"listbox\"]//div[@class=\"wM6W7d\"]//span"));
		for (WebElement webElement : el) {
			String compval=webElement.getText();
			if(compval.contains("youtube")) {
				webElement.click();
				
			}
			
		}
	}

}
