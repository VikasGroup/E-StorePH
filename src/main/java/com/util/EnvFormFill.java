package com.util;

import com.base.Base;
import com.pageObjects.ArmeniaEnvPgObject;
import com.pageObjects.AzerbaijanEnvPgObject;
import com.pageObjects.CoteDIvoireEnvPgObject;
import com.pageObjects.EthiopiaEnvPgObject;
import com.pageObjects.GeorgiaEnvPgObject;
import com.pageObjects.MyanmarEnvPgObject;
import com.pageObjects.SyrianArabRepublicEnvPgObject;
import com.pageObjects.TunisiaEnvPgObject;

public class EnvFormFill {

	public void MyaEnvForm(String prex,MyanmarEnvPgObject myanmarEnvObject , Base base){
		
		myanmarEnvObject.selectTitle(base.propp.getProperty(prex+ "title"));
		myanmarEnvObject.selectTitle(base.propp.getProperty(prex+ "title"));
		myanmarEnvObject.enterSurname(base.propp.getProperty(prex+ "surname"));
		myanmarEnvObject.enterGiveName(base.propp.getProperty(prex+ "given_name"));
		myanmarEnvObject.EnterAddress(base.propp.getProperty(prex+ "address1"));
		myanmarEnvObject.enterTown(base.propp.getProperty(prex+ "town"));
		myanmarEnvObject.enterPostal(base.propp.getProperty(prex+ "postal"));
		myanmarEnvObject.enterHomePhone(base.propp.getProperty(prex+ "homephone"));      
		myanmarEnvObject.enterMoblieNumber(base.propp.getProperty(prex+ "mobilephone"));
		myanmarEnvObject.enterEmail(base.propp.getProperty(prex+ "email"));
		myanmarEnvObject.ReEnterEmail(base.propp.getProperty(prex+ "reemail"));
		myanmarEnvObject.SelectValidIdType(base.propp.getProperty(prex+ "validid"));
		myanmarEnvObject.enterValidIdNo(base.propp.getProperty(prex+ "valididno")); 
		myanmarEnvObject.selectNationality(base.propp.getProperty(prex+ "nationality"));
		myanmarEnvObject.selectdobmonth(base.propp.getProperty(prex+ "dobmonth"));
		myanmarEnvObject.selectdobdate(base.propp.getProperty(prex+ "dobdate"));
		myanmarEnvObject.selectdobyear(base.propp.getProperty(prex+ "dobyear"));
		myanmarEnvObject.enterBenificiary(base.propp.getProperty(prex+ "benificiary"));
		myanmarEnvObject.selectRelationship(base.propp.getProperty(prex+ "relationship"));
		myanmarEnvObject.enterMFName(base.propp.getProperty(prex+ "mfname"));
		myanmarEnvObject.selectPClang(base.propp.getProperty(prex+ "pclang"));
		myanmarEnvObject.selectSecques(base.propp.getProperty(prex+ "secques"));
		myanmarEnvObject.enterAnswer(base.propp.getProperty(prex+ "ans"));
		myanmarEnvObject.enterSecword(base.propp.getProperty(prex+ "secword"));
		myanmarEnvObject.enterQApin(base.propp.getProperty(prex+ "qapin"));
		myanmarEnvObject.enterReQapin(base.propp.getProperty(prex+ "reqapin"));
		myanmarEnvObject.enterPwd(base.propp.getProperty(prex+ "pwd"));
		myanmarEnvObject.reenterPwd(base.propp.getProperty(prex+ "repwd"));  
		myanmarEnvObject.selectAgreement();
		myanmarEnvObject.clickConfirmBtn(); 
	}
	
