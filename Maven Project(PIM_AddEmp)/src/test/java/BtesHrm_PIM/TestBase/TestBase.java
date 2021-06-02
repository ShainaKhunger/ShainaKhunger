package BtesHrm_PIM.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try {
			
		FileInputStream inp = new FileInputStream("C:\\Users\\SHAINA BAJAJ\\eclipse-workspace\\PIM_AddEmp\\src\\test\\java\\BtesHrm_PIM\\Configuration\\config.properties");
		prop= new Properties();
		prop.load(inp);
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initialization()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	public void Termination()
	{
		driver.close();
	}
	
	

}
