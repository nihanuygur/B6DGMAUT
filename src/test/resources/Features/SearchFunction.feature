Feature: Search Icon Function
  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login
  @B6DGMAUT-35
  Scenario: Product is displayed when the user searches for the item on the website
    Given The user clicks to "Search button"
    Then The user clicks the "Search area"
    Then The user should write "TV" at searching area and click "Search Button"
    And Verify that "Search TV" screen is displayed


