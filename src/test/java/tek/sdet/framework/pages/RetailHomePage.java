package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		// we are implementing PageFactory Class to initialize the UI elements 
		// using @FindBy annotation of PageFactory. 
		PageFactory.initElements(getDriver(), this);
	}

	// syntax for storing UI elements using @FindBy annotations
	// @FindBy(locatorType = "locator Value")
	// public WebElement nameOfElement
	
	@FindBy(linkText = "TEKSCHOOL") // this is same as driver.findElement() 
	public WebElement tekschoolLogo;
	@FindBy(id = "searchInput")
	public WebElement searchBarInput;
	@FindBy(id = "searchBtn")
	public WebElement searchButton;
	@FindBy(xpath ="//img[contains(@alt,'Pokemon')]")
	public WebElement pokemonImage;
	@FindBy(id ="signinLink")
	public WebElement signInOption;
	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	@FindBy(xpath = "//span[text()='All']")
	public WebElement AllElements;
	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> sideBar;
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	public WebElement ElectronicsBtn;
	@FindBy(xpath="//span[contains(text(),'Computers')")
	public WebElement ComputersBtn;
	@FindBy(xpath="//div[contains(text(),'Order Placed']")
	public WebElement orderPlaced;
	
	@FindBy(xpath="//span[contains(text(),'Smart Home')]")
	public WebElement smartHomeBtn;
	//span[contains(text(),'Sports')]
	@FindBy(xpath="//span[contains(text(),'Sports')]")
	public WebElement sportsbtn;
	@FindBy(xpath="//span[contains(text(),'Automative')]")
	public WebElement automativeBtn;
	@FindBy(xpath="//select[@id='search']")
	public WebElement selectCatagory;
	@FindBy(xpath="//input[@id='searchInput']")
	public WebElement searchInput;
	@FindBy(xpath="//button[@id='searchBtn']")
	public WebElement searchBtn;
	@FindBy(xpath="//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement outdoorSmartPlug;
	@FindBy(xpath="//*[@class='product__select']")
	public WebElement qtyForproduct;
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	public WebElement addToCart;
	@FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement cardQty;
	@FindBy(xpath="//p[contains(text(),'Cart')]")
	public WebElement cart;
	@FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement proceedButton;
	@FindBy(xpath="//button[@id='addAddressBtn']")
	public WebElement addAddresslink;
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement buttonAddressAdd;
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement addPaymentOPTbtn;
	@FindBy(xpath ="//button[@id='paymentSubmitBtn']")
	public WebElement addCardBtnpay;
	@FindBy(xpath= "//button[@id='placeOrderBtn']")
	public WebElement PlaceYourOrderBtn;
	@FindBy(xpath ="//img[@class='image']")
	public WebElement ItemToBeClickedOn;
	@FindBy(xpath="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedThanks;
	@FindBy(className = "products__layout")
	public WebElement item;

	
}
