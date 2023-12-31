package com.myautomation.com.selenium_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alerts {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Handling Simple JavaScript Alerts
		 */

		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.id("s_alert1")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.close();
	}

}
