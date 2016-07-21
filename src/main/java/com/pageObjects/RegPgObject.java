package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class RegPgObject {
	 WebDriver driver;
	 public Base base;
	 public RegPgObject( WebDriver driver){
		 this.driver=driver;
		 
	 }
	 public void selectTitle(String value){
		 Select title= new Select(driver.findElement(By.xpath(".//*[@id='ddlTitle']")));
		 title.selectByVisibleText(value);
	 }
	 public void enterSurname(String value){
		 WebElement surname=driver.findElement(By.xpath(".//*[@id='txtLastName']"));
		 surname.sendKeys(value);
	 }
	 public void enterGiveName(String value){
		 WebElement given_name=driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
		 given_name.sendKeys(value);
	 }
	 public void EnterAddress(String value){
		 WebElement address1=driver.findElement(By.xpath(".//*[@id='txtAddr1']"));
		 address1.sendKeys(value);
	 }
	 public void enterTown(String value){
		 WebElement town=driver.findElement(By.xpath(".//*[@id='txtCity']"));
		 town.sendKeys(value);
	 }
	 public void enterPostal(String value){
		 WebElement postal=driver.findElement(By.xpath(".//*[@id='txtPostZip']"));
		 postal.sendKeys(value);
	 }
	 public void enterHomePhone(String value){
		 WebElement homephone=driver.findElement(By.xpath(".//*[@id='tbHomeCountryHomeTel']"));
		 homephone.sendKeys(value);
	 }
	 public void enterMoblieNumber(String value){
		 WebElement mobilephone=driver.findElement(By.xpath(".//*[@id='ctlMobilePhone_tbHomeCountryMobileTel']"));
		 mobilephone.sendKeys(value);
	 }
	 public void enterEmail(String value){
		 WebElement email=driver.findElement(By.xpath(".//*[@id='txtEMail']"));
		 email.sendKeys(value);
	 }
	 public void ReEnterEmail(String value){
		 WebElement reemail=driver.findElement(By.xpath(".//*[@id='txtEMail2']"));
		 reemail.sendKeys(value);
	 }
	 public void SelectValidIdType(String value){
		 Select valididtype= new Select(driver.findElement(By.xpath(".//*[@id='ddlIDType']")));
		 valididtype.selectByVisibleText(value);
	 }
	 public void enterValidIdNo(String value){
		WebElement valididno=driver.findElement(By.xpath(".//*[@id='txtValidID']"));
		valididno.sendKeys(value);
	 }
	 public void selectNationality(String value){
		 Select nationality=new Select(driver.findElement(By.xpath(".//*[@id='ddlNatCode']")));
		 nationality.selectByVisibleText(value);
	 }
	 public void selectdobmonth(String value){
		 Select dobmonth=new Select(driver.findElement(By.xpath(".//*[@id='ddlMonth']")));
		 dobmonth.selectByVisibleText(value);
	 }
	 public void selectdobdate(String value){
		 Select dobdate=new Select(driver.findElement(By.xpath(".//*[@id='ddlDate']")));
		 dobdate.selectByVisibleText(value);
	 }
	 public void selectdobyear(String value){
		 Select dobyear=new Select(driver.findElement(By.xpath(".//*[@id='ddlYear']")));
		 dobyear.selectByVisibleText(value);
	 }
	 public void enterBenificiary(String value){
		 WebElement benificiary=driver.findElement(By.xpath(".//*[@id='txtBeneficiary']"));
		 benificiary.sendKeys(value);
	 }
	 public void selectRelationship(String value){
		 Select relationship=new Select(driver.findElement(By.xpath(".//*[@id='ddlBeneficiary']")));
		 relationship.selectByVisibleText(value);
	 }
	 public void enterMFName(String value){
		 WebElement mfname=driver.findElement(By.xpath(".//*[@id='txtMothersMaidenName']"));
		 mfname.sendKeys(value);
	 }
	 public void selectPClang(String value){
		 Select pclang=new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredCorrespondenceLanguage']")));
		 pclang.selectByVisibleText(value);
	 }
	 public void selectSecques(String value){
		 Select secques=new Select(driver.findElement(By.xpath(".//*[@id='SecurityQuestions_IRQuestion1']")));
		 secques.selectByVisibleText(value);
	 }
	 public void enterAnswer(String value){
		 WebElement ans=driver.findElement(By.xpath(".//*[@id='SecurityQuestions_IRAnswer1']"));
		 ans.sendKeys(value);
	 }
	 public void enterSecword(String value){
		 WebElement secword=driver.findElement(By.xpath(".//*[@id='SecurityQuestions_SecWord']"));
		 secword.sendKeys(value);
	 }
	 public void enterQApin(String value){
		 WebElement qapin=driver.findElement(By.xpath(".//*[@id='txtQAPin']"));
		 qapin.sendKeys(value);
	 }
	 public void enterReQapin(String value){
		 WebElement reqapin=driver.findElement(By.xpath(".//*[@id='txtQAPin2']"));
		 reqapin.sendKeys(value);
	 }
	 public void enterPwd(String value){
		  WebElement pwd=driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		  pwd.sendKeys(value);
	 }
	 public void reenterPwd(String value){				 
		 WebElement repwd=driver.findElement(By.xpath(".//*[@id='txtPassword2']"));	
		 repwd.sendKeys(value);
	 }
	 public void selectAgreement(){
		 WebElement chk1=driver.findElement(By.xpath(".//*[@id='chkQuestionaire1']"));
		 WebElement chk2=driver.findElement(By.xpath(".//*[@id='chkQuestionaire2']"));
		 WebElement chk3=driver.findElement(By.xpath(".//*[@id='chkAccept']"));
		 WebElement chk4=driver.findElement(By.xpath(".//*[@id='chkCOE']"));
		 WebElement chk5=driver.findElement(By.xpath(".//*[@id='chkDisclaimer']"));
		 WebElement chk6=driver.findElement(By.xpath(".//*[@id='cbWORLDCheckBox01']"));
		 chk1.click();
		 chk2.click();
		 chk3.click();
		 chk4.click();
		 chk5.click();
		 chk6.click();
	 }
	 public void clickConfirmBtn(){
		 WebElement confirmBtn=driver.findElement(By.xpath(".//*[@id='cmdOK']"));
		 confirmBtn.click();
	 }
}
