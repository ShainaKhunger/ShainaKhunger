package Actions_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadAndDownload {
	
	public static String path;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//path= System.getProperty("user.dir")+ "//Browser//chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", path);
		//driver  = new ChromeDriver();
		
		//driver.get("https://www.monsterindia.com/seeker/registration");
		
		
		// File uploading using send keys
		
		//WebElement browser = driver.findElement(By.xpath("//input[@id='file-upload']")); 
		
		// Click on "Choose file" to upload the desired file
		
		//browser.sendKeys("D:\\Shaina\\Resume\\Shaina_Resume.doc");
		//System.out.println("File is uploaded Successfully");
		
		//driver.close();
	}
		@Test(priority=1)
		public void dwnlad()
		{
			path= System.getProperty("user.dir")+ "//Browser//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver  = new ChromeDriver();
			
			driver.get("https://chromedriver.storage.googleapis.com/index.html?path=2.0/");
			
			WebElement download = driver.findElement(By.xpath(".//a[text()='chromedriver_win32.zip']"));
			download.click();
			System.out.println("File is downloaded successfully");
			
			driver.close();
			
		}
		
				


}
