@B6DGMAUT-13
Feature: Select Sub-Category

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page

  @B6DGMAUT-92
  Scenario: User can go to the Category button to see the Sub-Category page without clicking
    Given  The user moves to Category button
    When The user can see the sub categories

  @B6DGMAUT-93
  Scenario: User can click on the 'Health & Beauty' sub-button under the Category button
    Given  The user moves to Category button
    When The user clicks on the Health & Beauty sub-button
    Then The user is on the Health & Beauty page

  @B6DGMAUT-94
  Scenario: User can click on the 'Televisions' sub-button under the Category button
    Given  The user moves to Category button
    When The user clicks on the Televisions sub-button
    Then The user is on the Televisions page

  @B6DGMAUT-95
  Scenario: User can click on the 'TV Accessories' sub-button under the Category button
    Given  The user moves to Category button
    When The user clicks on the TV Accessories sub-button
    Then The user is on the TV Accessories page

  @B6DGMAUT-96
  Scenario: User can click on the 'Networking' sub-button under the Category button
    Given  The user moves to Category button
    When The user clicks on the Networking sub-button
    Then The user is on the Networking page