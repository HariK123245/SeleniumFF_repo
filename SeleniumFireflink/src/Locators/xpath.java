package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/mobiles?rawQuery=mobiles");
		//driver.findElement(By.xpath("//input[@value= 'Search']")).click();
		//multiple ATTRIBUTES
		//input[@value="Search" and @type="submit"]
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']/..//input[@value='Mobile Accessories']")).click();

	}

}
