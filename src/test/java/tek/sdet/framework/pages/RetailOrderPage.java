package tek.sdet.framework.pages;

import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
        // we are implementing PageFactory Class to initialize the UI elements 
        // using @FindBy annotation of PageFactory. 
        PageFactory.initElements(getDriver(), this);
    }
	

}
