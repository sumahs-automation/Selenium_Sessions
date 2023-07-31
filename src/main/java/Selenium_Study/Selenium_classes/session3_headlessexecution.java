package Selenium_Study.Selenium_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class session3_headlessexecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();
		//co.setHeadless(false); //--- this value is depricated
		
		co.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://google.com");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.quit();

	}

}
