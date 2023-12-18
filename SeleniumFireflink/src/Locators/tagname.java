package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		List<WebElement> images=driver.findElements(By.tagName("img"));
		List<WebElement> inputs=driver.findElements(By.tagName("input"));
		System.out.println(links.size());
		System.out.println(images.size());
		System.out.println(inputs.size());
		
		
	}

	}

