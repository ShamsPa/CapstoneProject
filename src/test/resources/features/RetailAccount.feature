Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'test.group@gmail.com' and password 'Kpccpn1313@'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @Updateprofile @AccountTest @finalTestforAll
  Scenario: Verify User can update Profile Information
    And User update Name 'Lomar' and Phone '9162681342'
    And User click on Update button
    Then user profile information should be updated

  @Grouptest 
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Kpccpn1313@     | Qqccpn1313@ | Qqccpn1313@     |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @Addcardtest @AccountTest @finalTestforAll
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6011621222712371 | Parwiz     |              11 |           2029 |          334 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @EditCardTest @AccountTest @finalTestforAll
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6011621222712327 | Shams      |              12 |           2030 |          667 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @RemovingtheCard @AccountTest @finalTestforAll
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @AddingAddress @AccountTest @finalTestforAll
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city       | state      | zipCode |
      | United States | Parwiz   |  9167774563 | 932 frank Ave | 123 | Elk Grover | California |   98765 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @UpdateAddress @AccountTest @finalTestforAll
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new updated address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city    | state | zipCode |
      | United States | Shams    |  9182348234 | 1234 Hon Ave  |  45 | Sac Hop | Ohio  |   65754 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @RemovingAddressTest @AccountTest @finalTestforAll
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
