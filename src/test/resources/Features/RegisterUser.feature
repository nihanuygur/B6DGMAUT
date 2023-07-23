@B6DGMAUT-3
Feature: Dgmarkt Register Test

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication


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


  Scenario Outline: Preventing registration as a User due to incorrect, incomplete and empty information.
    Given The User is on the Register Page
    When The User registers by entering  "<firstName>" , "<lastName>" ,"<email>" ,"<telephone>", "<password>" and "<passwordConfirm>"
    Then The warning message contains "<message>"
    Examples:
      | firstName                         | lastName                          | email            | telephone                         | password | passwordConfirm | message                                         |
      | abcdefghijklmnoprstuvyzqwxabcdefg | serdan                            | serd16@gmail.com | 05455456576                       | Test120! | Test120!        | First Name must be between 1 and 32 characters! |
      |                                   | serdan                            | serd16@gmail.com | 05455456576                       | Test120! | Test120!        | First Name must be between 1 and 32 characters! |
      | ali                               | abcdefghijklmnoprstuvyzqwxabcdefg | serd16@gmail.com | 05455456576                       | Test120! | Test120!        | Last Name must be between 1 and 32 characters!  |
      | ali                               |                                   | serd16@gmail.com | 05455456576                       | Test120! | Test120!        | Last Name must be between 1 and 32 characters!  |
      | ali                               | serdan                            |                  | 05455456576                       | Test120! | Test120!        | E-Mail Address does not appear to be valid!     |
      | ali                               | serdan                            | serd16gmail.com  | 05455456576                       | Test120! | Test120!        | E-Mail Address does not appear to be valid!     |
      | ali                               | serdan                            | @gmail.com       | 05455456576                       | Test120! | Test120!        | E-Mail Address does not appear to be valid!     |
      | ali                               | serdan                            | serd16@          | 05455456576                       | Test120! | Test120!        | E-Mail Address does not appear to be valid!     |
      | ali                               | serdan                            | serd16@.com      | 05455456576                       | Test120! | Test120!        | E-Mail Address does not appear to be valid!     |
      | ali                               | serdan                            | serd16@gmail     | 05455456576                       | Test120! | Test120!        | E-Mail Address does not appear to be valid!     |
      | ali                               | serdan                            | serd16@gmail.    | 05455456576                       | Test120! | Test120!        | E-Mail Address does not appear to be valid!     |
      | ali                               | serdan                            | serd16@gmail.com |                                   | Test120  | Test120         | Telephone must be between 3 and 32 characters!  |
      | ali                               | serdan                            | serd16@gmail.com | 61                                | Test120! | Test120!        | Telephone must be between 3 and 32 characters!  |
      | ali                               | serdan                            | serd16@gmail.com | 123456789012345678901234567890123 | Test120! | Test120!        | Telephone must be between 3 and 32 characters!  |
      | ali                               | serdan                            | serd16@gmail.com | 05455456576                       |          | Test120!        | Password must be between 4 and 20 characters!   |
      | ali                               | serdan                            | serd16@gmail.com | 05455456576                       | Test120! |                 | Password confirmation does not match password!  |
      | ali                               | serdan                            | serd16@gmail.com | 05455456576                       | 123      | 123             | Password must be between 4 and 20 characters!   |
      | ali                               | serdan                            | serd16@gmail.com | 05455456576                       | 1234     | 12345           | Password confirmation does not match password!  |
      |                                   |                                   |                  |                                   |          |                 | First Name must be between 1 and 32 characters! |


  Scenario: Failure to register as a User when the Privacy Policy checkbox is not clicked
    Given The User is on the Register Page
    When The User registers by entering  "ali" , "serdan" ,"serd16@gmail.com" ,"05455456576 ", "Test01234!" and does not click on the Privacy Policy checkbox
    Then The warning message contains "Warning: You must agree to the Privacy Policy!"


  Scenario: The user cannot re-register with a previously registered e-mail address.
    Given The User is on the Register Page
    When The User registers by entering  "ali" , "serdan" ,"userone@gmail.com" ,"05455456576 ", "Test01234!"
    Then The warning message contains "Warning: E-Mail Address is already registered!"






