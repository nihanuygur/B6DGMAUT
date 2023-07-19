@B6DGMAUT-17
Feature: Cat-Subcategory - Sort By Function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  @B6DGMAUT-37
  Scenario Outline: Sort By tab initially shows "default"
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    Then the Sort By tab initially shows "Default"
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |

  @B6DGMAUT-38
  Scenario Outline: the user can sort the products by NAME (A-Z)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Name (A - Z)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Name (A - Z)"
    Then Verify that the products are actually alphabetically "Name (A - Z)" sorted
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |

  @B6DGMAUT-39
  Scenario Outline: the user can sort the products by NAME (Z-A)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Name (Z - A)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Name (Z - A)"
    Then Verify that the products are actually alphabetically "Name (Z - A)" sorted
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |