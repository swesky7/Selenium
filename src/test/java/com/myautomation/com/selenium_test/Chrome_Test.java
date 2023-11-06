package com.myautomation.com.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Test {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();//launches Chrome
		
	
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.15.0");
		
		System.out.println(driver.getTitle());
		
		
	}
}
