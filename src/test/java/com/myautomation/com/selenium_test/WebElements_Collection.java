package com.myautomation.com.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElements_Collection {

	public static void main(String[] args) {
		
		/*
		 * Example: Get collection of all the links from a web page
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//System.out.println("Test");
		
		driver.get("https://www.goodreads.com/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("a"));
		
		for(WebElement link : links) {
			String text = link.getText();
			if (!text.trim().isEmpty()) {
				System.out.println(link.getText());
				System.out.println(link.getAttribute("class"));
				System.out.println("-------------------");
			}
		}
		
		//driver.close();
		
	}

}
