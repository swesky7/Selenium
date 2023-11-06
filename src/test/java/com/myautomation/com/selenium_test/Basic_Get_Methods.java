package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Get_Methods {

	public static void main(String[] args) {
		
		/*
		 * Basic Get Methods
		 * 1. Get Attribute
		 * 2. Get Text
		 * 3. Get Tag Name
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk5MTAyMTgwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		
		String att1 = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("autocomplete");
		String att2 = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("class");
		String att3 = driver.findElement(By.xpath("//input[@id='email']")).getTagName();
		String text = driver.findElement(By.xpath("//button[@id='loginbutton']")).getText();
		
		System.out.println(att1);
		System.out.println(att2);
		System.out.println(att3);
		System.out.println(text);
		
		driver.quit();
		
	}

}
