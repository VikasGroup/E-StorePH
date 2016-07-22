package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserAgreementPgObject {
	 WebDriver driver;
	 public UserAgreementPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void selectAgreement(){
		 WebElement chk = driver.findElement(By.id("cbIAgree"));
		 chk.click();
		 WebElement btn = driver.findElement(By.id("btnContinue"));
		 btn.click();
	 }
}
