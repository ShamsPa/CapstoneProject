package tek.sdet.framework.steps;

import org.junit.Assert;

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

	

}
