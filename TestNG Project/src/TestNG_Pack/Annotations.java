package TestNG_Pack;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite //1
	public void setup()
	{
		System.out.println("Setup system property for chrome-1");
	}
	
	@BeforeClass //3
	public void launchBrowser()
	{
		System.out.println("Launch Chrome Browser-2");
	}
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("enterURL-3");
		Assert.assertTrue(true);
	}
	
	@BeforeTest //2
	public void login()
	{
		System.out.println("Login Method-4");
	}
	
	@Test(groups= {"Testing"})
	public void googleTitleTest()
	{
		System.out.println("Google Title Test-5");
	}
	
	@Test
	public void logoTest()
	{
		System.out.println("Availability of logo-6");
	}
	
	@Test
	public void searchPanel()
	{
		System.out.println("Availability of Search Panel-7");
	}
	
	@AfterSuite
	public void logout()
	{
		System.out.println("Logout from App-8");
	}
}
