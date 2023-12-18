package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class apple {
		@Test
		public void navigateApple()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.apple.com/in/");
			Reporter.log("Launched",true);
		}
		


}
