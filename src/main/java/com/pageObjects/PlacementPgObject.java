package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PlacementPgObject {
	 WebDriver driver;
	 public PlacementPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void enterIRID(String value){
		 WebElement irid=driver.findElement(By.xpath(".//*[@id='txtTCOID']"));
		 irid.sendKeys(value);
	 }
	 public void clickVerifyBtn(){
		 WebElement verifybtn=driver.findElement(By.xpath(".//*[@id='cmdValidate']"));
		 verifybtn.click();
	 }
	 public void selectPlacement(String value){
		 Select placement = new Select(driver.findElement(By.xpath(".//*[@id='ddlTCExt']")));
		 placement.selectByIndex(Integer.parseInt(value));
	 }
	 public void prefferPlacement(String value){
		 WebElement right=driver.findElement(By.xpath(".//*[@id='radPrefPosition_0']"));
		 WebElement left=driver.findElement(By.xpath(".//*[@id='radPrefPosition_1']"));
		 if(value.equals("right")){
			 right.click();
		 }else if(value.equals("left")){
			 left.click();			 
		 }
	 }
	 public void clickconfBtn(){
		 WebElement confirmbtn=driver.findElement(By.xpath(".//*[@id='cmdOK']"));
		 confirmbtn.click();
	 }
}
