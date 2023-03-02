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
    
}
