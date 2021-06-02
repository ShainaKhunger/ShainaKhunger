package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_XPATH {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("User");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//a[contains (@href, 'recover')]")).click();
		
		
		if(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed())
		{
			System.out.println("Facebook logo is Displayed");
		}
		else
		{
			System.out.println("Facebook logo is not Displayed");
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
