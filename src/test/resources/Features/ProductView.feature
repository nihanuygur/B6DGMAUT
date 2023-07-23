@B6DMAUT-41
Feature: Cat-Subcategory - Product View function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  @wip
  Scenario Outline: Check if it can change the product appearance by selecting one of the sub-categories.
    Given The user hovers over the category and selects one of the four sub-categories "<Category Name>"from the sub-categories.
    When user click on product view icon"<viewOption>"
    Then Check if the product view has changed after the user clicks on the product view icon
    Examples:
      | Category Name   | viewOption |
      | Health & Beauty | 2          |
      | Health & Beauty | 3          |
      | Health & Beauty | 4          |
      | Health & Beauty | List       |
      | Televisions     | 2          |
      | Televisions     | 3          |
      | Televisions     | 4          |
      | Televisions     | List       |
      | Networking      | 2          |
      | Networking      | 3          |
      | Networking      | 4          |
      | Networking      | List       |
      | TV Accessories  | 2          |
      | TV Accessories  | 3          |
      | TV Accessories  | 4          |
      | TV Accessories  | List       |

