package TestNG;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependson {
	@Test(dependsOnMethods="register")
	public void login()//test case
	{
		//test steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	
		Reporter.log("Loginsuccessful", true);
	}
	@Test(priority=-1)
	public void register()
	{	WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Registered",true);
		Assert.fail();
	}
}
		





