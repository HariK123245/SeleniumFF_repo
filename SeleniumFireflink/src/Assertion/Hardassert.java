package Assertion;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hardassert {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id=\'Email\']")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.xpath("//input[@id=\'Password\']")).sendKeys("abhi@1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","user failed to login");
		Reporter.log("user logged in",true);
	}
}
