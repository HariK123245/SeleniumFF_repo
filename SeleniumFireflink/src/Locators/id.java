package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/user-signin");
		Thread.sleep(10000);
		driver.findElement(By.id("Email")).sendKeys("haripriya.k@testyantra.com");
		Thread.sleep(10000);
		driver.findElement(By.name("Password")).sendKeys("khasj");

	}

}
