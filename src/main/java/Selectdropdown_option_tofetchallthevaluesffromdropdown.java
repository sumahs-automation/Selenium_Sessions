import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Selenium_Study.Selenium_classes.GeneralElement_utility;

public class Selectdropdown_option_tofetchallthevaluesffromdropdown {
/////// To get all the elements from the dropdown	
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		/// to get all the elements from the dropdown
		By locator = By.xpath("//select[@id=\"Form_getForm_Country\"]");
		GeneralElement_utility e= new GeneralElement_utility(driver);
		e.dropdownvalues(locator);
//		for (Object object : f) {
//			System.out.println(object);
//			
//		}

		}
}
