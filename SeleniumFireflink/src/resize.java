

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().setSize(new Dimension(500,300));

	}

}
