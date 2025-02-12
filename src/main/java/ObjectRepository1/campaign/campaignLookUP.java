package ObjectRepository1.campaign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class campaignLookUP {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement lookUpbutton;

	public campaignLookUP(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLookUpbutton() {
		return lookUpbutton;
	}

	public void campLookUp() {
		lookUpbutton.click();
	}
}


