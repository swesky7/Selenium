package com.myautomation.com.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visible_And_Invisible_Elements {

	public static void main(String[] args) {
		
		/*
		 * Example: Retrieve the titles of all the books 'VISIBLE' on 'goodreads' home page
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goodreads.com/");
		
		List<WebElement> books = driver.findElements(By.cssSelector("img[src$='.jpg']"));
		
		System.out.println(books.size());
		
		for(WebElement book : books) {
			if (book.isDisplayed()) {
				System.out.println(book.isDisplayed());
				System.out.println(book.getAttribute("alt"));
				System.out.println("---------------------");
			}
		}
		
		driver.close();
	}
}
