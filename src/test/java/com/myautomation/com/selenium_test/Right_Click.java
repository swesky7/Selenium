package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Right Click on a WebElement
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement btn = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(btn).perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		
		action.sendKeys(Keys.RETURN).perform();
		
	}

}
