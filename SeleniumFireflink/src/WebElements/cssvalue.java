package WebElements;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssvalue {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement Username= driver.findElement(By.xpath("//input[@id='username']"));
		Username.clear();
		Username.sendKeys("haripriya");
		driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
		WebElement error =driver.findElement(By.xpath("//span[@id='validationMessage']"));
		System.out.println(error.getCssValue("color"));
		System.out.println(error.getTagName());
		System.out.println(error.getSize());//to get size of element
		
		
		
		
		
		
	

	}

}
