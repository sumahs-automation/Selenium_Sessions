package testngpPackage;


import org.testng.annotations.Test;

public class ExpectedException {
	String name;
	
	   @Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	    public void saerchTest1() {
	     	System.out.println("Test1");
	     	//int i=9/0;
	     	ExpectedException ob=new ExpectedException();
	     	ob= null;
	     	ob.name="Naveen";
	     	int i=9/0;
	    } 	
	     	

}
