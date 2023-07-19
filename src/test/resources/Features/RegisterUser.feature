Feature: Dgmarkt Register Test

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button
    Given The user is on the home page

  @B6DGMAUT-3
  Scenario Outline: Registering as a User with correct information
    Given The User is on the Register Page
    When The User registers by entering  "<firstName>" , "<lastName>" , "<e-mail>" , "<telephone>" and "<password>"
    Then The User should be able to register
    Examples:
      | firstName                        | lastName                         | e-mail          | telephone                        | password             |
      | a                                | serdan                           | a.123@gmail.com | 04627312307                      | Test0123?            |
      | turanattilametehantomrisalpaslan | serdan                           | b.123@gmail.com | 02124616161                      | Test0123!            |
      | ali                              | b                                | c.123@gmail.com | 02167776644                      | Test0123.            |
      | ali                              | turanattilametehantomrisalpaslan | d.123@gmail.com | 03229994411                      | Test0124?            |
      | ali                              | serdan                           | e.123@gmail.com | 123                              | Test0125!            |
      | murat                            | serdan                           | f.123@gmail.com | 12345678901234567890123456789012 | Test1234?            |
      | tekin                            | serdan                           | g.123@gmail.com | 05614616161                      | a123                 |
      | sungur                           | serdan                           | h.123@gmail.com | 04614611967                      | a1b2c3d4e5f6g7h8j9k! |