package Selenium_Study.Selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown_withoutselectoptions {
	
///// Select usage without selectdropdown such as options values and visibleText
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By locator=By.id("Form_getForm_Country");
		Select s1=new Select(driver.findElement(locator));
		List<WebElement> web=s1.getOptions();
		for (WebElement webElement : web) {
			System.out.println(webElement.getText());
			
		}
		
			
			
		

	}

}
