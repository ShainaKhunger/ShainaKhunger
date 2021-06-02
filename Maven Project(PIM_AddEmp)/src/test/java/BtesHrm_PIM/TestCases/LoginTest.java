package BtesHrm_PIM.TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import BtesHrm_PIM.Pages.LoginPage;
import BtesHrm_PIM.TestBase.TestBase;

public class LoginTest extends TestBase{
	
	LoginPage LP;
	
	@BeforeSuite
	public void Launch()
	{
		initialization();
		LP= new LoginPage();
		
	}
	
	@Test(priority=1)
	public void Check_Img()
	{
		LP.Check_img();
		LP.Check_Title();
	}
	
	@Test(priority=2)
	public void Invalid_Login()
	{
		LP.Invalid_Login();
	}
	
	@Test(priority=3)
	public void VldUserInvdPass()
	{
		LP.VldUserInvdPass();
	}
	
	@Test(priority=4)
	public void InvdUserVldPass()
	{
		LP.InvdUserVldPass();
	}
	
	@Test(priority=5)
	public void Valid_Login()
	{
		LP.VldLogin();
	}
	
	@AfterSuite
	public void Terminate()
	{
		Termination();
	}

}
