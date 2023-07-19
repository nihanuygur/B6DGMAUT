
Feature: Not add new address into address Book with invalid data

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button
    Given The user is on the home page
    When  The user enters valid credentials
    And The user should be able to login
    Given The user clicks My Account menu and navigates to My Account Page
    Then The user clicks Address Book and navigates to the Address Book Entries
    And The user clicks New Address button and navigates to Add Address page



@wip
  Scenario Outline: Not add address with invalid first name
    Given The user is on the Add Address Page
    When The user fills the Add Address form with data "<First Name>" and "<Last Name>" and "<Company>" and "<Address 1>" and "<City>" and "<Post Code>"
    And The user selects country as "Germany"
    And The user selects "Nordrhein-Westfalen" as RegionState
    Then The user clicks continue button and see warning "<Message>"
    Examples:
      | First Name                        | Last Name | Company | Address 1      | City | Post Code |Message|
      |                                   | Stein     | IBM     | Steinstrase 10 | Koln | 5462      |  First Name must be between 1 and 32 characters!     |
      | bnmvcdfghjkiuztrewsdfghjkiuztredf | Stein     | IBM     | Steinstrase 10 | Koln | 5462      |   First Name must be between 1 and 32 characters!    |

  @wip
  Scenario Outline: Not add address with invalid last name
    Given The user is on the Add Address Page
    When The user fills the Add Address form with data "<First Name>" and "<Last Name>" and "<Company>" and "<Address 1>" and "<City>" and "<Post Code>"
    And The user selects country as "Germany"
    And The user selects "Nordrhein-Westfalen" as RegionState
    Then The user clicks continue button and see warning "<Message>"
    Examples:
      | First Name | Last Name                         | Company | Address 1      | City | Post Code |Message|
      | Sarah      |                                   | IBM     | Steinstrase 10 | Koln | 5462      |Last Name must be between 1 and 32 characters!|
      | Sarah      | bnmvcdfghjkiuztrewsdfghjkiuztredf | IBM     | Steinstrase 10 | Koln | 5462      |Last Name must be between 1 and 32 characters!|

  @wip
  Scenario Outline: Not add address with invalid Address1
    Given The user is on the Add Address Page
    When The user fills the Add Address form with data "<First Name>" and "<Last Name>" and "<Company>" and "<Address 1>" and "<City>" and "<Post Code>"
    And The user selects country as "Germany"
    And The user selects "Nordrhein-Westfalen" as RegionState
    Then The user clicks continue button and see warning "<Message>"
    Examples:
      | First Name | Last Name | Company | Address 1                                                                                                                                             | City | Post Code |Message|
      | Sarah      | Stein     | IBM     | Steinstrase 10 Steinstrase 10 Steinstrase 10 Steinstrase 10 Steinstrase 10 Steinstrase 10 Steinstrase 10 Steinstrase 10 Steinstrase 10 Steinstrase 10 | Koln | 5462      |Address must be between 3 and 128 characters!|
      | Sarah      | Stein     | IBM     | St                                                                                                                                                    | Koln | 5462      |Address must be between 3 and 128 characters!|

  @wip
  Scenario Outline: Not add address with invalid city
    Given The user is on the Add Address Page
    When The user fills the Add Address form with data "<First Name>" and "<Last Name>" and "<Company>" and "<Address 1>" and "<City>" and "<Post Code>"
    And The user selects country as "Germany"
    And The user selects "Nordrhein-Westfalen" as RegionState
    Then The user clicks continue button and see warning "<Message>"
    Examples:
      | First Name | Last Name | Company | Address 1      | City                                                                                                                              | Post Code |Message|
      | Sarah      | Stein     | IBM     | Steinstrase 10 | mnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyasdmnbvcxyak | 5462      |City must be between 2 and 128 characters!|
      | Sarah      | Stein     | IBM     | Steinstrase 10 | K                                                                                                                                 | 5462      |City must be between 2 and 128 characters!|
      | Sarah      | Stein     | IBM     | Steinstrase 10 |                                                                                                                                   | 5462      |City must be between 2 and 128 characters!|

  @wip
  Scenario Outline: Not add address with invalid postcode
    Given The user is on the Add Address Page
    When The user fills the Add Address form with data "<First Name>" and "<Last Name>" and "<Company>" and "<Address 1>" and "<City>" and "<Post Code>"
    And The user selects country as "Germany"
    And The user selects "Nordrhein-Westfalen" as RegionState
    Then The user clicks continue button and see warning "<Message>"
    Examples:
      | First Name | Last Name | Company | Address 1      | City | Post Code   |Message|
      | Sarah      | Stein     | IBM     | Steinstrase 10 | Koln | 5           |Postcode must be between 2 and 10 characters!|
      | Sarah      | Stein     | IBM     | Steinstrase 10 | Koln | 12345678912 |Postcode must be between 2 and 10 characters!|


  @wip
  Scenario Outline: Not add address without selecting country
    Given The user is on the Add Address Page
    When The user fills the Add Address form with data "<First Name>" and "<Last Name>" and "<Company>" and "<Address 1>" and "<City>" and "<Post Code>"
    And The user does not select any country
    Then The user clicks continue button and see warning "<Message>"
    Examples:
      | First Name | Last Name | Company | Address 1      | City | Post Code |Message|
      | Sarah      | Stein     | IBM     | Steinstrase 10 | Koln | 5462      |Please select a country!|

  @wip
  Scenario Outline: Not add address without selecting region and state
    Given The user is on the Add Address Page
    When The user fills the Add Address form with data "<First Name>" and "<Last Name>" and "<Company>" and "<Address 1>" and "<City>" and "<Post Code>"
    And The user selects country as "Germany"
    And The user does not select any region and state
    Then The user clicks continue button and see warning "<Message>"
    Examples:
      | First Name | Last Name | Company | Address 1      | City | Post Code |Message|
      | Sarah      | Stein     | IBM     | Steinstrase 10 | Koln | 5462      |Please select a region / state!|












