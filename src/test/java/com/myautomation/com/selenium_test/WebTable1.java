package com.myautomation.com.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * How to read data from a WebTable?
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'tg')]/tbody/tr"));////table[@class='tg']/tbody/tr
		int c = 0;
		for(WebElement row : rows) {
			c++;
			if(c==1) {
				continue;
			}
			String x = row.findElement(By.xpath("td[1]")).getText();
			String y = row.findElement(By.xpath("td[2]")).getText();
			System.out.println("Name: " + x);
			System.out.println("Email: " + y);
			System.out.println("-----------------");
		}
		
		driver.quit();
	}
}