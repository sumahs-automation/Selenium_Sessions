package Selenium_Study.Selenium_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralElement_utility  {
	private WebDriver driver;
	
	
	public GeneralElement_utility(WebDriver driver) {
		this.driver = driver;
	}

	public  void languagelink(By locator, String s1,String s2) throws InterruptedException
	{
		
		List<WebElement>  lan=driver.findElements(locator);
		System.out.println(lan.size());		
	    for (WebElement e : lan) {
			//System.out.println(e);
		System.out.println(e.getText());		   
		  if(e.getText().equals(s1)) {
			  e.click();
			  Thread.sleep(4000);
			  WebElement  lan1=driver.findElement(By.xpath("//div[@id=\"SIvCob\"]/a"));
				if(lan1.getText().equals(s2)) {
					  Thread.sleep(3000);
					  lan1.click(); 
					  break;
		  }
			 
			  
		  }
		  
			
		  }
	}
	/////////drop down util//////
	
	//
	//By locator=By.id("Form_getForm_Country");
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	
	public void dropdownwithslectByValue(By locator, String value) {
	//	 WebElement country=driver.findElement(locator);
		Select sel=new Select(getElement(locator));
		sel.selectByValue(value);
		
	}
	
	public  void dropdownwithslectByIndex(By locator, int index) {
		Select sel=new Select(getElement(locator));
		sel.selectByIndex(index);
		
	}
	
	public  void dropdownwithvisibleText(By locator, String value) {
		Select sel=new Select(getElement(locator));
		sel.selectByVisibleText(value);
		
	}
	
	public  void dropdownvalues(By locator) {
		Select s1= new Select(getElement(locator));
		List<WebElement> elements=s1.getOptions();
		System.out.println(elements.size());
		int count=0;
	//	ArrayList<Object> options = new ArrayList<>();
		for (WebElement webElement : elements) {
			count++;
			String values=webElement.getText();
			//options.add(values);
			System.out.println(count+" "+values)	;		
	}
	//return options;
		
////////////////MovetoElements Utility////
		
	
}
	
	public  void MenuandSubmenuclick(WebElement locator, String menuval) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(locator).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"headermenudesktop\"]//a[text()=\""+menuval+"\"]")).click();
		Thread.sleep(2000);
		
	}

//////////////////dragdrop methods////////////////////////
	public  void dragdrop(WebElement l1, WebElement l2) {
		 Actions act =new Actions(driver);
//		 act.clickAndHold(l1).perform();
//		 Thread.sleep(2000);
//		 act.release(l2).perform();
//		 
		 act.dragAndDrop(l1, l2).build().perform();
		
	}
	
}