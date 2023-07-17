Feature: Login for the first authentication

  @wip
  Scenario: Login for the first authentication
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button
    Then Verify that the user is on the Home Page