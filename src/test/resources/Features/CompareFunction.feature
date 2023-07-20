Feature: Cat-Subcategory - Product Compare function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button
    Given The user is on the home page
    When  The user enters valid credentials
    Then The user should be able to login

  Scenario:
    Given The user navigates to "Health & Beauty" category
    Then The title is "Health & Beauty"
    When The user clicks to Product Compare button
    Then The user should be able to see Product Comparison title