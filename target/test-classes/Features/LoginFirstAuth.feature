@B6DGMAUT-1
Feature: Login for the first authentication

  @B6DGMAUT-24
  Scenario: Login for the first authentication
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Then The user is on the main page