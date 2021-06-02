package BtesHrm_PIM.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BtesHrm_PIM.TestBase.TestBase;


public class HomePage extends TestBase{
	

	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement changepass;
	
	@FindBy(xpath = "//a[text()= 'Logout']")
	WebElement logout;
	
	@FindBy(linkText="ADMIN")
	WebElement Admin;
	
	@FindBy(linkText="PIM")
	WebElement PIM;
	
	@FindBy(xpath="//span[text()= 'Add Employee']")
	WebElement AddEmp;
	
	//@FindBy(xpath = "//input[@class='backbutton' and @value='Back']")
	//@FindBy(xpath = "//input[@class='backbutton']")
	@FindBy(linkText="Back")
	WebElement BackButton;
	
	@FindBy(linkText="Reports")
	WebElement Reports;
	
	
	@FindBy(name = "loc_code")
	WebElement SearchBy;
	
	@FindBy(id = "loc_name")
	WebElement SearchFor;
	
	@FindBy(xpath = "//input[@value='Search']")
	WebElement SearchButton;
	
	@FindBy(xpath = "//input[@value='Reset']")
	WebElement ResetButton;
	
	//@FindBy(xpath="//a[text()= 'devinder  kumar']")
	//WebElement clickname;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);	
	}
	
	public void Changepswd() 
	 { 
		 changepass.click(); 
	 }
	
	
	public void PIM()
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		AddEmp.click();
	}
	
	public void AddEmp()
	{
		AddEmp.click();
	}
	
	 public void BackButton()
	 {
		 BackButton.click();
	 }
	 
	public void SearchBy()
	{
		Select select= new Select(driver.findElement(By.id("loc_code")));
		select.selectByVisibleText("Emp. First Name");		
	}
	
	public void SearchFor()
	{
		SearchFor.sendKeys("Shaina Bajaj");
	}
	
	public void ClickAdmin()
	{
		Admin.click();
	}
	
	
	
	public void Logout()
	{
		logout.click();
	}	
	
	 
	
	
	
	

}

