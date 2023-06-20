Feature: Inventory page

  Background:
    Given I open the page Login
    When I input "standard_user" to username field
    And input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory

  @inventory-1
  Scenario: 6 inventory items are displayed
    Then inventory item quantity is 6
    And al inventory items are displayed

  @inventory-2
    @sort_by_name_az
  Scenario: Sorting by name A-Z
    When I choose sorting option by name A-Z
    Then all items names are sorted alphabetically

  @inventory-3
  Scenario:  Sorting by name Z-A
    When I choose sorting option by name Z-A
    Then all items names are sorted in reverse alphabetical

  @inventory-4
  Scenario: Sorting by price from low to high
    When I choose sorting option by price from low to high
    Then all items are sorted by price from low to high

  @inventory-5
  Scenario:  Sorting by price from high to low
    When I choose sorting option by price from high to low
    Then all items are sorted by price from high to low