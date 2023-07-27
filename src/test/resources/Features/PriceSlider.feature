@B6DGMAUT-14
Feature:PRICE slider function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  @B6DGMAUT-40
  Scenario Outline: Check if the product slider is visible by selecting a category from the sub-categories.
    Given The user hovers over the category and selects one of the four sub-categories "<Category Name>"from the sub-categories.
    When sees the price slider
    Then The user change the minimum value to 125 and 480
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Networking      |
      | Televisions     |
      | TV Accessories  |

