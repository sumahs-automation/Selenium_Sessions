package testngpPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriortyTest {
	
	@Test
	   public void saerchTest() {
	    	System.out.println("Test1");
	    	Assert.assertEquals("Google", "Google");  	
	    	
	    }
	    @Test(priority = 1)
	    public void saerchTest1() {
	     	System.out.println("Test1");
	     	Assert.assertEquals("1000", "1000");  	
	     	
	     }
	    @Test(priority = 0)
	    public void alphabet() {
	     	System.out.println("Test2");
	     	Assert.assertEquals("10001", "10001");  	
	     	
	     }

}
