Feature: Cat-Subcategory-Add to Wish List icon function

  US:As a user, I should be able to add the product on wish list by clicking the Add to Wish List icon.
  AC1- Verify that when the user hovers over the product, they can see the Add to Wish List icon.
  AC2- Verify that the user can add products to their wish list, When the user clicks Add to Wish List icon.

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login


  Scenario Outline:
    Given User choose Category "<Category Name>"
    When  User hover over the Product "<Product>"
    Then  Verify that user can see "Add to Wish List"
    Examples:
      | Category Name   | Product                              |
      | Health & Beauty | BaByliss 3663U - Hair rollers        |
      | Televisions     | Cello C1920FS 19" LED-backlit LCD TV |
      | TV Accessories  | Belkin adapter cable                 |
      | Networking      | ASUS PCE-AC51 - network adapter      |

  @B6DGMAUT-21
  Scenario Outline:
    Given User choose Category "<Category Name>"
    When  User hover over the Product "<Product>"
    And   User click on "Add to Wish List"
#    And   User can see the message "<message>"
    And   User click on main "Wish List"
    Then  Verify that user can see "<Product>" in Wish List
    Examples:
      | Category Name   | Product                              | message                 |
      | Health & Beauty | BaByliss 3663U - Hair rollers        | Success: You have added |
      | Televisions     | Cello C2420G 24" LED-backlit LCD TV  | Success: You have added |
      | TV Accessories  | Belkin adapter cable                 | Success: You have added |
      | Networking      | ASUS PCE-AC51 - network adapter      | Success: You have added |