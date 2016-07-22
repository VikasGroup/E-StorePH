package com.util;

import com.base.Base;
import com.pageObjects.EcardPaymentPgObject;
import com.pageObjects.PlacementPgObject;

public class PlcFormFill {
 public void PlcFill(String prefix,PlacementPgObject placementPgObject, Base base){
	
	 	placementPgObject.enterIRID(base.propp.getProperty(prefix+"irid"));
		placementPgObject.clickVerifyBtn();
		placementPgObject.selectPlacement(base.propp.getProperty(prefix+"tcp"));
		placementPgObject.prefferPlacement(base.propp.getProperty(prefix+"placementside"));
		placementPgObject.clickconfBtn();
	
 }
 public void EcrdFill(String prefix,EcardPaymentPgObject ecardPaymentPgObject, Base base){
	 ecardPaymentPgObject.enterEcardDetails(base.propp.getProperty(prefix+"ecardno"),base.propp.getProperty(prefix+"pin"),prefix);
 }
}
