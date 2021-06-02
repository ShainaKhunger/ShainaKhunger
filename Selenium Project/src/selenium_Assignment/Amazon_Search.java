package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_Search {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Marshall Speakers");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//img[@alt='Marshall Woburn II Wireless Bluetooth Speaker (Black)']")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		 
		 
		Thread.sleep(6000);
		driver.close();
		
		//driver.findElement(By.xpath("//*[@id='nav-flyout-searchAjax']/following::div[@class='s-heavy']")).click();
		
		
       
		
		
		
	}

}
