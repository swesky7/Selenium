package com.myautomation.com.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced_Collections {

	public static void main(String[] args) {
		
		/*
		 * Example: Retrieve the titles of all the books present on 'goodreads' home page
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goodreads.com/");
		
		List<WebElement> books = driver.findElements(By.cssSelector("img[src$='.jpg']"));
		
		System.out.println(books.size());//43
		
		for(WebElement book : books) {
			System.out.println(book.getAttribute("alt"));
			System.out.println("---------------------");
		}
		
		driver.close();

	}

}
