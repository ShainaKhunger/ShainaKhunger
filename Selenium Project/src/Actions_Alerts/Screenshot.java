package Actions_Alerts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
	
		String path;
		
		path = System.getProperty("user.dir")+ "//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://182.76.176.205/hrm/login.php");
		
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Shaina\\Quality Analyst\\ScreenShots\\screenshot.png"));
		FileUtils.copyFile(f, new File("D:\\Shaina\\Quality Analyst\\ScreenShots\\scrnshot123.png"));
		
		
		System.out.println("The Screenshot is captured");
		
		driver.close();
	
	}

}

