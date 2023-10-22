Feature: Login

  @POSITIVE
  Scenario: User login with valid username & password
    Given User on login page
    When User input username
    And User input password
    And User Click Login Button
    Then User redirected to Dashboard Page

  @NEGATIVE
  Scenario: User login with invalid username & password
    Given User on login page
    When User input invalid username
    And User input invalid password
    And User Click Login Button
    Then User get Error message
