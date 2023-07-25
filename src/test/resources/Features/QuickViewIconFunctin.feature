@B6DGMAUT-20
Feature: Cat-Subcategory-Quick View icon function

  Users Story: As a user, I should be able to browse and act on the product privately by clicking the quick view icon.

  Acceptance Criteria:

  1- Verify that when the user hovers over the product, they can see the quick view icon.

  *2-*Verify that the user can browse the product when the user clicks the quick view icon

  3- Verify that the user can add the product to their wish lis*t when the user *clicks Add to Wish List icon from the quick view popup.

  4- Verify that the user can add the product to their compare list when the user clicks Compare this Product icon from the quick view popup

  5-*Verify that the user can *add the product to their cart when the user clicks Add to Cart button from the quick view popup

  6-Verify that the user can increase the number of the products to add to the cart by filling the box from the quick view popup

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  @B6DGMAUT-157
  Scenario Outline: Verify that when the user hovers over the product, they can see the quick view icon.
    Given The user navigates to "<Category Name>" category
    When  User hover over the Product "<Product>"
    Then  Verify that user can see "Quick View"
    Examples:
      | Category Name   | Product              |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |

  @B6DGMAUT-158
  Scenario Outline: Verify that the user can browse the product when the user clicks the quick view icon
    Given User choose Category "<Category Name>"
    When The user hover over "<Product>" product and clicks to the "Quick View" icon
    Then Verify that the user can browse the product
    Examples:
      | Category Name   | Product              |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |

  @B6DGMAUT-159
  Scenario Outline: Verify that the user can add the product to their wish lis*t when the user *clicks Add to Wish List icon from the quick view popup.
    Given User choose Category "<Category Name>"
    When The user hover over "<Product>" product and clicks to the "Quick View" icon
    Then Verify that the user can browse the product
    And The user clicks to "Add to Wish List" button
    When The user clicks wish list! link from pop-up message and closes the message
    Then The user should see that the "<Product>" has been added to the Wish List page
    Examples:
      | Category Name   | Product              |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |

  @B6DGMAUT-160
  Scenario Outline: Verify that the user can add the product to their compare list when the user clicks Compare this Product icon from the quick view popup
    Given User choose Category "<Category Name>"
    When The user hover over "<Product>" product and clicks to the "Quick View" icon
    Then Verify that the user can browse the product
    And The user clicks to "Compare this Product" button
    Then The user clicks product comparison link and see the "<Product>" in the page
    Examples:
      | Category Name   | Product              |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |

  @B6DGMAUT-161
  Scenario Outline: Verify that the user can *add the product to their cart when the user clicks Add to Cart button from the quick view popup
    Given User choose Category "<Category Name>"
    When The user hover over "<Product>" product and clicks to the "Quick View" icon
    Then Verify that the user can browse the product
    And The user clicks to Add To Cart button
    When The user clicks shopping cart! link from pop-up message and closes the message
    Then The user should see that the "<Product>" has been added to the Shopping Cart page
    Examples:
      | Category Name   | Product              |
      | Health & Beauty | Capsule Plate 6pcs   |
      | Televisions     | Cello C2420G         |
      | Networking      | ASUS ZenWiFi XD6     |
      | TV Accessories  | Belkin adapter cable |

  @B6DGMAUT-162
  Scenario Outline: Verify that the user can increase the number of the products to add to the cart by filling the box from the quick view popup
    Given User choose Category "<Category Name>"
    When The user hover over "<Product>" product and clicks to the "Quick View" icon
    Then Verify that the user can browse the product
    And The user enters quantity as "<Quantity>"
    And The user clicks to Add To Cart button
    Then The user should see that quantity is increased by "<Quantity>"
    Examples:
      | Category Name   | Product              | Quantity |
      | Health & Beauty | Capsule Plate 6pcs   | 5        |
      | Televisions     | Cello C2420G         | 6        |
      | Networking      | ASUS ZenWiFi XD6     | 15       |
      | TV Accessories  | Belkin adapter cable | 3        |
