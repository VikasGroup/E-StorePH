package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MoroccoEnvComPgObj {
	static WebDriver driver;
	 
	 public MoroccoEnvComPgObj(WebDriver driver){
		 MoroccoEnvComPgObj.driver = driver; 
	 }
	 public void selectCompany(String value){
		 Select companybtn = new Select(driver.findElement(By.xpath(".//*[@id='txtCompanyName']")));
		 companybtn.selectByIndex(Integer.parseInt(value));
	 }		 
	 public void enterComName(String value){
		 WebElement comName=driver.findElement(By.xpath(".//*[@id='txtCompany']"));
		 comName.sendKeys(value);
	 }
	 public void enterCnontactPerson(String value){
		 WebElement cnontactPerson=driver.findElement(By.xpath(".//*[@id='txtContactPerson']"));
		 cnontactPerson.sendKeys(value);
	 }	 
	 public void selectPosition(String value){
		 Select position= new Select(driver.findElement(By.xpath(".//*[@id='ddlPosition']")));
		 position.selectByIndex(Integer.parseInt(value));
	 }
	 public  void enterArabname(String value){
		  WebElement aName = driver.findElement(By.xpath(".//*[@id='tbFullName']"));
		  aName.sendKeys(value);
	 }
	 public  void enterEmail(String value){
		  WebElement emailAdd = driver.findElement(By.xpath(".//*[@id='txtEmailAdd']"));
		  emailAdd.sendKeys(value);
		 }
		 
		 public  void ReEnterEmail(String value){
		  WebElement reEmail  = driver.findElement(By.xpath(".//*[@id='txtEmailAddConfirmation']"));
		  reEmail.sendKeys(value); 
		 }
		 
		 public  void selectContNo(String value){
		  Select dpContactNum = new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredContact']")));
		  dpContactNum.selectByIndex(Integer.parseInt(value));
		 }
		 public  void entercontNo(String value){
		  WebElement contactNo = driver.findElement(By.xpath(".//*[@id='txtPreferredContactNo']"));
		  contactNo.sendKeys(value); 
		 }
		 public  void enterPwd(String value){
		  WebElement passWord  = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		  passWord.sendKeys(value); 
		 }
		 public  void reenterPwd(String value){
		  WebElement repwd = driver.findElement(By.xpath(".//*[@id='txtReTypePassword']"));
		  repwd.sendKeys(value); 
		 }
		 public  void EnterAddress(String value){
		  WebElement addl1 = driver.findElement(By.xpath(".//*[@id='txtaddrss1']"));
		  addl1.sendKeys(value); 
		 }
		 public  void enterTown(String value){
		  WebElement city = driver.findElement(By.xpath(".//*[@id='txttown']"));
		  city.sendKeys(value); 
		 }
		 public  void enterPostal(String value){
		  WebElement zipcode = driver.findElement(By.xpath(".//*[@id='txtzip']"));
		  zipcode.sendKeys(value); 
		 }
		 public  void clickcontiune2(){
		  WebElement step2countinue = driver.findElement(By.xpath(".//*[@id='MainContent_btnRegister']"));
		  step2countinue.click();
		}
		//Step3
		 public  void enterIRID(String value){
		  WebElement IR_ID= driver.findElement(By.xpath(".//*[@id='txtTCOID']"));
		  IR_ID.sendKeys(value);
		 }
		 
		 public  void clickVerifyBtn(){
		  WebElement verifyPlacement = driver.findElement(By.xpath(".//*[@id='btnVerifyPlacement']"));
		  verifyPlacement.click();
		 }
		 
		 public  void selectPlacement(String value){
		  Select dpTraCentre = new Select(driver.findElement(By.xpath(".//*[@id='ddlTCExt']")));
		  dpTraCentre.selectByIndex(Integer.parseInt(value));
		 }
		 public void prefferPlacement(String value){
		   WebElement right=driver.findElement(By.xpath(".//*[@id='radRight']"));
		   WebElement left=driver.findElement(By.xpath(".//*[@id='radLeft']"));
		   if(value.equals("right")){
		    right.click();
		   }else if(value.equals("left")){
		    left.click();    
		   }
		}
		 public  void clickCountinue3(){
			  WebElement countinue3 = driver.findElement(By.xpath(".//*[@id='MainContent_btnContinuePlacement']"));
			  countinue3.click();
			 }
			 
			 //Step 4
			 public  void clickSubmit(){
			  WebElement submit = driver.findElement(By.xpath(".//*[@id='btnSubmit']"));
			  submit.click();
			 }
			 
			 // Payment type selection
			 
			 public void selectPayment(String currency,String method){
				 Select curr = new Select(driver.findElement(By.id("MainContent_cboddlCurrency")));
				 System.out.println(currency);
				 if(currency.equals("us")){ 
					 curr.selectByIndex(0);
				 }else if(currency.equals("euro")){
					 curr.selectByIndex(1);
				 }
				 Select meth = new Select(driver.findElement(By.id("MainContent_cboPaymentType")));
				 if(method.equals("ecard")){
					 meth.selectByIndex(1);
				 }
				 
			}	 

}
