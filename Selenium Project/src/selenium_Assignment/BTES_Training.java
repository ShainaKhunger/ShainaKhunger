package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BTES_Training {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.btes.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Training Courses"))).build().perform();
		driver.findElement(By.xpath("//a[@rel='software-testing-course']")).click();
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
