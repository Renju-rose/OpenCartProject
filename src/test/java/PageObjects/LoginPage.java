package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(id="Email")
	WebElement txtemail;
	
	
	@FindBy(id="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement btnlogin;
	
	
	public void enteremail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void enterpassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
	
	
	

}
