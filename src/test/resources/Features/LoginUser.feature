Feature: Dgmarkt user login test

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button


  @B6DGMAUT-25
  Scenario: Login as a user
    Given The user is on the home page
    When  The user enters valid credentials
    Then The user should be able to login
