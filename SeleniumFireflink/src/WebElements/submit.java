package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement Username= driver.findElement(By.xpath("//input[@id='username']"));
		Username.clear();
		Username.sendKeys("haripriya");
		driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
	
	

	}

}
