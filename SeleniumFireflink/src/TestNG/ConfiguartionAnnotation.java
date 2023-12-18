package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ConfiguartionAnnotation {
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("@beforesuite",true);
	}
	
	
	@Test
	public void demoTest()
	{
		Reporter.log("Demo execution");
	}
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("@aftersuite",true);
	}

}
