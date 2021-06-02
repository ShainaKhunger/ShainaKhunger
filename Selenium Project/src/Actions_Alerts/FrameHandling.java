package Actions_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static WebDriver driver;
	public static String path;

	public static void main(String[] args) throws InterruptedException {
		
		path = System.getProperty("user.dir") + "//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		// iframe by index value and by id
		
		/*
		 * driver.switchTo().frame(0);
		 * System.out.println(driver.findElement(By.id("tinymce")).getText());
		 */
		
		
		// iframe by WebElement (both are correct)
		
		//WebElement frame1= driver.findElement(By.xpath("//iframe[@class='mce-content-body']"));
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe")); // when iframe is single on the page
		driver.switchTo().frame(frame1);
		System.out.println(driver.findElement(By.id("tinymce")).getText());
		
		
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
