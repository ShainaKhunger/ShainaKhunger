package TestNG_Pack;


import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import com.beust.jcommander.Parameters;

public class TagsTestNg {
	
	@DataProvider(name="LoginTest")
	
	public Object[][] Log()
	{
		Object[][] data= new Object[4][2];
		
		data[0][0] = "user1";
		data[0][1] = "pass1";
		
		data[1][0] = "user2";
		data[1][1] = "pass2";
		
		data[2][0] = "user3";
		data[2][1] = "pass3";
		
		data[3][0] = "user4";
		data[3][1] = "pass4";
		
		return data;
	}
	
	@Test(dataProvider="LoginTest")
	public void test(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test
	//@Parameters({"username","password"})
	public void test1(String username, Integer password)
	{
		System.out.println(username);
		System.out.println(password);
	}

}
