package com.myautomation.com.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		
		/*
		 * Explicit Wait
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.dezlearn.com/explicit-wait-example/");
		driver.findElement(By.name("fname")).sendKeys("De Zinnia");
		driver.findElement(By.name("lname")).sendKeys("Institutes");
		driver.findElement(By.xpath("//div/form/input[3]")).sendKeys("dezinnia@dezlearn.com");
		
		driver.findElement(By.id("u_5_6")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("u_5_7"))).click();
		
		
	}

}
