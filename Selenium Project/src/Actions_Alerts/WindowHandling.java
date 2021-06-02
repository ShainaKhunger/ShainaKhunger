package Actions_Alerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static WebDriver driver;
	public static String path;
	
	public static void main(String[] args) throws InterruptedException {
		
		path= System.getProperty("user.dir")+ "//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();
		
		// 1.Extracting Window Handles
		
		Set<String> ids= driver.getWindowHandles();
		
		//2. Defining Iterator for this set of Window Handles
		
		Iterator<String> it = ids.iterator();
		String parent_id = it.next();
		String child_id = it.next();
		
		//3. Switching to the respective window handle using WindowHandle
		
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parent_id);
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
