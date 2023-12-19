package jenkins;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Instagram {
	@Test
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("amazon.in");
		
	}

}
