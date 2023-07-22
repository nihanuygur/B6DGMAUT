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



