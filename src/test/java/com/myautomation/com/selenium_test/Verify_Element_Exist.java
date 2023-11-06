package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Exist {

	public static void main(String[] args) {
		
		/*
		 * How to verify is an element is present on web page?
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/index.html");
		
		try {
			driver.findElement(By.xpath("//h2[contains(text(),'Examples')]"));
			System.out.println("Pass: Element is Present");
		} catch (Exception e) {
			System.out.println("Fail: Element is Not Present");
		}
		
		
		driver.quit();
		
		
		
	}

}
