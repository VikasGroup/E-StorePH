package com.pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.steps.enrollment_steps;

public class LogInPgObject {
	WebDriver driver;

	public LogInPgObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickRegister() {
		WebElement registerBtn = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_pnRegister']"));
		registerBtn.click();
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();

		set.remove(base);
		// assert set.size() == 1;
		if (set.size() == 0) {

		} else {
			enrollment_steps.driver.switchTo().window((String) set.toArray()[0]);
		}
		System.out.println(driver.getCurrentUrl());
	}
}
