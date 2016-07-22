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
import com.pageObjects.InduPgObject;
import com.pageObjects.IraqEnvPgObject;
import com.util.EnvFormFill;
import com.util.PlcFormFill;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class enrollment_steps {
	public WebDriver driver;
	public LogInPgObject logInPgObject;
	public Base base;
	public PreRegisterPgObject preRegisterPgObject;
	public InduPgObject induPgObject;
	public Legal_disclaimerPgObject legal_disclaimerPgObject;
	public PlacementPgObject placementPgObject;
	public MembershipOptionsPgObject membershipOptionsPgObject;
	public ChoosePaymentPgObject choosePaymentPgObject;
	public EcardPaymentPgObject ecardPaymentPgObject;
	public LibyaEnvPgObject libyaEnvPgObject;
	public IraqEnvPgObject iraqEnvPgObject;
	public BurkinafasoEnvPgObject burkinafasoEnvPgObject;
	public RecepitPgObject recepitPgObject;
	public EnvFormFill envFormFill;
	public PlcFormFill plcFormFill;
	public String country;
	public String currency;
	public enrollment_steps (Base base){
		System.out.println("11111111111");
		this.base = base;
		this.driver=base.getDriver();
		induPgObject=new InduPgObject(driver);
		logInPgObject=new LogInPgObject(driver);
		preRegisterPgObject=new PreRegisterPgObject(driver);
		legal_disclaimerPgObject=new Legal_disclaimerPgObject(driver);
		placementPgObject=new PlacementPgObject(driver);
		membershipOptionsPgObject=new MembershipOptionsPgObject(driver);
		choosePaymentPgObject=new ChoosePaymentPgObject(driver);
		ecardPaymentPgObject=new EcardPaymentPgObject(driver);
		libyaEnvPgObject=new LibyaEnvPgObject(driver);
		burkinafasoEnvPgObject=new BurkinafasoEnvPgObject(driver);
		iraqEnvPgObject=new IraqEnvPgObject(driver);
		recepitPgObject=new RecepitPgObject(driver);
		plcFormFill=new PlcFormFill();
		envFormFill=new EnvFormFill();
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
	   envFormFill.InduEnvform(country, induPgObject, this.base);
	    Assert.assertEquals(driver.getCurrentUrl(),"https://portal.qntest.com/eStore/legal_disclaimer.aspx");
		}
		else if(country.equals("Libia")){
			envFormFill.LibEnvform(country, libyaEnvPgObject, this.base);
		}else if(country.equals("Burkina Faso")){
			country="burkina";
			envFormFill.BurEnvform(country, burkinafasoEnvPgObject, base);
		}else if(country.equals("Iraq")){
			envFormFill.IrqEnvform(country, iraqEnvPgObject, base);
		}
		legal_disclaimerPgObject.checkAccept();
	    legal_disclaimerPgObject.clickConfirm();
	}

	@When("^Fill up placement information$")
	public void fill_up_placement_information() throws Throwable {
		plcFormFill.PlcFill(country, placementPgObject, base);
	}

	@When("^Choose enrolment package$")
	public void choose_enrolment_package() throws Throwable {	
			membershipOptionsPgObject.clickContinue();	
	}

	@Then("^Select Payment \"([^\"]*)\"$")
	public void select_Payment(String currency) throws Throwable {
		this.currency=currency;
		choosePaymentPgObject.selectCurrency(currency);
		choosePaymentPgObject.selectEcard();
		
	}

	@Then("^Enter payment details$")
	public void enter_payment_details() throws Throwable {
		 plcFormFill.EcrdFill(country, ecardPaymentPgObject, base);
		
	}

	@Then("^click validate$")
	public void click_validate() throws Throwable {
		
			ecardPaymentPgObject.clickValidateBtn();
		
	}

	@Then("^click Confirm button$")
	public void click_Confirm_button() throws Throwable {	
		ecardPaymentPgObject.clickConfirmBtn();
	}
	
	@Then("^validate recepit$")
	public void validate_recepit() throws Throwable {
	    Assert.assertEquals("Language",base.propp.getProperty(country+"language"), recepitPgObject.getLanguage());
	    Assert.assertEquals("Logo", recepitPgObject.getLogo(),"true");
	    Assert.assertEquals("Fee", recepitPgObject.getFee(currency),base.propp.getProperty(country+"fee"));
	    Assert.assertEquals("Prefix", recepitPgObject.getPrefix(),base.propp.getProperty(country+"prefix"));
	    recepitPgObject.clickBuyNow();
	    Assert.assertEquals("BuyNowLink",driver.getCurrentUrl(),"https://portal.qntest.com/eStore/products.aspx?Category=&type=");
	}
	}
