package com.visa.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTestParameterization {
	@Test
	
	@Parameters({"author", "searchKey"})
	
	public void testParameterWithXML(@Optional("abc") String author , String searchKey) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		WebElement searchText = driver.findElement(By.name("q"));
		
		//Searching text in google text box
		searchText.sendKeys(searchKey+"\n");
		
		System.out.println("Welcome ->" + author + "Your search Key is ->" + searchKey);
		System.out.println("The thread will sleep now");
		
		Thread.sleep(3000);
		System.out.println("Value in Google search Box is =" + searchText.getAttribute("value") + "Value given by input =" + searchKey);
		
		//verifying the value in google search box
		Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));
		
	}
	

}
