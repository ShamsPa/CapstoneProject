package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	  click(factory.homePage().AllElements);
	  logger.info("User click on All section");
	}
	@And("User on {string}")
	public void userOnDepartment(String department) {
	  List < WebElement > dept = factory.homePage().sideBar;
	  for (WebElement element: dept) {
	    if (element.getText().equals(department)) {
	      element.click();
	      break;
	    }
	  }
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	  List < List < String >> departmentSection = dataTable.asLists(String.class);
	  List < WebElement > dept = factory.homePage().sideBar;
	  for (int i = 0; i < departmentSection.get(0).size(); i++) {
	    for (WebElement element: dept) {
	      if (element.getText().equals(departmentSection.get(0).get(i))) {
	        Assert.assertTrue(element.isDisplayed());
	        logger.info(element.getText() + "The item is present");
	      }
	    }
	  }
	}
	@And("User change the category to {string}")
	public void user_change_the_category_to(String catagory) {
		//selectByVisibleText(factory.homePage().selectCatagory.getAccessibleName("string"));
		Select selectBox = new Select((WebElement) factory.homePage().selectCatagory);
		selectBox.selectByVisibleText(catagory);
		//System.out.println(catagory);
		logger.info("user clicked on catagory to change it");
		
	  }

	@And("User search for an item {string}")
	public void user_search_for_an_item(String searchField) {
		sendText(factory.homePage().searchBarInput,searchField);
		logger.info("user searched for the item");
	   }

	@And("User click on Search icon")
	public void user_click_on_search_icon() {
	   click(factory.homePage().searchBtn);
	   logger.info("user clicked on search button");
	}

	@And("User click on item")
	public void user_click_on_item() throws InterruptedException {
	    click(factory.homePage().item);
	   logger.info("user clicked one the item");
	   Thread.sleep(3000);
	}

	@And("User select quantity {string}")
	public void user_select_quantity(String qty) {
	selectByVisibleText(factory.homePage().qtyForproduct,qty);
	logger.info("user selected for qty");
	    
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	    click(factory.homePage().addToCart);
	    logger.info("user clicked on add to card button");
	}

	@Then("the cart icon quantity should change to {string}")
	public void the_cart_icon_quantity_should_change_to(String string) {
		waitTillPresence(factory.homePage().cardQty);
		Assert.assertTrue(isElementDisplayed(factory.homePage().cardQty));
    	logger.info("the qty icon is changed");
	}
	@And("User click on Cart option")
	public void user_click_on_cart_option() {
		  click(factory.homePage().cart);
		  logger.info("user clicked on add to card option ");
		}
		@And("User click on Proceed to Checkout button") 
		public void user_click_on_proceed_to_checkout_button() {
		  click(factory.homePage().proceedButton);
		  logger.info("user clicked on proceedBtn");
		}
		@And("User click Add a new address link for shipping address")
		public void user_click_add_a_new_address_link_for_shipping_address() {
		  click(factory.homePage().addAddresslink);
		  logger.info("user clicked on add new address link");
		}
		@And("User fill new address form with below information")
		public void user_fill_new_address_form_with_below_information(DataTable dataTable)  {
		  List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
		  selectByVisibleText(factory.accountPage().countrydropDown, data.get(0).get("country"));
		  sendText(factory.accountPage().fullNameInput, data.get(0).get("fullName"));
		  sendText(factory.accountPage().phoneNumberInput, data.get(0).get("phoneNumber"));
		  sendText(factory.accountPage().streetInput,data.get(0).get("streetAddress"));
		  sendText(factory.accountPage().apartmentInput,data.get(0).get("apt"));
		  sendText(factory.accountPage().cityInput,data.get(0).get("city"));
	      selectByVisibleText(factory.accountPage().account__address_state,data.get(0).get("state"));
	      sendText(factory.accountPage().zipCodeInput,data.get(0).get("zipCode"));
		  logger.info("user filled the address form");
		}
		@And ("User click Add Your Address button link")
		public void userClickOnAddCardBtnLink()  {
		click(factory.homePage().buttonAddressAdd);
		waitTillPresence(factory.accountPage().addressAddedSuccessfully);
		logger.info("User Clicked on cardButton");
	
		}
		@And("User click add a Cridet or Debit Card button for payement method")
		public void userClickeAddACreditOrDebitCardPayMeth() {
			click(factory.homePage().addPaymentOPTbtn);
			logger.info("user clicked on add cart Btn");
		}
		@And("User fill below card information") 
		public void user_fill_below_card_information(DataTable dataTable) {
		  List < Map < String, String >> data = dataTable.asMaps(String.class, String.class);
		  sendText(factory.accountPage().cardNumberInput, data.get(0).get("cardNumber"));
		  sendText(factory.accountPage().nameOnCardInput, data.get(0).get("nameOnCard"));
		  selectByVisibleText(factory.accountPage().expirationMonthInput, data.get(0).get("expirationMonth"));
		  selectByVisibleText(factory.accountPage().expirationYearInput, data.get(0).get("expirationYear"));
		  sendText(factory.accountPage().securityCodeInput, data.get(0).get("securityCode"));
		  logger.info("User entered the card information");
		}
		@And("User click on Add card button")
		public void userClickOnAddCardBtn() throws InterruptedException {
		  click(factory.homePage().addCardBtnpay);
		 waitTillPresence(factory.accountPage().paymentMethodadded);
		  logger.info("User Clicked on cardButton");
		  Thread.sleep(3000);
	
		}
		@And("User click on Place Your Order")
		public void User_click_Place_Your_Order_button() {
		  click(factory.homePage().PlaceYourOrderBtn);
		  logger.info("User Clicked on place order Btn");
		}
		@Then("a message should be displayed 'Order Placed, Thanks'") 
		public void Then_a_message_should_be_displayed_Order_Placed() {
		  waitTillPresence(factory.homePage().orderPlacedThanks);
		  Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedThanks));
		  logger.info("Order placed,thanks");
		}
	
	
	}