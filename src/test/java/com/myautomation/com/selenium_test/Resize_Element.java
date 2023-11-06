package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_Element {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Automating resizable element
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/resizable");
		
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']/span"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.clickAndHold(source).moveByOffset(300, 200).build().perform();

	}

}
