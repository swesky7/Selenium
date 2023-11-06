package com.myautomation.com.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Test {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "/Users/mayurdeshmukh/Documents/Drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();//Launching FireFox
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());

	}

}
