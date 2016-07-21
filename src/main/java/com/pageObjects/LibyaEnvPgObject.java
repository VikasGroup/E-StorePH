package com.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LibyaEnvPgObject {
		 static WebDriver driver;
		 public LibyaEnvPgObject( WebDriver driver){
			 LibyaEnvPgObject.driver=driver;
		 }
public static void titleOfName(String title){
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlLanguage']")));
		dropdown.selectByVisibleText(title);
	}
	
public static void surName(String sname){
	WebElement surname = driver.findElement(By.xpath(".//*[@id='txtLastName']"));
	surname.sendKeys(sname);
}
public static void  givenName(String fname) {
	WebElement givenName = driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
	givenName.sendKeys(fname);
}
public static void 	address1(String addr){
	WebElement address1 = driver.findElement(By.xpath(".//*[@id='txtAddr1']"));
	address1.sendKeys(addr);	
}
public static void city(String cityname) {
	WebElement city = driver.findElement(By.xpath(".//*[@id='txtCity']"));
	city.sendKeys(cityname);
}
public static void postalCode(String code) {
	WebElement postalCode = driver.findElement(By.xpath(".//*[@id='txtPostZip']"));
	postalCode.sendKeys(code);
}
public static void homePhoneNum(String num) {
	WebElement homePhoneNum = driver.findElement(By.xpath(".//*[@id='tbHomeCountryHomeTel']       "));
	homePhoneNum.sendKeys(num);	
}
public static void  mobilePhoneNum(String mobnum) {
	WebElement mobilePhoneNum = driver.findElement(By.xpath(".//*[@id='ctlMobilePhone_tbHomeCountryMobileTel']']"));
	mobilePhoneNum.sendKeys(mobnum);
}
public static void  emailAddr(String email) {
	WebElement emailAddr = driver.findElement(By.xpath(".//*[@id='txtEMail']"));
	emailAddr.sendKeys(email);	
}
public static void  retypeEmailAddr(String email1) {
	WebElement retypeEmailAddr = driver.findElement(By.xpath(".//*[@id='txtEMail2']"));
	retypeEmailAddr.sendKeys(email1);
}
public static void validIDType(String validIDType){
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlIDType']")));
	dropdown.selectByVisibleText(validIDType);
}
public static void  validIDNo(String idno) {
	WebElement validIDNo = driver.findElement(By.xpath(".//*[@id='txtValidID']"));
	validIDNo.sendKeys(idno);
}
public static void nationality(String nationality){
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlNatCode']")));
	dropdown.selectByVisibleText(nationality);
}
public static void month(String month){
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlMonth']")));
	dropdown.selectByVisibleText(month);
}
public static void date(String date){
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlDate']")));
	dropdown.selectByVisibleText(date);
}
public static void year(String year){
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlYear']")));
	dropdown.selectByVisibleText(year);
}
public static void  nameOfBeneficiary(String nob) {
	WebElement nameOfBeneficiary = driver.findElement(By.xpath(".//*[@id='txtBeneficiary']"));
	nameOfBeneficiary.sendKeys(nob);
}
public static void relationship(String relationship){
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlBeneficiary']")));
	dropdown.selectByVisibleText(relationship);
}
public static void  mothersFamilyName(String mothername) {
	WebElement mothersFamilyName = driver.findElement(By.xpath(".//*[@id='txtMothersMaidenName']"));
	mothersFamilyName.sendKeys(mothername);	
}
public static void 	preferredLang(String preferredLang){
	Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredCorrespondenceLanguage']")));
	dropdown.selectByVisibleText(preferredLang);
}	
public static void  pinnum(String pin) {
	WebElement pinnum = driver.findElement(By.xpath(".//*[@id='txtQAPin']"));
	pinnum.sendKeys(pin);
}
public static void  pinnumconfierm(String pinCon) {
	WebElement pinnumconfierm = driver.findElement(By.xpath(".//*[@id='txtQAPin2']"));
	pinnumconfierm.sendKeys(pinCon);
}
public static void  pwd(String password) {
	WebElement pwd = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
	pwd.sendKeys(password);
}
public static void  pwdconfierm(String passwordcon) {
	WebElement pwdconfierm = driver.findElement(By.xpath(".//*[@id='txtPassword2']"));
	pwdconfierm.sendKeys(passwordcon);
}
public static void  emailTextselectbtn() {
WebElement emailTextselectbtn = driver.findElement(By.xpath(".//*[@id='rbtnRegistrationSubscriptionOption']/tbody/tr[1]/td/span"));
emailTextselectbtn.click();
}
public static void  questionaire1btn() {
WebElement questionaire1btn = driver.findElement(By.xpath(".//*[@id='chkQuestionaire1']"));
questionaire1btn.click();
}
public static void  questionaire2btn() {
WebElement questionaire2btn = driver.findElement(By.xpath(".//*[@id='chkQuestionaire2']"));
questionaire2btn.click();
}	
public static void  questionaire3btn() {
WebElement questionaire3btn = driver.findElement(By.xpath(".//*[@id='chkAccept']"));
questionaire3btn.click();
}	
public static void  questionaire4btn() {
WebElement questionaire4btn = driver.findElement(By.xpath(".//*[@id='chkCOE']"));
questionaire4btn.click();
}		
public static void  questionaire5btn() {
WebElement questionaire5btn = driver.findElement(By.xpath(".//*[@id='chkDisclaimer']"));
questionaire5btn.click();
}		
public static void  questionaire6btn() {
WebElement questionaire6btn = driver.findElement(By.xpath(".//*[@id='cbWORLDCheckBox01']"));
questionaire6btn.click();
}		
public static void  confirmbtn() {
WebElement confirmbtn = driver.findElement(By.xpath(".//*[@id='cmdOK']"));
confirmbtn.click();
}		
	
}