	public void GeoEnvForm(String prex,GeorgiaEnvPgObject georgiaEnvObject , Base base){
		
		georgiaEnvObject.selectTitle(base.propp.getProperty(prex+ "title"));
		georgiaEnvObject.selectTitle(base.propp.getProperty(prex+ "title"));
		georgiaEnvObject.enterSurname(base.propp.getProperty(prex+ "surname"));
		georgiaEnvObject.enterGiveName(base.propp.getProperty(prex+ "given_name"));
		georgiaEnvObject.EnterAddress(base.propp.getProperty(prex+ "address1"));
		georgiaEnvObject.enterTown(base.propp.getProperty(prex+ "town"));
		georgiaEnvObject.enterPostal(base.propp.getProperty(prex+ "postal"));
		georgiaEnvObject.enterHomePhone(base.propp.getProperty(prex+ "homephone"));      
		georgiaEnvObject.enterMoblieNumber(base.propp.getProperty(prex+ "mobilephone"));
		georgiaEnvObject.enterEmail(base.propp.getProperty(prex+ "email"));
		georgiaEnvObject.ReEnterEmail(base.propp.getProperty(prex+ "reemail"));
		georgiaEnvObject.SelectValidIdType(base.propp.getProperty(prex+ "validid"));
		georgiaEnvObject.enterValidIdNo(base.propp.getProperty(prex+ "valididno")); 
		georgiaEnvObject.selectNationality(base.propp.getProperty(prex+ "nationality"));
		georgiaEnvObject.selectdobmonth(base.propp.getProperty(prex+ "dobmonth"));
		georgiaEnvObject.selectdobdate(base.propp.getProperty(prex+ "dobdate"));
		georgiaEnvObject.selectdobyear(base.propp.getProperty(prex+ "dobyear"));
		georgiaEnvObject.enterBenificiary(base.propp.getProperty(prex+ "benificiary"));
		georgiaEnvObject.selectRelationship(base.propp.getProperty(prex+ "relationship"));
		georgiaEnvObject.enterMFName(base.propp.getProperty(prex+ "mfname"));
		georgiaEnvObject.selectPClang(base.propp.getProperty(prex+ "pclang"));
		georgiaEnvObject.selectSecques(base.propp.getProperty(prex+ "secques"));
		georgiaEnvObject.enterAnswer(base.propp.getProperty(prex+ "ans"));
		georgiaEnvObject.enterSecword(base.propp.getProperty(prex+ "secword"));
		georgiaEnvObject.enterQApin(base.propp.getProperty(prex+ "qapin"));
		georgiaEnvObject.enterReQapin(base.propp.getProperty(prex+ "reqapin"));
		georgiaEnvObject.enterPwd(base.propp.getProperty(prex+ "pwd"));
		georgiaEnvObject.reenterPwd(base.propp.getProperty(prex+ "repwd"));  
		georgiaEnvObject.selectAgreement();
		georgiaEnvObject.clickConfirmBtn(); 	
	}
	
