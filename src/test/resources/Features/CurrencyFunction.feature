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
    Given The user hover over "<ProductName>" product and clicks to the "Add To Cart" icon.
    And  The user should be able to access the cart from the view cart button
    Then The user should see that the "<ProductName>" has been added to the Shopping Cart page

    Examples:
      | CategoryName    | CurrencyType |ProductName|
      | Health & Beauty | €            |Capsule Plate 6pcs   |
      | Televisions     | £            |Cello C2420G         |
      | Networking      | $            |ASUS ZenWiFi XD6     |
