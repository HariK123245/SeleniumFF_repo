package WebElements;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/mobiles?rawQuery=mobiles");
		File temp=driver.findElement(By.xpath("//a[@class=\'myntraweb-sprite desktop-logo sprites-headerLogo \']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("/.screenshot/image1.png");
		FileHandler.copy(temp, dest);
		
	
	}

}
