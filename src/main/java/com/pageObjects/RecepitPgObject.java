package com.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vselenium.LanDetector;




public class RecepitPgObject {
	WebDriver driver;
	 public RecepitPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public String getPrefix(){
		 WebElement value=driver.findElement(By.id("genTCOID"));
		 String text=value.getText().substring(0, 2);
		 return text;
	 }
	 public String getFee(String currency){
		 if(currency.equals("us")){
		 WebElement value=driver.findElement(By.id("lblTotalAmountPaid"));
		 String text=value.getText().substring(4, 6);
		 return text;
		 }
		 else if(currency.equals("euro")){
			 WebElement value=driver.findElement(By.id("lblEuroTotal"));
			 String text=value.getText().substring(4, 6);
			 return text;
		 }
		 return "";
	 }
	 public String getLogo(){
		 WebElement logo=driver.findElement(By.id("imgLogo"));
		if(logo.isDisplayed()){
			return "true";
		}else{
			return "false";
		}
	 }
	 public String getLanguage() throws IOException{
		 WebElement value=driver.findElement(By.id("lblTermAndConditioneStore01"));
		String text= LanDetector.getLan(value.getText());
		 return text;
	 }
	 public void clickBuyNow(){
		 WebElement clicknow=driver.findElement(By.id("lnkBuyNow1"));
		 clicknow.click();
	 }
	 public void buyNowNew(){
		 WebElement clicknow=driver.findElement(By.id("imgBtnBuyNow_Revamp2"));
		 clicknow.click();
	 }
	 
}
