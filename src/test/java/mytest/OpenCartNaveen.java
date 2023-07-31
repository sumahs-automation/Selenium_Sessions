package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartNaveen extends BaseTest{
	@Test
	public void loginTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.xpath("//span[text()=\"My Account\"]")).click();
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sumasautomation@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
		
	}
	
	@Test
	
	public void searchTest() {
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("mackbook");
		driver.findElement(By.xpath("//span/button[@type=\"button\"]")).click();
	}
	
	@Test
	
	public void validateSearchTest() {
		String val=driver.findElement(By.xpath("//div/h1")).getText();
		Assert.assertEquals(val,"Search - mackbook");
	}

}
