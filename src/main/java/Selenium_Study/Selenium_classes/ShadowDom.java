package Selenium_Study.Selenium_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDom {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		//getting html element --> webelement
//		WebElement pizza_ele = (WebElement)js.executeScript(script);
//		pizza_ele.sendKeys("Veg Pizza");
		
		
		Thread.sleep(5000);
		
		//
		driver.get("chrome://settings/");
		WebElement search  = (WebElement)js.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		search.sendKeys("notification");

	}

}
