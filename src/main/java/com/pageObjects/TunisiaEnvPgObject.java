package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;
import com.vselenium.BasicPageObject;

public class TunisiaEnvPgObject extends BasicPageObject{
	
	public WebElement title_dp = createElement(By.xpath(".//*[@id='ddlTitle']"));
	public WebElement surname_txt  = createElement(By.xpath(".//*[@id='txtFirstName']"));
	public WebElement given_name_txt = createElement(By.xpath(".//*[@id='txtLastName']"));
	public WebElement arabname_txt = createElement(By.xpath(".//*[@id='tbFullName']"));	
	public WebElement add_txt = createElement(By.xpath(".//*[@id='txtaddrss1']"));
	public WebElement town_txt = createElement(By.xpath(".//*[@id='txttown']"));
	public WebElement post_txt = createElement(By.xpath(".//*[@id='txtzip']"));
	public WebElement contact_dp = createElement(By.xpath(".//*[@id='ddlPreferredContact']"));
	public WebElement contact_txt = createElement(By.xpath(".//*[@id='txtPreferredContactNo']"));
	public WebElement email_txt = createElement(By.xpath(".//*[@id='txtEmailAdd']"));
	public WebElement reemail_txt = createElement(By.xpath(".//*[@id='txtEmailAddConfirmation']"));
	public WebElement idtype_dp = createElement(By.xpath(".//*[@id='ddlIDType']"));
	public WebElement idno_txt = createElement(By.xpath(".//*[@id='txtValidID']"));
	public WebElement nationality_dp = createElement(By.xpath(".//*[@id='ddlMonth']"));
	public WebElement dobmonth_dp = createElement(By.xpath(".//*[@id='ddlMonth']"));
	public WebElement dobdate_dp = createElement(By.xpath(".//*[@id='ddlDate']"));
	public WebElement dobyear_dp = createElement(By.xpath(".//*[@id='ddlYear']"));
	public WebElement pwd_txt = createElement(By.xpath(".//*[@id='txtPassword']"));
	public WebElement repwd_txt = createElement(By.xpath(".//*[@id='txtReTypePassword']"));
	public WebElement step2_cl = createElement(By.xpath(".//*[@id='MainContent_btnRegister']"));
	public WebElement IR_ID_txt = createElement(By.xpath(".//*[@id='btnVerifyPlacement']"));
	public WebElement vplace_cl = createElement(By.xpath(".//*[@id='btnVerifyPlacement']"));
	public WebElement trecentre_dp = createElement(By.xpath(".//*[@id='ddlTCExt']"));
	public WebElement step3_cl = createElement(By.xpath(".//*[@id='MainContent_btnContinuePlacement']"));
	public WebElement submit_cl = createElement(By.xpath(".//*[@id='btnSubmit']"));
	public WebElement right_cl = createElement(By.xpath(".//*[@id='radRight']"));
	public WebElement left_cl = createElement(By.xpath(".//*[@id='radLeft']"));
	
	static WebDriver driver;
	 public Base base;
	 public TunisiaEnvPgObject( WebDriver driver){
		 super(driver);
		 TunisiaEnvPgObject.driver=driver;	 
	 }
//Step1
	/*public  void enterReferrer(String value){
		WebElement referrerIrID = driver.findElement(By.xpath(".//*[@id='txtReferrer']"));
		referrerIrID.sendKeys(value);
	}
	
	public  void selectCountry(String value){
		Select dpCountry= new Select(driver.findElement(By.xpath(".//*[@id='ddlCountry']")));
		dpCountry.selectByIndex(Integer.parseInt(value));
		
	}

	public  void clickcontinue1(){
		WebElement step1countinue = driver.findElement(By.xpath(".//*[@id='btnVerifyReferrer']"));
		step1countinue.click();
	}*/
	//step2
	public  void selectTitle(String value){
		Select dpTitle = new Select(title_dp);
		dpTitle.selectByIndex(Integer.parseInt(value));
	}
	public  void enterSurname(String value){
		surname_txt.sendKeys(value);
	}		
	public  void enterGiveName(String value){
		given_name_txt.sendKeys(value);
	}
	public  void enterArabname(String value){
		arabname_txt.sendKeys(value);
	}
	public  void selectdobmonth(String value){
		Select dpMonth = new Select(dobmonth_dp);
		dpMonth.selectByIndex(Integer.parseInt(value));
	}
	public  void selectdobdate(String value){
		Select dpDate = new Select(dobdate_dp);
		dpDate.selectByIndex(Integer.parseInt(value));
	}
	
	public  void selectdobyear(String value){
		Select dpYear = new Select(dobyear_dp);
		dpYear.selectByIndex(Integer.parseInt(value));
	}
	
	public  void enterEmail(String value){
		email_txt.sendKeys(value);
	}
	
	public  void ReEnterEmail(String value){
		reemail_txt.sendKeys(value);	
	}
	
	public  void selectContNo(String value){
		Select dpContactNum = new Select(contact_dp);
		dpContactNum.selectByIndex(Integer.parseInt(value));
	}
	public  void entercontNo(String value){
		contact_txt.sendKeys(value);	
	}
	public  void enterPwd(String value){
		pwd_txt.sendKeys(value);	
	}
	public  void reenterPwd(String value){
		repwd_txt.sendKeys(value);	
	}
	public  void EnterAddress(String value){
		add_txt.sendKeys(value);	
	}
	public  void enterTown(String value){
		town_txt.sendKeys(value);	
	}
	public  void enterPostal(String value){
		post_txt.sendKeys(value);	
	}
	public  void clickcontiune2(){
		step2_cl.click();
	}
	
	//Step3
	public  void enterIRID(String value){
		IR_ID_txt.sendKeys(value);
	}
	
	public  void clickVerifyBtn(){
		vplace_cl.click();
	}
	
	public  void selectPlacement(String value){
		Select dpTraCentre = new Select(trecentre_dp);
		dpTraCentre.selectByIndex(Integer.parseInt(value));
	}
	public void prefferPlacement(String value){
		 
		 if(value.equals("right_cl")){
			 right_cl.click();
		 }else if(value.equals("left_cl")){
			 left_cl.click();			 
		 }
	}
	/*public  void clickLeftTC(){
		WebElement leftTC = driver.findElement(By.xpath(".//*[@id='radLeft']"));
		leftTC.click();
	}
	public  void clickRightTC(){
		WebElement rightTC = driver.findElement(By.xpath(".//*[@id='radRight']"));
		rightTC.click();
	}*/
	public  void clickCountinue3(){
		step3_cl.click();
	}
	
	//Step 4
	public  void clickSubmit(){
		submit_cl.click();
	}
	
}