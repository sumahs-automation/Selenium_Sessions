package Selenium_Study.Selenium_classes;

import org.openqa.selenium.chrome.ChromeDriver;

public class session1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver =new ChromeDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String titile=driver.getTitle();
		System.out.println(titile);
		if(titile.equals("Facebooklog in or sign up")) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Wrong");
		}

	}

}
