package com.myautomation.com.selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Select date from a date picker
		 */
		String expMonth = "August 2019";
		String expDate = "15";
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/reference/input.html");
		
		driver.findElement(By.xpath("//input[@id='date-input']")).click();
		String currMonth = driver.findElement(By.cssSelector("th.cal-heading-month")).getText();
		int c = 0;
		while(!currMonth.contains(expMonth)) {
			driver.findElement(By.cssSelector("button.cal-btn-next")).click();
			c++;
			Thread.sleep(1000);
			currMonth = driver.findElement(By.cssSelector("th.cal-heading-month")).getText();
			if (c == 12) {
				break;
			}
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("table.cal-month td"));
		
		for(WebElement date : dates) {
			String x = date.getText().trim();
			if(x.equals(expDate)) {
				date.click();
				break;
			}
		}

	}

}
