package TestNG_Pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Grouping {

	@BeforeSuite
	public void suite()
	{
		System.out.println("Should be executed first");
	}
	
	@Test
	public void gamma()
	{
		System.out.println("Gamma");
	}
	
	@Test(groups= {"Testing"})
	public void alpha()
	{
		System.out.println("Alpha");
	}
	@Test
	public void beta()
	{
		System.out.println("Beta");
	}
	
	@AfterSuite
	public void suite1()
	{
		System.out.println("Should be executed last");
	}
	
}
