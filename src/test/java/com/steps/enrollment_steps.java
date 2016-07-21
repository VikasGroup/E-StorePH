package com.steps;

import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.pageObjects.ChoosePaymentPgObject;
import com.pageObjects.EcardPaymentPgObject;
import com.pageObjects.Legal_disclaimerPgObject;
import com.pageObjects.LogInPgObject;
import com.pageObjects.MembershipOptionsPgObject;
import com.pageObjects.PlacementPgObject;
import com.pageObjects.PreRegisterPgObject;
import com.pageObjects.RegPgObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class enrollment_steps {
	public static WebDriver driver;
	public LogInPgObject logInPgObject;
	public Base base;
	public PreRegisterPgObject preRegisterPgObject;
	public RegPgObject regPgObject;
	public Legal_disclaimerPgObject legal_disclaimerPgObject;
	public PlacementPgObject placementPgObject;
	public MembershipOptionsPgObject membershipOptionsPgObject;
	public ChoosePaymentPgObject choosePaymentPgObject;
	public EcardPaymentPgObject ecardPaymentPgObject;
	public enrollment_steps (Base base){
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
	}
	@Given("^user open the login page$")
	public void user_open_the_login_page() throws Throwable {
	   driver.get("https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx");
	}

	@When("^user click on Register button$")
	public void user_click_on_Register_button() throws Throwable {
	    logInPgObject.clickRegister();
	    
	}

	@When("^preregister page should displayed with pop up window \"([^\"]*)\"$")
	public void preregister_page_should_displayed_with_pop_up_window(String preregurl) throws Throwable {
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

	@When("^Fill up placement information$")
	public void fill_up_placement_information() throws Throwable {
		placementPgObject.enterIRID(base.propp.getProperty("irid"));
		placementPgObject.clickVerifyBtn();
		placementPgObject.prefferPlacement(base.propp.getProperty("placementside"));
		placementPgObject.clickconfBtn();
	}

	@When("^Choose enrolment package$")
	public void choose_enrolment_package() throws Throwable {
		membershipOptionsPgObject.clickContinue();
	}

	@Then("^Select Payment \"([^\"]*)\"$")
	public void select_Payment(String currency) throws Throwable {
		choosePaymentPgObject.selectCurrency(currency);
		choosePaymentPgObject.selectEcard();
	}

	@Then("^Enter payment details$")
	public void enter_payment_details() throws Throwable {
	   ecardPaymentPgObject.enterEcardDetails(base.propp.getProperty("ecardno"),base.propp.getProperty("pin"));
	}

	@Then("^click validate$")
	public void click_validate() throws Throwable {
		ecardPaymentPgObject.clickValidateBtn();
	}

	@Then("^click Confirm button$")
	public void click_Confirm_button() throws Throwable {
		ecardPaymentPgObject.clickConfirmBtn();
	}

	}
