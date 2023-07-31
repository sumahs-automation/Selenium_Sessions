package Selenium_Study.Selenium_classes;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import Exceptionpackage.FrameworkException;

public class utility_class {
	
	private WebDriver driver;
	
	public  void launchbrowser(String browser) {
		
		if(browser== null) {
			throw new FrameworkException("BROWSERSHOULDNOTBENULL");
			
		}
		switch (browser.toLowerCase()) {
		case "chrome":
			 driver= new ChromeDriver();
		     break;
		case "firefox":
			 driver= new FirefoxDriver();
		     break;
		case "edge":
			 driver= new EdgeDriver();
		     break;
		case "safari":
			 driver= new SafariDriver();
		     break;
		     

		default:
			// System.out.println("pleasee enter correct url");
			 throw new FrameworkException("NOTVAILDBROWSER");
		}
	}
	public WebDriver geturl(String url) {
		driver.get(url);
		return driver;
	}
	public String getname() {
	  return driver.getCurrentUrl();
	}
	
	public void quit() {
		driver.quit();
	}
	 
	public void close() {
		driver.close();
	}

}
