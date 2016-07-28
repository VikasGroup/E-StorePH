package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class ArmeniaEnvComPgObj {
	WebDriver driver;
	 public Base base;
	 
	 public ArmeniaEnvComPgObj( WebDriver driver){
		 this.driver=driver;	 
	 }
	 public void enterComName(String value){
		 WebElement comName=driver.findElement(By.xpath(".//*[@id='txtCompany']"));
		 comName.sendKeys(value);
	 }
	 
	 public void selectCnontactPerson(String value){
		 Select cnontactPerson= new Select(driver.findElement(By.xpath(".//*[@id='ddlTitle']")));
		 cnontactPerson.selectByIndex(Integer.parseInt(value));
	 }
	 
	 public void enterCnontactPerson(String value){
		 WebElement cnontactPerson=driver.findElement(By.xpath(".//*[@id='txtContactPerson']"));
		 cnontactPerson.sendKeys(value);
	 }
	 
	 public void selectPosition(String value){
		 Select position= new Select(driver.findElement(By.xpath(".//*[@id='ddlPosition']")));
		 position.selectByIndex(Integer.parseInt(value));
	 }
	 public void EnterAddress(String value){
		 WebElement address1=driver.findElement(By.xpath(".//*[@id='txtAddr1']"));
		 address1.sendKeys(value);
	 }
	 public void selectTown(String value){
		 Select Town= new Select(driver.findElement(By.xpath(".//*[@id='ddlCity']")));
		 Town.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterPostal(String value){
		 WebElement postal=driver.findElement(By.xpath(".//*[@id='txtPostZip']"));
		 postal.sendKeys(value);
	 }
	 public void enterHomePhone(String value){
		 WebElement homephone=driver.findElement(By.xpath(".//*[@id='tbHomeCountryHomeTel']"));
		 homephone.sendKeys(value);
	 }
	 public void enterofficeNumber(String value){
		 WebElement officeNumber=driver.findElement(By.xpath(".//*[@id='tbHomeCountryOfficeTel']"));
		 officeNumber.sendKeys(value);
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
	 public void selectBusiness(String value){
		 Select business =new Select(driver.findElement(By.xpath(".//*[@id='ddlOccupation']")));
		 business.selectByIndex(Integer.parseInt(value));
	 }
	 public void SelectValidIdType(String value){
		 Select valididtype= new Select(driver.findElement(By.xpath(".//*[@id='ddlIDType']")));
		 valididtype.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterValidIdNo(String value){
		WebElement valididno=driver.findElement(By.xpath(".//*[@id='txtValidID']"));
		valididno.sendKeys(value);
	 }
	 public void selectregmonth(String value){
		 Select regmonth=new Select(driver.findElement(By.xpath(".//*[@id='ddlMonth']")));
		 regmonth.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectregdate(String value){
		 Select regdate=new Select(driver.findElement(By.xpath(".//*[@id='ddlDate']")));
		 regdate.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectregyear(String value){
		 Select regyear=new Select(driver.findElement(By.xpath(".//*[@id='ddlYear']")));
		 regyear.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectregCountry(String value){
		 Select regCountry=new Select(driver.findElement(By.xpath(".//*[@id='ddlNatCode']")));
		 regCountry.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectPClang(String value){
		 Select pclang=new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredCorrespondenceLanguage']")));
		 pclang.selectByIndex(Integer.parseInt(value));
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
