Feature: Dgmarkt Register Test

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication


  @B6DGMAUT-3
  Scenario Outline: Registering as a User with correct information
    Given The User is on the Register Page
    When The User registers by entering  "<firstName>" , "<lastName>" , "<telephone>" and "<password>"
    Then The User should be able to register
    Examples:
      | firstName                        | lastName                         | telephone                        | password             |
      | a                                | serdan                           | 04627312307                      | Test0123?            |
      | turanattilametehantomrisalpaslan | serdan                           | 02124616161                      | Test0123!            |
      | ali                              | b                                | 02167776644                      | Test0123.            |
      | ali                              | turanattilametehantomrisalpaslan | 03229994411                      | Test0124?            |
      | ali                              | serdan                           | 123                              | Test0125!            |
      | murat                            | serdan                           | 12345678901234567890123456789012 | Test1234?            |
      | tekin                            | serdan                           | 05614616161                      | a123                 |
      | sungur                           | serdan                           | 04614611967                      | a1b2c3d4e5f6g7h8j9k! |