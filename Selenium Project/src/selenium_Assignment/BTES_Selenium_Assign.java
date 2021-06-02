package selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BTES_Selenium_Assign {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.btes.co.in/");
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("About Company"))).build().perform();
		driver.findElement(By.xpath("//a[text()='bebo technologies']")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
