package com.myautomation.com.selenium_test;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectbox {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Selecting multiple options from a Multi-Selectbox
		 */
		//System.setProperty("webdriver.chrome.driver", "/Users/mayurdeshmukh/Documents/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		Select oSel = new Select(driver.findElement(By.xpath("//*[@id='cars']")));

				if(oSel.isMultiple()){
					
					//Selecting multiple values by index
					oSel.selectByIndex(1);
					oSel.selectByIndex(2);

					//Or selecting by values
					oSel.selectByValue("volvo");
					oSel.selectByValue("audi");

					//Or selecting by visible text
					oSel.selectByVisibleText("Volvo");
					oSel.selectByVisibleText("Opel");
				}
				
				Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		        
				// Get all the options of the dropdown
				List<WebElement> options = select.getOptions();
				
			
				ListIterator itr = options.listIterator();
				
				for(WebElement x : options) {
					System.out.println(x.getText());
				}
				
				
				//System.out.println(options);
	}
}
