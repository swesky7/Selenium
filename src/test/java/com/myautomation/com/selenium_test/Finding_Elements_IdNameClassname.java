package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_Elements_IdNameClassname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.id("email")).sendKeys("sweta@gmail.com");
		 * 
		 * //driver.findElement(By.id("email")).sendKeys("Sweta");
		 * driver.findElement(By.name("pass")).sendKeys("Abcd");
		 * //driver.findElement(By.id("u_0_5_rt")).click();
		 * driver.findElement(By.linkText("Forgotten password?")).click();
		 */
			
			  driver.get("https://www.rediff.com/");
			  driver.findElement(By.className("txt_srchquery")).sendKeys("Reliance");
			  Thread.sleep(3000);// my execution will pause for 5 secs.
			  driver.close();
			 



	}

}
