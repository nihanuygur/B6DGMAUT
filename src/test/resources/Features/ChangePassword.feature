@B6DGMAUT-9
Feature: Verifies that the user can change the password
  Users Story: As a user, I should be able to change the password by clicking the Password tab under the My Account module.

  Acceptance Criteria :

  1-Verifies that the user can change the password.

  2-Verifies error message when user can't confirm password

  3-Verify error message when is given the same password

  4-Verify error message with blank inputboxes

  5-Verify error message when is password out of boundary

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page

  @B6DGMAUT-246
  Scenario Outline: Verifies that the user can change the password.
    Given The user enters valid credentials "user4@gmail.com" and "123456" for login
    Then The user should be able to login
    Given The user clicks My Account menu and navigates to My Account Page
    When  User click on "Change your password" under My Account
    Then  Verify that the user is on the "Change Password" page
    And   User in "Password" add "<Password>"
    And   User in "Password Confirm" add "<Password Confirm>"
    Then  The user click Continue button and can see the "<message>"
    And   Change the default credentials go to "Change your password" and "123456" and "123456" for the change Password
    Examples:
      | Password | Password Confirm | message                                               |
      | eurotech | eurotech         | Success: Your password has been successfully updated. |


  @B6DGMAUT-247
  Scenario Outline: Verify error message with blank inputboxes.
    Given The user enters valid credentials "user4@gmail.com" and "123456" for login
    Then The user should be able to login
    Given The user clicks My Account menu and navigates to My Account Page
    When  User click on "Change your password" under My Account
    Then  Verify that the user is on the "Change Password" page
    And   User in "Password" add "<Password>"
    And   User in "Password Confirm" add "<Password Confirm>"
    Then  The user click Continue button and can see the "<message>"

    Examples:
      | Password | Password Confirm | message                                        |
      |          |                  | Password must be between 4 and 20 characters!  |
      |          | new1234          | Password must be between 4 and 20 characters!  |
      | new1234  |                  | Password confirmation does not match password! |


