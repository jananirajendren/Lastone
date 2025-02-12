package ObjectRepository1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//element declaration
@FindBy(name="user_name")
private WebElement UserTextField;
@FindBy(name="user_password")
private WebElement PasswordTextField;
@FindBy(id="submitButton")
private WebElement LoginButton;

//element initialization
public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//getter methods

public WebElement getUserTextField() {
	return UserTextField;
}

public WebElement getPasswordTextField() {
	return PasswordTextField;
}

public WebElement getLoginButton() {
	return LoginButton;
}
//Business logic
public void loginToApp(String USERNAME,String PASSWORD) {
	UserTextField.sendKeys(USERNAME);
	PasswordTextField.sendKeys(PASSWORD);
	LoginButton.click();
}
}




