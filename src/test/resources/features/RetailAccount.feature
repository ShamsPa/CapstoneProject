Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'test.group@gmail.com' and password 'Lpcxpn12132@'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @LabSession
  Scenario: Verify User can update Profile Information
    And User update Name 'Jake' and Phone '9163586540'
    And User click on Update button
    Then user profile information should be updated

  @Grouptest
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | Lpcxpn12132@     | Ppcxpn13132@ | Ppcxpn13132@    |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @Addcardtest
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6011621222712371 | Parwiz     |              11 |           2029 |          334 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @EditCardTest
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6011621222712327 | Shams      |              12 |           2030 |          667 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully

  @RemovingtheCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed
