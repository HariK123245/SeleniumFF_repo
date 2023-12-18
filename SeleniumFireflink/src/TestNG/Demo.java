package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void sample()
	{
		Reporter.log("TestNg Class",true);
	

	}
	
	@Test
	public void Test()
	{
		Reporter.log("Test",true);
	}
}
