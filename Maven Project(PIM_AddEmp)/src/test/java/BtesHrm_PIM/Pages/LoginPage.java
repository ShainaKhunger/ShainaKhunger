package BtesHrm_PIM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BtesHrm_PIM.TestBase.TestBase;

public class LoginPage extends TestBase {

	//PageFactory Annotation for locators
	
	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr/td[1]/img")
	WebElement img;
	
	@FindBy(name="txtUserName")
	WebElement uname;
	
	@FindBy(name="txtPassword")
	WebElement pass;
	
	@FindBy(name="Submit")
	WebElement loginButton;
	
	@FindBy(name="clear")
	WebElement clearButton;

	//Constructor
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);	
	}
	
	//Create method for login
	
	public void Check_img()
	{
		if(img.isDisplayed())
		{
			System.out.println("Logo is Displayed");
		}
		else
		{
			System.out.println("Logo is not Displayed");
		}
	}
	
	public void Check_Title()
	{
		String expected_title, title;
		expected_title = "BTES HRM";
		title= driver.getTitle();
		
		if(expected_title.equals(title))
		{
			System.out.println("Title of the page is correct");
		}
		else
		{
			System.out.println("Title of the page is not correct");
		}
	}
	
	public void Invalid_Login()
	{
		
		uname.sendKeys(prop.getProperty("username1"));
		pass.sendKeys(prop.getProperty("password1"));
		loginButton.click();
		
	}
	
	public void VldUserInvdPass()
	{

		uname.clear();
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password1"));
		loginButton.click();
		
		
	}
	
	public void InvdUserVldPass()
	{
		uname.clear();
		uname.sendKeys(prop.getProperty("username1"));
		pass.sendKeys(prop.getProperty("password"));
		loginButton.click();
		
	}
	
	public void VldLogin()
	{
		uname.clear();
		uname.sendKeys(prop.getProperty("username"));
		pass.clear();
		pass.sendKeys(prop.getProperty("password"));
		loginButton.click();
	}
	
	
	
	//Create method for clear button
	
	public void clearButton()
	{
		clearButton.click();
	}

}
