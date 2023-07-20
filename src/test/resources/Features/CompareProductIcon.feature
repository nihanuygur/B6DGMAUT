@B6DGMAUT-22
Feature:  Cat-Subcategory-Compare this Product icon function
  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    And The user should be able to login

  Scenario Outline: The user can see the Compare this Product icon by hover overing the product.
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    And The user hover over the product

    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |