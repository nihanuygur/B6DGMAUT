@B6DGMAUT-17
Feature: Cat-Subcategory - Sort By Function

  Users Story: As a user, I should be able to sort the products on my page in the category I want.

  Acceptance Criteria:

  1- Verify that the Sort By tab initially shows "default

  2-Verify that the user can sort the products by NAME (A-Z)

  3-Verify that the user can sort the products by NAME (Z-A)

  4-Verify that the user can sort the products by Price (Low>High)

  5-Verify that the user can sort the products by Price (High>Low)

  6-Verify that the user can sort the products by Rating (Highest)

  7-Verify that the user can sort the products by Rating (Lowest)

  8-Verify that the user can sort the products by MODEL (A-Z)

  9-Verify that the user can sort the products by MODEL (Z-A)

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

  @B6DGMAUT-42
  Scenario Outline: the user can sort the products by Price (Low > High)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Price (Low > High)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Price (Low > High)"
    Then Verify that the products are actually sorted by "Price (Low > High)"
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |

  @B6DGMAUT-43
  Scenario Outline: the user can sort the products by Price (High > Low)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Price (High > Low)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Price (High > Low)"
    Then Verify that the products are actually sorted by "Price (High > Low)"
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |

  @B6DGMAUT-44
  Scenario Outline: the user can sort the products by Rating (Highest)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Rating (Highest)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Rating (Highest)"
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |

  @B6DGMAUT-46
  Scenario Outline: the user can sort the products by Price Rating (Lowest)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Rating (Lowest)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Rating (Lowest)"
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |

  @B6DGMAUT-47
  Scenario Outline: the user can sort the products by Price Model (A - Z)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Model (A - Z)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Model (A - Z)"
    Then Verify that the products are actually alphabetically "Name (A - Z)" sorted
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |

  @B6DGMAUT-48
  Scenario Outline: the user can sort the products by Price Model (Z - A)
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    When The user selects "Model (Z - A)" in the sorting dropdown menu
    Then the Sort By tab initially shows "Model (Z - A)"
    Then Verify that the products are actually alphabetically "Name (Z - A)" sorted
    Examples:
      | Category Name   |
      | Health & Beauty |
      | Televisions     |
      | Networking      |
      | TV Accessories  |