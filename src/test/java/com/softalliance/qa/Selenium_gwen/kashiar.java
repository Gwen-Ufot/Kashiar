package com.kashiar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class kashiar {
	String Exception="nothing";
	static String name = null;
	static String code = null;
	@Test
	public void kashiar() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://iecr.softalliance.com/");
		
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("09024884308");
		driver.findElement(By.xpath("//input[@aria-label='Pin Code']")).sendKeys("12345");
		driver.findElement(By.xpath("//div[@class='v-btn__content']")).click(); Thread.sleep(2000);
		
		
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);;
		dashboard.setup.click();
		dashboard.unitsOfMeasurement.click();
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Setup')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Units of Measurement')]")).click();
		driver.findElement(By.xpath("//div[@data-app= 'true']/div[4]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]")).click();
		name = getString(5);
		code = getString(2);
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name = 'code']")).sendKeys(code); Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Save')]")).click();
		Thread.sleep(6000);
		while (Exception.equalsIgnoreCase("nothing") ) {

			Thread.sleep(2000);
			List<WebElement> myList=driver.findElements(By.tagName("td"));
			//			System.out.println(myList.size());
			for (WebElement webElement : myList) {
				String tds = webElement.getText();
				if(tds.equalsIgnoreCase(name)||tds.equalsIgnoreCase(code)) 
				{
					Exception = "error dey";
					System.out.println(tds);
				} else {

				}
			}driver.findElement(By.xpath("//i[contains(text(),'chevron_right')]")).click();
		}	
	}
	static String getString(int n)
	{

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index
			= (int)(AlphaNumericString.length()
					* Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString
					.charAt(index));
		}

		return sb.toString();
	}


}
