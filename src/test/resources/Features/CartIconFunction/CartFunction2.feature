@B6DGMAUT-7
Feature: Cart Icon Function 2
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
    Given The user navigates to "Health & Beauty" category
    When The user selects "Capsule Plate 6pcs" product and clicks to the Add to Cart icon.
    And  The user clicks shopping cart! link from pop-up message and closes the message



#  Scenario: Verify that the user should be able to complete the checkout
#    Given The user clicks Checkout button and navigates to Checkout Page
#    When The user should be able to complete checkout with valid inputs
#    And The user should be able to click on the Cart Symbol button and see that the cart is empty.

  @B6DGMAUT-146
  Scenario: Verify that the user should be able to complete the checkout with existing address
    Given The user clicks Checkout button and navigates to Checkout Page
    When The user clicks radio button to use existing address and then click on Continue button in Billing Details
    And The user clicks radio button to use existing address and then click on Continue button in Delivery Details
    And The user controls if is it clicked Flat Shipping Rate the radio button and clicks on Continue button.
    And The user controls if is it clicked Cash On Delivery the radio button and then clicks on I agree button and Continue button.
    Then The user should be able to click on Confirm Order button
    And The user should be able to see "Your Order Has Been Placed!" message

  @B6DGMAUT-147
  Scenario: The user should not be able to complete checkout by filling required fields with empty fields
    Given The user clicks Checkout button and navigates to Checkout Page
    When The user clicks add New Address option and leaves empty required fields then clicks on Continue button in Billing Details
    And The user should be able to see the error messages about fields
      | First Name must be between 1 and 32 characters! |
      | Last Name must be between 1 and 32 characters!  |
      | Address 1 must be between 3 and 128 characters! |
      | City must be between 2 and 128 characters!      |
      | Postcode must be between 2 and 10 characters!   |
      | Please select a region / state!                 |

  @B6DGMAUT-148
  Scenario Outline: The user should not be able to complete checkout by filling required fields with out of the boundary character
    Given The user clicks Checkout button and navigates to Checkout Page
    When The user clicks add New Address option and "<First Name>","<Last Name>","<Company>","<Address 1>","<Address 2>","<City>","<Post Code>","<Country>","<RegionState>" then clicks on Continue button in Billing Details
    And The user should be able to see the error "<Message>" about fields
    Examples:
      | First Name                              | Last Name                               | Company | Address 1 | Address 2 | City | Post Code | Country        | RegionState | Message                                         |
      | abcdefghijklmnoprstuvyzxwabcdefghijklmn | abcd                                    |         | abcd      |           | abcd | abcd      | United Kingdom | Aberdeen    | First Name must be between 1 and 32 characters! |
      | abcd                                    | abcdefghijklmnoprstuvyzxwabcdefghijklmn |         | abcd      |           | abcd | abcd      | United Kingdom | Aberdeen    | Last Name must be between 1 and 32 characters!  |
      | abcd                                    | abcd                                    |         | a         |           | abcd | abcd      | United Kingdom | Aberdeen    | Address 1 must be between 3 and 128 characters! |
      | abcd                                    | abcd                                    |         | abcd      |           | a    | abcd      | United Kingdom | Aberdeen    | City must be between 2 and 128 characters!      |
      | abcd                                    | abcd                                    |         | abcd      |           | abcd | a         | United Kingdom | Aberdeen    | Postcode must be between 2 and 10 characters!   |

  @B6DGMAUT-149
  Scenario Outline: The user should be able to complete checkout by adding new address information
    Given The user clicks Checkout button and navigates to Checkout Page
    When The user clicks add New Address option and "<First Name>","<Last Name>","<Company>","<Address 1>","<Address 2>","<City>","<Post Code>","<Country>","<RegionState>" then clicks on Continue button in Billing Details
    And The user clicks radio button to use existing address and then click on Continue button in Delivery Details
    And The user controls if is it clicked Flat Shipping Rate the radio button and clicks on Continue button.
    And The user controls if is it clicked Cash On Delivery the radio button and then clicks on I agree button and Continue button.
    Then The user should be able to click on Confirm Order button
    And The user should be able to see "Your Order Has Been Placed!" message
    Examples:
      | First Name | Last Name | Company | Address 1 | Address 2 | City | Post Code | Country        | RegionState |
      | abcd       | abcd      |         | abcd      |           | abcd | abcd      | United Kingdom | Aberdeen    |