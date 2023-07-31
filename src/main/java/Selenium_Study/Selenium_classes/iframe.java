package Selenium_Study.Selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("//img[@alt=\"Vehicle Registration Form\"]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Vehicle Registration");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Hassan");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("2022-06-03");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("Automation script to be written and automated ");
		WebElement el=driver.findElement(By.xpath("//input[@type=\"file\"]"));
		el.sendKeys("C:\\Users\\mrsha\\OneDrive\\Documents\\sampleautomationdoc.txt");
//		driver.switchTo().alert().sendKeys("\"C:\\Users\\mrsha\\OneDrive\\Documents\\sampleautomationdoc.txt\"");
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Suma");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("HS");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("Near DM Halli");
     	driver.findElement(By.id("RESULT_TextField-11")).sendKeys("Bye Pass Road");
		driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Hassan");
		WebElement ele=driver.findElement(By.id("RESULT_RadioButton-13"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Indiana");
		driver.findElement(By.id("RESULT_TextField-14")).sendKeys("573201");
		driver.findElement(By.id("RESULT_TextField-15")).sendKeys("245673838883");
		driver.findElement(By.id("RESULT_TextField-16")).sendKeys("adcs.s10@gmail.com");
		driver.findElement(By.id("FSsubmit")).click();
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));	
		WebElement e1l=driver.findElement(By.xpath("//h3[@class=\"success-text\"]"));
		String s1=e1l.getText();
		System.out.println(s1);
		driver.switchTo().defaultContent();

	}

}
