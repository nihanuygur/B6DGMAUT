Feature: Navigate to Address Book

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button
    Given The user is on the home page
    When  The user enters valid credentials
    And The user should be able to login
    Given The user clicks My Account menu and navigates to My Account Page
@wip
  Scenario: User navigates to Address Book from right side menu
    Given The user clicks Address Book and navigates to the Address Book Entries
@wip
  Scenario: User navigates to Address Book from left side menu
    Given The user clicks Modify your address book entries and navigates to the Address Book Entries

