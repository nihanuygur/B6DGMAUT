@B6DGMAUT-4
Feature: Currency Function
  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login
  @B6DGMAUT-72
  Scenario Outline: The currency selected by the user matches the currency on the products
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    Given The user clicks "Currency" button
    Then The user selects"<CurrencyType>" currency
    And Verify that currency selected "<CurrencyType>" by the user matches the currency on the products
    Examples:

     | CategoryName    | CurrencyType |
     | Health & Beauty | €        |
     | Televisions     | £     |
     | Networking      | $     |

  @B6DGMAUT-75
  Scenario Outline: The user is able to complete their purchase with the currency of their choice
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    Given The user clicks "Currency" button
    Then The user selects"<CurrencyType>" currency
    Given The user hover over 5 th product and clicks to the "Add to Cart" icon.
    When The user clicks shopping cart! link from pop-up message and closes the message
    Given The user clicks Checkout button and navigates to Checkout Page
    When The user clicks radio button to use existing address and then click on Continue button in Billing Details
    And The user clicks radio button to use existing address and then click on Continue button in Delivery Details
    And Verify that Flat Shipping rate matches selected "<CurrencyType>"
    And The user controls if is it clicked Flat Shipping Rate the radio button and clicks on Continue button.
    And The user controls if is it clicked Cash On Delivery the radio button and then clicks on I agree button and Continue button.
    Then The user should be able to click on Confirm Order button
    And The user should be able to see "Your Order Has Been Placed!" message

    Examples:
      | CategoryName    | CurrencyType |
      | Health & Beauty | €            |
      | Televisions     | £            |
      | Networking      | $            |
