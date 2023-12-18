package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static ChromeDriver driver;
	
	@BeforeClass
	public static void browserSetup()
	{
		driver=new ChromeDriver();
		
	}

}
