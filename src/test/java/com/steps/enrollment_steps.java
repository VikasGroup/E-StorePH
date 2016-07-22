package com.steps;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pageObjects.BurkinafasoEnvPgObject;
import com.pageObjects.ChoosePaymentPgObject;
import com.pageObjects.EcardPaymentPgObject;
import com.pageObjects.Legal_disclaimerPgObject;
import com.pageObjects.LibyaEnvPgObject;
import com.pageObjects.LogInPgObject;
import com.pageObjects.MembershipOptionsPgObject;
import com.pageObjects.PlacementPgObject;
import com.pageObjects.PreRegisterPgObject;
import com.pageObjects.RecepitPgObject;
import com.pageObjects.RegPgObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class enrollment_steps {
	public WebDriver driver;
	public LogInPgObject logInPgObject;
	public Base base;
	public PreRegisterPgObject preRegisterPgObject;
	public RegPgObject regPgObject;
	public Legal_disclaimerPgObject legal_disclaimerPgObject;
	public PlacementPgObject placementPgObject;
	public MembershipOptionsPgObject membershipOptionsPgObject;
	public ChoosePaymentPgObject choosePaymentPgObject;
	public EcardPaymentPgObject ecardPaymentPgObject;
	public LibyaEnvPgObject libyaEnvPgObject;
	public BurkinafasoEnvPgObject burkinafasoEnvPgObject;
	public RecepitPgObject recepitPgObject;
	public String country;
	public enrollment_steps (Base base){
		System.out.println("11111111111");
		this.base = base;
		this.driver=base.getDriver();
		regPgObject=new RegPgObject(driver);
		logInPgObject=new LogInPgObject(driver);
		preRegisterPgObject=new PreRegisterPgObject(driver);
		legal_disclaimerPgObject=new Legal_disclaimerPgObject(driver);
		placementPgObject=new PlacementPgObject(driver);
		membershipOptionsPgObject=new MembershipOptionsPgObject(driver);
		choosePaymentPgObject=new ChoosePaymentPgObject(driver);
		ecardPaymentPgObject=new EcardPaymentPgObject(driver);
		libyaEnvPgObject=new LibyaEnvPgObject(driver);
		burkinafasoEnvPgObject=new BurkinafasoEnvPgObject(driver);
		recepitPgObject=new RecepitPgObject(driver);
	}
	@Given("^user open the login page$")
	public void user_open_the_login_page() throws Throwable {
		System.out.println("11111111111");
	   driver.get("https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx");
	}

	@When("^user click on Register button$")
	public void user_click_on_Register_button() throws Throwable {
	    logInPgObject.clickRegister();
	    System.out.println("11111111111");
	}

	@When("^preregister page should displayed with pop up window \"([^\"]*)\"$")
	public void preregister_page_should_displayed_with_pop_up_window(String preregurl) throws Throwable {
		 String base = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();

			//set.remove(base);
			//assert set.size() == 1;
			
			if(set.toArray()[0].equals(base)){
				
			}else{
				driver.switchTo().window((String) set.toArray()[0]).close();
			}
			driver.switchTo().window(base);
			Assert.assertEquals(driver.getCurrentUrl(), preregurl);
		  	}
		
	
	@When("^Choose \"([^\"]*)\" in the language dropdown$")
	public void choose_in_the_language_dropdown(String langauge) throws Throwable {
		preRegisterPgObject.selectLanguage(langauge);
	}

	@When("^Enter \"([^\"]*)\" of referrer$")
	public void enter_of_referrer(String irid) throws Throwable {
	   preRegisterPgObject.enterIRID(irid);
	}

	@When("^Choose a \"([^\"]*)\" in Country I live in dropdown$")
	public void choose_a_in_Country_I_live_in_dropdown(String country) throws Throwable {
	   preRegisterPgObject.selectCountry(country);
	   this.country=country;
	}

	@When("^Choose \"([^\"]*)\"$")
	public void choose(String arg1) throws Throwable {
	  
	}

	@When("^click next button$")
	public void click_next_button() throws Throwable {
	    preRegisterPgObject.clickNextBtn();
	}

	@When("^then Confirm button$")
	public void then_Confirm_button() throws Throwable {
		 preRegisterPgObject.clickNextBtn();
	}

	@When("^validate registation page \"([^\"]*)\"$")
	public void validate_registation_page(String regurl) throws Throwable {
	    Assert.assertEquals(driver.getCurrentUrl(), regurl);
	}
    
	@When("^Fill up the registration form and agree to the terms in enrollment$")
	public void fill_up_the_registration_form_and_agree_to_the_terms_in_enrollment() throws Throwable {
		if(country.equals("Indonesia")){
	    regPgObject.selectTitle(base.propp.getProperty("title"));
	    regPgObject.enterSurname(base.propp.getProperty("surname"));
	    regPgObject.enterGiveName(base.propp.getProperty("given_name"));
	    regPgObject.EnterAddress(base.propp.getProperty("address1"));
	    regPgObject.enterTown(base.propp.getProperty("town"));
	    regPgObject.enterPostal(base.propp.getProperty("postal"));
	    regPgObject.enterHomePhone(base.propp.getProperty("homephone"));
	    
	    regPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
	    regPgObject.enterEmail(base.propp.getProperty("email"));
	    regPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
	    regPgObject.SelectValidIdType(base.propp.getProperty("validid"));
	    Thread.sleep(7000);
	    regPgObject.selectNationality(base.propp.getProperty("nationality"));
	    regPgObject.enterValidIdNo(base.propp.getProperty("valididno"));
	    regPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
	    regPgObject.selectdobdate(base.propp.getProperty("dobdate"));
	 	regPgObject.selectdobyear(base.propp.getProperty("dobyear"));
	    regPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
	    regPgObject.selectRelationship(base.propp.getProperty("relationship"));
	    regPgObject.enterMFName(base.propp.getProperty("mfname"));
	    regPgObject.selectPClang(base.propp.getProperty("pclang"));
	    regPgObject.selectSecques(base.propp.getProperty("secques"));
	    
	    regPgObject.enterAnswer(base.propp.getProperty("ans"));
	    regPgObject.enterSecword(base.propp.getProperty("secword"));
	    regPgObject.enterQApin(base.propp.getProperty("qapin"));
	    regPgObject.enterReQapin(base.propp.getProperty("reqapin"));
	    regPgObject.enterPwd(base.propp.getProperty("pwd"));
	    regPgObject.reenterPwd(base.propp.getProperty("repwd"));
	    
	    regPgObject.selectAgreement();
	    regPgObject.clickConfirmBtn();
	    
	    Assert.assertEquals(driver.getCurrentUrl(),"https://portal.qntest.com/eStore/legal_disclaimer.aspx");
	    
	    legal_disclaimerPgObject.checkAccept();
	    legal_disclaimerPgObject.clickConfirm();
		}
		else if(country.equals("Libia")){
			libyaEnvPgObject.selectTitle(base.propp.getProperty("title"));
			libyaEnvPgObject.enterSurname(base.propp.getProperty("surname"));
			libyaEnvPgObject.enterGiveName(base.propp.getProperty("given_name"));
			libyaEnvPgObject.EnterAddress(base.propp.getProperty("address1"));
			libyaEnvPgObject.enterTown(base.propp.getProperty("town"));
			libyaEnvPgObject.enterPostal(base.propp.getProperty("postal"));
			libyaEnvPgObject.enterHomePhone(base.propp.getProperty("homephone"));
		    
			libyaEnvPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
			libyaEnvPgObject.enterEmail(base.propp.getProperty("email"));
			libyaEnvPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
			libyaEnvPgObject.SelectValidIdType(base.propp.getProperty("validid"));
		    Thread.sleep(7000);
		    libyaEnvPgObject.selectNationality(base.propp.getProperty("nationality"));
		    libyaEnvPgObject.enterValidIdNo(base.propp.getProperty("valididno"));
		    libyaEnvPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		    libyaEnvPgObject.selectdobdate(base.propp.getProperty("dobdate"));
		    libyaEnvPgObject.selectdobyear(base.propp.getProperty("dobyear"));
		    libyaEnvPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
		    libyaEnvPgObject.selectRelationship(base.propp.getProperty("relationship"));
		    libyaEnvPgObject.enterMFName(base.propp.getProperty("mfname"));
		    libyaEnvPgObject.selectPClang(base.propp.getProperty("pclang"));
		    
		    libyaEnvPgObject.enterQApin(base.propp.getProperty("qapin"));
		    libyaEnvPgObject.enterReQapin(base.propp.getProperty("reqapin"));
		    libyaEnvPgObject.enterPwd(base.propp.getProperty("pwd"));
		    libyaEnvPgObject.reenterPwd(base.propp.getProperty("repwd"));
		    
		    libyaEnvPgObject.selectAgreement();
		    regPgObject.clickConfirmBtn();
		   
		   // Assert.assertEquals(driver.getCurrentUrl(),"https://portal.qntest.com/eStore/legal_disclaimer.aspx");
		    
		    legal_disclaimerPgObject.checkAccept();
		    legal_disclaimerPgObject.clickConfirm();
		}else if(country.equals("Burkina Faso")){
			burkinafasoEnvPgObject.selectTitle(base.propp.getProperty("title"));
			burkinafasoEnvPgObject.enterSurname(base.propp.getProperty("surname"));
			burkinafasoEnvPgObject.enterGiveName(base.propp.getProperty("given_name"));
			burkinafasoEnvPgObject.EnterAddress(base.propp.getProperty("address1"));
			burkinafasoEnvPgObject.enterTown(base.propp.getProperty("town"));
			burkinafasoEnvPgObject.enterPostal(base.propp.getProperty("postal"));
			burkinafasoEnvPgObject.enterHomePhone(base.propp.getProperty("homephone"));
		    
			burkinafasoEnvPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
			burkinafasoEnvPgObject.enterEmail(base.propp.getProperty("email"));
			burkinafasoEnvPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
			burkinafasoEnvPgObject.SelectValidIdType(base.propp.getProperty("validid"));
		    Thread.sleep(7000);
		    burkinafasoEnvPgObject.selectNationality(base.propp.getProperty("nationality"));
		    burkinafasoEnvPgObject.enterValidIdNo(base.propp.getProperty("valididno"));
		    burkinafasoEnvPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		    burkinafasoEnvPgObject.selectdobdate(base.propp.getProperty("dobdate"));
		    burkinafasoEnvPgObject.selectdobyear(base.propp.getProperty("dobyear"));
		    burkinafasoEnvPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
		    burkinafasoEnvPgObject.selectRelationship(base.propp.getProperty("relationship"));
		    burkinafasoEnvPgObject.enterMFName(base.propp.getProperty("mfname"));
		    burkinafasoEnvPgObject.selectPClang(base.propp.getProperty("pclang"));
		    
		    burkinafasoEnvPgObject.enterQApin(base.propp.getProperty("qapin"));
		    burkinafasoEnvPgObject.enterReQapin(base.propp.getProperty("reqapin"));
		    burkinafasoEnvPgObject.enterPwd(base.propp.getProperty("pwd"));
		    burkinafasoEnvPgObject.reenterPwd(base.propp.getProperty("repwd"));
		    
		    burkinafasoEnvPgObject.selectAgreement();
		    regPgObject.clickConfirmBtn();
		   
		   // Assert.assertEquals(driver.getCurrentUrl(),"https://portal.qntest.com/eStore/legal_disclaimer.aspx");
		    
		    legal_disclaimerPgObject.checkAccept();
		    legal_disclaimerPgObject.clickConfirm();
		}
	}

	@When("^Fill up placement information$")
	public void fill_up_placement_information() throws Throwable {
		if(country.equals("Indonesia")||country.equals("Burkina Faso")){
		placementPgObject.enterIRID(base.propp.getProperty("irid"));
		placementPgObject.clickVerifyBtn();
		placementPgObject.selectPlacement(base.propp.getProperty("tcp"));
		placementPgObject.prefferPlacement(base.propp.getProperty("placementside"));
		placementPgObject.clickconfBtn();
		}else if(country.equals("Libia")){
			placementPgObject.enterIRID(base.propp.getProperty("irid"));
			placementPgObject.clickVerifyBtn();
			placementPgObject.selectPlacement(base.propp.getProperty("tcp"));
			placementPgObject.prefferPlacement(base.propp.getProperty("placementside"));
			placementPgObject.clickconfBtn();
		}
	}

	@When("^Choose enrolment package$")
	public void choose_enrolment_package() throws Throwable {
		if(country.equals("Indonesia")||country.equals("Burkina Faso")){
		membershipOptionsPgObject.clickContinue();
		}else if(country.equals("Libia")){
			membershipOptionsPgObject.clickContinue();
		}
	}

	@Then("^Select Payment \"([^\"]*)\"$")
	public void select_Payment(String currency) throws Throwable {
		if(country.equals("Indonesia")||country.equals("Burkina Faso")){
		choosePaymentPgObject.selectCurrency(currency);
		choosePaymentPgObject.selectEcard();
		}else if(country.equals("Libia")){
			choosePaymentPgObject.selectCurrency(currency);
			choosePaymentPgObject.selectEcard();
		}
	}

	@Then("^Enter payment details$")
	public void enter_payment_details() throws Throwable {
		if(country.equals("Indonesia")||country.equals("Burkina Faso")){
	   ecardPaymentPgObject.enterEcardDetails(base.propp.getProperty("ecardno"),base.propp.getProperty("pin"));
		}else if(country.equals("Libia")){
			 ecardPaymentPgObject.enterEcardDetails(base.propp.getProperty("ecardno"),base.propp.getProperty("pin"));
		}
	}

	@Then("^click validate$")
	public void click_validate() throws Throwable {
		if(country.equals("Indonesia")||country.equals("Burkina Faso")){
		ecardPaymentPgObject.clickValidateBtn();
		}else if(country.equals("Libia")){
			ecardPaymentPgObject.clickValidateBtn();
		}
	}

	@Then("^click Confirm button$")
	public void click_Confirm_button() throws Throwable {
		if(country.equals("Indonesia")||country.equals("Burkina Faso")){
		ecardPaymentPgObject.clickConfirmBtn();
	}else if(country.equals("Libia")){
		ecardPaymentPgObject.clickConfirmBtn();
	}

	}
	@Then("^validate recepit$")
	public void validate_recepit() throws Throwable {
	    Assert.assertEquals("Language",base.propp.getProperty("language"), recepitPgObject.getLanguage());
	    Assert.assertEquals("Logo", recepitPgObject.getLogo(),"true");
	    Assert.assertEquals("Fee", recepitPgObject.getFee(),base.propp.getProperty("fee"));
	    Assert.assertEquals("Prefix", recepitPgObject.getPrefix(),base.propp.getProperty("prefix"));
	    recepitPgObject.clickBuyNow();
	    Assert.assertEquals("BuyNowLink",driver.getCurrentUrl(),"https://portal.qntest.com/eStore/products.aspx?Category=&type=");
	}
	}
