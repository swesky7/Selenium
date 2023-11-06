package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Mouse hover a Menu item to populate Sub-menu
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/automation-demos");
		
		Actions action = new Actions(driver);
		
		WebElement clients = driver.findElement(By.linkText("Platform"));
		
		action.moveToElement(clients).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[contains(text(),'Online Browser Testing')]")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl());

	}

}
