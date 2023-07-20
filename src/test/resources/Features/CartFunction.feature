@B6DGMAUT-7
Feature: Cart Icon Function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    And The user should be able to login



  @B6DGMAUT-34
#  Scenario: Verify that the User should be able to add products with hover over a product
#  and see the products added to the cart by clicking the 'shopping cart!' link from the pop-up message
#    Given The user navigates to "Health & Beauty" category
#    Given The user hover over "Capsule Plate 6pcs" product and clicks to the "Add to Cart" icon.
#    When The user clicks shopping cart! link from pop-up message and closes the message
#    Then The user should see that the "Capsule Plate 6pcs" has been added to the Shopping Cart page
#
  Scenario: Verify that the User should be able to add products with hover over a product
  and see the products added to the cart by clicking the 'shopping cart!' link from the pop-up message from product Page
    Given The user navigates to "Health & Beauty" category
    Given The user selects "Capsule Plate 6pcs" product and clicks to the "Add To Cart" icon.
    When The user clicks shopping cart! link from pop-up message and closes the message
    Then The user should see that the "Capsule Plate 6pcs" has been added to the Shopping Cart page

