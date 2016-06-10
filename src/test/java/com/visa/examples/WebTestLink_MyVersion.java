package com.visa.examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTestLink_MyVersion {
	
	String baseUrl = "http://newtours.demoaut.com/";
	WebDriver driver = new FirefoxDriver();
	String underConsTitle = "Under Construction: Mercury Tours";
	
	
	@Test
	public void testLinks(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		String [] linkTexts = new String[linkElements.size()];
		int i =0;
		
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;

		}
		
		for(String t : linkTexts){
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underConsTitle)){
				System.out.println("\"" + t + "\""
                        + " is under construction.");
			} else {
				System.out.println("\"" + t + "\""
                        + " is working.");
			}
			driver.navigate().back();
		}
		
		driver.quit();
		
	}
	
	

}
