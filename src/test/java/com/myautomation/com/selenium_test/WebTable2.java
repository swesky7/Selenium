package com.myautomation.com.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		
		/*
		 * Working with objects inside WebTable Cells
		 */
		
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");

		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'tg')]/tbody/tr"));
		int c = 0;
		for(WebElement row : rows) {
			c++;
			if(c==1) {
				continue;
			}
			String name = row.findElement(By.xpath("td[1]")).getText();
			if(name.equals("John White")) {
				row.findElement(By.xpath("td[4]/input")).click();
				List<WebElement> options = row.findElements(By.xpath("td[5]/select/option"));
				for(WebElement opt : options) {
					if(opt.getText().contains("Sports")) {
						opt.click();
						break;
					}
				}
				row.findElement(By.xpath("td[6]/input")).sendKeys("Test Comment");
				break;
			}
			
		}
		
		driver.findElement(By.cssSelector("button#demo")).click();
	}

}
