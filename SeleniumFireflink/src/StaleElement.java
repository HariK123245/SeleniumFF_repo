import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("absddsc");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.getpasswordTextField().sendKeys("ash");
	}

}
