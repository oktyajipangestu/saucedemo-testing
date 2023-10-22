Feature: Add Product

  @POSITIVE
  Scenario: User adds products to cart
    Given User on Products page
    When User click add button
    Then The number on the cart increases