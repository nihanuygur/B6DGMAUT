@@B6DGMAUT-1
Feature: Forgotten Password Functionality

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page

  @B6DGMAUT-74
  Scenario Outline: View and Use 'Forgotten Password' functionality
    Given The user in on the forgotten password page
    When The user enter "<email>"
    Then The user should be able to "<message>"
    Examples:
      | email               | message                                                                     |
      | userone@gmail.com   | An email with a confirmation link has been sent your email address.         |
      | userone12@gmail.com | Warning: The E-Mail Address was not found in our records, please try again! |