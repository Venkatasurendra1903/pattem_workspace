Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

Scenario: Amazon Login Page
    Given user is on Amazon landing page
    And Sign in button is present on screen
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "suri@gmail.com" in username field
    And user enters "suri@123" in password field
    And user clicks Sign in button
    Then user is on home page
    And title of home page is "Amazon"
    But Sign in button is not present 