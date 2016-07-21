package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EcardPaymentPgObject {
	WebDriver driver;
	 public EcardPaymentPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void enterEcardDetails(String no,String PIN){
		 WebElement ecardno=driver.findElement(By.id("dgGrid_ctl02_txtECardNo"));
		 WebElement pin=driver.findElement(By.id("dgGrid_ctl02_txtECardPin"));
		 
		 ecardno.sendKeys(no);
		 pin.sendKeys(PIN);
	 }
	 public void clickValidateBtn(){
		 WebElement validatebtn=driver.findElement(By.id("dgGrid_ctl02_cmdValidate"));
		 validatebtn.click();
	 }
	 public void clickConfirmBtn(){
		 WebElement confirmbtn=driver.findElement(By.id("cmdOK"));
		 confirmbtn.click();
	 }
}
