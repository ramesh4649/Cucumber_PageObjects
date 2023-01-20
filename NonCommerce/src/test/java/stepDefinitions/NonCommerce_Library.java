package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.RegistrationPageObjects;


public class NonCommerce_Library  {

	WebDriver driver;

	RegistrationPageObjects regp;



	@Given("^Open Browser and Enter Application URL$")
	public void open_Browser_and_Enter_Application_URL() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "tools//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/en");

	}

	@Given("^Click on Profile and Select Registration Option$")
	public void click_on_Profile_and_Select_Registration_Option() throws Throwable {
		regp = new RegistrationPageObjects(driver);
		regp.clickOnProfile();
		regp.clickRegistrationbutton();

	}

	@When("^Application Redirect to the Your Personal Details page$")
	public void application_Redirect_to_the_Your_Personal_Details_page() throws Throwable {
		
		
		Assert.assertTrue(regp.RegPage(), "confirmation check point for Personal page details");
		

	}

	@When("^Enter all Mandatory details and Click Register Button$")
	public void enter_all_Mandatory_details_and_Click_Register_Button() throws Throwable {
		
		regp.firstname("ramesh");
		regp.lastname("batikiri");
		
		
	}

	@When("^Verify the Email verification text to Activate the Account$")
	public void verify_the_Email_verification_text_to_Activate_the_Account() throws Throwable {


	}

}
