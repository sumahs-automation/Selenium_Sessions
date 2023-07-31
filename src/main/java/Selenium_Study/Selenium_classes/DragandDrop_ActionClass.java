package Selenium_Study.Selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_ActionClass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		 driver =new ChromeDriver();
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 
		 WebElement l1= driver.findElement(By.id("draggable"));
		 WebElement l2= driver.findElement(By.id("droppable"));
		 
		 GeneralElement_utility ut=new GeneralElement_utility(driver);
		 
         ut.dragdrop(l1, l2);

	}
	
	

}
