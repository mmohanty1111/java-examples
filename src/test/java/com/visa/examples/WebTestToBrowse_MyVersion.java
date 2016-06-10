package com.visa.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class WebTestToBrowse_MyVersion {
	WebDriver driver = new FirefoxDriver();
	String baseUrl = "http://newtours.demoaut.com";
	
	@Test
	public void testTitle()
	{
		
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        
        if(actualTitle.contentEquals(expectedTitle))
        {
        	System.out.println("MATCH");
             
        }
        else{
        	System.out.println("NO MATCH");
        }
        
        	
	}
	
	@Test(dependsOnMethods="testTitle")
	public void testElement()
	{
		
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.name("password")).getTagName();
        System.out.println(tagName);
		
        
	}
	
	
	
	@AfterClass
	public void cleanup(){
		driver.close();
        System.exit(0);
	}

}
