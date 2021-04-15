package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

	// public static String PAGE_URL="https://iecr.softalliance.com/";
	 
  final WebDriver driver;
	 
	 //constructor
	public LoginPage(WebDriver driver) {
		 this.driver = driver; 
         PageFactory.initElements(driver, this);
         
		}
	
	@FindBy(xpath = "//input[@name='phone_number']")
	private WebElement phoneNumber;
	
	public WebElement getPhoneNumber() {
	return phoneNumber;
	}

	
	@FindBy(xpath = "//input[@aria-label='Pin Code']")
	private WebElement pinCode;
	
	public WebElement getPinCode() {
		return pinCode;
	}
	
	
	@FindBy(xpath = "//div[@class='v-btn__content']")
	private WebElement loginButton;

	public WebElement clickButton() {
		return loginButton;
		
	}
}
