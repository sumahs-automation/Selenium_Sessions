package Selenium_Study.Selenium_classes;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketgetting_elements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		WebElement level1 = driver.findElement(By.xpath("//a[@qa='categoryDD']"));
		System.out.println(level1.getText());
//		Actions act = new Actions(driver);
//		act.moveToElement(level1).perform();
//		Thread.sleep(1500);
	
	   List<WebElement> elements= driver.findElements(By.xpath("//li[@class=\"dropdown full-wid hvr-drop\"]//li//a[@qa=\"catL1\"]"));

	   for (WebElement web : elements) {
		   Actions act = new Actions(driver);
			act.moveToElement(level1).perform();
			Thread.sleep(1500);
		   String s=web.getText();
	       System.out.println(s);
	       WebElement level2 = driver.findElement(By.xpath("//li//a[@qa=\"catL1\"]"));
			System.out.println(level1.getText());
			Actions act1 = new Actions(driver);
			act1.moveToElement(level2).perform();
	       List<String> ids=Arrays.asList("beverages","fresh-vegetables");
	      // for(int i=0;i<ids.size();i++) {
	    	   //System.out.println(ids.get(i));    
	       List<WebElement> cat2=driver.findElements(By.xpath("//li[@class=\"dropdown full-wid hvr-drop\"]//li//a[@qa=\"catL2\"]"));
//	       act.moveToElement(cat2).perform();
	       for (WebElement element : cat2) {
	    	   act.moveToElement(level1);
	    	   
	    	   String s1=element.getText();
	    	   System.out.println(s1);
	    	   break;
			
		}
	       }
	      //}
	   WebElement forViewall = driver.findElement(By.xpath("//li[@class=\"dropdown full-wid hvr-drop\"]//li//a[text()=\"View All\"]"));
	   System.out.println(forViewall.getText());
}
}


