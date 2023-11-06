package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Automating slider element
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		
		//WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//driver.switchTo().frame(1);
		
		WebElement red = driver.findElement(By.xpath("//input[@type='range']"));
//		WebElement green = driver.findElement(By.cssSelector("div#green>span"));
//		WebElement blue = driver.findElement(By.cssSelector("div#blue>span"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(red).moveByOffset(40, 0).release(red).build().perform();
		Thread.sleep(1000);
//		action.clickAndHold(green).moveByOffset(20, 0).release(green).build().perform();
//		Thread.sleep(1000);
//		action.clickAndHold(blue).moveByOffset(10, 0).release(blue).build().perform();

	}

}
