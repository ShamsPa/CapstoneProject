Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @smokeTest @Regresion @FunctionalTestCase
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'test.group@gmail.com' and password 'Lpcxpn12132@'
    And User click on login button
    Then User should be logged in into Account

  @smokeTest @Regresion @registerAccount
  Scenario: : Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                   | password  | confrimPassword |
      | panthers | panfgghg44@tekschool.us | Poli@1212 | Poli@1212       |
    And User click on SignUp button
    Then User should be logged into account page