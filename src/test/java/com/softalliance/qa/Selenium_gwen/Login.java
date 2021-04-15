package com.softalliance.qa.Selenium_gwen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjModel.LogOutPage;
import pageObjModel.LoginPage;

public class Login {  
	@Test
	public void kashiarLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		LogOutPage logger = PageFactory.initElements(driver, LogOutPage.class);
		
		//url
		driver.get("https://iecr.softalliance.com/");
		
		//input phone number
		login.getPhoneNumber().sendKeys("09024884308");
		//pin
		login.getPinCode().sendKeys("12345");
		//click login
		login.clickButton().click();
		Thread.sleep(3000);
		
		logger.Button().click();
		logger.clickLogout().click();
		
		
		
		
		


//driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("09024884308");
//driver.findElement(By.xpath("//input[@aria-label='Pin Code']")).sendKeys("12345");
//driver.findElement(By.xpath("//div[@class='v-btn__content']")).click();
 

	}
}
//FileInputStream file1 =new FileInputStream(System.getProperty("user.dir")+"\\src\\chromedriver.exe");
//Properties prop1=new Properties();
//prop.load(file1);          syste
// System.setProperty("webdriver.chrome.driver", "("user.dir")+\\chromedriver.exe");
//"C:\\Users\\ugwendoline\\Documents\\Selenium Drivers2\\chromedriver.exe"
//File appDir = new File("src");    @@ System.setProperty("webdriver.chrome.driver",("user.dir")+"\\chromedriver.exe");
//File app = new File(appDir, "chromedriver.exe");
//app.getAbsolutePath();