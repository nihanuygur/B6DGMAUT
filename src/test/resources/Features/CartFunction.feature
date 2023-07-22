@B6DGMAUT-7
Feature: Cart Icon Function
  Users Story: As a user, I should be able to manage the cart by clicking the cart icon
  Acceptance Criteria :
  AC1- Verify that the user should be able to see the products added to the cart by clicking the 'shopping cart!' link from the pop-up message.
  AC2- Verify that the user should be able to see the products added to the cart by clicking the cart icon
  AC3- Verify that the user should be able to access the cart from the ‘View Cart’ button
  AC4- Verify that the user should be able to complete the checkout
  AC5- Verify that the user should not be able to complete the checkout with invalid input on the 'View Cart' page.
  AC6- Verify that the user should not be able to add a product to the cart by clicking the cart icon that has an invalid amount for quantity
  AC7- Verify that the user should not be able to complete checkout on the 'Checkout' page with invalid input for information
  AC8- Verify that the user should not be able to complete checkout on the 'Checkout' page with empty input for information


  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    And The user should be able to login


  Scenario: Verify that the User should be able to add products with hover over a product
  and see the products added to the cart by clicking the 'shopping cart!' link from the pop-up message from product Page
    Given The user navigates to "Health & Beauty" category
    Given The user selects "Capsule Plate 6pcs" product and clicks to the "Add To Cart" icon.
    When The user clicks shopping cart! link from pop-up message and closes the message
    Then The user should see that the "Capsule Plate 6pcs" has been added to the Shopping Cart page




  Scenario Outline: Verify that the User should be able to add products with hover over a product
  and see the products added to the cart by clicking the 'shopping cart!' link from the pop-up message
    Given The user navigates to "<CategoryName>" category
    Given The user hover over "<ProductName>" product and clicks to the "Add To Cart" icon.
    When The user clicks shopping cart! link from pop-up message and closes the message
    Then The user should see that the "<ProductName>" has been added to the Shopping Cart page
    Examples:
      | CategoryName    | ProductName          |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |


  Scenario: Verify that the user should be able to access the cart from the ‘View Cart’ button
    Given The user navigates to "Health & Beauty" category
    When The user selects "Capsule Plate 6pcs" product and clicks to the "Add To Cart" icon.
    Then The user should see product successfully added message
    And  The user should be able to access the cart from the view cart button
    And The user should see that the "Capsule Plate 6pcs" has been added to the Shopping Cart page
