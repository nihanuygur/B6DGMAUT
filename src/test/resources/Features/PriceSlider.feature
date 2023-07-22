@B6DMAUT-40
Feature:PRICE slider function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  @Wip
  Scenario Outline: Check if the product slider is visible by selecting a category from the sub-categories.
    Given The user hovers over the category and selects one of the four sub-categories "<Category Name>"from the sub-categories.
    When sees the price slider
    And user enters a  "<priceRange>" and "<priceRangeMax>"
    Then verify if the user can use the price slider
    Examples:
      | Category Name   | priceRange | priceRangeMax |
      | Health & Beauty | 8.09399    | 77.5457       |
      | Televisions     | 8.09399    | 77.5457       |
      | TV Accessories  | 8.09399    | 77.5457       |
      | Networking      | 8.09399    | 77.5457       |
