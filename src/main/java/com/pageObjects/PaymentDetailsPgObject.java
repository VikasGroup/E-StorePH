package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class PaymentDetailsPgObject {
	 static WebDriver driver;
	 public Base base;
	 public PaymentDetailsPgObject( WebDriver driver){
		 PaymentDetailsPgObject.driver=driver;	 
}
	 public static void selectPayMethod(String value){
			Select paymethod = new Select(driver.findElement(By.xpath(".//*[@id='MainContent_cboPaymentType']")));
			paymethod.selectByIndex(Integer.parseInt(value));
		} 
	 public static void selectCurrency(String value){
			Select currency = new Select(driver.findElement(By.xpath(".//*[@id='MainContent_cboddlCurrency']")));
			currency.selectByIndex(Integer.parseInt(value));
		} 
	 public static void enterEcardNo(String value){
			WebElement ecardNo = driver.findElement(By.xpath(".//*[@id='MainContent_eCardCtrl1_dgGrid_txtECardNo_0']"));
			ecardNo.sendKeys(value);
		}
	 public static void enterPin(String value){
			WebElement pin = driver.findElement(By.xpath(".//*[@id='MainContent_eCardCtrl1_dgGrid_txtECardPin_0']"));
			pin.sendKeys(value);
		}
		public static void clickValidate(){
			WebElement validate = driver.findElement(By.xpath(".//*[@id='MainContent_eCardCtrl1_dgGrid_cmdValidate_0']"));
			validate.click();
		}
		public static void clickConfirm(){
			WebElement confirm = driver.findElement(By.xpath(".//*[@id='MainContent_eCardCtrl1_cmdOK']"));
			confirm.click();
		}
}
