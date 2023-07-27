@B6DGMAUT-16
Feature: Cat-Subcategory - Product Compare function

  Users Story: As a user, I should be able to compare the features of the products I want.

  Acceptance Criteria :

  1-*Verify that the User should be able to *navigate the Product Compare Page when the User clicks on the Product Compare sub-Tab.

  2-Verify that the user should be able to see the Products they want to compare on the Product Comparison page

  3-*Verify that the user can *ADD the compared products to the cart separately

  4-Verify that the user can REMOVE the compared products separately

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  @B6DGMAUT-229
  Scenario: *Verify that the User should be able to *navigate the Product Compare Page when the User clicks on the Product Compare sub-Tab.
    Given The user navigates to "Health & Beauty" category
    Then The title is "Health & Beauty"
    When The user clicks to Product Compare button
    Then The user should be able to see Product Comparison title

  @B6DGMAUT-230
  Scenario Outline: Verify that the user should be able to see the Products they want to compare on the Product Comparison page
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    And The user hover over the "<Product1>" and "<Product2>" add to comparison
    Then The user clicks product comparison link and should see the "<Product1>" and "<Product2>" in the page
    Examples:
      | CategoryName    | Product1                      | Product2           |
      | Health & Beauty | BaByliss 3663U - Hair rollers | Capsule Plate 6pcs |

  @B6DGMAUT-231
  Scenario Outline: Verify that the user should be able to see the Products they want to compare on the Product Comparison page
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    And The user hover over the "<Product1>" and "<Product2>" add to comparison
    Then The user clicks product comparison link and should see the "<Product1>" and "<Product2>" in the page
    Then The user clicks the Add to Cart button for each product
    Examples:
      | CategoryName    | Product1                      | Product2           |
      | Health & Beauty | BaByliss 3663U - Hair rollers | Capsule Plate 6pcs |

  @B6DGMAUT-232
  Scenario Outline: Verify that the user can REMOVE the compared products separately
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    And The user hover over the "<Product1>" and "<Product2>" add to comparison
    Then The user clicks product comparison link and should see the "<Product1>" and "<Product2>" in the page
    Then The user clicks the Remove button to remove products
    And The user should not see any products in the page
    Examples:
      | CategoryName    | Product1                      | Product2           |
      | Health & Beauty | BaByliss 3663U - Hair rollers | Capsule Plate 6pcs |


