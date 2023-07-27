Feature: Verifies that the user can change the password
  Users Story: As a user, I should be able to change the password by clicking the Password tab under the My Account module.

  Acceptance Criteria :

  1-Verifies that the user can *change the password.

  2-Verifies error message *when user can't confirm password

  3-Verify error message when is given the same password

  4-Verify error message with blank inputboxes

  5-Verify error message when is password out of boundary

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Then The user should be able to login

  Scenario Outline:
    Given The user clicks My Account menu and navigates to My Account Page
    Then  The page is "Change Password"
    When  User click on "Change your password" under My Account
    And   User enter "<Password>" and "<Password Confirm>"
    Then  The user see the <message>

    Examples:
      | Password | Password Confirm | message                                               |
      | eurotech | eurotech         | Success: Your password has been successfully updated. |
      |          |                  | "Password must be between 4 and 20 characters!"       |
      |          | new1234          | Password confirmation does not match password!        |
      | new1234  |                  | Password confirmation does not match password!        |



