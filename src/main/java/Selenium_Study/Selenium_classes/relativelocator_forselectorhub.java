package Selenium_Study.Selenium_classes;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativelocator_forselectorhub {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		driver.findElement(By.xpath("//div//label[text()=\"Can you enter name here through automation \"]")).click();
		WebElement el=driver.findElement((By.linkText("Joe.Root")));
	    String rightvalue=	driver.findElement(with(By.tagName("td")).toRightOf(el)).getText();
	    System.out.println(rightvalue);
	    driver.findElement(with(By.tagName("input")).toLeftOf(el)).click();
	    String belowval=driver.findElement(with(By.tagName("td")).below(el)).getText();
	    System.out.println(belowval);
	    
	//	String rightIndex1 = driver.findElement(with(By.tagName("a")).toRightOf(el)).getText();
	    
	  List<WebElement> element= driver.findElements(with(By.xpath("//tr[@class=\"usr_acn\"]//input[@type=\"checkbox\" and @id=\"ohrmList_chkSelectRecord_25\"]//ancestor::td//following-sibling::td")).above(el));
	 //   List<WebElement> element=driver.findElements(By.xpath("//table[@class=\"elementor-widget-container\"]//td"));
	   for (WebElement webElement : element) {
		  String s1= webElement.getText();
		  System.out.println(s1);
		
	}
	   
	   List<WebElement> e2=driver.findElements(with(By.tagName("td")).below(el));
	   for (WebElement web : e2) {
		   String ss=web.getText();
		   System.out.println(ss);
		   
		
	    }
	  

}
}
