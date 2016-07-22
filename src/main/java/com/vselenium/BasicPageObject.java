package com.vselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicPageObject {
		WebDriver driver;
		
		public BasicPageObject(WebDriver driver) {
			this.driver = driver;
		}
		
		public WebElement createElement(By ele) {
			WebElement element= null;
			
			element = driver.findElement(ele);
			return element;
		}

	}
