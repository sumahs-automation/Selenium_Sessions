package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTesting extends BaseTest {
//	WebDriver driver;

//	@BeforeTest
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	}

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority = 2)
	public void googleURLTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}

	@Test(priority = 3)
	public void googleSearchTest() {
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).submit();
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}

//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}


