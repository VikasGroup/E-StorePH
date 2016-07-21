package com.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LibyaEnvPgObject {
   public WebDriver driver;
   public LibyaEnvPgObject( WebDriver driver){
    this.driver=driver;
   }
public  void selectTitle(String title){
  Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlTitle']")));
  dropdown.selectByIndex(Integer.parseInt(title));
 }
 
public  void enterSurname(String sname){
 WebElement surname = driver.findElement(By.xpath(".//*[@id='txtLastName']"));
 surname.sendKeys(sname);
}
public  void  enterGiveName(String fname) {
 WebElement givenName = driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
 givenName.sendKeys(fname);
}
public  void  EnterAddress(String addr){
 WebElement address1 = driver.findElement(By.xpath(".//*[@id='txtAddr1']"));
 address1.sendKeys(addr); 
}
public  void enterTown(String cityname) {
 WebElement city = driver.findElement(By.xpath(".//*[@id='txtCity']"));
 city.sendKeys(cityname);
}
public  void enterPostal(String code) {
 WebElement postalCode = driver.findElement(By.xpath(".//*[@id='txtPostZip']"));
 postalCode.sendKeys(code);
}
public  void enterHomePhone(String num) {
 WebElement homePhoneNum = driver.findElement(By.xpath(".//*[@id='tbHomeCountryHomeTel']"));
 homePhoneNum.sendKeys(num); 
}
public  void  enterMoblieNumber(String mobnum) {
 WebElement mobilePhoneNum = driver.findElement(By.xpath(".//*[@id='ctlMobilePhone_tbHomeCountryMobileTel']"));
 mobilePhoneNum.sendKeys(mobnum);
}
public  void  enterEmail(String email) {
 WebElement emailAddr = driver.findElement(By.xpath(".//*[@id='txtEMail']"));
 emailAddr.sendKeys(email); 
}
public  void  ReEnterEmail(String email1) {
 WebElement retypeEmailAddr = driver.findElement(By.xpath(".//*[@id='txtEMail2']"));
 retypeEmailAddr.sendKeys(email1);
}
public  void SelectValidIdType(String validIDType){
 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlIDType']")));
 dropdown.selectByIndex(Integer.parseInt(validIDType));
}
public  void  enterValidIdNo(String idno) {
 WebElement validIDNo = driver.findElement(By.xpath(".//*[@id='txtValidID']"));
 validIDNo.sendKeys(idno);
}
public  void selectNationality(String nationality){
 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlNatCode']")));
 dropdown.selectByIndex(Integer.parseInt(nationality));
}
public  void selectdobmonth(String month){
 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlMonth']")));
 dropdown.selectByIndex(Integer.parseInt(month));
}
public  void selectdobdate(String date){
 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlDate']")));
 dropdown.selectByIndex(Integer.parseInt(date));
}
public  void selectdobyear(String year){
 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlYear']")));
 dropdown.selectByIndex(Integer.parseInt(year));
}
public  void  enterBenificiary(String nob) {
 WebElement nameOfBeneficiary = driver.findElement(By.xpath(".//*[@id='txtBeneficiary']"));
 nameOfBeneficiary.sendKeys(nob);
}
public  void selectRelationship(String relationship){
 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlBeneficiary']")));
 dropdown.selectByIndex(Integer.parseInt(relationship));
}
public  void  enterMFName(String mothername) {
 WebElement mothersFamilyName = driver.findElement(By.xpath(".//*[@id='txtMothersMaidenName']"));
 mothersFamilyName.sendKeys(mothername); 
}
public  void  selectPClang(String preferredLang){
 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredCorrespondenceLanguage']")));
 dropdown.selectByIndex(Integer.parseInt(preferredLang));
} 
public  void  enterQApin(String pin) {
 WebElement pinnum = driver.findElement(By.xpath(".//*[@id='txtQAPin']"));
 pinnum.sendKeys(pin);
}
public  void  enterReQapin(String pinCon) {
 WebElement pinnumconfierm = driver.findElement(By.xpath(".//*[@id='txtQAPin2']"));
 pinnumconfierm.sendKeys(pinCon);
}
public  void  enterPwd(String password) {
 WebElement pwd = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
 pwd.sendKeys(password);
}
public  void  reenterPwd(String passwordcon) {
 WebElement pwdconfierm = driver.findElement(By.xpath(".//*[@id='txtPassword2']"));
 pwdconfierm.sendKeys(passwordcon);
}
public  void  selectAgreement() {
WebElement emailTextselectbtn = driver.findElement(By.xpath(".//*[@id='rbtnRegistrationSubscriptionOption']/tbody/tr[1]/td/span"));
emailTextselectbtn.click();
WebElement questionaire1btn = driver.findElement(By.xpath(".//*[@id='chkQuestionaire1']"));
questionaire1btn.click();
WebElement questionaire2btn = driver.findElement(By.xpath(".//*[@id='chkQuestionaire2']"));
questionaire2btn.click();
WebElement questionaire3btn = driver.findElement(By.xpath(".//*[@id='chkAccept']"));
questionaire3btn.click();
WebElement questionaire4btn = driver.findElement(By.xpath(".//*[@id='chkCOE']"));
questionaire4btn.click();
WebElement questionaire5btn = driver.findElement(By.xpath(".//*[@id='chkDisclaimer']"));
questionaire5btn.click();
WebElement questionaire6btn = driver.findElement(By.xpath(".//*[@id='cbWORLDCheckBox01']"));
questionaire6btn.click();
}
 
public  void  clickConfirmBtn() {
WebElement confirmbtn = driver.findElement(By.xpath(".//*[@id='cmdOK']"));
confirmbtn.click();
}  
 
}