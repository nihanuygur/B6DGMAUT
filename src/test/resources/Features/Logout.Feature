@B6DGMAUT-2
Feature: Logout Functionality

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login

  @B6DGMAUT-77
  Scenario: Logout Securely
    Given The user clicks My Account drop down menu and click logout option
    When The user clicks continue button on the Account Logout pop-up
    Then The user should be able to logout

  @B6DGMAUT-78