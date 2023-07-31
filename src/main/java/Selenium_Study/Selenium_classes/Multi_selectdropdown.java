package Selenium_Study.Selenium_classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_selectdropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement pointer=driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select se= new Select(pointer);
		List<WebElement>el=se.getOptions();
		for(WebElement ewb:el) {
			String text=ewb.getText();
			System.out.println(text);	
		}
		if(se.isMultiple()) {
			se.selectByVisibleText("Volvo");
			se.selectByVisibleText("Audi");
			se.deselectByVisibleText("Audi");
			se.deselectByIndex(0);
		}

	}

}
