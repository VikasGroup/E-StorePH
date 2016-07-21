package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChoosePaymentPgObject {
	 WebDriver driver;
	 public ChoosePaymentPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void selectCurrency(String value){
		 WebElement currencyUS=driver.findElement(By.id("rblChooseCurrency_0"));
		 WebElement currencyEuro=driver.findElement(By.id("rblChooseCurrency_1"));
		 if(value.equals("us")){
			 currencyUS.click();
		 }else if(value.equals("euro")){
			 currencyEuro.click();
		 }
	 }
	 public void selectEcard(){
		 WebElement ecard=driver.findElement(By.id("dlPaymentModeButton_ctl01_ibtnPaymentModeButtonItem"));
		 ecard.click();
	 }
}
