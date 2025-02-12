package ObjectRepository1.campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class windowSwitching {
	@FindBy(id = "search_txt")
	private WebElement searchField;

	@FindBy(name = "search")
	private WebElement searchnowButton;

	// element intialization
	public windowSwitching(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchnowButton() {
		return searchnowButton;
	}

	// methods
	public void enterProdName(WebDriver driver, String prdName) {
		searchField.sendKeys(prdName);
	}

	public void searchProd() {

		searchnowButton.click();
	}

	public void dynamicPath(WebDriver driver, String prdName) {
		driver.findElement(By.xpath("//a[text()='" + prdName + "']")).click();

	}
}
