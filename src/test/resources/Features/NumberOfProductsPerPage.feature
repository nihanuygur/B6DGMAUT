@B6DGMAUT-18
Feature: Test for the number of products to be shown on a page while in subcategories

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    And The user should be able to login

  Scenario Outline:
    Given The user navigates to "<categoryName>" category
    When User selects "<number>" from SHOW
    Then The message contains "<message>"
    Examples:
      | categoryName    | number | message     |
      | Health & Beauty | 12     | 1 to 12 of  |
      | Health & Beauty | 25     | 1 to 25 of  |
      | Televisions     | 12     | 1 to 12 of  |
      | Televisions     | 25     | 1 to 25 of  |
      | Televisions     | 50     | 1 to 50 of  |
      | TV Accessories  | 12     | 1 to 12 of  |
      | TV Accessories  | 25     | 1 to 25 of  |
      | TV Accessories  | 50     | 1 to 50 of  |
      | TV Accessories  | 75     | 1 to 75 of  |
      | Networking      | 12     | 1 to 12 of  |
      | Networking      | 25     | 1 to 25 of  |
      | Networking      | 50     | 1 to 50 of  |
      | Networking      | 75     | 1 to 75 of  |




