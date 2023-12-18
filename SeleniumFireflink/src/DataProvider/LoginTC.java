package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTC {
	@DataProvider
	public String[][] dataSender()
	{
		String[][] data= {{"hari@gmail.com","priya@1234"},{"priya123@gmail.com","1223h"}};
		return data;
		}
	@Test(dataProvider="dataSender")
	public void Login(String[] cred)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id=\'Email\']")).sendKeys(cred[0]);
		driver.findElement(By.xpath("//input[@id=\'Password\']")).sendKeys(cred[1]);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}
	

}
