package ObjectRepository1.campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campiagnCreationPage {

	@FindBy(name="campaignname")
	private WebElement campaignTextFiled;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement saveButton;
	
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement plusLookupbutton;	
	
	
	
	

	//element intialization
	public campiagnCreationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getCampaignTextFiled() {
		return campaignTextFiled;
	}
	
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getPlusLookupbutton() {
		return plusLookupbutton;
	}


	
	public void campaignTextFiled(String campName) {
		campaignTextFiled.sendKeys(campName);
	}
	public void saveButton() {
		saveButton.click();
	}
	
	public void plusLookupButton() {
		plusLookupbutton.click();
	}
}


