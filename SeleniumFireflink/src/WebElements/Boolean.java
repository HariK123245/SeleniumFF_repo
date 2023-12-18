package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(10000);
		WebElement Button= driver.findElement(By.xpath("//select[@name=\'addresstype\']"));
		System.out.println(Button.isDisplayed());
		System.out.println(Button.isEnabled());
		System.out.println(Button.isSelected());
		Button.click();
		System.out.println(Button.isSelected());
		
		
		
	}

}
