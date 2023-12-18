import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		//https://demowebshop.tricentis.com/
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("hp@gamil.com");
		lp.getpasswordTextField().sendKeys("14389");
		lp.getLoginbutton().click();

	
		
		
		
		

	}

}
