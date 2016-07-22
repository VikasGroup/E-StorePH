package com.util;

import com.base.Base;
import com.pageObjects.ArmeniaEnvPgObject;
import com.pageObjects.AzerbaijanEnvPgObject;
import com.pageObjects.CoteDIvoireEnvPgObject;
import com.pageObjects.EthiopiaEnvPgObject;
import com.pageObjects.GeorgiaEnvPgObject;
import com.pageObjects.MyanmarEnvPgObject;
import com.pageObjects.SyrianArabRepublicEnvPgObject;

public class EnvFormFill {

	public void MyaEnvForm(String prex,MyanmarEnvPgObject myanmarEnvObject , Base base){
		
		myanmarEnvObject.selectTitle(base.propp.getProperty("title"));
		myanmarEnvObject.selectTitle(base.propp.getProperty("title"));
		myanmarEnvObject.enterSurname(base.propp.getProperty("surname"));
		myanmarEnvObject.enterGiveName(base.propp.getProperty("given_name"));
		myanmarEnvObject.EnterAddress(base.propp.getProperty("address1"));
		myanmarEnvObject.enterTown(base.propp.getProperty("town"));
		myanmarEnvObject.enterPostal(base.propp.getProperty("postal"));
		myanmarEnvObject.enterHomePhone(base.propp.getProperty("homephone"));      
		myanmarEnvObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		myanmarEnvObject.enterEmail(base.propp.getProperty("email"));
		myanmarEnvObject.ReEnterEmail(base.propp.getProperty("reemail"));
		myanmarEnvObject.SelectValidIdType(base.propp.getProperty("validid"));
		myanmarEnvObject.enterValidIdNo(base.propp.getProperty("valididno")); 
		myanmarEnvObject.selectNationality(base.propp.getProperty("nationality"));
		myanmarEnvObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		myanmarEnvObject.selectdobdate(base.propp.getProperty("dobdate"));
		myanmarEnvObject.selectdobyear(base.propp.getProperty("dobyear"));
		myanmarEnvObject.enterBenificiary(base.propp.getProperty("benificiary"));
		myanmarEnvObject.selectRelationship(base.propp.getProperty("relationship"));
		myanmarEnvObject.enterMFName(base.propp.getProperty("mfname"));
		myanmarEnvObject.selectPClang(base.propp.getProperty("pclang"));
		myanmarEnvObject.selectSecques(base.propp.getProperty("secques"));
		myanmarEnvObject.enterAnswer(base.propp.getProperty("ans"));
		myanmarEnvObject.enterSecword(base.propp.getProperty("secword"));
		myanmarEnvObject.enterQApin(base.propp.getProperty("qapin"));
		myanmarEnvObject.enterReQapin(base.propp.getProperty("reqapin"));
		myanmarEnvObject.enterPwd(base.propp.getProperty("pwd"));
		myanmarEnvObject.reenterPwd(base.propp.getProperty("repwd"));  
		myanmarEnvObject.selectAgreement();
		myanmarEnvObject.clickConfirmBtn(); 
	}
	
	public void GeoEnvForm(String prex,GeorgiaEnvPgObject georgiaEnvObject , Base base){
		
		georgiaEnvObject.selectTitle(base.propp.getProperty("title"));
		georgiaEnvObject.selectTitle(base.propp.getProperty("title"));
		georgiaEnvObject.enterSurname(base.propp.getProperty("surname"));
		georgiaEnvObject.enterGiveName(base.propp.getProperty("given_name"));
		georgiaEnvObject.EnterAddress(base.propp.getProperty("address1"));
		georgiaEnvObject.enterTown(base.propp.getProperty("town"));
		georgiaEnvObject.enterPostal(base.propp.getProperty("postal"));
		georgiaEnvObject.enterHomePhone(base.propp.getProperty("homephone"));      
		georgiaEnvObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		georgiaEnvObject.enterEmail(base.propp.getProperty("email"));
		georgiaEnvObject.ReEnterEmail(base.propp.getProperty("reemail"));
		georgiaEnvObject.SelectValidIdType(base.propp.getProperty("validid"));
		georgiaEnvObject.enterValidIdNo(base.propp.getProperty("valididno")); 
		georgiaEnvObject.selectNationality(base.propp.getProperty("nationality"));
		georgiaEnvObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		georgiaEnvObject.selectdobdate(base.propp.getProperty("dobdate"));
		georgiaEnvObject.selectdobyear(base.propp.getProperty("dobyear"));
		georgiaEnvObject.enterBenificiary(base.propp.getProperty("benificiary"));
		georgiaEnvObject.selectRelationship(base.propp.getProperty("relationship"));
		georgiaEnvObject.enterMFName(base.propp.getProperty("mfname"));
		georgiaEnvObject.selectPClang(base.propp.getProperty("pclang"));
		georgiaEnvObject.selectSecques(base.propp.getProperty("secques"));
		georgiaEnvObject.enterAnswer(base.propp.getProperty("ans"));
		georgiaEnvObject.enterSecword(base.propp.getProperty("secword"));
		georgiaEnvObject.enterQApin(base.propp.getProperty("qapin"));
		georgiaEnvObject.enterReQapin(base.propp.getProperty("reqapin"));
		georgiaEnvObject.enterPwd(base.propp.getProperty("pwd"));
		georgiaEnvObject.reenterPwd(base.propp.getProperty("repwd"));  
		georgiaEnvObject.selectAgreement();
		georgiaEnvObject.clickConfirmBtn(); 	
	}
	
