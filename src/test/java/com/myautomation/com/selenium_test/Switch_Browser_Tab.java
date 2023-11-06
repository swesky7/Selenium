package com.myautomation.com.selenium_test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Browser_Tab {

	public static void main(String[] args) {
		
		/*
		 * Switching the driver to new browser window
		 */

		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		//switch the driver to new tab
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			}
		}
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("abc@gmail.com");
		
		driver.switchTo().window(parentWindow);
	}

}
