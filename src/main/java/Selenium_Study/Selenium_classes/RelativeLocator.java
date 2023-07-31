package Selenium_Study.Selenium_classes;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// org.openqa.selenium.support.locators.RelativeLocator.with;i

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele = driver.findElement(By.linkText("London, Canada"));
		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);	
		//right of ele:
				String rightIndex1 = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
				System.out.println(rightIndex1);
				
				//left of ele:
				String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
				System.out.println(leftRank);
				
				//below of ele:
				String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
				System.out.println(belowCity);
				
				//above of ele:
				String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
				System.out.println(aboveCity);
				
				
				//near of ele:
				String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
				System.out.println(nearCity);// will find the nearest value -100 pixcel

				List<WebElement> belowElements = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
				System.out.println(belowElements.size());
				for(WebElement e : belowElements) {
					System.out.println(e.getText());
		
		
		

	
	}
	}}
