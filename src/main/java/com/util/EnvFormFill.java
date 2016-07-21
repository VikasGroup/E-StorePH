package com.util;

import com.base.Base;
import com.pageObjects.BurkinafasoEnvPgObject;
import com.pageObjects.HongKongEnvPgObject;
import com.pageObjects.IraqEnvPgObject;
import com.pageObjects.LibyaEnvPgObject;
import com.pageObjects.TajikistanEnvPgObject;

public class EnvFormFill {
	
	public void BurEnvform(String prefix,BurkinafasoEnvPgObject burkinafasoEnvpgobject,Base base){
		burkinafasoEnvpgobject.selectTitle(base.propp.getProperty("title"));
		burkinafasoEnvpgobject.enterSurname(base.propp.getProperty("surname"));
		burkinafasoEnvpgobject.enterGiveName(base.propp.getProperty("given_name"));
		burkinafasoEnvpgobject.EnterAddress(base.propp.getProperty("address1"));
		burkinafasoEnvpgobject.enterTown(base.propp.getProperty("town"));
		burkinafasoEnvpgobject.enterPostal(base.propp.getProperty("postal"));
		burkinafasoEnvpgobject.enterHomePhone(base.propp.getProperty("homephone"));
		burkinafasoEnvpgobject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		burkinafasoEnvpgobject.enterEmail(base.propp.getProperty("email"));
		burkinafasoEnvpgobject.ReEnterEmail(base.propp.getProperty("reemail"));
		burkinafasoEnvpgobject.SelectValidIdType(base.propp.getProperty("validid"));
		burkinafasoEnvpgobject.enterValidIdNo(base.propp.getProperty("valididno"));
		burkinafasoEnvpgobject.selectNationality(base.propp.getProperty("nationality"));
		burkinafasoEnvpgobject.selectdobmonth(base.propp.getProperty("dobmonth"));
		burkinafasoEnvpgobject.selectdobdate(base.propp.getProperty("dobdate"));
		burkinafasoEnvpgobject.selectdobyear(base.propp.getProperty("dobyear"));
		burkinafasoEnvpgobject.enterBenificiary(base.propp.getProperty("benificiary"));
		burkinafasoEnvpgobject.selectRelationship(base.propp.getProperty("relationship"));
		burkinafasoEnvpgobject.enterMFName(base.propp.getProperty("mfname"));
		burkinafasoEnvpgobject.selectPClang(base.propp.getProperty("pclang"));
		burkinafasoEnvpgobject.enterQApin(base.propp.getProperty("qapin"));
		burkinafasoEnvpgobject.enterReQapin(base.propp.getProperty("reqapin"));
		burkinafasoEnvpgobject.enterPwd(base.propp.getProperty("pwd"));
		burkinafasoEnvpgobject.reenterPwd(base.propp.getProperty("repwd"));
		
		burkinafasoEnvpgobject.selectAgreement();
		burkinafasoEnvpgobject.clickConfirmBtn();
	
	}
	public void HonEnvform(String prefix,HongKongEnvPgObject hongkongenvpgobject,Base base){
		hongkongenvpgobject.selectTitle(base.propp.getProperty("title"));
		hongkongenvpgobject.enterSurname(base.propp.getProperty("surname"));
		hongkongenvpgobject.enterGiveName(base.propp.getProperty("given_name"));
		hongkongenvpgobject.EnterAddress(base.propp.getProperty("address1"));
		hongkongenvpgobject.enterTown(base.propp.getProperty("town"));
		hongkongenvpgobject.enterPostal(base.propp.getProperty("postal"));
		hongkongenvpgobject.enterHomePhone(base.propp.getProperty("homephone"));
		hongkongenvpgobject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		hongkongenvpgobject.enterEmail(base.propp.getProperty("email"));
		hongkongenvpgobject.ReEnterEmail(base.propp.getProperty("reemail"));
		hongkongenvpgobject.SelectValidIdType(base.propp.getProperty("validid"));
		hongkongenvpgobject.enterValidIdNo(base.propp.getProperty("valididno"));
		hongkongenvpgobject.selectNationality(base.propp.getProperty("nationality"));
		hongkongenvpgobject.selectdobmonth(base.propp.getProperty("dobmonth"));
		hongkongenvpgobject.selectdobdate(base.propp.getProperty("dobdate"));
		hongkongenvpgobject.selectdobyear(base.propp.getProperty("dobyear"));
		hongkongenvpgobject.enterBenificiary(base.propp.getProperty("benificiary"));
		hongkongenvpgobject.selectRelationship(base.propp.getProperty("relationship"));
		hongkongenvpgobject.enterMFName(base.propp.getProperty("mfname"));
		hongkongenvpgobject.selectPClang(base.propp.getProperty("pclang"));
		hongkongenvpgobject.selectSecques(base.propp.getProperty("secques"));
		hongkongenvpgobject.enterAnswer(base.propp.getProperty("ans"));
		hongkongenvpgobject.enterSecword(base.propp.getProperty("secword"));
		hongkongenvpgobject.enterQApin(base.propp.getProperty("qapin"));
		hongkongenvpgobject.enterReQapin(base.propp.getProperty("reqapin"));
		hongkongenvpgobject.enterPwd(base.propp.getProperty("pwd"));
		hongkongenvpgobject.reenterPwd(base.propp.getProperty("repwd"));
		
		hongkongenvpgobject.selectAgreement();
		hongkongenvpgobject.clickConfirmBtn();
	}
	public void IrqEnvform(String prefix,IraqEnvPgObject iraqenvpgobject,Base base){
		iraqenvpgobject.selectTitle(base.propp.getProperty("title"));
		iraqenvpgobject.enterSurname(base.propp.getProperty("surname"));
		iraqenvpgobject.enterGiveName(base.propp.getProperty("given_name"));
		iraqenvpgobject.EnterAddress(base.propp.getProperty("address1"));
		iraqenvpgobject.enterTown(base.propp.getProperty("town"));
		iraqenvpgobject.enterPostal(base.propp.getProperty("postal"));
		iraqenvpgobject.enterHomePhone(base.propp.getProperty("homephone"));
		iraqenvpgobject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		iraqenvpgobject.enterEmail(base.propp.getProperty("email"));
		iraqenvpgobject.ReEnterEmail(base.propp.getProperty("reemail"));
		iraqenvpgobject.SelectValidIdType(base.propp.getProperty("validid"));
		iraqenvpgobject.enterValidIdNo(base.propp.getProperty("valididno"));
		iraqenvpgobject.selectNationality(base.propp.getProperty("nationality"));
		iraqenvpgobject.selectdobmonth(base.propp.getProperty("dobmonth"));
		iraqenvpgobject.selectdobdate(base.propp.getProperty("dobdate"));
		iraqenvpgobject.selectdobyear(base.propp.getProperty("dobyear"));
		iraqenvpgobject.selectRelationship(base.propp.getProperty("relationship"));
		iraqenvpgobject.enterMFName(base.propp.getProperty("mfname"));
		iraqenvpgobject.selectPClang(base.propp.getProperty("pclang"));
		iraqenvpgobject.enterQApin(base.propp.getProperty("qapin"));
		iraqenvpgobject.enterReQapin(base.propp.getProperty("reqapin"));
		iraqenvpgobject.enterPwd(base.propp.getProperty("pwd"));
		iraqenvpgobject.reenterPwd(base.propp.getProperty("repwd"));
		
		iraqenvpgobject.selectAgreement();
		iraqenvpgobject.clickConfirmBtn();
	}
	public void LibEnvform(String prefix,LibyaEnvPgObject libyaenvpgobject,Base base){
		libyaenvpgobject.selectTitle(base.propp.getProperty("title"));
		libyaenvpgobject.enterSurname(base.propp.getProperty("surname"));
		libyaenvpgobject.enterGiveName(base.propp.getProperty("given_name"));
		libyaenvpgobject.EnterAddress(base.propp.getProperty("address1"));
		libyaenvpgobject.enterTown(base.propp.getProperty("town"));
		libyaenvpgobject.enterPostal(base.propp.getProperty("postal"));
		libyaenvpgobject.enterHomePhone(base.propp.getProperty("homephone"));
		libyaenvpgobject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		libyaenvpgobject.enterEmail(base.propp.getProperty("email"));
		libyaenvpgobject.ReEnterEmail(base.propp.getProperty("reemail"));
		libyaenvpgobject.SelectValidIdType(base.propp.getProperty("validid"));
		libyaenvpgobject.enterValidIdNo(base.propp.getProperty("valididno"));
		libyaenvpgobject.selectNationality(base.propp.getProperty("nationality"));
		libyaenvpgobject.selectdobmonth(base.propp.getProperty("dobmonth"));
		libyaenvpgobject.selectdobdate(base.propp.getProperty("dobdate"));
		libyaenvpgobject.selectdobyear(base.propp.getProperty("dobyear"));
		libyaenvpgobject.selectRelationship(base.propp.getProperty("relationship"));
		libyaenvpgobject.enterMFName(base.propp.getProperty("mfname"));
		libyaenvpgobject.selectPClang(base.propp.getProperty("pclang"));
		libyaenvpgobject.enterQApin(base.propp.getProperty("qapin"));
		libyaenvpgobject.enterReQapin(base.propp.getProperty("reqapin"));
		libyaenvpgobject.enterPwd(base.propp.getProperty("pwd"));
		libyaenvpgobject.reenterPwd(base.propp.getProperty("repwd"));
		
		libyaenvpgobject.selectAgreement();
		libyaenvpgobject.clickConfirmBtn();
	}
	public void TajEnvform(String prefix,TajikistanEnvPgObject tajikistanenvpgobject,Base base){
		tajikistanenvpgobject.selectTitle(base.propp.getProperty("title"));
		tajikistanenvpgobject.enterSurname(base.propp.getProperty("surname"));
		tajikistanenvpgobject.enterGiveName(base.propp.getProperty("given_name"));
		tajikistanenvpgobject.EnterAddress(base.propp.getProperty("address1"));
		tajikistanenvpgobject.enterTown(base.propp.getProperty("town"));
		tajikistanenvpgobject.enterPostal(base.propp.getProperty("postal"));
		tajikistanenvpgobject.enterHomePhone(base.propp.getProperty("homephone"));
		tajikistanenvpgobject.enterMoblieNumber(base.propp.getProperty("mobilephone"));
		tajikistanenvpgobject.enterEmail(base.propp.getProperty("email"));
		tajikistanenvpgobject.ReEnterEmail(base.propp.getProperty("reemail"));
		tajikistanenvpgobject.SelectValidIdType(base.propp.getProperty("validid"));
		tajikistanenvpgobject.enterValidIdNo(base.propp.getProperty("valididno"));
		tajikistanenvpgobject.selectNationality(base.propp.getProperty("nationality"));
		tajikistanenvpgobject.selectdobmonth(base.propp.getProperty("dobmonth"));
		tajikistanenvpgobject.selectdobdate(base.propp.getProperty("dobdate"));
		tajikistanenvpgobject.selectdobyear(base.propp.getProperty("dobyear"));
		tajikistanenvpgobject.selectRelationship(base.propp.getProperty("relationship"));
		tajikistanenvpgobject.enterMFName(base.propp.getProperty("mfname"));
		tajikistanenvpgobject.selectPClang(base.propp.getProperty("pclang"));
		tajikistanenvpgobject.enterQApin(base.propp.getProperty("qapin"));
		tajikistanenvpgobject.enterReQapin(base.propp.getProperty("reqapin"));
		tajikistanenvpgobject.enterPwd(base.propp.getProperty("pwd"));
		tajikistanenvpgobject.reenterPwd(base.propp.getProperty("repwd"));
		
		tajikistanenvpgobject.selectAgreement();
		tajikistanenvpgobject.clickConfirmBtn();
	}

}
