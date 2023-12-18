package Webdriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		
		for(String id:allWindowIds)
		{
			driver.switchTo().window(id);
			driver.close();
			/*Thread.sleep(1000);
			
			if(driver.getCurrentUrl().contains("Flipkart"))
			{
				break;
			}*/
		}
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
	}
		
		

		
	}

