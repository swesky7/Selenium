package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Visible_Enabled {

	public static void main(String[] args) {
		
		/*
		 * How to validate if an element is visible and enabled?
		 */

		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk5MTAyMTgwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		
		boolean isDisplayed = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
		boolean isEnabled = driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
		
		System.out.println(isDisplayed);
		System.out.println(isEnabled);
		
		driver.quit();
		
	}

}
