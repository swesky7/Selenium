package com.myautomation.com.selenium_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Implicit Wait Statement
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dezlearn.com/test-sync-example/");
		
		driver.findElement(By.name("fname")).sendKeys("De Zinnia");
		driver.findElement(By.name("lname")).sendKeys("Institutes");
		driver.findElement(By.xpath("//div/form/input[3]")).sendKeys("dezinnia@dezlearn.com");
		
		driver.findElement(By.id("u_5_6")).click();
		
		driver.findElement(By.linkText("Go to Next Page")).click();
	}
}