	public void EthEnvForm(String prex,EthiopiaEnvPgObject ethiopiaEnvPgObject , Base base){
		
		ethiopiaEnvPgObject.selectTitle(base.propp.getProperty(prex+ "title"));
		ethiopiaEnvPgObject.selectTitle(base.propp.getProperty(prex+ "title"));
		ethiopiaEnvPgObject.enterSurname(base.propp.getProperty(prex+ "surname"));
		ethiopiaEnvPgObject.enterGiveName(base.propp.getProperty(prex+ "given_name"));
		ethiopiaEnvPgObject.EnterAddress(base.propp.getProperty(prex+ "address1"));
		ethiopiaEnvPgObject.enterTown(base.propp.getProperty(prex+ "town"));
		ethiopiaEnvPgObject.enterPostal(base.propp.getProperty(prex+ "postal"));
		ethiopiaEnvPgObject.enterHomePhone(base.propp.getProperty(prex+ "homephone"));      
		ethiopiaEnvPgObject.enterMoblieNumber(base.propp.getProperty(prex+ "mobilephone"));
		ethiopiaEnvPgObject.enterEmail(base.propp.getProperty(prex+ "email"));
		ethiopiaEnvPgObject.ReEnterEmail(base.propp.getProperty(prex+ "reemail"));
		ethiopiaEnvPgObject.SelectValidIdType(base.propp.getProperty(prex+ "validid"));
		ethiopiaEnvPgObject.enterValidIdNo(base.propp.getProperty(prex+ "valididno")); 
		ethiopiaEnvPgObject.selectNationality(base.propp.getProperty(prex+ "nationality"));
		ethiopiaEnvPgObject.selectdobmonth(base.propp.getProperty(prex+ "dobmonth"));
		ethiopiaEnvPgObject.selectdobdate(base.propp.getProperty(prex+ "dobdate"));
		ethiopiaEnvPgObject.selectdobyear(base.propp.getProperty(prex+ "dobyear"));
		ethiopiaEnvPgObject.enterBenificiary(base.propp.getProperty(prex+ "benificiary"));
		ethiopiaEnvPgObject.selectRelationship(base.propp.getProperty(prex+ "relationship"));
		ethiopiaEnvPgObject.enterMFName(base.propp.getProperty(prex+ "mfname"));
		ethiopiaEnvPgObject.selectPClang(base.propp.getProperty(prex+ "pclang"));
		ethiopiaEnvPgObject.selectSecques(base.propp.getProperty(prex+ "secques"));
		ethiopiaEnvPgObject.enterAnswer(base.propp.getProperty(prex+ "ans"));
		ethiopiaEnvPgObject.enterSecword(base.propp.getProperty(prex+ "secword"));
		ethiopiaEnvPgObject.enterQApin(base.propp.getProperty(prex+ "qapin"));
		ethiopiaEnvPgObject.enterReQapin(base.propp.getProperty(prex+ "reqapin"));
		ethiopiaEnvPgObject.enterPwd(base.propp.getProperty(prex+ "pwd"));
		ethiopiaEnvPgObject.reenterPwd(base.propp.getProperty(prex+ "repwd"));  
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
		armeniaEnvPgObject.selectTitle(base.propp.getProperty(prex+ "title"));
		armeniaEnvPgObject.enterSurname(base.propp.getProperty(prex+ "surname"));
		armeniaEnvPgObject.enterGiveName(base.propp.getProperty(prex+ "given_name"));
		armeniaEnvPgObject.EnterAddress(base.propp.getProperty(prex+ "address1"));
		armeniaEnvPgObject.enterTown(base.propp.getProperty(prex+ "town"));
		armeniaEnvPgObject.enterPostal(base.propp.getProperty(prex+ "postal"));
		armeniaEnvPgObject.enterHomePhone(base.propp.getProperty(prex+ "homephone"));		      
		armeniaEnvPgObject.enterMoblieNumber(base.propp.getProperty(prex+ "mobilephone"));
		armeniaEnvPgObject.enterEmail(base.propp.getProperty(prex+ "email"));
		armeniaEnvPgObject.ReEnterEmail(base.propp.getProperty(prex+ "reemail"));
		armeniaEnvPgObject.SelectValidIdType(base.propp.getProperty(prex+ "validid"));		      
		armeniaEnvPgObject.selectNationality(base.propp.getProperty(prex+ "nationality"));
		armeniaEnvPgObject.enterValidIdNo(base.propp.getProperty(prex+ "valididno"));
		armeniaEnvPgObject.selectdobmonth(base.propp.getProperty(prex+ "dobmonth"));
		armeniaEnvPgObject.selectdobdate(base.propp.getProperty(prex+ "dobdate"));
		armeniaEnvPgObject.selectdobyear(base.propp.getProperty(prex+ "dobyear"));
		armeniaEnvPgObject.enterBenificiary(base.propp.getProperty(prex+ "benificiary"));
		armeniaEnvPgObject.selectRelationship(base.propp.getProperty(prex+ "relationship"));
		armeniaEnvPgObject.enterMFName(base.propp.getProperty(prex+ "mfname"));
		armeniaEnvPgObject.selectPClang(base.propp.getProperty(prex+ "pclang"));		      
		armeniaEnvPgObject.enterQApin(base.propp.getProperty(prex+ "qapin"));
		armeniaEnvPgObject.enterReQapin(base.propp.getProperty(prex+ "reqapin"));
		armeniaEnvPgObject.enterPwd(base.propp.getProperty(prex+ "pwd"));
		armeniaEnvPgObject.reenterPwd(base.propp.getProperty(prex+ "repwd"));		      
		armeniaEnvPgObject.selectAgreement();
		armeniaEnvPgObject.clickConfirmBtn();
	}
	public void AzrEnvForm(String prex,AzerbaijanEnvPgObject azerbaijanEnvPgObject , Base base){
		azerbaijanEnvPgObject.selectTitle(base.propp.getProperty(prex+ "title"));
		azerbaijanEnvPgObject.enterSurname(base.propp.getProperty(prex+ "surname"));
		azerbaijanEnvPgObject.enterGiveName(base.propp.getProperty(prex+ "given_name"));
		azerbaijanEnvPgObject.EnterAddress(base.propp.getProperty(prex+ "address1"));
		azerbaijanEnvPgObject.enterTown(base.propp.getProperty(prex+ "town"));
		azerbaijanEnvPgObject.enterPostal(base.propp.getProperty(prex+ "postal"));
		azerbaijanEnvPgObject.enterHomePhone(base.propp.getProperty(prex+ "homephone"));		      
		azerbaijanEnvPgObject.enterMoblieNumber(base.propp.getProperty(prex+ "mobilephone"));
		azerbaijanEnvPgObject.enterEmail(base.propp.getProperty(prex+ "email"));
		azerbaijanEnvPgObject.ReEnterEmail(base.propp.getProperty(prex+ "reemail"));
		azerbaijanEnvPgObject.SelectValidIdType(base.propp.getProperty(prex+ "validid"));		      
		azerbaijanEnvPgObject.selectNationality(base.propp.getProperty(prex+ "nationality"));
		azerbaijanEnvPgObject.enterValidIdNo(base.propp.getProperty(prex+ "valididno"));
		azerbaijanEnvPgObject.selectdobmonth(base.propp.getProperty(prex+ "dobmonth"));
		azerbaijanEnvPgObject.selectdobdate(base.propp.getProperty(prex+ "dobdate"));
		azerbaijanEnvPgObject.selectdobyear(base.propp.getProperty(prex+ "dobyear"));
		azerbaijanEnvPgObject.enterBenificiary(base.propp.getProperty(prex+ "benificiary"));
		azerbaijanEnvPgObject.selectRelationship(base.propp.getProperty(prex+ "relationship"));
		azerbaijanEnvPgObject.enterMFName(base.propp.getProperty(prex+ "mfname"));
		azerbaijanEnvPgObject.selectPClang(base.propp.getProperty(prex+ "pclang"));		      
		azerbaijanEnvPgObject.enterQApin(base.propp.getProperty(prex+ "qapin"));
		azerbaijanEnvPgObject.enterReQapin(base.propp.getProperty(prex+ "reqapin"));
		azerbaijanEnvPgObject.enterPwd(base.propp.getProperty(prex+ "pwd"));
		azerbaijanEnvPgObject.reenterPwd(base.propp.getProperty(prex+ "repwd"));		      
		azerbaijanEnvPgObject.selectAgreement();
		azerbaijanEnvPgObject.clickConfirmBtn();
	}
	public void SyrEnvForm(String prex,SyrianArabRepublicEnvPgObject syrianArabRepublicEnvPgObject, Base base){
		syrianArabRepublicEnvPgObject.selectTitle(base.propp.getProperty(prex+ "title"));
		syrianArabRepublicEnvPgObject.enterSurname(base.propp.getProperty(prex+ "surname"));
		syrianArabRepublicEnvPgObject.enterGiveName(base.propp.getProperty(prex+ "given_name"));
		syrianArabRepublicEnvPgObject.EnterAddress(base.propp.getProperty(prex+ "address1"));
		syrianArabRepublicEnvPgObject.selectTown(base.propp.getProperty(prex+ "town"));
		syrianArabRepublicEnvPgObject.enterPostal(base.propp.getProperty(prex+ "postal"));
		syrianArabRepublicEnvPgObject.enterHomePhone(base.propp.getProperty(prex+ "homephone"));
		syrianArabRepublicEnvPgObject.enterHomePhonePrefix(base.propp.getProperty(" "));  
		syrianArabRepublicEnvPgObject.enterMoblieNumber(base.propp.getProperty(prex+ "mobilephone"));
		syrianArabRepublicEnvPgObject.enterEmail(base.propp.getProperty(prex+ "email"));
		syrianArabRepublicEnvPgObject.ReEnterEmail(base.propp.getProperty(prex+ "reemail"));
		syrianArabRepublicEnvPgObject.SelectValidIdType(base.propp.getProperty(prex+ "validid"));		      
		syrianArabRepublicEnvPgObject.enterValidIdNo(base.propp.getProperty(prex+ "valididno"));
		syrianArabRepublicEnvPgObject.selectdobmonth(base.propp.getProperty(prex+ "dobmonth"));
		syrianArabRepublicEnvPgObject.selectdobdate(base.propp.getProperty(prex+ "dobdate"));
		syrianArabRepublicEnvPgObject.selectdobyear(base.propp.getProperty(prex+ "dobyear"));
		syrianArabRepublicEnvPgObject.enterBenificiary(base.propp.getProperty(prex+ "benificiary"));
		syrianArabRepublicEnvPgObject.selectRelationship(base.propp.getProperty(prex+ "relationship"));
		syrianArabRepublicEnvPgObject.enterMFName(base.propp.getProperty(prex+ "mfname"));
		syrianArabRepublicEnvPgObject.selectPClang(base.propp.getProperty(prex+ "pclang"));		      
		syrianArabRepublicEnvPgObject.enterQApin(base.propp.getProperty(prex+ "qapin"));
		syrianArabRepublicEnvPgObject.enterReQapin(base.propp.getProperty(prex+ "reqapin"));
		syrianArabRepublicEnvPgObject.enterPwd(base.propp.getProperty(prex+ "pwd"));
		syrianArabRepublicEnvPgObject.reenterPwd(base.propp.getProperty(prex+ "repwd"));		  
		syrianArabRepublicEnvPgObject.selectAgreement();
		syrianArabRepublicEnvPgObject.clickConfirmBtn();
	}
	
