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
	public static void enterReferrer(String value){
		WebElement referrerIrID = driver.findElement(By.xpath(".//*[@id='txtReferrer']"));
		referrerIrID.sendKeys(value);
	}
	
	public static void selectCountry(String value){
		Select dpCountry= new Select(driver.findElement(By.xpath(".//*[@id='ddlCountry']")));
		dpCountry.selectByIndex(Integer.parseInt(value));
		
	}

	public static void continue1(){
		WebElement step1countinue = driver.findElement(By.xpath(".//*[@id='btnVerifyReferrer']"));
		step1countinue.click();
	}
	//step2
	public static void selectTitle(String value){
		Select dpTitle = new Select(driver.findElement(By.xpath(".//*[@id='ddlTitle']")));
		dpTitle.selectByIndex(Integer.parseInt(value));
	}
	
	public static void firstName(String value){
		WebElement fName = driver.findElement(By.xpath(".//*[@id='txtFirstName']"));
		fName.sendKeys(value);
	}
	
	public static void lastName(String value){
		WebElement lName = driver.findElement(By.xpath(".//*[@id='txtLastName']"));
		lName.sendKeys(value);
	}
	
	public static void dobMonth(String value){
		Select dpMonth = new Select(driver.findElement(By.xpath(".//*[@id='ddlMonth']")));
		dpMonth.selectByIndex(Integer.parseInt(value));
	}
	
	public static void dobDate(String value){
		Select dpDate = new Select(driver.findElement(By.xpath(".//*[@id='ddlDate']")));
		dpDate.selectByIndex(Integer.parseInt(value));
	}
	
	public static void dobYear(String value){
		Select dpYear = new Select(driver.findElement(By.xpath(".//*[@id='ddlYear']")));
		dpYear.selectByIndex(Integer.parseInt(value));
	}
	
	public static void email(String value){
		WebElement emailAdd = driver.findElement(By.xpath(".//*[@id='txtEmailAdd']"));
		emailAdd.sendKeys(value);
	}
	
	public static void reTypeEmail(String value){
		WebElement reEmail  = driver.findElement(By.xpath(".//*[@id='txtEmailAddConfirmation']"));
		reEmail.sendKeys(value);	
	}
	
	public static void selectContNo(String value){
		Select dpContactNum = new Select(driver.findElement(By.xpath(".//*[@id='ddlPreferredContact']")));
		dpContactNum.selectByIndex(Integer.parseInt(value));
	}
	public static void contNo(String value){
		WebElement contactNo = driver.findElement(By.xpath(".//*[@id='txtPreferredContactNo']"));
		contactNo.sendKeys(value);	
	}
	public static void password(String value){
		WebElement passWord  = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		passWord.sendKeys(value);	
	}
	public static void rePassword(String value){
		WebElement repwd = driver.findElement(By.xpath(".//*[@id='txtReTypePassword']"));
		repwd.sendKeys(value);	
	}
	public static void addline1(String value){
		WebElement addl1 = driver.findElement(By.xpath(".//*[@id='txtaddrss1']"));
		addl1.sendKeys(value);	
	}
	public static void town(String value){
		WebElement city = driver.findElement(By.xpath(".//*[@id='txttown']"));
		city.sendKeys(value);	
	}
	public static void zipCode(String value){
		WebElement zipcode = driver.findElement(By.xpath(".//*[@id='txtzip']"));
		zipcode.sendKeys(value);	
	}
	public static void contiune2(){
		WebElement step2countinue = driver.findElement(By.xpath(".//*[@id='MainContent_btnRegister']"));
		step2countinue.click();
	}
	
	//Step3
	public static void iridNum(String value){
		WebElement IR_ID= driver.findElement(By.xpath(".//*[@id='btnVerifyPlacement']"));
		IR_ID.sendKeys(value);
	}
	
	public static void clickPlacement(){
		WebElement verifyPlacement = driver.findElement(By.xpath(".//*[@id='btnVerifyPlacement']"));
		verifyPlacement.click();
	}
	
	public static void trackCentre(String value){
		Select dpTraCentre = new Select(driver.findElement(By.xpath(".//*[@id='ddlTCExt']")));
		dpTraCentre.selectByIndex(Integer.parseInt(value));
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