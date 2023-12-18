package listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerImplementation.class)
public class learnListeners extends BaseClass {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id=\'Email\']")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.xpath("//input[@id=\'Password\']")).sendKeys("abhi@1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Assert.assertEquals(true, false);
		
	}
}
