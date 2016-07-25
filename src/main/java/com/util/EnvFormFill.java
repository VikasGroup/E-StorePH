package com.util;

import com.base.Base;
import com.pageObjects.ArmeniaEnvPgObject;
import com.pageObjects.AzerbaijanEnvPgObject;
import com.pageObjects.BurkinafasoEnvPgObject;
import com.pageObjects.CoteDIvoireEnvPgObject;
import com.pageObjects.EthiopiaEnvPgObject;
import com.pageObjects.GeorgiaEnvPgObject;
import com.pageObjects.HongKongEnvPgObject;
import com.pageObjects.InduPgObject;
import com.pageObjects.IraqEnvPgObject;
import com.pageObjects.LibyaEnvPgObject;
import com.pageObjects.MyanmarEnvPgObject;
import com.pageObjects.SyrianArabRepublicEnvPgObject;
import com.pageObjects.TajikistanEnvPgObject;
import com.pageObjects.TunisiaEnvPgObject;

public class EnvFormFill {
	public void BurEnvform(String prefix,BurkinafasoEnvPgObject burkinafasoEnvpgobject,Base base) throws InterruptedException{
		burkinafasoEnvpgobject.selectTitle(base.propp.getProperty(prefix+"title"));
		burkinafasoEnvpgobject.enterSurname(base.propp.getProperty(prefix+"surname"));
		burkinafasoEnvpgobject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		burkinafasoEnvpgobject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		burkinafasoEnvpgobject.enterTown(base.propp.getProperty(prefix+"town"));
		burkinafasoEnvpgobject.enterPostal(base.propp.getProperty(prefix+"postal"));
		burkinafasoEnvpgobject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));
		burkinafasoEnvpgobject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		burkinafasoEnvpgobject.enterEmail(base.propp.getProperty(prefix+"email"));
		burkinafasoEnvpgobject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		burkinafasoEnvpgobject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		burkinafasoEnvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		burkinafasoEnvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		burkinafasoEnvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		burkinafasoEnvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		burkinafasoEnvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		burkinafasoEnvpgobject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		burkinafasoEnvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		burkinafasoEnvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		burkinafasoEnvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		burkinafasoEnvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		burkinafasoEnvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		burkinafasoEnvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		burkinafasoEnvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		burkinafasoEnvpgobject.selectAgreement();
		burkinafasoEnvpgobject.clickConfirmBtn();
	
	}
	public void InduEnvform(String prefix,InduPgObject induPgObject,Base base) throws InterruptedException{
		induPgObject.selectTitle(base.propp.getProperty(prefix+"title"));
		induPgObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		induPgObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		induPgObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		induPgObject.enterTown(base.propp.getProperty(prefix+"town"));
		induPgObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		induPgObject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));
		induPgObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		induPgObject.enterEmail(base.propp.getProperty(prefix+"email"));
		induPgObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		induPgObject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		induPgObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		induPgObject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		induPgObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		induPgObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		induPgObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		induPgObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		induPgObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		induPgObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		induPgObject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		induPgObject.selectSecques(base.propp.getProperty(prefix+"secques"));
		induPgObject.enterAnswer(base.propp.getProperty(prefix+"ans"));
		induPgObject.enterSecword(base.propp.getProperty(prefix+"secword"));
		induPgObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		induPgObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		induPgObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		induPgObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		induPgObject.selectAgreement();
		induPgObject.clickConfirmBtn();
	
	}
	public void HonEnvform(String prefix,HongKongEnvPgObject hongkongenvpgobject,Base base){
		hongkongenvpgobject.selectTitle(base.propp.getProperty(prefix+"title"));
		hongkongenvpgobject.enterSurname(base.propp.getProperty(prefix+"surname"));
		hongkongenvpgobject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		hongkongenvpgobject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		hongkongenvpgobject.enterTown(base.propp.getProperty(prefix+"town"));
		hongkongenvpgobject.enterPostal(base.propp.getProperty(prefix+"postal"));
		hongkongenvpgobject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));
		hongkongenvpgobject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		hongkongenvpgobject.enterEmail(base.propp.getProperty(prefix+"email"));
		hongkongenvpgobject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		hongkongenvpgobject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		hongkongenvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		hongkongenvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		hongkongenvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		hongkongenvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		hongkongenvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		hongkongenvpgobject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		hongkongenvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		hongkongenvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		hongkongenvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		hongkongenvpgobject.selectSecques(base.propp.getProperty(prefix+"secques"));
		hongkongenvpgobject.enterAnswer(base.propp.getProperty(prefix+"ans"));
		hongkongenvpgobject.enterSecword(base.propp.getProperty(prefix+"secword"));
		hongkongenvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		hongkongenvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		hongkongenvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		hongkongenvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		hongkongenvpgobject.selectAgreement();
		hongkongenvpgobject.clickConfirmBtn();
	}
	public void IrqEnvform(String prefix,IraqEnvPgObject iraqenvpgobject,Base base) throws InterruptedException{
		iraqenvpgobject.selectTitle(base.propp.getProperty(prefix+"title"));
		iraqenvpgobject.enterSurname(base.propp.getProperty(prefix+"surname"));
		iraqenvpgobject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		iraqenvpgobject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		iraqenvpgobject.enterTown(base.propp.getProperty(prefix+"town"));
		iraqenvpgobject.enterPostal(base.propp.getProperty(prefix+"postal"));
		iraqenvpgobject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));
		iraqenvpgobject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		iraqenvpgobject.enterEmail(base.propp.getProperty(prefix+"email"));
		iraqenvpgobject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		iraqenvpgobject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		iraqenvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		iraqenvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		iraqenvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		iraqenvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		iraqenvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		iraqenvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		iraqenvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		iraqenvpgobject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		iraqenvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		iraqenvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		iraqenvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		iraqenvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		iraqenvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		iraqenvpgobject.selectAgreement();
		iraqenvpgobject.clickConfirmBtn();
	}
	public void LibEnvform(String prefix,LibyaEnvPgObject libyaenvpgobject,Base base) throws InterruptedException{
		libyaenvpgobject.selectTitle(base.propp.getProperty(prefix+"title"));
		libyaenvpgobject.enterSurname(base.propp.getProperty(prefix+"surname"));
		libyaenvpgobject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		libyaenvpgobject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		libyaenvpgobject.enterTown(base.propp.getProperty(prefix+"town"));
		libyaenvpgobject.enterPostal(base.propp.getProperty(prefix+"postal"));
		libyaenvpgobject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));
		libyaenvpgobject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		libyaenvpgobject.enterEmail(base.propp.getProperty(prefix+"email"));
		libyaenvpgobject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		libyaenvpgobject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		libyaenvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		libyaenvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		libyaenvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		libyaenvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		libyaenvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		libyaenvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		libyaenvpgobject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		libyaenvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		libyaenvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		libyaenvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		libyaenvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		libyaenvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		libyaenvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		libyaenvpgobject.selectAgreement();
		libyaenvpgobject.clickConfirmBtn();
	}
	public void TajEnvform(String prefix,TajikistanEnvPgObject tajikistanenvpgobject,Base base) throws InterruptedException{
		tajikistanenvpgobject.selectTitle(base.propp.getProperty(prefix+"title"));
		tajikistanenvpgobject.enterSurname(base.propp.getProperty(prefix+"surname"));
		tajikistanenvpgobject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		tajikistanenvpgobject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		tajikistanenvpgobject.enterTown(base.propp.getProperty(prefix+"town"));
		tajikistanenvpgobject.enterPostal(base.propp.getProperty(prefix+"postal"));
		tajikistanenvpgobject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));
		tajikistanenvpgobject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		tajikistanenvpgobject.enterEmail(base.propp.getProperty(prefix+"email"));
		tajikistanenvpgobject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		tajikistanenvpgobject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		tajikistanenvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		tajikistanenvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		tajikistanenvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		tajikistanenvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		tajikistanenvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		tajikistanenvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		tajikistanenvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		tajikistanenvpgobject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		tajikistanenvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		tajikistanenvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		tajikistanenvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		tajikistanenvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		tajikistanenvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		tajikistanenvpgobject.selectAgreement();
		tajikistanenvpgobject.clickConfirmBtn();
	}

	public void MyaEnvForm(String prefix,MyanmarEnvPgObject myanmarEnvObject , Base base) throws InterruptedException{
		
		myanmarEnvObject.selectTitle(base.propp.getProperty(prefix+"title"));
		myanmarEnvObject.selectTitle(base.propp.getProperty(prefix+"title"));
		myanmarEnvObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		myanmarEnvObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		myanmarEnvObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		myanmarEnvObject.enterTown(base.propp.getProperty(prefix+"town"));
		myanmarEnvObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		myanmarEnvObject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));      
		myanmarEnvObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		myanmarEnvObject.enterEmail(base.propp.getProperty(prefix+"email"));
		myanmarEnvObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		myanmarEnvObject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		myanmarEnvObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno")); 
		myanmarEnvObject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		myanmarEnvObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		myanmarEnvObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		myanmarEnvObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		myanmarEnvObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		myanmarEnvObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		myanmarEnvObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		myanmarEnvObject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		//myanmarEnvObject.selectSecques(base.propp.getProperty(prefix+"secques"));
		//myanmarEnvObject.enterAnswer(base.propp.getProperty(prefix+"ans"));
		//myanmarEnvObject.enterSecword(base.propp.getProperty(prefix+"secword"));
		myanmarEnvObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		myanmarEnvObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		myanmarEnvObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		myanmarEnvObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));  
		myanmarEnvObject.selectAgreement();
		myanmarEnvObject.clickConfirmBtn(); 
	}
	
	public void GeoEnvForm(String prefix,GeorgiaEnvPgObject georgiaEnvObject , Base base) throws InterruptedException{
		
		georgiaEnvObject.selectTitle(base.propp.getProperty(prefix+"title"));
		georgiaEnvObject.selectTitle(base.propp.getProperty(prefix+"title"));
		georgiaEnvObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		georgiaEnvObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		georgiaEnvObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		georgiaEnvObject.enterTown(base.propp.getProperty(prefix+"town"));
		georgiaEnvObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		georgiaEnvObject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));      
		georgiaEnvObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		georgiaEnvObject.enterEmail(base.propp.getProperty(prefix+"email"));
		georgiaEnvObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		georgiaEnvObject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		georgiaEnvObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno")); 
		georgiaEnvObject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		georgiaEnvObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		georgiaEnvObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		georgiaEnvObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		georgiaEnvObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		georgiaEnvObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		georgiaEnvObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		georgiaEnvObject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		georgiaEnvObject.selectSecques(base.propp.getProperty(prefix+"secques"));
		georgiaEnvObject.enterAnswer(base.propp.getProperty(prefix+"ans"));
		georgiaEnvObject.enterSecword(base.propp.getProperty(prefix+"secword"));
		georgiaEnvObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		georgiaEnvObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		georgiaEnvObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		georgiaEnvObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));  
		georgiaEnvObject.selectAgreement();
		georgiaEnvObject.clickConfirmBtn(); 	
	}
	
	public void EthEnvForm(String prefix,EthiopiaEnvPgObject ethiopiaEnvPgObject , Base base) throws InterruptedException{
		
		ethiopiaEnvPgObject.selectTitle(base.propp.getProperty(prefix+"title"));
		ethiopiaEnvPgObject.selectTitle(base.propp.getProperty(prefix+"title"));
		ethiopiaEnvPgObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		ethiopiaEnvPgObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		ethiopiaEnvPgObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		ethiopiaEnvPgObject.enterTown(base.propp.getProperty(prefix+"town"));
		ethiopiaEnvPgObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		ethiopiaEnvPgObject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));      
		ethiopiaEnvPgObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		ethiopiaEnvPgObject.enterEmail(base.propp.getProperty(prefix+"email"));
		ethiopiaEnvPgObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		ethiopiaEnvPgObject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		ethiopiaEnvPgObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno")); 
		ethiopiaEnvPgObject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		ethiopiaEnvPgObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		ethiopiaEnvPgObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		ethiopiaEnvPgObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		ethiopiaEnvPgObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		ethiopiaEnvPgObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		ethiopiaEnvPgObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		ethiopiaEnvPgObject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		ethiopiaEnvPgObject.selectSecques(base.propp.getProperty(prefix+"secques"));
		ethiopiaEnvPgObject.enterAnswer(base.propp.getProperty(prefix+"ans"));
		ethiopiaEnvPgObject.enterSecword(base.propp.getProperty(prefix+"secword"));
		ethiopiaEnvPgObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		ethiopiaEnvPgObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		ethiopiaEnvPgObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		ethiopiaEnvPgObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));  
		ethiopiaEnvPgObject.selectAgreement();
		ethiopiaEnvPgObject.clickConfirmBtn(); 
	}
	public void CotEnvForm(String prefix,CoteDIvoireEnvPgObject coteDIvoireEnvPgObject , Base base) throws InterruptedException{
		
		coteDIvoireEnvPgObject.selectTitle(base.propp.getProperty(prefix+"title"));
		coteDIvoireEnvPgObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		coteDIvoireEnvPgObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		coteDIvoireEnvPgObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		coteDIvoireEnvPgObject.selectTown(base.propp.getProperty(prefix+"town"));
		coteDIvoireEnvPgObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		coteDIvoireEnvPgObject.enterHomePhone(base.propp.getProperty(prefix+"homephone")); 
		coteDIvoireEnvPgObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		coteDIvoireEnvPgObject.enterEmail(base.propp.getProperty(prefix+"email"));
		coteDIvoireEnvPgObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		coteDIvoireEnvPgObject.SelectValidIdType(base.propp.getProperty(prefix+"validid")); 
		Thread.sleep(5000);
		coteDIvoireEnvPgObject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		coteDIvoireEnvPgObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		coteDIvoireEnvPgObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		coteDIvoireEnvPgObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		coteDIvoireEnvPgObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		coteDIvoireEnvPgObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		coteDIvoireEnvPgObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		coteDIvoireEnvPgObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		coteDIvoireEnvPgObject.selectPClang(base.propp.getProperty(prefix+"pclang"));		      
		coteDIvoireEnvPgObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		coteDIvoireEnvPgObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		coteDIvoireEnvPgObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		coteDIvoireEnvPgObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));		      
		coteDIvoireEnvPgObject.selectAgreement();
		coteDIvoireEnvPgObject.clickConfirmBtn();		
	}
	public void ArmEnvForm(String prefix,ArmeniaEnvPgObject armeniaEnvPgObject, Base base) throws InterruptedException{
		armeniaEnvPgObject.selectTitle(base.propp.getProperty(prefix+"title"));
		armeniaEnvPgObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		armeniaEnvPgObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		armeniaEnvPgObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		armeniaEnvPgObject.enterTown(base.propp.getProperty(prefix+"town"));
		armeniaEnvPgObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		armeniaEnvPgObject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));		      
		armeniaEnvPgObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		armeniaEnvPgObject.enterEmail(base.propp.getProperty(prefix+"email"));
		armeniaEnvPgObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		armeniaEnvPgObject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));	
		Thread.sleep(5000);
		armeniaEnvPgObject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		armeniaEnvPgObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		armeniaEnvPgObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		armeniaEnvPgObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		armeniaEnvPgObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		armeniaEnvPgObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		armeniaEnvPgObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		armeniaEnvPgObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		armeniaEnvPgObject.selectPClang(base.propp.getProperty(prefix+"pclang"));		      
		armeniaEnvPgObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		armeniaEnvPgObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		armeniaEnvPgObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		armeniaEnvPgObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));		      
		armeniaEnvPgObject.selectAgreement();
		armeniaEnvPgObject.clickConfirmBtn();
	}
	public void AzrEnvForm(String prefix,AzerbaijanEnvPgObject azerbaijanEnvPgObject , Base base) throws InterruptedException{
		azerbaijanEnvPgObject.selectTitle(base.propp.getProperty(prefix+"title"));
		azerbaijanEnvPgObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		azerbaijanEnvPgObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		azerbaijanEnvPgObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		azerbaijanEnvPgObject.enterTown(base.propp.getProperty(prefix+"town"));
		azerbaijanEnvPgObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		azerbaijanEnvPgObject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));		      
		azerbaijanEnvPgObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		azerbaijanEnvPgObject.enterEmail(base.propp.getProperty(prefix+"email"));
		azerbaijanEnvPgObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		azerbaijanEnvPgObject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		azerbaijanEnvPgObject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		azerbaijanEnvPgObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		azerbaijanEnvPgObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		azerbaijanEnvPgObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		azerbaijanEnvPgObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		azerbaijanEnvPgObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		azerbaijanEnvPgObject.enterLeader(base.propp.getProperty(prefix+"leader"));
		azerbaijanEnvPgObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		azerbaijanEnvPgObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		azerbaijanEnvPgObject.selectPClang(base.propp.getProperty(prefix+"pclang"));		      
		azerbaijanEnvPgObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		azerbaijanEnvPgObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		azerbaijanEnvPgObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		azerbaijanEnvPgObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));		      
		azerbaijanEnvPgObject.selectAgreement();
		azerbaijanEnvPgObject.clickConfirmBtn();
	}
	public void SyrEnvForm(String prefix,SyrianArabRepublicEnvPgObject syrianArabRepublicEnvPgObject, Base base) throws InterruptedException{
		syrianArabRepublicEnvPgObject.selectTitle(base.propp.getProperty(prefix+"title"));
		syrianArabRepublicEnvPgObject.enterSurname(base.propp.getProperty(prefix+"surname"));
		syrianArabRepublicEnvPgObject.enterGiveName(base.propp.getProperty(prefix+"given_name"));
		syrianArabRepublicEnvPgObject.EnterAddress(base.propp.getProperty(prefix+"address1"));
		syrianArabRepublicEnvPgObject.selectTown(base.propp.getProperty(prefix+"town"));
		syrianArabRepublicEnvPgObject.enterPostal(base.propp.getProperty(prefix+"postal"));
		syrianArabRepublicEnvPgObject.enterHomePhone(base.propp.getProperty(prefix+"homephone"));
		syrianArabRepublicEnvPgObject.enterHomePhonePrefix(base.propp.getProperty(prefix+" "));  
		syrianArabRepublicEnvPgObject.enterMoblieNumber(base.propp.getProperty(prefix+"mobilephone"));
		syrianArabRepublicEnvPgObject.enterEmail(base.propp.getProperty(prefix+"email"));
		syrianArabRepublicEnvPgObject.ReEnterEmail(base.propp.getProperty(prefix+"reemail"));
		syrianArabRepublicEnvPgObject.SelectValidIdType(base.propp.getProperty(prefix+"validid"));
		Thread.sleep(5000);
		syrianArabRepublicEnvPgObject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		syrianArabRepublicEnvPgObject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		syrianArabRepublicEnvPgObject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		syrianArabRepublicEnvPgObject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		syrianArabRepublicEnvPgObject.enterBenificiary(base.propp.getProperty(prefix+"benificiary"));
		syrianArabRepublicEnvPgObject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		syrianArabRepublicEnvPgObject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		syrianArabRepublicEnvPgObject.selectPClang(base.propp.getProperty(prefix+"pclang"));		      
		syrianArabRepublicEnvPgObject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		syrianArabRepublicEnvPgObject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		syrianArabRepublicEnvPgObject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		syrianArabRepublicEnvPgObject.reenterPwd(base.propp.getProperty(prefix+"repwd"));		  
		syrianArabRepublicEnvPgObject.selectAgreement();
		syrianArabRepublicEnvPgObject.clickConfirmBtn();
	}
	public void TunEnvForm(String prex,TunisiaEnvPgObject tunisiaEnvPgObject , Base base) throws InterruptedException{
		  tunisiaEnvPgObject.selectTitle(base.propp.getProperty(prex+"title"));
		  tunisiaEnvPgObject.enterSurname(base.propp.getProperty(prex+"surname"));
		  tunisiaEnvPgObject.enterGiveName(base.propp.getProperty(prex+"given_name"));
		  tunisiaEnvPgObject.enterArabname(prex + " ");
		  tunisiaEnvPgObject.selectdobmonth(base.propp.getProperty(prex +"dobmonth"));
		  tunisiaEnvPgObject.selectdobdate(base.propp.getProperty(prex +"dobdate"));
		  tunisiaEnvPgObject.selectdobyear(base.propp.getProperty(prex +"dobyear"));
		  tunisiaEnvPgObject.enterEmail(base.propp.getProperty(prex +"email"));
		  tunisiaEnvPgObject.ReEnterEmail(base.propp.getProperty(prex +"reemail"));
		  tunisiaEnvPgObject.selectContNo(base.propp.getProperty(prex +"contact"));
		  tunisiaEnvPgObject.entercontNo(base.propp.getProperty(prex +"homephone"));
		  tunisiaEnvPgObject.enterPwd(base.propp.getProperty(prex+"pwd"));
		  tunisiaEnvPgObject.reenterPwd(base.propp.getProperty(prex+"repwd"));
		  tunisiaEnvPgObject.EnterAddress(base.propp.getProperty(prex+"address1"));
		  tunisiaEnvPgObject.enterTown(base.propp.getProperty(prex+"town"));
		  tunisiaEnvPgObject.enterPostal(base.propp.getProperty(prex+"postal"));
		  tunisiaEnvPgObject.clickcontiune2();
		  Thread.sleep(8000);
		  tunisiaEnvPgObject.enterIRID(base.propp.getProperty(prex+"irid"));
		  tunisiaEnvPgObject.clickVerifyBtn();
		  Thread.sleep(5000);
		  tunisiaEnvPgObject.selectPlacement(base.propp.getProperty(prex+"tcp"));
		  Thread.sleep(5000);
		  tunisiaEnvPgObject.prefferPlacement(base.propp.getProperty(prex+"placementside"));
		  tunisiaEnvPgObject.clickCountinue3();
		  Thread.sleep(5000);
		  tunisiaEnvPgObject.clickSubmit();
		  
		 }
	

}
