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

  @B6DGMAUT-21
  Scenario: Wish List Products
    Given   User click on "Wish List"
    Then  Verify that user can see all Products 4 in Wish List



    Scenario:
      Given User click on Add to Wish List
      And   User is on My Wish List
      And   User add the "<Product>" from wish list to card
      Then  Verify that the "<Product>" is in My card




