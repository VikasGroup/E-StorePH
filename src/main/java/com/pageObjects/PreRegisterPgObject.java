package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PreRegisterPgObject {
	 WebDriver driver;
	 public PreRegisterPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void selectCountry(String value){
		 Select country = new Select(driver.findElement(By.xpath(".//*[@id='ddlCountry']")));
		  country.selectByVisibleText(value);
	 }
	 public void enterIRID(String value){
		 WebElement irid=driver.findElement(By.xpath(".//*[@id='txtReferrer']"));
		 irid.sendKeys(value);
	 }
	 public void selectLanguage(String value){
		 Select language = new Select(driver.findElement(By.xpath(".//*[@id='ddlLanguage']")));
		 language.selectByIndex(Integer.parseInt(value));
	 }
	 public void clickNextBtn(){
		 WebElement nextBtn=driver.findElement(By.xpath(".//*[@id='cmdOK']"));
		 nextBtn.click();
	 }
}
