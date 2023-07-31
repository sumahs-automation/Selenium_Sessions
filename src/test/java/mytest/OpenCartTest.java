package mytest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
//	WebDriver driver;

//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.orangehrm.com/");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM");
	}

	@Test(priority = 2)
	public void googleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("orangehrm.com"));

}
}
