Feature: Cart
  As a user
  I can manage items in cart
  So that I can proceed to checkout

  Scenario: As a user I can add item to the cart
    Given I am on the login page
    When I input valid username
    And I input valid password
    And I click login button
    And I add item to the cart
    Then the item is added to the cart
