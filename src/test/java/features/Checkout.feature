@checkout
  Feature: Checkout
    Background:
      Given I open the page Login
      When I input "standard_user" to username field
      And input "secret_sauce" to password field
      When I push the Login button
      Then I am on the page Inventory

    @checkout-1
    Scenario: Success backpack purchase
      When I push Add to cart button of backpack
      And I push the Card icon
      Then I am on the page YourCard
      When I push Checkout button
      Then I am on the page Checkout Your Information
      When I input "jhgj" to First name field
      And I input "jhgj" to Last name field
      And I input "87654" to Zip/postal code field
      When I push Continue button
      Then I am on the page Checkout: Overview
      When I push Finish button
      Then message with text "Thank you for your order!" is displayed