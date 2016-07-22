package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EcardPaymentPgObject {
	WebDriver driver;
	 public EcardPaymentPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void enterEcardDetails(String no,String PIN,String country){
		 if(country.equals("Tunisia")){
			 WebElement ecardno=driver.findElement(By.id("MainContent_eCardCtrl1_dgGrid_txtECardNo_0"));
			 WebElement pin=driver.findElement(By.id("MainContent_eCardCtrl1_dgGrid_txtECardPin_0"));
			 
			 ecardno.sendKeys(no);
			 pin.sendKeys(PIN);
		 }else{
		 WebElement ecardno=driver.findElement(By.id("dgGrid_ctl02_txtECardNo"));
		 WebElement pin=driver.findElement(By.id("dgGrid_ctl02_txtECardPin"));
		 
		 ecardno.sendKeys(no);
		 pin.sendKeys(PIN);
		 }
	 }
	 public void clickValidateBtn(String country){
		 if(country.equals("Tunisia")){
			 WebElement validatebtn=driver.findElement(By.id("MainContent_eCardCtrl1_dgGrid_cmdValidate_0"));
			 validatebtn.click();
		 }else{
			 WebElement validatebtn=driver.findElement(By.id("dgGrid_ctl02_cmdValidate"));
			 validatebtn.click();
		 }
	 }
	 public void clickConfirmBtn(String country){
		 if(country.equals("Tunisia")){
			 WebElement confirmbtn=driver.findElement(By.id("MainContent_eCardCtrl1_cmdOK"));
			 confirmbtn.click();
		 }else{
		 WebElement confirmbtn=driver.findElement(By.id("cmdOK"));
		 confirmbtn.click();
		 }
	 }
}
