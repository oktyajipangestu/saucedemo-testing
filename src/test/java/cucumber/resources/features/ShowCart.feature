Feature: Show Products

  @POSITIVE
  Scenario: User view all products selected
    Given User on products page to select product
    When user clicks some add buttons
    And User click cart icon
    Then Your cart page is displayed