package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Legal_disclaimerPgObject {
	 WebDriver driver;
	 public Legal_disclaimerPgObject( WebDriver driver){
		 this.driver=driver;
	 }
	 public void checkAccept(){
		 WebElement check=driver.findElement(By.xpath(".//*[@id='chkAccept']"));
		 check.click();
	 }
	 public void clickConfirm(){
		 WebElement confirm=driver.findElement(By.xpath(".//*[@id='cmdOK']"));
		 confirm.click();	 
	 }
	 
}
