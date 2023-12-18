package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class annotationattribute {
	@Test(priority = 2,invocationCount=5,threadPoolSize=5)
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	
		Reporter.log("Loginsuccessful", true);
	}
	@Test(priority = -1,enabled=false)//or invocationCount=0 instead of enable =false
	public void register()
	{
		Reporter.log("Registered",true);
	}

}
