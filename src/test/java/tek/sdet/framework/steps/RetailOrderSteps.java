package tek.sdet.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("User is on retail website");
	}
	
	@When("User search for {string} item")
	public void userSearchForItem(String value) {
		sendText(factory.homePage().searchBarInput,value);
		click(factory.homePage().searchButton);
		logger.info("User searched for " + value+ " item");
		
	}
	@Then("Product should be displayed")
	public void productShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonImage));
		logger.info("Product is displayed");
		
		
	}
	 @And ("User click on Orders section")
	 public void clickOnOrdersSection() {
		 click(factory.accountOrderpage().orderLink);
		 logger.info("user clicked on order section");
		 
	 }
	 @And("User click on first order in list")
	 public void userClickOnFirstOrderInList() {
		 logger.info("user clicked on the first order in list");
		 
		 }
	 @And("User click on Cancel The Order button")
	 public void userClickOnCancelTheOrderButton() throws InterruptedException {
		 click(factory.accountOrderpage().cancelButton);
		 Thread.sleep(2000);
		 logger.info("user clicked on cancel");
	 }
	    @And("User select the cancelation Reason {string}")
	    public void userselectTheCancelationReason(String reason) throws InterruptedException {
	    	Thread.sleep(2000);
	    	selectByVisibleText(factory.accountOrderpage().reasonForCancelation,reason);
	    	logger.info("user selceted the reason");
	    	
	    	
	    }
	    @And("User click on Cancel Order button")
	    public void userClickOncancelOrderButton() throws InterruptedException {
	    	click(factory.accountOrderpage().cancelButtonSub);
	    	Thread.sleep(2000);
	    	logger.info("user canceled the order");
	    	
	    }
	    @Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	    public void aCancelationmessageShouldBeDisplayed() {
	    	waitTillPresence(factory.accountOrderpage().yourOrderHasBeenCancelled);
	    	Assert.assertTrue(isElementDisplayed(factory.accountOrderpage().yourOrderHasBeenCancelled));
	    	logger.info("Your Order Has Been Cancelled");
	    	
	    }
	    @And("User click on Return Items button")
	    public void userClickOnReturnItems() {
	    	click(factory.accountOrderpage().retrunbtn);
	    	logger.info("user clicked one return Items");
	    }
	    @And ("User select the Return Reason {string}")
	    public void userselectTheRetrunReason(String returnreason) throws InterruptedException {
	    	selectByVisibleText(factory.accountOrderpage().returnReason,returnreason);
	    	logger.info("user selected the reason for return");
	    	Thread.sleep(2000);
	    }
	    @And ("User select the drop off service {string}")
	    public void userSelectTheDropOffService(String dropoff) {
	    	selectByVisibleText(factory.accountOrderpage().dropOffInput,dropoff);
	    	logger.info("user selected the drop off service");
	    	
	    }
	    @And("User click on Return Order button")
	    public void UserClickOnReturnOrderButton() {
	    	click(factory.accountOrderpage().returnSubBtn);
	    	logger.info("user clicked on retrun order");
	    	
	    }
	    @Then("a cancelation message should be displayed ‘Return was successful’")
	    public void aCancelationMessageShouldbeDisplayed() {
	    	waitTillPresence(factory.accountOrderpage().returnwassuccessful);
	    	Assert.assertTrue(isElementDisplayed(factory.accountOrderpage().returnwassuccessful));
	    	logger.info("a cancelation message is displayed");
	    }
	    @And("User click on Review button")
	    public void userclickedonReviewbutoon() {
	    	click(factory.accountOrderpage().reviewBtn);
	    	logger.info("User clicked on review button");
	    }
	    @And ("User write Review headline {string} and {string}")
	    public void userwriteReviewheadline(String commentOne,String commentTwo) {
	    	sendText(factory.accountOrderpage().addHeadlin, commentOne);
	    	sendText(factory.accountOrderpage().addWritten, commentTwo);
	    	logger.info("User clicked added headline value and review text");
	    }
	    	

	    @And ("User click Add your Review button")
	    public void userClickedAddYourReviewButton() throws InterruptedException {
	    	click(factory.accountOrderpage().addYourReview);
	    	logger.info("User clicked on add review button");
	    	Thread.sleep(3000);
	    }
	    @Then("a review message should be displayed 'Your review was added successfully'")
	    public void areviewmessageshouldbedisplayed() {
	    	waitTillPresence(factory.accountOrderpage().yourReviewWassAddedSuccessfully);
	    	Assert.assertTrue(isElementDisplayed(factory.accountOrderpage().yourReviewWassAddedSuccessfully));
	    	logger.info("your review as added is displayed");
	    	
	    }
	 
	

}
