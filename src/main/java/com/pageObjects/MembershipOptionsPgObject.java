package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MembershipOptionsPgObject {
	 WebDriver driver;
	 public MembershipOptionsPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void clickContinue(){
		 WebElement continuebtn=driver.findElement(By.id("btnQNet2ContinueOptionA"));
		 continuebtn.click();
	 }
}
