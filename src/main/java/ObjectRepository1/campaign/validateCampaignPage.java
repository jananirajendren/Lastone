package ObjectRepository1.campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class validateCampaignPage {
	public validateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String CampaignPage(WebDriver driver,String campName)
	{
	String actualdata = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
//if (actualdata.contains(campName)){
//		System.out.println("campaign is created");
//}
//	else {
//		System.out.println("campaign is not created");	
//	
//	
//	}
	return actualdata;
	}
}
