Feature: Invalid Login Scenarios

  Scenario: User not able to login with invalid username
    Given the user is on the login page
    When the user logs in with invalid username "standard" and password "secret_sauce"
    Then an error message indicating invalid username or password is displayed

  Scenario: User not able to login with invalid password
    Given the user is on the login page
    When the user logs in with valid username "standard_user" and invalid password "secret"
    Then an error message indicating invalid username or password is displayed

  Scenario: User not able to login with invalid credentials
    Given the user is on the login page
    When the user logs in with invalid username "standard" and invalid password "secret"
    Then an error message indicating invalid username or password is displayed

  Scenario: User not able to login with empty username and password
    Given the user is on the login page
    When the user logs in with empty username and password
    Then an error message indicating empty username or both fields is displayed

  Scenario: User not able to login with empty username
    Given the user is on the login page
    When the user logs in with empty username and valid password "secret"
    Then an error message indicating empty username or both fields is displayed

  Scenario: User not able to login with empty password
    Given the user is on the login page
    When the user logs in with valid username "standard_user" and empty password
    Then an error message indicating empty password is displayed
