package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Synchronization {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 1. What is test synchronization?
		 * 2. Why is it required?
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/test-sync-example/");
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.name("fname")).sendKeys("De Zinnia");
		driver.findElement(By.name("lname")).sendKeys("Institutes");
		driver.findElement(By.xpath("//div/form/input[3]")).sendKeys("dezinnia@dezlearn.com");
		
		driver.findElement(By.id("u_5_6")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Go to Next Page")).click();
		
	}
}
