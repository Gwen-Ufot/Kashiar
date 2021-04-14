package com.softalliance.qa.Selenium_gwen;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {  
	@Test
	public void kashiarLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ugwendoline\\Documents\\Selenium Drivers2\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
driver.get("https://iecr.softalliance.com/");
driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("09024884308");
driver.findElement(By.xpath("//input[@aria-label='Pin Code']")).sendKeys("12345");
driver.findElement(By.xpath("//div[@class='v-btn__content']")).click();

	}

}
