package Selenium_Study.Selenium_classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup_javascript {
	static WebDriver driver;
	
	/// 3 types of Alert
	//1.Alert
	//2.prompt
	//3.confirm

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		Alert a=driver.switchTo().alert();
		String textval=a.getText();
		Thread.sleep(2900);
		a.accept();
		System.out.println(textval);
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert a1=driver.switchTo().alert();
		String textval1=a1.getText();
		Thread.sleep(2900);
		a1.dismiss();
		System.out.println(textval1);
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert a2=driver.switchTo().alert();
		String textval2=a2.getText();
		a2.sendKeys("alertautomation");
		Thread.sleep(2900);
		a2.accept();
		System.out.println(textval2);
		
		WebElement ele=driver.findElement(By.xpath("//p[@id=\"result\"]"));
		String val=ele.getText();
		System.out.println(val);
		String[] va2=val.split(":");
		System.out.println(va2[1].trim());
		

	}

}
