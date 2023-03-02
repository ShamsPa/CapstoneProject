Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phantom.test@gmail.com' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
@LabSession
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Kafeda' and Phone '9163586540'
    And User click on Update button
    Then user profile information should be updated
