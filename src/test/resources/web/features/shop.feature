@Shop
Feature: As a potential client I need to use the Shop.

  Background:
    Given the client is on automationtesting page
    When the client clicks on Shop button

   @TaxFunctionality
  Scenario Outline: Tax Functionality
      When the client clicks on Add to Basket button on a product
      When the client clicks on Item button on navbar
      When the client clicks on Proceed to Checkout button
      When the client enter <country> on country textbox
      Then tax rate should be <percentage>% for <country>

      Examples:
        | country   | percentage |
        | India     | 2          |
        | Argentina | 5          |


  @MenuItemLink
      Scenario: View Basket through Item link
        When the client clicks on Add to Basket button on a product
        When the client clicks on Item button on navbar
        When the client clicks on Proceed to Checkout button
        When the client enters their details in the billing form
        When the client choose check payment method
        When the client clicks on Place Order button
        Then Order Details are shown