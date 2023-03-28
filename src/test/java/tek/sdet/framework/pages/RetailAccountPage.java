package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
        // we are implementing PageFactory Class to initialize the UI elements 
        // using @FindBy annotation of PageFactory. 
        PageFactory.initElements(getDriver(), this);
    }
 
    // syntax for storing UI elements using @FindBy annotations
    // @FindBy(locatorType = "locator Value")
    // public WebElement nameOfElement
	//@FindBy(xpath ="//a[@id='accountLink']")
	//public WebElement accountOption;
	
	@FindBy(xpath ="//input[@id='nameInput']")
	public WebElement nameInput;
	@FindBy (xpath ="//*[@id='personalPhoneInput']")
	public WebElement phoneNumberField;
	@FindBy (xpath ="//*[@id='personalUpdateBtn']")
	public WebElement updateBtn;
	@FindBy (xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personlainfoUpdateMassage;
    
     @FindBy(xpath = "//img[@alt='profile pic']") // this is same as driver.findElement() 
     public WebElement accountProfilePicture;
     @FindBy(xpath = "//input[@id='previousPasswordInput']")
     public WebElement previousPassword;
     @FindBy(xpath ="//input[@id='newPasswordInput']")
     public WebElement newPassword;
     @FindBy(xpath ="//input[@id='confirmPasswordInput']")
     public WebElement confirmPassword;
     @FindBy(xpath ="//button[@id='credentialsSubmitBtn']")
     public WebElement changePassword;
     @FindBy(xpath ="//div[text()='Password Updated Successfully']")
     public WebElement passwordUpdatedSuccessfully;
     @FindBy(xpath ="//p[contains(text(),'Add a payment method')]")
     public WebElement addPaymentMethod;
     @FindBy(xpath ="//input[@id='cardNumberInput']")
     public WebElement cardNumberInput;
     @FindBy(xpath ="//input[@id='nameOnCardInput']")
     public WebElement nameOnCardInput;
     @FindBy(xpath ="//select[@id='expirationMonthInput']")
     public WebElement expirationMonthInput; 
     @FindBy(xpath="//select[@id='expirationYearInput']")
     public WebElement expirationYearInput;
     @FindBy(xpath ="//input[@id='securityCodeInput']")
     public WebElement securityCodeInput;
     @FindBy(xpath ="//button[@id='paymentSubmitBtn']")
     public WebElement addYourCardtBtn;
     @FindBy(xpath="//div[contains(text(),'Payment Method added sucessfully')]")
     public WebElement paymentMethodadded;
     @FindBy(xpath="//button[contains(text(),'Edit')]")
     public WebElement editbtnForCard;
     @FindBy (xpath="//button[@id='paymentSubmitBtn']")
     public WebElement UpdatebtnForCard;
     @FindBy(xpath ="//div[contains(text(),'Payment Method updated Successfully')]")
     public WebElement paymentMethodUpdated;
     @FindBy(xpath="//p[@class=('account__payment-sub-title')]")
     public WebElement cardthatsNeedstoBeUpdated_Or_Removed;
     @FindBy(xpath="//button[contains(text(),'remove')]")
     public WebElement removeBtnForCard;
    // @FindBy(xpath="//p[@class=('account__payment-sub-title')]")
    // public WebElement clickOntoupdate;
    @FindBy(xpath="//*[@class=\"account__address-new-wrapper\"]")
    public WebElement addAddressbtn;
    @FindBy(xpath="//select[@id='countryDropdown']")
    public WebElement countrydropDown;
    @FindBy(xpath="//input[@id='fullNameInput']")
    public WebElement fullNameInput;
    @FindBy(xpath="//input[@id='phoneNumberInput']")
    public WebElement phoneNumberInput;
    @FindBy(xpath="//input[@id='streetInput']")
    public WebElement streetInput;
    @FindBy(xpath="//input[@id='apartmentInput']")
    public WebElement apartmentInput;
    @FindBy(xpath="//input[@id='cityInput']")
    public WebElement cityInput;
    @FindBy(xpath="//*[@name=\"state\"]")
    public WebElement account__address_state;
    @FindBy(xpath="//input[@id='zipCodeInput']")
    public WebElement zipCodeInput;
    @FindBy(xpath="//button[@id='addressBtn']")
    public WebElement addYourAddressBtnUpdate;
    @FindBy(xpath="//div[contains(text(),'Address Added Successfully')]")
    public WebElement addressAddedSuccessfully;
    @FindBy(xpath="//button[contains(text(),'Edit')]")
    public WebElement editbtnforAddress;
    @FindBy(xpath="//button[@id='addressBtn']")
    public WebElement updateYourAddress;
    @FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]")
    public WebElement addressUpdatedSuccessfully;
    @FindBy(xpath="//button[contains(text(),'Remove')]")
    public WebElement removebtnForAddress;   
}
