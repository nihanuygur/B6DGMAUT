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
    Given   User choose Category "Health & Beauty"
    Then    The title is "Health & Beauty"
    And     The user hover over "C1 Smart Scale White" product and clicks to the "Add to Wish List" icon
    And     User close the PopUp and click on "Wish List"



  Scenario: Verify that the user should be able to see the products in the wish list
    Given    Verify that the user is on the "My Wish List" page
    Then    The user should see that the "C1 Smart Scale White" has been added to the Wish List page


  Scenario: Verify that the user should be able add to cart products from wish list
    Given    Verify that the user is on the "My Wish List" page
    When    The user should be able "C1 Smart Scale White" to click "Add to Cart"
    And     The user clicks "shopping cart!" link from pop-up message and closes the message
    Then    The user should see that the "C1 Smart Scale White" has been added to the Shopping Cart page

  Scenario: Verify that the user should be able to delete products from wish list
    Given    Verify that the user is on the "My Wish List" page
    When     The user should be able "C1 Smart Scale White" to click "Remove"
    Then     Verify that the and user can see the message

