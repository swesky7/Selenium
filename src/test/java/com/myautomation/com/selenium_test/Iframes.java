package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Working with iframes (Inline Frames)
		 * 
		 * 1. Working with iframes using 'index'
		 * 2. Working with iframes using 'id/name'
		 * 3. Working with iframes using 'WebElement'
		 */

		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/iframe-example/");
		Thread.sleep(2000);
		
		//WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframe2']"));
		
		//driver.switchTo().frame(0); //Using Index
		
		//driver.switchTo().frame("iframe1"); //Using ID
		
		//driver.switchTo().frame("demo_frame1"); //Using Name
		
		//driver.switchTo().frame(frame1); //Using WebElement
		
		driver.findElement(By.id("u_5_6")).click();
		
		driver.switchTo().defaultContent();// wil switch the control of driver back to main window
		
	}
}
