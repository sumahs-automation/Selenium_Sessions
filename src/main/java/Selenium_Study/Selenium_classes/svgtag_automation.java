package Selenium_Study.Selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class svgtag_automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		Thread.sleep(6000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,\"map-instance\")]")));
	    List<WebElement> el=driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
	    Thread.sleep(6000);
	    System.out.println(el.size());
	   for (WebElement webElement : el) {
		String st=webElement.getAttribute("name");
		//st.si
		System.out.println(st);
		
	}

	}

}
