package Selenium_Study.Selenium_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session_09customxpathpart2 {
	
 static 	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//a[text()='Try different image']")).click();//using custom xpath with text annotation
		Thread.sleep(400);
		String titile=driver.getTitle();
	System.out.println(titile);
//		driver.findElement(By.xpath("//a[text()='Amazon Science']")).click();
//		Thread.sleep(500);
//	    driver.navigate().back();
	  //span[text()='Sign in']
	  // driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div/div[2]/div/div/div/a/span")).click();
      signup();
	}
	
	
	//existing customer sp issue is there
	public static void signin() {
		//driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[1]/div/div[2]/div/div/div/a/span")).click();
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("9448256544");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("bsindustries");
		String s1=driver.findElement(By.xpath("//span[@ class=\"a-list-item\"]")).getText();
		if(s1.equalsIgnoreCase("Your password is incorrect")) {
			driver.findElement(By.id("auth-fpp-link-bottom")).click();
		}
		else {
			driver.findElement(By.xpath("//input[@class=\"a-button-input\" and @type='submit']")).click();
		}
	}
	
	public static void signup() {
		
		driver.findElement(By.xpath("//a[text()='Start here.' and  @class=\"sign-in-tooltip-link\" ]")).click();
		driver.findElement(By.id("id=\"ap_customer_name\"")).sendKeys("Ambika");
		driver.findElement(By.id("ap_email")).sendKeys("8310598203");
		
	}

}
