@B6DGMAUT-22
Feature:  Cat-Subcategory-Compare this Product icon function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    And The user should be able to login


  Scenario Outline: The user can see the Compare this Product icon by hover overing the product.
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    And The user hover over the product and clicks compare icon

    Examples:
      | Category Name   |
      | Health & Beauty |
#      | Televisions     |
#      | Networking      |
#      | TV Accessories  |


  Scenario Outline: The user can add products to the comparison list when the user clicks the Compare This Product icon.
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    And The user hover over the product and clicks compare icon
    Then The user clicks product comparison link and see the product in the page

    Examples:
      | Category Name   |
      | Health & Beauty |
##      | Televisions     |
##      | Networking      |
##      | TV Accessories  |

  @son
  Scenario Outline: The user should not be able to add the same product more than once to the comparison list.
    Given The user navigates to "<Category Name>" category
    Then The title is "<Category Name>"
    And The user hover over the product and clicks compare icon
   Then The user close pop up message
     And The user hover over the product and clicks compare icon
  Then The user clicks product comparison link and see the product in the page
  Then The user see only one product on the list in product comparison page
    Examples:
      | Category Name   |
      | Health & Beauty |
#      | Televisions     |
#      | Networking      |
#      | TV Accessories  |