	public void TunEnvForm(String prex,TunisiaEnvPgObject tunisiaEnvPgObject , Base base){
		tunisiaEnvPgObject.selectTitle(base.propp.getProperty(prex+"repwd"));
		tunisiaEnvPgObject.enterSurname(base.propp.getProperty(prex+"surname"));
		tunisiaEnvPgObject.enterGiveName(base.propp.getProperty(prex+"given_name"));
		tunisiaEnvPgObject.enterArabname(prex + " ");
		tunisiaEnvPgObject.selectdobmonth(base.propp.getProperty(prex +"dobmonth"));
		tunisiaEnvPgObject.selectdobdate(base.propp.getProperty(prex +"dobdate"));
		tunisiaEnvPgObject.selectdobyear(base.propp.getProperty(prex +"dobyear"));
		tunisiaEnvPgObject.enterEmail(base.propp.getProperty(prex +"email"));
		tunisiaEnvPgObject.ReEnterEmail(base.propp.getProperty(prex +"reemail"));
		tunisiaEnvPgObject.selectContNo(prex+ " ");
		tunisiaEnvPgObject.entercontNo(prex+ " ");
		tunisiaEnvPgObject.enterPwd(base.propp.getProperty(prex+"pwd"));
		tunisiaEnvPgObject.reenterPwd(base.propp.getProperty(prex+"repwd"));
		tunisiaEnvPgObject.EnterAddress(base.propp.getProperty(prex+"address1"));
		tunisiaEnvPgObject.enterTown(base.propp.getProperty(prex+"town"));
		tunisiaEnvPgObject.enterPostal(base.propp.getProperty(prex+"postal"));
		tunisiaEnvPgObject.clickcontiune2();
		tunisiaEnvPgObject.enterIRID(prex+ " ");
		tunisiaEnvPgObject.clickVerifyBtn();
		tunisiaEnvPgObject.selectPlacement(prex+ " ");
		tunisiaEnvPgObject.prefferPlacement(prex+ " ");
		tunisiaEnvPgObject.clickCountinue3();
		tunisiaEnvPgObject.clickSubmit();
		
	}
}
