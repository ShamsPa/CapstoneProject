Feature: Retail Home Page 

Background: 
Given User is on retail website
		When User click on Sign in option
    And User enter email 'test.group@gmail.com' and password 'Lpcxpn12132@'
    And User click on login button
    Then User should be logged in into Account
    
@clickon
	Scenario: Verify Shop by Department sidebar
	When User click on All section 
		Then below options are present in Shop by Department sidebar
		|'Electronics'|'Computers'|'Smart Home'|'Sports'|'Automative'|

@retailHomePage
    Scenario Outline: Verify department sidebar options
  	When User click on All section
      And User on <department>
      Then below options are present in department
        | <optionOne> | <optionTwo> | 
    
  Examples: 
        | department    | optionOne                      | optionTwo                |
        | 'Electronics' | TV & Video                     | Video Games              |
        | 'Computers'   | Accessories                    | Networking               |
        | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
        | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
        | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |
  
  @addItemtocart
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
		And User search for an item 'kasa outdoor smart plug'
		And User click on Search icon
		And User click on item 
		And User select quantity '2'
		And User click add to Cart button 
		Then the cart icon quantity should change to '2'
		
		@Test004
		Scenario: Verify User can place an order without Shipping address and payment Method on file
		And User click on Cart option 
		And User click on Proceed to Checkout button
		And User click Add a new address link for shipping address 
		And User fill new address form with below information 
		 | country       | fullName | phoneNumber | streetAddress | apt | city       | state      | zipCode |
     | United States | Parwiz   |  9167774563 | 932 frank Ave | 123 | Elk Grover | California |   98765 |
		And User click Add Your Address button link
		And User click add a Cridet or Debit Card button for payement method
		And User fill below card information 
		| cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
    | 6011621222712371 | Parwiz     |              11 |           2029 |          334 |
		And User click on Add card button 
		And User click on Place Your Order
		Then a message should be displayed 'Order Placed, Thanks'
		
		@TestFinal
		Scenario: Verify User can place an order with Shipping address and payment Method on file
		And User change the category to 'Electronics'
		And User search for an item 'Apex Legends'
		And User click on Search icon
		And User click on item 
		And User select quantity '5'
		And User click add to Cart button 
		Then the cart icon quantity should change to '5'
		And User click on Cart option 
		And User click on Proceed to Checkout button
		And User click on Place Your Order
		Then a message should be displayed 'Order Placed, Thanks'
		
  