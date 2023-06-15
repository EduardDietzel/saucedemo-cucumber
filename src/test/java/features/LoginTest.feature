@login
Feature: Login

  Background:
    Given I open the page Login

  @login-1
  Scenario: Success login
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

#  @login-2
#  Scenario: Login with invalid data
#    Given I open the page Login
#    When I input "standard_user" to username field
#    And input "jhfhfghk" to password field
#    When I push the Login button
#    Then error with text "Username and password do not match any user in this service" is displayed
#
#  @login-3
#  Scenario: Login with locked out user
#    Given I open the page Login
#    When I input "locked_out_user" to username field
#    And input "secret_sauce" to password field
#    When I push the Login button
#    Then error with text "Sorry, this user has been locked out." is displayed

  @login-4
  Scenario Outline: Login with invalid user
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error with text "<errorMessageText>" is displayed
    Examples:
      |username         |password      |errorMessageText                                            |
      |standard_user    |jhfhfghk      |Username and password do not match any user in this service |
      |locked_out_user  |secret_sauce  |Sorry, this user has been locked out.                       |

#  @login-5
#  Scenario: Login with empty username
#    Given I open the page Login
#    When I input "" to username field
#    And input "secret_sauce" to password field
#    When I push the Login button
#    Then error with text "Username is required" is displayed
#
#  @login-6
#  Scenario: Login with empty password
#    Given I open the page Login
#    When I input "standard_user" to username field
#    And input "" to password field
#    When I push the Login button
#    Then error with text "Password is required" is displayed

  @login-7
  Scenario Outline: Login with empty fields
    When I input "<username>" to username field
    And input "<password>" to password field
    When I push the Login button
    Then error with text "<errorMessageText>" is displayed
    Examples:
      |username         |password       |errorMessageText                   |
      |                 |secret_sauce   |Username is required               |
      |standard_user    |               |Password is required               |

  @login-8
  Scenario: Success logout
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory
    And click on burger menu
    When I follow the Logout link
    Then I am on the page Login