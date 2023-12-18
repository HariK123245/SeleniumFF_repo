package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class axis {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Documents/table.html");
		 String a = driver.findElement(By.xpath("//td[text()=' KGF ']/following-sibling::td")).getText();
		 String b = driver.findElement(By.xpath("//td[text()=' Baahubali ']/preceding-sibling::td")).getText();
		 System.out.println(a);
		 System.out.println(b);
		 
	}

}
