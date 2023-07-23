@B6DGMAUT-22
Feature:  Cat-Subcategory-Compare this Product icon function

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    And The user should be able to login


  Scenario Outline: The user can see the Compare this Product icon by hover overing the product.
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    And The user hover over the "<ProductName>" and see compare icon

    Examples:
      | CategoryName    | ProductName                                           |
      | Health & Beauty | Nicky Clarke Hair Therapy NSS043 Hair Straightener V2 |
      | Networking      | ASUS USB-BT400 - network adapter                      |
      | TV Accessories  | Belkin High Speed HDMI Cable with Ethernet            |


  Scenario Outline: The user can add products to the comparison list when the user clicks the Compare This Product icon.
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    And The user hover over the "<ProductName>" and clicks compare icon
    Then The user clicks product comparison link and see the "<ProductName>" in the page

    Examples:
      | CategoryName    | ProductName                                           |
      | Health & Beauty | Nicky Clarke Hair Therapy NSS043 Hair Straightener V2 |
  #  | Televisions     | Cello C4020F 40" LED-backlit LCD TV        |
      | Networking      | ASUS USB-BT400 - network adapter                      |
      | TV Accessories  | Belkin High Speed HDMI Cable with Ethernet            |


  Scenario Outline: The user should not be able to add the same product more than once to the comparison list.
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    And The user hover over the "<ProductName>" and add two times compare icon
    Then The user clicks product comparison link and see the "<ProductName>" in the page
    Then The user see only one product on the list in product comparison page

    Examples:
      | CategoryName    | ProductName                                           |
      | Health & Beauty | Nicky Clarke Hair Therapy NSS043 Hair Straightener V2 |
 #   | Televisions     | Cello C4020F 40" LED-backlit LCD TV        |
      | Networking      | ASUS USB-BT400 - network adapter                      |
      | TV Accessories  | Belkin High Speed HDMI Cable with Ethernet            |

  @son
  Scenario Outline: The user should not be able to add more than four products to the comparison list.
    Given The user navigates to "<CategoryName>" category
    Then The title is "<CategoryName>"
    And The user hover over the "<Product1>" and "<Product2>" and "<Product3>" and "<Product4>" and "<Product5>" add to comparison
    Then The user clicks product comparison see only four products on the list in product comparison page

    Examples:
      | CategoryName    | Product1                                              | Product2                                    | Product3                                 | Product4                                   | Product5                                                     |
      | Health & Beauty | Nicky Clarke Hair Therapy NSS043 Hair Straightener V2 | eufy P1 Smart Scale Blue and Black          | Fitbit Aria Air Smart Bathroom Scale     | Nicky Clarke NGP201 Hair Dryer Set         | Nicky Clarke NSS111 Classic Ceramic & Tourmaline Straightner |
  #    | Televisions     | Cello C4020F 40" LED-backlit LCD TV                   | Cello C4020DVB 40" LED-backlit LCD TV       | Cello C4020F 40" LED-backlit LCD TV      | Cello C4320F 43" Full HD LED TV            | Daewoo D24RTS 24" HD Ready Smart LED Television              |
      | Networking      | ASUS USB-BT400 - network adapter                      | ASUS ZenWiFi XD6 - Wi-Fi system (2 routers) | Belkin - Network device mounting bracket | BenQ TDY31 - Network adapter               | Broadcom 5720 - Customer Kit                                 |
      | TV Accessories  | Belkin High Speed HDMI Cable with Ethernet            | Belkin adapter cable                        | Belkin Standard HDMI cable               | C2G 3m High Speed HDMI Cable with Ethernet | Belkin video / audio cable                                   |