package Selenium_Study.Selenium_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pseudo_element {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//can be used::befor ::after
	
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-telephone']\"), '::before').getPropertyValue('content')";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String mand_text=(String) js.executeScript(script);
		//String mand_test=
	System.out.println(mand_text);
	}

}
