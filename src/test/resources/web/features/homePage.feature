@HomePage
Feature: As a potential client I need to navigate the Home Page

  Background:
    Given the client is on automationtesting page

  @CheckTotalAndSubtotal
  Scenario: Add to Basket - See values
    When the client clicks on a product's image in new arrivals section
    When the client clicks on Add to Basket button
    When the client clicks on Item button on navbar
    Then the client can view the Total and Subtotal values

  @CheckApplyCoupon
  Scenario: Add to Basket - See Apply Coupon
    When the client clicks on a product's image in new arrivals section
    When the client clicks on Add to Basket button
    When the client clicks on Item button on navbar
    Then the client can view the Apply Coupon button

  @PlaceAnOrder
  Scenario: Place an Order
    When the client clicks on a product's image in new arrivals section
    When the client clicks on Add to Basket button
    When the client clicks on Item button on navbar
    When the client clicks on Proceed to Checkout button
    When the client enters their details in the billing form
    When the client choose check payment method
    When the client clicks on Place Order button
    Then Order Details are shown
