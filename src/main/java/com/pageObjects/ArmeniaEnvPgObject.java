package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;
import com.vselenium.BasicPageObject;

public class ArmeniaEnvPgObject extends BasicPageObject {
	
	public WebElement title_dp = createElement(By.xpath(".//*[@id='ddlTitle']"));
	public WebElement surname_txt  = createElement(By.xpath(".//*[@id='txtLastName']"));
	public WebElement given_name_txt = createElement(By.xpath(".//*[@id='txtFirstName']"));
	public WebElement add_txt = createElement(By.xpath(".//*[@id='txtAddr1']"));
	public WebElement town_txt = createElement(By.xpath(".//*[@id='txtCity']"));
	public WebElement post_txt = createElement(By.xpath(".//*[@id='txtPostZip']"));
	public WebElement homephone_txt = createElement(By.xpath(".//*[@id='tbHomeCountryHomeTel']"));
	public WebElement mobilephone_txt = createElement(By.xpath(".//*[@id='ctlMobilePhone_tbHomeCountryMobileTel']"));
	public WebElement email_txt = createElement(By.xpath(".//*[@id='txtEMail']"));
	public WebElement reemail_txt = createElement(By.xpath(".//*[@id='txtEMail2']"));
	public WebElement idtype_dp = createElement(By.xpath(".//*[@id='ddlIDType']"));
	public WebElement idno_txt = createElement(By.xpath(".//*[@id='txtValidID']"));
	public WebElement nationality_dp = createElement(By.xpath(".//*[@id='ddlMonth']"));
	public WebElement dobmonth_dp = createElement(By.xpath(".//*[@id='ddlMonth']"));
	public WebElement dobdate_dp = createElement(By.xpath(".//*[@id='ddlDate']"));
	public WebElement dobyear_dp = createElement(By.xpath(".//*[@id='ddlYear']"));
	public WebElement benificiary_txt = createElement(By.xpath(".//*[@id='txtBeneficiary']"));
	public WebElement relationship_dp = createElement(By.xpath(".//*[@id='ddlBeneficiary']"));
	public WebElement mfname_txt = createElement(By.xpath(".//*[@id='txtMothersMaidenName']"));
	public WebElement pclang_dp = createElement(By.xpath(".//*[@id='ddlPreferredCorrespondenceLanguage']"));
	public WebElement qapin_txt = createElement(By.xpath(".//*[@id='txtQAPin']"));
	public WebElement reqapin_txt = createElement(By.xpath(".//*[@id='txtQAPin2']"));
	public WebElement pwd_txt = createElement(By.xpath(".//*[@id='txtPassword']"));
	public WebElement repwd_txt = createElement(By.xpath(".//*[@id='txtPassword2']"));
	public WebElement chk1_c1 = createElement(By.xpath(".//*[@id='chkQuestionaire1']"));
	public WebElement chk2_c1 = createElement(By.xpath(".//*[@id='chkQuestionaire2']"));
	public WebElement chk3_c1 = createElement(By.xpath(".//*[@id='chkAccept']"));
	public WebElement chk4_c1 = createElement(By.xpath(".//*[@id='chkCOE']"));
	public WebElement chk5_c1 = createElement(By.xpath(".//*[@id='chkDisclaimer']"));
	public WebElement chk6_c1 = createElement(By.xpath(".//*[@id='cbWORLDCheckBox01']"));
	public WebElement confirm_btn = createElement(By.xpath(".//*[@id='cmdOK']"));
	
	
	 static WebDriver driver;
	 public Base base;
	 public ArmeniaEnvPgObject( WebDriver driver){
		 super(driver);
		 ArmeniaEnvPgObject.driver=driver;	 
	 }
	 public void selectTitle(String value){
		 Select title= new Select(title_dp);
		 title.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterSurname(String value){
		 surname_txt.sendKeys(value);
	 }
	 public void enterGiveName(String value){		 
		 given_name_txt.sendKeys(value);
	 }	 
	 public void EnterAddress(String value){
		add_txt.sendKeys(value);
	 }
	 public void enterTown(String value){
		 town_txt.sendKeys(value);
	 }
	 public void enterPostal(String value){	 
		 post_txt.sendKeys(value);
	 }
	 public void enterHomePhone(String value){
		homephone_txt.sendKeys(value);
	 }
	 public void enterMoblieNumber(String value){
		 mobilephone_txt.sendKeys(value);
	 }
	 public void enterEmail(String value){
		 email_txt.sendKeys(value);
	 }
	 public void ReEnterEmail(String value){
		 reemail_txt.sendKeys(value);
	 }
	 public void SelectValidIdType(String value){
		 Select valididtype= new Select(idtype_dp);
		 valididtype.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterValidIdNo(String value){
		 idno_txt.sendKeys(value);
	 }
	 public void selectNationality(String value){
		 Select nationality=new Select(nationality_dp);
		 nationality.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectdobmonth(String value){
		 Select dobmonth=new Select(dobmonth_dp);
		 dobmonth.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectdobdate(String value){
		 Select dobdate = new Select(dobdate_dp);
		 dobdate.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectdobyear(String value){
		 Select dobyear = new Select(dobyear_dp);
		 dobyear.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterBenificiary(String value){
		 benificiary_txt.sendKeys(value);
	 }
	 public void selectRelationship(String value){
		 Select relationship=new Select(relationship_dp);
		 relationship.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterMFName(String value){
		 mfname_txt.sendKeys(value);
	 }
	 public void selectPClang(String value){
		 Select pclang=new Select(pclang_dp);
		 pclang.selectByIndex(Integer.parseInt(value));
}
	 public void enterQApin(String value){
		 qapin_txt.sendKeys(value);
	 }
	 public void enterReQapin(String value){
		 reqapin_txt.sendKeys(value);
	 }
	 public void enterPwd(String value){
		 pwd_txt.sendKeys(value);
	 }
	 public void reenterPwd(String value){				 
		 repwd_txt.sendKeys(value);
	 }
	 public void selectAgreement(){	 
		 chk1_c1.click();
		 chk2_c1.click();
		 chk3_c1.click();
		 chk4_c1.click();
		 chk5_c1.click();
		 chk6_c1.click();
	 }
	 public void clickConfirmBtn(){		 
		 confirm_btn.click();
	 }
	
	 public Legal_disclaimerPgObject clickConfirmBtn1(){
		 
		 ConfirmBtn.click();
		 return new Legal_disclaimerPgObject(driver);
		}
}
