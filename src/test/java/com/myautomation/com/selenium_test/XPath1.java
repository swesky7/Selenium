package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {

	public static void main(String[] args) {
		
		/*
		 * 1. What is XPath? 
		 * 	 
		 * 	  A query language which is used to find a node or set of nodes in XML/HTML document
		 * 
		 * 2. Relative XPath Using Node Attributes
		 *     
		 *    Syntax: //TagName[@AttributeName="Attribute Value"]
		 *    
		 *    /body/div/span
		 *    
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Sweta");
		
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		

	}
}
