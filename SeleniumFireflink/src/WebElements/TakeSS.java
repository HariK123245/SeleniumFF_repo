package WebElements;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		TakeScreenshot ts=(TakeScreenshot)driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\User\\Documents\\screenshot.png");
		FileHandler.copy(temp, dest);
		
		
		
		
		

	}

	private File getScreenshotAs(OutputType<File> file) {
		// TODO Auto-generated method stub
		return null;
	}

}
