package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath2 {

	public static void main(String[] args) {
		
		/*
		 * Relative XPath Using Text
		 *     
		 * Syntax: //TagName[text()="Text"]
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		String text =driver.findElement(By.xpath("//div[text()=\'Create a new account\']")).getText();
		
		System.out.println(text);
		
		
		

	}
}
