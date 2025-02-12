package hello;


import org.testng.annotations.Test;

import ObjectRepository1.Homepage;
import ObjectRepository1.campaign.campaignLookUP;
import ObjectRepository1.campaign.campiagnCreationPage;
import ObjectRepository1.campaign.validateCampaignPage;
import ObjectRepository1.campaign.windowSwitching;
import Utility.BaseClass;
import Utility.Excel_Utility;

import Utility.Java_Utility;
import Utility.WebDriver_Utility;


//@Listeners(Generic_Uilities.Listener.class)

public class CreateCampaignTest extends BaseClass {

	//
//	@Test(retryAnalyzer = Generic_Uilities.RetryImp.class)
	@Test
	public void createCampaignTest() throws Throwable {


		WebDriver_Utility wlib = new WebDriver_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();

		Homepage homepage = new Homepage(driver);
		homepage.morebutton();
		homepage.camplink();
		
		campaignLookUP lookupimg = new campaignLookUP(driver);
		lookupimg.campLookUp();
		

		int rannum=jlib.getRandomNum();
		
		String campName = elib.getExcelData("Sheet1", 0, 0) + rannum;
		
	campiagnCreationPage page = new campiagnCreationPage(driver);
       page.campaignTextFiled(campName);
       page.plusLookupButton();
       
      String prdName = elib.getExcelData("Sheet1", 8, 0);
       wlib.windowSwitching(driver, "Campaigns&action");
      windowSwitching window = new windowSwitching(driver);
      window.enterProdName(driver, prdName);
      window.searchProd();
      window.dynamicPath(driver, prdName);
      wlib.windowSwitching1(driver, "Campaigns&action");
      
       
		page.saveButton();

		validateCampaignPage validate = new validateCampaignPage(driver);
		 validate.CampaignPage(driver, campName);
		
//homepage.adminlink();
	}
	
	
}