package Actions_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	public static void main(String[] args) throws InterruptedException {
		
		String path;
		
		path= System.getProperty("user.dir")+ "//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().deleteAllCookies();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		
		//Actions Class
		
		Actions act= new Actions(driver);
		
		// Drag and Drop-- Way 1
		
		
		  WebElement from = driver.findElement(By.id("draggable")); 
		  WebElement to = driver.findElement(By.id("droppable")); 
		  act.dragAndDrop(from, to).build().perform();
		 
		
		// Drag and Drop-- Way 2
		  
		/*act.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();*/
		
		
		Thread.sleep(3000);
		//driver.switchTo().defaultContent();
		driver.close();

	}

}
