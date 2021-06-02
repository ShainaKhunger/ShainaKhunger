package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Btes_Hrm {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://182.76.176.205/hrm/login.php");
		
		
		driver.findElement(By.cssSelector("input[name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		driver.findElement(By.xpath("//a[@target='rightMenu'][@class='l2_link empadd']")).click();
		
		//driver.findElement(By.cssSelector("input[id='txtEmpLastName']")).sendKeys("Khunger");
		
		//driver.findElement(By.cssSelector("input[name='txtEmpFirstName']")).sendKeys("Shaina");
		
		driver.findElement(By.id("btnEdit")).click();
	}

}
