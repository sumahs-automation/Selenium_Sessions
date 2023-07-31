package Selenium_Study.Selenium_classes;

public class session2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		utility_class u= new utility_class();
		u.launchbrowser("chrome");
		//u.geturl();
		String name=u.getname();
		System.out.println(name);
		u.quit();
		u.close();

	}

}
