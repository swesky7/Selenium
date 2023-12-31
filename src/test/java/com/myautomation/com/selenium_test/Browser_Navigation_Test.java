package com.myautomation.com.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigation_Test {

	public static void main(String[] args) {
		
		/*
		 * Get Method
		 * Navigate Methods - to()/back()/forward()/refresh()
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle()); //google
		
		driver.navigate().forward();// facebook
		
		System.out.println(driver.getTitle());//fb
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
