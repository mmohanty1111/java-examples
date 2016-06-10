package com.visa.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebCrossBrowserTesting {
	
	WebDriver driver;
	/**
	 * This function will execute before each test tag in testng.xml
	 * @param browser
	 * @throws exception
	 */
	

	@BeforeTest
	
	@Parameters("browser")
	
	public void setup(String browser) throws Exception
	{
		
		
		//Check if the parameter passed from TestNG is 'firefox'
		
		if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
			
			driver = new FirefoxDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("chrome")){
			
			//set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("ie")){
			//set path to IEdriver.exe You may need to download it from
			 
		     // 32 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_Win32_2.42.0.zip
		 
		     // 64 bits http://selenium-release.storage.googleapis.com/2.42/IEDriverServer_x64_2.42.0.zip
		 
		            System.setProperty("webdriver.ie.driver","C:\\IEdriver.exe");
		 
		            //create chrome instance
		 
		            driver = new InternetExplorerDriver();
		}
		
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	
	public void testParameterWithXML() throws InterruptedException{
		driver.get("http://demo.guru99.com/V4/");
		
		//find User name
		WebElement username = driver.findElement(By.name("uid"));
		username.sendKeys("guru99");
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("guru99");
	}
}
