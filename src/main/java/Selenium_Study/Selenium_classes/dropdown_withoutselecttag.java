package Selenium_Study.Selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_withoutselecttag {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//div[text()=\"Select Title\"]")).click();
		List<WebElement> ListofElement=driver.findElements(By.xpath("//div[@tabindex=\"-1\"]"));
		for(WebElement e:ListofElement){
			String text=e.getText();
			System.out.println(text);
			if(text.contains("Mr")) {
				e.click();
				break;
			}
			
			
		}
		
	

	}

}
