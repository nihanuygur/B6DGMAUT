@@B6DGMAUT-20
  Feature: Cat-Subcategory-Quick View icon function

    Users Story: As a user, I should be able to browse and act on the product privately by clicking the quick view icon.

    Acceptance Criteria:

    1- Verify that when the user hovers over the product, they can see the quick view icon.

    *2-*Verify that the user can browse the product when the user clicks the quick view icon

    3- Verify that the user can add the product to their wish lis*t when the user *clicks Add to Wish List icon from the quick view popup.

    4- Verify that the user can add the product to their compare list when the user clicks Compare this Product icon from the quick view popup

    5-*Verify that the user can *add the product to their cart when the user clicks Add to Cart button from the quick view popup

    6-Verify that the user can increase the number of the products to add to the cart by filling the box from the quick view popup

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

    Scenario: Verify that when the user hovers over the product, they can see the quick view icon.
      Given The user hovers over the Cello product
      Then The user should be able to see the quick view icon
