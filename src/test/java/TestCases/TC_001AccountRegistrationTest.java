package TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import PageObjects.*;
import TestBase.BaseClass;

public class TC_001AccountRegistrationTest extends BaseClass {
	
	
	
	@Test(groups= {"Regression","Master"})
	void test_registrationaccount() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickregister();
		
		logger.info("****TC_001_AccountRegistrationTest has started*****");
		Accountregistrationpage regpage=new Accountregistrationpage(driver);
		
		regpage.setfirstname("sree");
		logger.info("First name is entered");
		
		 regpage.setlastname("lakshmi");
		 logger.info("Last name is entered");
		 
		 regpage.setemail(rb.getString("email"));
		 logger.info("email is entered");
		 
		 regpage.setpassword(rb.getString("password"));
		 logger.info("Password is set");
		 
		 regpage.confirmpassword(rb.getString("password"));
		 logger.info("password is confirmed");
		 
		 regpage.clickRegister();
		 logger.info("Register button clicked");
		 
		 String message=regpage.Getconfirmationmsg();
		 
		 Assert.assertEquals(message,"Your registration completed");
		 logger.info("registered");
		 

		 logger.info("****TC_001AccountRegistrationTest has finished*****");
		 Thread.sleep(3000);
		 
		
	}
	
	

}


