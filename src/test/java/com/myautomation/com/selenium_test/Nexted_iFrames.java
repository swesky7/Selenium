package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nexted_iFrames {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Working with Nested iFrames
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/nested-iframes/");
		Thread.sleep(2000);
		
		driver.switchTo().frame("demo_parent_iframe");
		
		driver.switchTo().frame("demo_frame1");
		
		driver.findElement(By.id("u_5_6")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("u_5_5")).click();
		
		driver.switchTo().defaultContent();
		
		
		
	}
}
