package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Vs_Quit {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Close Vs Quit
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		
		driver.findElement(By.id("u_7_8")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		//driver.quit();

	}
}