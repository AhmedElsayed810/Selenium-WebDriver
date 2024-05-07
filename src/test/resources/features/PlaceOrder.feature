Feature: User places an order with valid credentials

  Scenario: User places an order successfully
    Given the user is logged in with username "your_username" and password "your_password"
    When the user adds the most expensive products to the cart
    When navigates to the cart
    When proceeds to checkout with first name "John", last name "Doe", and postal code "12345"
    When completes the order
    Then the thank you message and order dispatched confirmation are displayed
