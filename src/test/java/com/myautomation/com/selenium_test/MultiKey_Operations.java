package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiKey_Operations {

	public static void main(String[] args) {
		
		/*
		 * Automating Multi-key operations Click and hold keys and do operations
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().fullscreen();
		
		driver.switchTo().frame(0);
		
		WebElement first = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(1)"));
		WebElement third = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(3)"));
		WebElement fifth = driver.findElement(By.cssSelector("ol#selectable>li:nth-child(5)"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.COMMAND).perform();
		action.click(first);
		action.click(third);
		action.click(fifth);
		action.keyUp(Keys.COMMAND).perform();//release key
		
	}
}