	public void EthEnvForm(String prex,EthiopiaEnvPgObject ethiopiaEnvPgObject , Base base){
		
		ethiopiaEnvPgObject.selectTitle(base.propp.getProperty("title"));
		ethiopiaEnvPgObject.selectTitle(base.propp.getProperty("title"));
		ethiopiaEnvPgObject.enterSurname(base.propp.getProperty("surname"));
		ethiopiaEnvPgObject.enterGiveName(base.propp.getProperty("given_name"));
		ethiopiaEnvPgObject.EnterAddress(base.propp.getProperty("address1"));
		ethiopiaEnvPgObject.enterTown(base.propp.getProperty("town"));
		ethiopiaEnvPgObject.enterPostal(base.propp.getProperty("postal"));
		ethiopiaEnvPgObject.enterHomePhone(base.propp.getProperty("homephone"));      
		ethiopiaEnvPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		ethiopiaEnvPgObject.enterEmail(base.propp.getProperty("email"));
		ethiopiaEnvPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
		ethiopiaEnvPgObject.SelectValidIdType(base.propp.getProperty("validid"));
		ethiopiaEnvPgObject.enterValidIdNo(base.propp.getProperty("valididno")); 
		ethiopiaEnvPgObject.selectNationality(base.propp.getProperty("nationality"));
		ethiopiaEnvPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		ethiopiaEnvPgObject.selectdobdate(base.propp.getProperty("dobdate"));
		ethiopiaEnvPgObject.selectdobyear(base.propp.getProperty("dobyear"));
		ethiopiaEnvPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
		ethiopiaEnvPgObject.selectRelationship(base.propp.getProperty("relationship"));
		ethiopiaEnvPgObject.enterMFName(base.propp.getProperty("mfname"));
		ethiopiaEnvPgObject.selectPClang(base.propp.getProperty("pclang"));
		ethiopiaEnvPgObject.selectSecques(base.propp.getProperty("secques"));
		ethiopiaEnvPgObject.enterAnswer(base.propp.getProperty("ans"));
		ethiopiaEnvPgObject.enterSecword(base.propp.getProperty("secword"));
		ethiopiaEnvPgObject.enterQApin(base.propp.getProperty("qapin"));
		ethiopiaEnvPgObject.enterReQapin(base.propp.getProperty("reqapin"));
		ethiopiaEnvPgObject.enterPwd(base.propp.getProperty("pwd"));
		ethiopiaEnvPgObject.reenterPwd(base.propp.getProperty("repwd"));  
		ethiopiaEnvPgObject.selectAgreement();
		ethiopiaEnvPgObject.clickConfirmBtn(); 
	}
	public void CotEnvForm(String prex,CoteDIvoireEnvPgObject coteDIvoireEnvPgObject , Base base){
		
		coteDIvoireEnvPgObject.selectTitle(base.propp.getProperty("title"));
		coteDIvoireEnvPgObject.enterSurname(base.propp.getProperty("surname"));
		coteDIvoireEnvPgObject.enterGiveName(base.propp.getProperty("given_name"));
		coteDIvoireEnvPgObject.EnterAddress(base.propp.getProperty("address1"));
		coteDIvoireEnvPgObject.selectTown(base.propp.getProperty("town"));
		coteDIvoireEnvPgObject.enterPostal(base.propp.getProperty("postal"));
		coteDIvoireEnvPgObject.enterHomePhone(base.propp.getProperty("homephone")); 
		coteDIvoireEnvPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		coteDIvoireEnvPgObject.enterEmail(base.propp.getProperty("email"));
		coteDIvoireEnvPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
		coteDIvoireEnvPgObject.SelectValidIdType(base.propp.getProperty("validid"));   
		coteDIvoireEnvPgObject.selectNationality(base.propp.getProperty("nationality"));
		coteDIvoireEnvPgObject.enterValidIdNo(base.propp.getProperty("valididno"));
		coteDIvoireEnvPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		coteDIvoireEnvPgObject.selectdobdate(base.propp.getProperty("dobdate"));
		coteDIvoireEnvPgObject.selectdobyear(base.propp.getProperty("dobyear"));
		coteDIvoireEnvPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
		coteDIvoireEnvPgObject.selectRelationship(base.propp.getProperty("relationship"));
		coteDIvoireEnvPgObject.enterMFName(base.propp.getProperty("mfname"));
		coteDIvoireEnvPgObject.selectPClang(base.propp.getProperty("pclang"));		      
		coteDIvoireEnvPgObject.enterQApin(base.propp.getProperty("qapin"));
		coteDIvoireEnvPgObject.enterReQapin(base.propp.getProperty("reqapin"));
		coteDIvoireEnvPgObject.enterPwd(base.propp.getProperty("pwd"));
		coteDIvoireEnvPgObject.reenterPwd(base.propp.getProperty("repwd"));		      
		coteDIvoireEnvPgObject.selectAgreement();
		coteDIvoireEnvPgObject.clickConfirmBtn();		
	}
	public void ArmEnvForm(String prex,ArmeniaEnvPgObject armeniaEnvPgObject, Base base){
		armeniaEnvPgObject.selectTitle(base.propp.getProperty("title"));
		armeniaEnvPgObject.enterSurname(base.propp.getProperty("surname"));
		armeniaEnvPgObject.enterGiveName(base.propp.getProperty("given_name"));
		armeniaEnvPgObject.EnterAddress(base.propp.getProperty("address1"));
		armeniaEnvPgObject.enterTown(base.propp.getProperty("town"));
		armeniaEnvPgObject.enterPostal(base.propp.getProperty("postal"));
		armeniaEnvPgObject.enterHomePhone(base.propp.getProperty("homephone"));		      
		armeniaEnvPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		armeniaEnvPgObject.enterEmail(base.propp.getProperty("email"));
		armeniaEnvPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
		armeniaEnvPgObject.SelectValidIdType(base.propp.getProperty("validid"));		      
		armeniaEnvPgObject.selectNationality(base.propp.getProperty("nationality"));
		armeniaEnvPgObject.enterValidIdNo(base.propp.getProperty("valididno"));
		armeniaEnvPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		armeniaEnvPgObject.selectdobdate(base.propp.getProperty("dobdate"));
		armeniaEnvPgObject.selectdobyear(base.propp.getProperty("dobyear"));
		armeniaEnvPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
		armeniaEnvPgObject.selectRelationship(base.propp.getProperty("relationship"));
		armeniaEnvPgObject.enterMFName(base.propp.getProperty("mfname"));
		armeniaEnvPgObject.selectPClang(base.propp.getProperty("pclang"));		      
		armeniaEnvPgObject.enterQApin(base.propp.getProperty("qapin"));
		armeniaEnvPgObject.enterReQapin(base.propp.getProperty("reqapin"));
		armeniaEnvPgObject.enterPwd(base.propp.getProperty("pwd"));
		armeniaEnvPgObject.reenterPwd(base.propp.getProperty("repwd"));		      
		armeniaEnvPgObject.selectAgreement();
		armeniaEnvPgObject.clickConfirmBtn();
	}
	public void AzrEnvForm(String prex,AzerbaijanEnvPgObject azerbaijanEnvPgObject , Base base){
		azerbaijanEnvPgObject.selectTitle(base.propp.getProperty("title"));
		azerbaijanEnvPgObject.enterSurname(base.propp.getProperty("surname"));
		azerbaijanEnvPgObject.enterGiveName(base.propp.getProperty("given_name"));
		azerbaijanEnvPgObject.EnterAddress(base.propp.getProperty("address1"));
		azerbaijanEnvPgObject.enterTown(base.propp.getProperty("town"));
		azerbaijanEnvPgObject.enterPostal(base.propp.getProperty("postal"));
		azerbaijanEnvPgObject.enterHomePhone(base.propp.getProperty("homephone"));		      
		azerbaijanEnvPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		azerbaijanEnvPgObject.enterEmail(base.propp.getProperty("email"));
		azerbaijanEnvPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
		azerbaijanEnvPgObject.SelectValidIdType(base.propp.getProperty("validid"));		      
		azerbaijanEnvPgObject.selectNationality(base.propp.getProperty("nationality"));
		azerbaijanEnvPgObject.enterValidIdNo(base.propp.getProperty("valididno"));
		azerbaijanEnvPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		azerbaijanEnvPgObject.selectdobdate(base.propp.getProperty("dobdate"));
		azerbaijanEnvPgObject.selectdobyear(base.propp.getProperty("dobyear"));
		azerbaijanEnvPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
		azerbaijanEnvPgObject.selectRelationship(base.propp.getProperty("relationship"));
		azerbaijanEnvPgObject.enterMFName(base.propp.getProperty("mfname"));
		azerbaijanEnvPgObject.selectPClang(base.propp.getProperty("pclang"));		      
		azerbaijanEnvPgObject.enterQApin(base.propp.getProperty("qapin"));
		azerbaijanEnvPgObject.enterReQapin(base.propp.getProperty("reqapin"));
		azerbaijanEnvPgObject.enterPwd(base.propp.getProperty("pwd"));
		azerbaijanEnvPgObject.reenterPwd(base.propp.getProperty("repwd"));		      
		azerbaijanEnvPgObject.selectAgreement();
		azerbaijanEnvPgObject.clickConfirmBtn();
	}
	public void SyrEnvForm(String prex,SyrianArabRepublicEnvPgObject syrianArabRepublicEnvPgObject, Base base){
		syrianArabRepublicEnvPgObject.selectTitle(base.propp.getProperty("title"));
		syrianArabRepublicEnvPgObject.enterSurname(base.propp.getProperty("surname"));
		syrianArabRepublicEnvPgObject.enterGiveName(base.propp.getProperty("given_name"));
		syrianArabRepublicEnvPgObject.EnterAddress(base.propp.getProperty("address1"));
		syrianArabRepublicEnvPgObject.selectTown(base.propp.getProperty("town"));
		syrianArabRepublicEnvPgObject.enterPostal(base.propp.getProperty("postal"));
		syrianArabRepublicEnvPgObject.enterHomePhone(base.propp.getProperty("homephone"));
		syrianArabRepublicEnvPgObject.enterHomePhonePrefix(base.propp.getProperty(" "));  
		syrianArabRepublicEnvPgObject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		syrianArabRepublicEnvPgObject.enterEmail(base.propp.getProperty("email"));
		syrianArabRepublicEnvPgObject.ReEnterEmail(base.propp.getProperty("reemail"));
		syrianArabRepublicEnvPgObject.SelectValidIdType(base.propp.getProperty("validid"));		      
		syrianArabRepublicEnvPgObject.enterValidIdNo(base.propp.getProperty("valididno"));
		syrianArabRepublicEnvPgObject.selectdobmonth(base.propp.getProperty("dobmonth"));
		syrianArabRepublicEnvPgObject.selectdobdate(base.propp.getProperty("dobdate"));
		syrianArabRepublicEnvPgObject.selectdobyear(base.propp.getProperty("dobyear"));
		syrianArabRepublicEnvPgObject.enterBenificiary(base.propp.getProperty("benificiary"));
		syrianArabRepublicEnvPgObject.selectRelationship(base.propp.getProperty("relationship"));
		syrianArabRepublicEnvPgObject.enterMFName(base.propp.getProperty("mfname"));
		syrianArabRepublicEnvPgObject.selectPClang(base.propp.getProperty("pclang"));		      
		syrianArabRepublicEnvPgObject.enterQApin(base.propp.getProperty("qapin"));
		syrianArabRepublicEnvPgObject.enterReQapin(base.propp.getProperty("reqapin"));
		syrianArabRepublicEnvPgObject.enterPwd(base.propp.getProperty("pwd"));
		syrianArabRepublicEnvPgObject.reenterPwd(base.propp.getProperty("repwd"));		  
		syrianArabRepublicEnvPgObject.selectAgreement();
		syrianArabRepublicEnvPgObject.clickConfirmBtn();
	}
	

}
