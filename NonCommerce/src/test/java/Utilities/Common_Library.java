package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.Before;

public class Common_Library {

	public   WebDriver driver;
	
	
	public   void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver", "tools//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.nopcommerce.com/en");
	}
	
	
	public  void closeApp()
	{	
		driver.quit();
	}
	

}
