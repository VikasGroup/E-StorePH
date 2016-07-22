package com.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vselenium.BasicPageObject;

public class LibyaEnvPgObject extends BasicPageObject{
	public  WebElement title_dp			= createElement(By.xpath(".//*[@id='ddlTitle']"));
	public  WebElement surname_tx		=createElement(By.xpath(".//*[@id='txtLastName']"));
	public  WebElement given_name_tx	=createElement(By.xpath(".//*[@id='txtFirstName']"));
	public  WebElement address1_tx		=createElement(By.xpath(".//*[@id='txtAddr1']"));
	public  WebElement town_tx			=createElement(By.xpath(".//*[@id='txtCity']"));
	public  WebElement postal_tx		=createElement(By.xpath(".//*[@id='txtPostZip']"));
	public  WebElement homephone_tx		=createElement(By.xpath(".//*[@id='tbHomeCountryHomeTel']"));
	public  WebElement mobilephone_tx	=createElement(By.xpath(".//*[@id='ctlMobilePhone_tbHomeCountryMobileTel']"));
	public  WebElement email_tx			=createElement(By.xpath(".//*[@id='txtEMail']"));
	public  WebElement reemail_tx		=createElement(By.xpath(".//*[@id='txtEMail2']"));
	public  WebElement validIdType_dp 	= createElement(By.xpath(".//*[@id='ddlIDType']"));
	public  WebElement valididno_tx		=createElement(By.xpath(".//*[@id='txtValidID']"));
	public  WebElement nationality_dp	= createElement(By.xpath(".//*[@id='ddlNatCode']"));
	public  WebElement dobmonth_dp		= createElement(By.xpath(".//*[@id='ddlMonth']"));
	public  WebElement dobdate_dp		= createElement(By.xpath(".//*[@id='ddlDate']"));
	public  WebElement dobyear_dp		= createElement(By.xpath(".//*[@id='ddlYear']"));
	public  WebElement benificiary_tx	=createElement(By.xpath(".//*[@id='txtBeneficiary']"));
	public  WebElement relationship_dp	= createElement(By.xpath(".//*[@id='ddlBeneficiary']"));
	public  WebElement mfname_tx		=createElement(By.xpath(".//*[@id='txtMothersMaidenName']"));
	public  WebElement pclang_dp		= createElement(By.xpath(".//*[@id='ddlPreferredCorrespondenceLanguage']"));
	public  WebElement qapin_tx			=createElement(By.xpath(".//*[@id='txtQAPin']"));
	public  WebElement reqapin_tx		=createElement(By.xpath(".//*[@id='txtQAPin2']"));
	public  WebElement pwd_tx			=createElement(By.xpath(".//*[@id='txtPassword']"));
	public  WebElement repwd_tx			=createElement(By.xpath(".//*[@id='txtPassword2']"));
	public  WebElement emailTextselectbtn_cl = createElement(By.xpath(".//*[@id='rbtnRegistrationSubscriptionOption']/tbody/tr[1]/td/span"));
	public  WebElement chk1_cl			=createElement(By.xpath(".//*[@id='chkQuestionaire1']"));
    public WebElement chk2_cl			=createElement(By.xpath(".//*[@id='chkQuestionaire2']"));
	public WebElement chk3_cl			=createElement(By.xpath(".//*[@id='chkAccept']"));
	public WebElement chk4_cl			=createElement(By.xpath(".//*[@id='chkCOE']"));
	public WebElement chk5_cl			=createElement(By.xpath(".//*[@id='chkDisclaimer']"));
	public WebElement chk6_cl			=createElement(By.xpath(".//*[@id='cbWORLDCheckBox01']"));
	public WebElement confirmBtn_cl		=createElement(By.xpath(".//*[@id='cmdOK']"));
	
	
	static WebDriver driver;
    public LibyaEnvPgObject( WebDriver driver){
	   super(driver);
	   LibyaEnvPgObject.driver=driver;
   }
    public void selectTitle(String value){
		Select title= new Select(driver.findElement(By.xpath(".//*[@id='ddlTitle']")));
        title.selectByIndex(Integer.parseInt(value));
	 }
		
	 public void enterSurname(String value){
		 surname_tx.sendKeys(value);
	 }
	 public void enterGiveName(String value){
		 given_name_tx.sendKeys(value);
	 }
	 public void EnterAddress(String value){
		 address1_tx.sendKeys(value);
	 }
	 public void enterTown(String value){
		 town_tx.sendKeys(value);
	 }
	 public void enterPostal(String value){
		 postal_tx.sendKeys(value);
	 }
	 public void enterHomePhone(String value){
		 homephone_tx.sendKeys(value);
	 }
	 public void enterMoblieNumber(String value){
		 mobilephone_tx.sendKeys(value);
	 }
	 public void enterEmail(String value){
		 email_tx.sendKeys(value);
	 }
	 public void ReEnterEmail(String value){
		 reemail_tx.sendKeys(value);
	 }
	 public void SelectValidIdType(String value){
		 Select validIdType= new Select(validIdType_dp);
		 validIdType.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterValidIdNo(String value){
		valididno_tx.sendKeys(value);
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
		 Select dobdate=new Select(dobdate_dp);
		 dobdate.selectByIndex(Integer.parseInt(value));
	 }
	 public void selectdobyear(String value){
		 Select dobyear=new Select(dobyear_dp);
		 dobyear.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterBenificiary(String value){
		 benificiary_tx.sendKeys(value);
	 }
	 public void selectRelationship(String value){
		 Select relationship=new Select(relationship_dp);
		 relationship.selectByIndex(Integer.parseInt(value));
	 }
	 public void enterMFName(String value){
		 mfname_tx.sendKeys(value);
     }
	 public void selectPClang(String value){
		 Select pclang=new Select(pclang_dp);
		 pclang.selectByIndex(Integer.parseInt(value));
	 }
	 
	 public void enterQApin(String value){
		 qapin_tx.sendKeys(value);
	 }
	 public void enterReQapin(String value){
		 reqapin_tx.sendKeys(value);
	 }
	 public void enterPwd(String value){
		  pwd_tx.sendKeys(value);
	 }
	 public void reenterPwd(String value){				 	
		 repwd_tx.sendKeys(value);
     }
	 public void  emailTextselectbtn() {
		 emailTextselectbtn_cl.click();
	}
	 public void selectAgreement(){
		 chk1_cl.click();
		 chk2_cl.click();
		 chk3_cl.click();
		 chk4_cl.click();
		 chk5_cl.click();
		 chk6_cl.click();
   }
	public void clickConfirmBtn(){
		 confirmBtn_cl.click();
   }

public Legal_disclaimerPgObject clickConfirmBtn1(){
	
	ConfirmBtn.click();
	return new Legal_disclaimerPgObject(driver);
}
}
