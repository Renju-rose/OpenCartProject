package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	@Test(groups= {"Sanity","Master"})
	public void test_login()
	{
		logger.info("***Tc_002_LoginTest***");
		HomePage hp=new HomePage(driver);
		hp.clicklogin();
		
		logger.info("clicked on login link and page is visible");
		
		LoginPage lp=new LoginPage(driver);
		lp.enteremail(rb.getString("email"));
		lp.enterpassword(rb.getString("password"));
		
		lp.clicklogin();
		
		logger.info("clicked on login button");
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.verifylogin();
		
		Assert.assertEquals(targetpage,true);
		
	}


}
