package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PreregisterTunisiaPgObject {
	static WebDriver driver;
	
	public PreregisterTunisiaPgObject(WebDriver driver){
		PreregisterTunisiaPgObject.driver = driver;	
	}
//Step1
	public static void selectReferrer(String referrer){
		WebElement referrerIrID = driver.findElement(By.xpath(".//*[@id='txtReferrer']"));
		referrerIrID.sendKeys(referrer);
	}
	
	public static void selectCountry(String country){
		Select dpCountry= new Select(driver.findElement(By.xpath(".//*[@id='ddlCountry']")));
		dpCountry.selectByVisibleText(country);
		
	}

	public static void continue1(){
		WebElement step1countinue = driver.findElement(By.xpath(".//*[@id='btnVerifyReferrer']"));
		step1countinue.click();
	}
	//step2
	public static void selectTitle(String title){
		Select dpTitle = new Select(driver.findElement(By.xpath(".//*[@id='ddlTitle']")));
		dpTitle.selectByVisibleText(title);
	}
	
	public static void firstName(String name){
		WebElement fName = driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
		fName.sendKeys(name);
	}
	
	public static void lastName(String name){
		WebElement lName = driver.findElement(By.xpath(".//*[@id='txtLastName']"));
		lName.sendKeys(name);
	}
	
	public static void dobMonth(String month){
		Select dpMonth = new Select(driver.findElement(By.xpath(".//*[@id='ddlMonth']")));
		dpMonth.selectByVisibleText(month);
	}
	
	public static void dobDate(String date){
		Select dpDate = new Select(driver.findElement(By.xpath(".//*[@id='ddlDate']")));
		dpDate.selectByVisibleText(date);
	}
	
	public static void dobYear(String year){
		Select dpYear = new Select(driver.findElement(By.xpath(".//*[@id='ddlYear']")));
		dpYear.selectByVisibleText(year);
	}
	
	public static void email(String email){
		WebElement emailAdd = driver.findElement(By.xpath(".//*[@id='txtEmailAdd']"));
		emailAdd.sendKeys(email);
	}
	
	public static void reTypeEmail(String email){
		WebElement reEmail  = driver.findElement(By.xpath(".//*[@id='txtEmailAddConfirmation']"));
		reEmail.sendKeys(email);	
	}
	
	public static void selectContNo(String num){
		Select dpContactNum = new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredContact']")));
		dpContactNum.selectByVisibleText(num);
	}
	public static void contNo(String num){
		WebElement contactNo = driver.findElement(By.xpath(".//*[@id='txtPreferredContactNo']"));
		contactNo.sendKeys(num);	
	}
	public static void password(String pwd){
		WebElement passWord  = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		passWord.sendKeys(pwd);	
	}
	public static void rePassword(String pwd){
		WebElement repwd = driver.findElement(By.xpath(".//*[@id='txtReTypePassword']"));
		repwd.sendKeys(pwd);	
	}
	public static void addline1(String line){
		WebElement addl1 = driver.findElement(By.xpath(".//*[@id='txtaddrss1']"));
		addl1.sendKeys(line);	
	}
	public static void town(String city1){
		WebElement city = driver.findElement(By.xpath(".//*[@id='txttown']"));
		city.sendKeys(city1);	
	}
	public static void zipCode(String code){
		WebElement zipcode = driver.findElement(By.xpath(".//*[@id='txtzip']"));
		zipcode.sendKeys(code);	
	}
	public static void contiune2(){
		WebElement step2countinue = driver.findElement(By.xpath(".//*[@id='MainContent_btnRegister']"));
		step2countinue.click();
	}
	
	//Step3
	public static void iridNum(String id){
		WebElement IR_ID= driver.findElement(By.xpath(".//*[@id='btnVerifyPlacement']"));
		IR_ID.sendKeys(id);
	}
	
	public static void clickPlacement(){
		WebElement verifyPlacement = driver.findElement(By.xpath(".//*[@id='btnVerifyPlacement']"));
		verifyPlacement.click();
	}
	
	public static void trackCentre(String tc){
		Select dpTraCentre = new Select(driver.findElement(By.xpath(".//*[@id='ddlTCExt']")));
		dpTraCentre.selectByVisibleText(tc);
	}
	public static void clickLeftTC(){
		WebElement leftTC = driver.findElement(By.xpath(".//*[@id='radLeft']"));
		leftTC.click();
	}
	public static void clickRightTC(){
		WebElement rightTC = driver.findElement(By.xpath(".//*[@id='radRight']"));
		rightTC.click();
	}
	public static void clickCountinue3(){
		WebElement countinue3 = driver.findElement(By.xpath(".//*[@id='MainContent_btnContinuePlacement']"));
		countinue3.click();
	}
	
	//Step 4
	public static void clickSubmit(){
		WebElement submit = driver.findElement(By.xpath(".//*[@id='btnSubmit']"));
		submit.click();
	}
	
}