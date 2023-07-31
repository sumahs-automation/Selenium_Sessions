package Selenium_Study.Selenium_classes;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElements_Actionclass {
	
	
    static WebDriver driver;
    
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver= new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		WebElement locator=driver.findElement(By.xpath("//a[@rel=\"nofollow\" and @class=\"menulink\" ]"));
		
		WebElement locator2=driver.findElement(By.xpath("//span[@id=\"headermenudesktop\"]//a[text()=\"Courses\"]"));
		
	   GeneralElement_utility u1=new GeneralElement_utility(driver);
		
//		Actions act=new Actions(driver);
//		act.moveToElement(locator).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@id=\"headermenudesktop\"]//a[text()=\"Courses\"]")).click();
//		Thread.sleep(2000);
		
		u1.MenuandSubmenuclick(locator, "Articles");

	}
	
	public static void MenuandSubmenuclick(WebElement locator, String menuval) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(locator).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"headermenudesktop\"]//a[text()=\""+menuval+"\"]")).click();
		Thread.sleep(2000);
		
	}

}
