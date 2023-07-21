@@B6DGMAUT-1
Feature: Dgmarkt user login test

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page

  @B6DGMAUT-25
  Scenario: Login as a user with valid credentials
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  @B6DGMAUT-69
  Scenario Outline: Login as a user with wrong - valid credentials and blank inputboxes
    When The user enters "<email>" and "<password>"
    Then The user should be able to see warning message
    Examples:
      | email                 | password    |
      | userone@gmail.com     | userone1234 |
      | userone1234@gmail.com | userone12   |
      | usertwo@gmail.com     | ... !'^2314 |
      | usertwo@gmail         | userone12   |
      | userone@              | userone12   |
      | userone.com           | userone12   |
      | useronegmail.com      | userone12   |
      |                       | userone12   |
      | userone12@gmail.com   |             |