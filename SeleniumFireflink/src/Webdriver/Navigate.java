package Webdriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigate {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to(new String("https://www.amazon.in/"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
