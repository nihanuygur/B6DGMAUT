@B6DGMAUT-21
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

  @B6DGMAUT-228
  Scenario Outline: Verify that when the user hovers over the product, they can see the Add to Wish List icon.
    Given User choose Category "<Category Name>"
    Then    The title is "<Category Name>"
    When  User hover over the Product "<Product>"
    Then  Verify that user can see "Add to Wish List"
    Examples:
      | Category Name   | Product              |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |

  @B6DGMAUT-238
  Scenario Outline: Verify that the user can add products to their wish list, When the user clicks Add to Wish List icon.
    Given User choose Category "<Category Name>"
    Then  The title is "<Category Name>"
    Given The user hover over "<Product>" product and clicks to the "Add to Wish List" icon
    When The user clicks "wish list" link from pop-up message and closes the message
    Then The user should see that the "<Product>" has been added to the Wish List page
    Examples:
      | Category Name   | Product              |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |
