package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

public class LogOut extends BaseTest {
		
	LoginPage lp;
	SoftAssert sa;
	
	@BeforeClass
	public void initObject() {
		
		lp= new LoginPage(driver);
		 sa=new SoftAssert();
	}
	@Test (priority = 4)
	public void logoutpage()
	{
		//lp.LogOut();
	}
}
