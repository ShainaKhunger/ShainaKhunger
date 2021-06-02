package BtesHrm_PIM.TestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import BtesHrm_PIM.Pages.HomePage;
import BtesHrm_PIM.Pages.LoginPage;
import BtesHrm_PIM.TestBase.TestBase;

public class HomeTest extends TestBase {
	
	LoginPage LP;
	HomePage HP;
	
	@BeforeSuite
	public void Launch()
	{
		initialization();
		LP= new LoginPage();
		HP= new HomePage();
	}
	
	@Test(priority=0)
	public void Valid_Login()
	{
		LP.VldLogin();
	}
	
	@Test(priority=1)
	public void changePassword()
	{
		HP.Changepswd();
		
	}
	
	@Test(priority=3)
	public void PIM()
	{
		HP.PIM();
		HP.AddEmp();
	}
	
	@Test(priority=4)
	public void BackButton()
	{
		HP.BackButton();
	}
	
	@Test(priority=2)
	public void SearchBy()
	{
		HP.SearchBy();
		HP.SearchFor();
	}
	
	@Test(priority=3)
	public void SearchFor()
	{
		
		HP.SearchFor();
	}
	
	
	@Test(priority=5) 
	public void Logout()
	{
		HP.Logout();
	}
	
 
}
