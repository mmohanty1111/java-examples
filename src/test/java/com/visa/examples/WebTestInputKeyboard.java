package com.visa.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTestInputKeyboard {
	
	
	String baseUrl = "http://newtours.demoaut.com/";
	WebDriver driver = new FirefoxDriver();
	@Test
	public void keyBoardInput(){
		driver.get(baseUrl);
		WebElement link_home = driver.findElement(By.linkText("Home"));
		WebElement td_home = driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
		
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_home).build();
		
		String bgColor = td_home.getCssValue("background-color");
		System.out.println("Before Hover: " + bgColor);
		
		mouseOverHome.perform();
		bgColor = td_home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		
		driver.quit();
		 
	}

}
