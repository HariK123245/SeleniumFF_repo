package Webdriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String source=driver.getPageSource();
		System.out.println(source);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		/*if(url.equals("https://www.amazon.in/"))
		{
			System.out.println("correct page");
		}
		else
		{
			System.out.println("incorrect page");
		}
		*/
		//close()-- to close browser
		driver.close();
		

	}

}
