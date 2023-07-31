package testngpPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testng_Day1 {
	// global pre condition
	//pre condition
	// test steps exp vs +actual --- assertion
	//post step
	
	@BeforeSuite
	public void connectWithDB(){
		System.out.println("Connectg to DB");
		
	}
    @BeforeTest
    public void createUser() {
    	System.out.println("CreateUser");
    	
    }
    @BeforeClass
    public void lauunchBrowser() {
    	System.out.println("launch th ebropwser");
    	
    }
	
    @BeforeMethod
    public void logOnApp() {
    	System.out.println("logon to the browser");
    	
    }
    @Test
   public void saerchTest() {
    	System.out.println("Test1");
    	Assert.assertEquals("Google", "Google");  	
    	
    }
    @Test
    public void saerchTest1() {
     	System.out.println("Test1");
     	Assert.assertEquals("1000", "1000");  	
     	
     }
    
    @AfterMethod
    public void logOut() {
    	System.out.println("logout to the browser");
    	
    }
    @AfterClass
    public void closeBrowser() {
    	System.out.println("close the browser");
    	
    }
    @AfterTest
    public void deleteTheUser() {
    	System.out.println("Delete the user from the DB");
    	
    }
    @AfterSuite
    public void disconnectFromDB() {
    	System.out.println("Disconnect from DB");
    	
    }


}
