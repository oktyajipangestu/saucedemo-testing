Feature: Logout

  @POSITIVE
  Scenario: User logout from user page
    Given User on user page after login
    When User click menu icon
    And User click logout menu
    Then User redirected to login page