package ObjectRepository1;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Homepage{
	@FindBy(linkText="Calendar")
	private WebElement calendarbutton;

	@FindBy(linkText="Organizations")
	private WebElement organizationbutton;

	@FindBy(linkText="Contacts")
	private WebElement contactbutton;


	@FindBy(linkText="Quick Create...")
	private WebElement quickCreateButton;

	@FindBy(linkText="More")
	private WebElement MoreButton;

	@FindBy(xpath="//a[@href='index.php?module=Campaigns&action=index']")
	private WebElement campLink;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminLink;

	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signoutLink;

	@FindBy(xpath="//ul[@class='widgetDropDownList']")
	private WebElement widgetDropdown;

	@FindBy(xpath="//ul[@class='widgetDropDownList']/li[2]")
	private WebElement rss;

	@FindBy(linkText="Products")
	private WebElement productLink;


	//getter methods
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCalendarbutton() {
		return calendarbutton;
	}
	public WebElement getMoreButton() {
		return MoreButton;
	}

	public WebElement getQuickCreateButton() {
		return quickCreateButton;
	}
	public WebElement getCampLink() {
		return campLink;
	}

	public WebElement getAdminLink() {
		return adminLink;
	}


	public WebElement getSignoutLink() {
		return signoutLink;
	}
	public WebElement getWidgetDropdown() {
		return widgetDropdown;
	}
	public WebElement getOrganizationbutton() {
		return organizationbutton;
	}
	public WebElement getRss() {
		return rss;
	}
	public WebElement getContactbutton() {
		return contactbutton;
	}
	public WebElement getProductLink() {
		return productLink;
	}


	//methods
	public void calendar() {
		calendarbutton.click();
	}
	public void quickcreate() {
		quickCreateButton.click();
	}
	public void morebutton() {
		MoreButton.click();
	}
	public void  camplink() {
		campLink.click();
	}
	public void adminlink() {
		adminLink.click();
		signoutLink.click();
	}

	public void WidgetDropdown() {
		widgetDropdown.click();
	}
	public void Rss() {
		rss.click();
	}
	public void Organizationbutton() {
		 organizationbutton.click();
	}
	public void contactButton() {
		contactbutton.click();
		
	}
	public void clickproductLink() {
		productLink.click();
	}
	}



