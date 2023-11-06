package com.myautomation.com.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Selected {

	public static void main(String[] args) throws Exception {
		
		/*
		 * How to verify if a checkbox or radiobutton is checked/selected?
		 */
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/reference/input.html");
		driver.manage().window().fullscreen();// to maximise the window 
		
		boolean rc1 = driver.findElement(By.id("checkbox-input")).isSelected(); //false
		driver.findElement(By.id("checkbox-input")).click();
		boolean rc2 = driver.findElement(By.id("checkbox-input")).isSelected();//true
		System.out.println(rc1);
		System.out.println(rc2);
		
//		boolean rc3 = driver.findElement(By.xpath("//input[@id='LH_PrefLocRadio']")).isSelected();
//		driver.findElement(By.xpath("//input[@id='LH_PrefLocRadio']")).click();
//		boolean rc4 = driver.findElement(By.xpath("//input[@id='LH_PrefLocRadio']")).isSelected();
//		System.out.println(rc3);
//		System.out.println(rc4);
		
		//driver.quit();

	}

}
