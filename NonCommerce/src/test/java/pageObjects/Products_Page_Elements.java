package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Products_Page_Elements {
	
	
	WebDriver driver;
	
	public Products_Page_Elements(WebDriver driver){
		
		this.driver= driver;
		
	}
	
	@FindBy (how = How.LINK_TEXT, using = "Product")
	WebElement products;
	
	
	public void clickOnProducts(){
		
		products.click();
	}
	
}
