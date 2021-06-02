package Actions_Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlert {
	
	public static WebDriver driver;
	public static String path;

	public static void main(String[] args) throws InterruptedException {
		
		
		path= System.getProperty("user.dir") + "//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		
		  Alert alt = driver.switchTo().alert(); 
		  String str = alt.getText();
		  System.out.println(str); 
		  alt.accept();
		 		
		/*
		* String st= driver.switchTo().alert().getText(); System.out.println(st);
		* driver.switchTo().alert().accept();
		*/
		
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
