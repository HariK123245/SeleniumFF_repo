package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String classvALUE=driver.findElement(By.name("q")).getAttribute("class");
		System.out.println(classvALUE);

	}

}
