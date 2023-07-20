@@B6DGMAUT-1
Feature: Dgmarkt user login test

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication



  @B6DGMAUT-25 @wip
  Scenario: Login as a user
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login