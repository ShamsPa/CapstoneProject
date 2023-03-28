Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @singinTest @FunctionalTestCase @finalTestforAll
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'test.group@gmail.com' and password 'Kpccpn1313@'
    And User click on login button
    Then User should be logged in into Account

  @singnUptest @registerAccount @finalTestforAll
  Scenario: : Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                | password  | confrimPassword |
      | Alphatest | alphatest89@tekschool.us | Poli@1212 | Poli@1212       |
    And User click on SignUp button
    Then User should be logged into account page
