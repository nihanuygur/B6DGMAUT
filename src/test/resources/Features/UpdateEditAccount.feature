@B6DGMAUT-8
Feature: Update Edit Account

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the Edit Account login
    And The user should be able to login
    Given The user clicks on the My Account button
    When The user clicks on the Edit Account button

  @B6DGMAUT-83
  Scenario: User can update their account with valid First Name, Last Name, E-Mail and Telephone Number
    Given The user updates the First Name as "Tahir"
    When The user updates the Last Name as "Asim"
    Given The user updates the email as "tarik@gmail.com"
    When The user updates the telephone number as "12345678901234"
    And The user clicks on the Continue button
    Then The user updates their account successfully
    And Change the default credentials for the Edit Account

  @B6DGMAUT-84
  Scenario: User can turn back without update their account
    Given The user updates the First Name as "Tatar"
    When The user updates the Last Name as "Atik"
    Given The user updates the email as "atik@gmail.com"
    When The user updates the telephone number as "12345678901234"
    And The user clicks on the Back button
    Then The user can see the Edit Account without changes

  @B6DGMAUT-85
  Scenario: User can't update their account with blank First Name
    Given The user updates the First Name as blank
    When The user updates the Last Name as "Asim"
    Given The user updates the email as "atiktamer@gmail.com"
    When The user updates the telephone number as "1234567890123"
    And The user clicks on the Continue button
    Then The user should not be able to update their Edit Account with blank First Name

  @B6DGMAUT-86
  Scenario: User can't update their account with blank Last Name
    Given The user updates the First Name as "Talllmmm"
    When The user updates the Last Name as blank
    Given The user updates the email as "tarikasim@gmail.com"
    When The user updates the telephone number as "12345678901234"
    And The user clicks on the Continue button
    Then The user should not be able to update their Edit Account with blank Last Name

  @B6DGMAUT-87
  Scenario: User can't update their account with blank E-Mail
    Given The user updates the First Name as "degTekekdggggggg"
    When The user updates the Last Name as "TTTTT"
    Given The user updates the email as blank
    When The user updates the telephone number as "12345678901234"
    And The user clicks on the Continue button
    Then The user should not be able to update their Edit Account with blank email

  @B6DGMAUT-88
  Scenario: User can't update their account with invalid E-Mail
    Given The user updates the First Name as "dgerewgredsac vbdegTekekdggggggg"
    When The user updates the Last Name as "TTTTT"
    Given The user updates the email as "turgayakc%&ay@gmail.com"
    When The user updates the telephone number as "12345678"
    And The user clicks on the Continue button
    Then The user should not be able to update their Edit Account with invalid E-Mail

  @B6DGMAUT-89
  Scenario: User can't update their account with invalid (boundry) First Name
    Given The user updates the First Name as "ertetsdffgdfgdfhdg hredsxbghjkuzt"
    When The user updates the Last Name as "A"
    Given The user updates the email as "tarikasim@gmail.com"
    When The user updates the telephone number as "12345678"
    And The user clicks on the Continue button
    Then The user should not be able to update their Edit Account with invalid First Name

  @B6DGMAUT-90
  Scenario: User can't update their account with invalid (boundry) Last Name
    Given The user updates the First Name as "Be"
    When The user updates the Last Name as "ertetsdffgdfgdfhdg hredsxbghjkuzt"
    Given The user updates the email as "tarikasim@gmail.com"
    When The user updates the telephone number as "12345678"
    And The user clicks on the Continue button
    Then The user should not be able to update their Edit Account with invalid Last Name

  @B6DGMAUT-91
  Scenario: User can't update their account with invalid (boundry) Telephone
    Given The user updates the First Name as "Be"
    When The user updates the Last Name as "LOL"
    Given The user updates the email as "tarikasim@gmail.com"
    When The user updates the telephone number as "123456789012345678901234567890123"
    And The user clicks on the Continue button
    Then The user should not be able to update their Edit Account with invalid Telephone


  #@B6DGMAUT-911
  #Scenario: User can update their account with valid First Name, Last Name, E-Mail and Telephone Number
    #Given The user updates the First Name as "user2"
    #When The user updates the Last Name as "one2"
    #Given The user updates the email as "userone2@gmail.com"
    #When The user updates the telephone number as "9876543210"
    #And The user clicks on the Continue button
    #Then The user updates their account successfully