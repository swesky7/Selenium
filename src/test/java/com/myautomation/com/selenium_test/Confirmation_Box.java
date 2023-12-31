package com.myautomation.com.selenium_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Box {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Handling JavaScript Confirmation Box
		 */

		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.id("c_alert2")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		driver.close();
	}

}
