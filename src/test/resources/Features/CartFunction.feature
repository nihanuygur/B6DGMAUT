Feature: Cart Icon Function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    And The user should be able to login


  Scenario: Verify that the User should be able to add products with hover over a product
  and see the products added to the cart by clicking the 'shopping cart!' link from the pop-up message
#    Given The user hover over "Cello C2420G 24\" LED-backlit LCD TV" product and clicks to the Add To Cart icon.
    Given The user hover over "Cello C2420G" product and clicks to the Add To Cart icon.
    When The user clicks shopping cart! link from pop-up message and closes the message
    Then The user should see that the "Cello C2420G 24\" LED-backlit LCD TV" has been added to the Shopping Cart page


