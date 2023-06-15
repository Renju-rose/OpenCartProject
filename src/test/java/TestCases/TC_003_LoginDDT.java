package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import TestBase.BaseClass;
import Utilities.Dataprovider;

public class TC_003_LoginDDT extends BaseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=Dataprovider.class)
	public void test_loginddt(String email,String password,String exp)
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
		
		if(exp.equals("valid"))
		{
			if(targetpage==true)
			{
				macc.Clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}
		}

		if(exp.equals("invalid"))
		{
			if(targetpage==true)
			{
				macc.Clicklogout();
				Assert.fail();
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
	}
	

}
