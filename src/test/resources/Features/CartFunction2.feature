Feature:

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Given The user navigates to "Health & Beauty" category
    When The user selects "Capsule Plate 6pcs" product and clicks to the "Add To Cart" icon.
    And  The user should be able to access the cart from the view cart button


  Scenario: The user should be able to complete checkout by filling required fields with valid data
    When The user should be able to enter empty "<First Name>","<Last Name>","<Company>","<Address 1>","<Address 2>","<City>","<Post Code>","<Country>","<RegionState>" and then click on Continue button
    And The user should be able to see the error text
      | First Name must be between 1 and 32 characters! |
      | Last Name must be between 1 and 32 characters!  |
      | Address 1 must be between 3 and 128 characters! |
      | City must be between 2 and 128 characters!      |
      | Please select a country!                        |
      | Please select a region / state!                 |

  Scenario: The user should be able to enter the empty info and can be see the error messages
    When The user should be able to enter empty "<First Name>","<Last Name>","<Company>","<Address 1>","<Address 2>","<City>","<Post Code>","<Country>","<RegionState>" and then click on Continue button
    And The user should be able to see the error text
      | First Name must be between 1 and 32 characters! |
      | Last Name must be between 1 and 32 characters!  |
      | Address 1 must be between 3 and 128 characters! |
      | City must be between 2 and 128 characters!      |
      | Please select a country!                        |
      | Please select a region / state!                 |


  Scenario Outline: The user should be able to enter the empty info and can be see the error messages
    When The user should be able to enter empty "<First Name>","<Last Name>","<Company>","<Address 1>","<Address 2>","<City>","<Post Code>","<Country>","<RegionState>" and then click on Continue button
    And The user should be able to see the error text
      | First Name must be between 1 and 32 characters! |
      | Last Name must be between 1 and 32 characters!  |
      | Address 1 must be between 3 and 128 characters! |
      | City must be between 2 and 128 characters!      |
      | Please select a country!                        |
      | Please select a region / state!                 |
    Examples:
      | First Name | Last Name | Company | Address 1 | Address 2 | City | Post Code | Country               | RegionState           |
      |            |           |         |           |           |      |           | --- Please Select --- | --- Please Select --- |