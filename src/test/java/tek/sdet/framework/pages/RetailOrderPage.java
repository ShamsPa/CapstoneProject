package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
        // we are implementing PageFactory Class to initialize the UI elements 
        // using @FindBy annotation of PageFactory. 
        PageFactory.initElements(getDriver(), this);
    }
	
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement orderLink;
	@FindBy(xpath ="//button[@id='cancelBtn']")
	public WebElement cancelButton;
	@FindBy(xpath ="//select[@id='reasonInput']")
	public WebElement reasonForCancelation;
	@FindBy(xpath ="//button[@id='orderSubmitBtn']")
	public WebElement cancelButtonSub;
	@FindBy(xpath ="//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement yourOrderHasBeenCancelled;
	@FindBy(className="order")
	public WebElement Firstorder;
	@FindBy(xpath="//button[@id='returnBtn']")
	public WebElement retrunbtn;
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement returnReason;
	@FindBy(xpath="//select[@id='dropOffInput']")
	public WebElement dropOffInput;
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnSubBtn;
	@FindBy(xpath ="//p[contains(text(),'Return was successful')]")
	public WebElement returnwassuccessful;
	@FindBy(xpath = "//*[@id=\"reviewBtn\"]")
	public WebElement reviewBtn;
	@FindBy(xpath = "//*[@id=\"headlineInput\"]")
	public WebElement addHeadlin;
	@FindBy(xpath = "//*[@id=\"descriptionInput\"]")
	public WebElement addWritten;
	@FindBy(xpath = "//*[@id=\"reviewSubmitBtn\"]")
	public WebElement addYourReview;
	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement yourReviewWassAddedSuccessfully;
	
}
