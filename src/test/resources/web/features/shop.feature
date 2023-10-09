@Shop
Feature: As a potential client I need to use the Shop.

  Background:
    Given the client is on automationtesting page
    When the client clicks on Shop button

  @categories
  Scenario: Filter By Categories - HTML option
    When the client clicks on HTML from Product Categories
    Then the client can view products from HTML category

  @Sort
  Scenario Outline: Sort by <filter>
    When the client clicks on <option> the sorting dropdown
    Then the client can view the products sorted by <filter>

    Examples:
      | filter      | option                     |
      | low to high | Sort by price: low to high |
      | high to low | Sort by price: high to low |

  @sale
  Scenario: Sale Functionality
    When the client clicks on a product with Sale! tag
    Then the client can view both sale price and full price