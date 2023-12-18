package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		//hard assert - Assert.assertEquals("driver.getTitle()", "Demo Web Shop","User login failed");
		//in hard assert no need to call assertAll()
		driver.findElement(By.xpath("//input[@id=\'Email\']")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.xpath("//input[@id=\'Password\']")).sendKeys("abh@1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals("driver.getTitle()", "Demo Web Shop","User login failed");
		Reporter.log("User logged in ",true);
		softassert.assertAll();//if assertAll() is not written then test case will never fail in soft assert
		
	}

}
