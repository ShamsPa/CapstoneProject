Feature: Retail Page applicaiton

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'test.group@gmail.com' and password 'Kpccpn1313@'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list

  @test @orderPageTest @finalTestforAll
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for 'Pokemon' item
    Then Product should be displayed

  @cancelTest 
  Scenario: Verify User can cancel the order
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed ‘Your Order Has Been Cancelled’

  @ReturnOrderTest @orderPageTest @finalTestforAll
  Scenario: Verify User can Return the order
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a cancelation message should be displayed ‘Return was successful’

  @ReviewOrderTest @orderPageTest @finalTestforAll
  Scenario: Verify User can write a review on order placed
    And User click on Review button
    And User write Review headline 'Really Good Product' and 'I recomand buying this product'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
