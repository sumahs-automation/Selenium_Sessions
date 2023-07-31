package Selenium_Study.Selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Selenium_Study.Selenium_classes.GeneralElement_utility;

public class Googleautomation {
	
	
   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		utility_class u= new utility_class();
		u.launchbrowser("chrome");
		driver=u.geturl("https://www.google.com/");
		GeneralElement_utility e1=new GeneralElement_utility(driver);
	
		By locator=By.xpath("//div[@id=\"SIvCob\"]/a");
		
		e1.languagelink(locator, "ಕನ್ನಡ", "English");
	}
}