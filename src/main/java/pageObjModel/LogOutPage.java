package pageObjModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	final WebDriver driver;
	 //constructor
		public LogOutPage(WebDriver driver) {
			 this.driver = driver; 
	         PageFactory.initElements(driver, this);
	         
			}


		@FindBy(xpath = "//i[contains(text(),'more_vert')]")
		private WebElement button;
		
		public WebElement Button() {
			return button;
			
		}
		
		@FindBy(xpath = "//div[contains(text(),'Log out')]")
		private WebElement logOut;
		
		public WebElement clickLogout() {
			return logOut;
			
		}
	
}
