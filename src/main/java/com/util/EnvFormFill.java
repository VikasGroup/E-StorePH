package com.util;

import com.base.Base;
import com.pageObjects.BurkinafasoEnvPgObject;
import com.pageObjects.HongKongEnvPgObject;
import com.pageObjects.IraqEnvPgObject;
import com.pageObjects.LibyaEnvPgObject;
import com.pageObjects.TajikistanEnvPgObject;

public class EnvFormFill {
	
	public void BurEnvform(String prefix,BurkinafasoEnvPgObject burkinafasoEnvpgobject,Base base){
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
	public void IrqEnvform(String prefix,IraqEnvPgObject iraqenvpgobject,Base base){
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
		iraqenvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		iraqenvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		iraqenvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		iraqenvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		iraqenvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		iraqenvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		iraqenvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		iraqenvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		iraqenvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		iraqenvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		iraqenvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		iraqenvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		iraqenvpgobject.selectAgreement();
		iraqenvpgobject.clickConfirmBtn();
	}
	public void LibEnvform(String prefix,LibyaEnvPgObject libyaenvpgobject,Base base){
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
		libyaenvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		libyaenvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		libyaenvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		libyaenvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		libyaenvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		libyaenvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		libyaenvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		libyaenvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		libyaenvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		libyaenvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		libyaenvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		libyaenvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		libyaenvpgobject.selectAgreement();
		libyaenvpgobject.clickConfirmBtn();
	}
	public void TajEnvform(String prefix,TajikistanEnvPgObject tajikistanenvpgobject,Base base){
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
		tajikistanenvpgobject.enterValidIdNo(base.propp.getProperty(prefix+"valididno"));
		tajikistanenvpgobject.selectNationality(base.propp.getProperty(prefix+"nationality"));
		tajikistanenvpgobject.selectdobmonth(base.propp.getProperty(prefix+"dobmonth"));
		tajikistanenvpgobject.selectdobdate(base.propp.getProperty(prefix+"dobdate"));
		tajikistanenvpgobject.selectdobyear(base.propp.getProperty(prefix+"dobyear"));
		tajikistanenvpgobject.selectRelationship(base.propp.getProperty(prefix+"relationship"));
		tajikistanenvpgobject.enterMFName(base.propp.getProperty(prefix+"mfname"));
		tajikistanenvpgobject.selectPClang(base.propp.getProperty(prefix+"pclang"));
		tajikistanenvpgobject.enterQApin(base.propp.getProperty(prefix+"qapin"));
		tajikistanenvpgobject.enterReQapin(base.propp.getProperty(prefix+"reqapin"));
		tajikistanenvpgobject.enterPwd(base.propp.getProperty(prefix+"pwd"));
		tajikistanenvpgobject.reenterPwd(base.propp.getProperty(prefix+"repwd"));
		
		tajikistanenvpgobject.selectAgreement();
		tajikistanenvpgobject.clickConfirmBtn();
	}

}
