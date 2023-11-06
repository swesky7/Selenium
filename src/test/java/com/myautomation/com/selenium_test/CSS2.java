package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS2 {

	public static void main(String[] args) throws Exception {
		
		/*
		 **** Creating CSS Selector Using Attributes ****
		 * 	Syntax: TagName[Att1=Value]
		 * 	In case Att1 is 'id' or 'class' then we can use following symbols:
		 * 		id => # (hash)
		 * 		class => . (dot)
		 * 	Examples: 1. div#u123   2. span.layerParent
		 */
		

		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@class='hmenu-item' and @data-menu-id=2]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Podcasts')]")).click();
		
		Thread.sleep(1000);
		
		String title = driver.findElement(By.xpath(".color-black.font_Sharp_Grotesk_Pan_Euro_Bold_20.desktop.align-center")).getText();
		
		System.out.println(title);
		
		if (title.contains("podcast")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
