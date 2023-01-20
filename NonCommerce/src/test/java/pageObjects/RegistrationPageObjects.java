package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RegistrationPageObjects {
	
	
	public WebDriver driver;
	
	public RegistrationPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy( how= How.XPATH, using = "//span[text()[normalize-space()='My account']]")
	WebElement profile;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Register']")
	WebElement registerbutton;
	
	@FindBy (how = How.XPATH, using = "//h1[text()='Register']")
	WebElement Regpage;
	
	@FindBy (how = How.ID, using = "FirstName")
	WebElement firstname;
	
	@FindBy (how = How.ID, using = "LastName")
	WebElement lastname;
	
	@FindBy (how = How.ID, using = "Email") 
	WebElement Email;
	
	public void clickOnProfile()
	{
		profile.click();
	}
	public void clickRegistrationbutton()
	{
		registerbutton.click();
	}	
	public boolean RegPage()
	{
		if(Regpage.isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}	
	}
	public void firstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	public void lastname (String lname) 
	{
		lastname.sendKeys(lname);
	}
	public void email(String email)
	{
		Email.sendKeys(email);
	}
	
	
}


		
	
	