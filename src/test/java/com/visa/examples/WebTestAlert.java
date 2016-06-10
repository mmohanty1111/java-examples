package com.visa.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebTestAlert {
	WebDriver driver = new FirefoxDriver();
	WebDriver driver1 = new FirefoxDriver();

	@Test
	public void testAlert() {
		String alertMessage = "";

		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		System.out.println(alertMessage);
		driver.close();
	}

	@Test(dependsOnMethods = "testAlert")
	public void testDropdown() {

		driver1.get("http://jsbin.com/osebed/2");
		
		//Select fruits = new Select(driver1.findElement(By.id("fruits")));
		//Select fruits = (Select) driver1.findElement(By.xpath("//select[@id='fruits']"));
		WebElement banana = driver1.findElement(By.xpath("//select[@id='fruits']/option[1]"));
		banana.click();
		//fruits.selectByVisibleText("Banana");
		// fruits.selectByIndex(1);
		System.out.println(banana.getText());
		driver1.close();

	}

}
