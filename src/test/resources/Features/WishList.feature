@B6DGMAUT-6
Feature: Like Icon (Wish List) function
  Users story: As a user, I should be able to see the product in my wish list, when I like the product.

  Acceptance Criteria :

  1-*Verify that the user should be able to *see products in the wish list

  2-*Verify that the user should be able to *delete products from wish list or add to cart

  Background:
    Given The user is on the login panel
    When  The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then  The user should be able to login

  Scenario: Verify that the user should be able to see the products in the wish list
    Given   User choose Category "Health & Beauty"
    Then    The title is "Health & Beauty"
    And     The user hover over "Capsule Plate 6pcs" product and clicks to the "Add to Wish List" icon
    And     User close the PopUp and click on "Wish List"
    Then    The page is "My Wish List"
    Then    Verify that the 5 is in My Wish List


  Scenario: Verify that the user should be able add to cart products from wish list
    Given   User choose Category "Health & Beauty"
    Then    The title is "Health & Beauty"
    And     The user hover over "Capsule Plate 6pcs" product and clicks to the "Add to Wish List" icon
    And     User close the PopUp and click on "Wish List"
    Then    The page is "My Wish List"
    And     The user should be able "Capsule Plate 6pcs" to click "Add to Cart"
    When    The user clicks shopping cart! link from pop-up message and closes the message
    Then    The user should see that the "Capsule Plate 6pcs" has been added to the Shopping Cart page

  Scenario: Verify that the user should be able to delete products from wish list
    Given   User choose Category "Health & Beauty"
    Then    The title is "Health & Beauty"
    And     The user hover over "Capsule Plate 6pcs" product and clicks to the "Add to Wish List" icon
    And     User close the PopUp and click on "Wish List"
    Then    The page is "My Wish List"
    And     The user should be able "Capsule Plate 6pcs" to click "Remove"
    Then    Verify that the and user can see the message

