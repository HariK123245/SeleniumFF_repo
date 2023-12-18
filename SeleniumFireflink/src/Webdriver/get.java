package Webdriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class get {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().fullscreen();
		/*String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		/*if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("valid title");
		}
		else
		{
			System.out.println("invalid");
		}*/
		
		

}
}
