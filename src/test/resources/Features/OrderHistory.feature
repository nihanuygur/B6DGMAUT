@B6DGMAUT-12
Feature: My Account-Order History

  Users Story:
  As a user, I should be able to see and modify order history by clicking the Order History tab under the My Account module.

  Acceptance Criteria :
  AC1- Verify that the user can see the order history by clicking the Order History tab.
  AC2- Verify that the user can access the order detail by clicking the View icon
  AC3- Verify that the user can re-order a product from the order history
  AC4- Verify that the user can return a product from the order history
  AC2- Verify that the user can access the order detail by clicking the View icon
  AC3- Verify that the user can re-order a product from the order history
  AC4- Verify that the user can return a product from the order history
  AC5- Verify that the user can see the returned product on the 'Product Returns' page
  AC6- Verify that the user can access the return details by clicking the ‘View’ icon
  AC7- Verify that the user can see the product information as ‘Returned’ on the ‘Order Details’ page

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
#    Given The user navigates to "Health & Beauty" category
#    When The user selects "Capsule Plate 6pcs" product and clicks to the Add to Cart icon.
#    When The user selects "eufy C1 Smart" product and clicks to the Add to Cart icon.
#    And  The user clicks shopping cart! link from pop-up message and closes the message
#    Given The user clicks Checkout button and navigates to Checkout Page
#    When The user should be able to complete checkout with valid inputs


  @B6DGMAUT-203
  Scenario: Verify that the user can see the order history by clicking the Order History tab.
    Given The user clicks My Account menu and navigates to "Order History" Page
    Then Verify that the user is on the "Order History" page

  @B6DGMAUT-204
  Scenario: Verify that the user can access the order detail by clicking the View icon
    Given The user clicks My Account menu and navigates to "Order History" Page
    When The user clicks "View" icon to see the order histories
    Then The user should see the product's name "eufy C1 Smart" on the "Order History Information" page

  @B6DGMAUT-205
  Scenario: Verify that the user can re-order a product from the order history
    Given The user clicks My Account menu and navigates to "Order History" Page
    When The user clicks "View" icon to see the order histories
    When The user should click 'Reorder' icon for the product
    And The user should see product successfully added message
    And The user should see that the "eufy C1 Smart" has been added to the Shopping Cart page

  @B6DGMAUT-206
  Scenario: Verify that the user can return a product from the order history
    Given The user clicks My Account menu and navigates to "Order History" Page
    When The user clicks "View" icon to see the order histories
    When The user should click 'Return' icon for the product
    Then The title is "Product Returns"
    When The user complete the form on the Product Returns Page and clicks submit button
    Then The user should be able to see return request message

  @B6DGMAUT-207
  Scenario: Verify that the user should see the returned product on the 'Product Returns' page
    Given The user clicks My Account menu and navigates to "My Account" Page
    When The user clicks "Returns" tab to see returned products
    Then The title is "Product Returns"


  @B6DGMAUT-208
  Scenario: Verify that the user can access the return details by clicking the ‘View’ icon
    Given The user clicks My Account menu and navigates to "My Account" Page
    When The user clicks "Returns" tab to see returned products
    Then The title is "Product Returns"
    When The user clicks view button on the product returns page
    And The user should see that the "eufy C1 Smart" as the returned product on Product Returns Page

  @B6DGMAUT-209
  Scenario: Verify that the user should not return a product with unchecked options and empty
  fields  for required fields on the 'Product Returns' page
    Given The user clicks My Account menu and navigates to "Order History" Page
    When The user clicks "View" icon to see the order histories
    When The user should click 'Return' icon for the product
    Then The title is "Product Returns"
    When The user keeps the form fields empty and unchecked on the Product Returns Page or clicks submit button
    Then The user should be able to see warning message for the invalid inputs


