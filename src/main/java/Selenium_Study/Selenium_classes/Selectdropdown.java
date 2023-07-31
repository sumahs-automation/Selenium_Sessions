package Selenium_Study.Selenium_classes;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
			
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		GeneralElement_utility e=new GeneralElement_utility(driver);	
		
		By locator=By.id("Form_getForm_Country");
//	
//	    WebElement country=driver.findElement(locator);
//		Select sel=new Select(country);
//		sel.selectByValue("India");
//		Thread.sleep(2000);
//		sel.selectByIndex(3);
//		Thread.sleep(2000);
//		sel.selectByVisibleText("Belgium");
		e.getElement(locator);
		e.dropdownwithslectByIndex(locator, 3);
		e.dropdownwithslectByValue(locator, "India");
		e.dropdownwithvisibleText(locator, "Belgium");

      }
	
//	public static WebElement getElement(By locator ) {
//		 return driver.findElement(locator);
//	}
//	
//	
//	public static void dropdownwithslectByValue(By locator, String value) {
//	//	 WebElement country=driver.findElement(locator);
//		Select sel=new Select(getElement(locator));
//		sel.selectByValue(value);
//		
//	}
//	
//	public static void dropdownwithslectByIndex(By locator, int index) {
//		Select sel=new Select(getElement(locator));
//		sel.selectByIndex(index);
//		
//	}
//	
//	public static void dropdownwithvisibleText(By locator, String value) {
//		Select sel=new Select(getElement(locator));
//		sel.selectByVisibleText(value);
//		
//	}
}
