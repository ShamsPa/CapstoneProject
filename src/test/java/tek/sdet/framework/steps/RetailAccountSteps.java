package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.bouncycastle.asn1.dvcs.Data;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void UserClickOnAccountOption() {
	  click(factory.homePage().accountOption);
	  logger.info("User click on Account option");
	}
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
	  //List<List<String>> data1 = dataTable.asLists(String.class);
	  clearTextUsingSendKeys(factory.accountPage().nameInput);
	  
	  sendText(factory.accountPage().nameInput, name);
	  
	  clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
	  
	  sendText(factory.accountPage().phoneNumberField, phoneNumber);
	  
	  logger.info("User update Name ‘NameValue’ and Phone ‘PhoneValue’");
	  //Thread.sleep(3000);
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
	  click(factory.accountPage().updateBtn);
	  logger.info("User click on signUp button");
	}

    
    @Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
	  waitTillPresence(factory.accountPage().personlainfoUpdateMassage);
	  String actualMassage = factory.accountPage().personlainfoUpdateMassage.getText();
	  String expectedMessage = "Personal Information Update Succesfully";
	  Assert.assertTrue(isElementDisplayed(factory.accountPage().personlainfoUpdateMassage));
	  logger.info("user is logged into account page");
	}
    @And ("User enter below information")
    public void userEnterBelowInformation(DataTable dataTable){
        List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
        sendText(factory.accountPage().previousPassword,data.get(0).get("previousPassword"));
    	sendText(factory.accountPage().newPassword,data.get(0).get("newPassword"));
    	sendText(factory.accountPage().confirmPassword,data.get(0).get("confirmPassword"));
    	//Thread.sleep(3000);
    	logger.info("User entered the new Password");
    	
    	}
    @And("User click on Change Password button")
    public void userClickOnChangePasswordButton() {
    	click(factory.accountPage().changePassword);
    	logger.info("User clicked on change passowrd");
    }
    @Then("a message should be displayed 'Password Updated Successfully'")
    public void passwordUpdatedSuccessfully() {
    	waitTillPresence(factory.accountPage().passwordUpdatedSuccessfully);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().passwordUpdatedSuccessfully));
    	logger.info("Password Updated Successfully");
    	
    	
    }
    @And ("User click on Add a payment method link")
    public void userClickOnAddPaymentLink() {
    	click(factory.accountPage().addPaymentMethod);
    	logger.info("User clicked on Add a payment method link");
    	
    }
    @And ("User fill Debit or credit card information")
    public void userFillDebitOrCreditInfo(DataTable dataTable) {
    	 List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
    	 sendText(factory.accountPage().cardNumberInput,data.get(0).get("cardNumber"));
    	 sendText(factory.accountPage().nameOnCardInput,data.get(0).get("nameOnCard"));
    	 Select(factory.accountPage().expirationMonthInput,data.get(0).get("expirationMonth"));
    	 Select(factory.accountPage().expirationYearInput,data.get(0).get("expirationYear"));
    	 sendText(factory.accountPage().securityCodeInput,data.get(0).get("securityCode"));
    	// Select(factory.accountPage().expirationMonthInput,data.get(0).get("expirationMonth"));
    	 //(factory.accountPage().expirationMonthInput,data.get(0).get("expirationMonth"));
    	
    }
    private void Select(WebElement expirationMonthInput, String string) {
		// TODO Auto-generated method stub
		
	}
    
	@And ("User click on Add your card button")
    public void userClickOnAddYourCardBtn()
    {
     	click(factory.accountPage().addYourCardtBtn);
     	logger.info("User Clicked on cardButton");
     	
    }
    @Then ("a message should be displayed ‘Payment Method added successfully’")
    public void paymentMethodAddedSuccessfully() {
    	waitTillPresence(factory.accountPage().paymentMethodadded);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodadded));
    	logger.info("Payment add successfully");
    	
    }
    @And ("User click on Edit option of card section")
    public void userClickOnEditOptionOfCardSection() {
    	click(factory.accountPage().cardthatsNeedstoBeUpdated_Or_Removed);
    	waitTillPresence(factory.accountPage().editbtnForCard);
    	click(factory.accountPage().editbtnForCard);
    	logger.info("user Clicked on edit button");
    	
    	 }
    @And("user edit information with below data")
    public void userEditInformationWithBelowDatta(DataTable dataTable) {
    	List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
    	clear(factory.accountPage().cardNumberInput);
    	sendText(factory.accountPage().cardNumberInput,data.get(0).get("cardNumber"));
    	clear(factory.accountPage().nameInput);
    	sendText(factory.accountPage().nameOnCardInput,data.get(0).get("nameOnCard"));
    	Select(factory.accountPage().expirationMonthInput,data.get(0).get("expirationMonth"));
   	 	Select(factory.accountPage().expirationYearInput,data.get(0).get("expirationYear"));
   	 	sendText(factory.accountPage().securityCodeInput,data.get(0).get("securityCode"));
   	 	logger.info("The Data has been updated");
   	 	}
    private void clear(WebElement cardNumberInput) {
		// TODO Auto-generated method stub
		
	}
	@And ("user click on Update Your Card button")
    public void userClickOnupdateYourCardbutton() {
    	click(factory.accountPage().UpdatebtnForCard);
    	logger.info("the user clicked in update card button");
    	 }
    @Then("a message should be displayed ‘Payment Method updated Successfully")
    public void paymentMehtodUpdatedSuccessfully() {
    	waitTillPresence(factory.accountPage().paymentMethodUpdated);
    	Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdated));
    	logger.info("Payment Method updated Successfully");
    	}
    @And("User click on remove option of card section")
    public void userClickOnRemovebtn() {
    	click(factory.accountPage().cardthatsNeedstoBeUpdated_Or_Removed);
    	waitTillPresence(factory.accountPage().removeBtnForCard);
    	click(factory.accountPage().removeBtnForCard);
    	logger.info("the card has been removed");
    	
    	
    }
    @Then("payment details should be removed")
    public void paymentDetailsShouldbeRemoved()  {
    	//Thread.sleep(5000);
    	logger.info("The Card has been removed ");
    	
    }
    
    
}
	

