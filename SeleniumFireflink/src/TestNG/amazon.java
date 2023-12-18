package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class amazon {
	@Test(groups="smoke")
	public void navigateApple()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Launched",true);
	}
	

}
