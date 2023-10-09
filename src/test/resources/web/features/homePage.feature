@HomePage
Feature: As a potential client I need to navigate the Home Page

  Background:
    Given the client is on automationtesting page
    When the client clicks on Shop button
    When the client clicks on Home button

  @arrivals @tp3
  Scenario: Home page with three Arrivals only
    Then the client can view the three Arrivals

  @arrivals
  Scenario: Images in Arrivals should navigate
    When the client clicks on a product's image in new arrivals section
    Then the client is on the book page and can add it to the basket

  @reviews
  Scenario: Products have Reviews
    When the client clicks on a product's image in new arrivals section
    When the client clicks on Reviews button
    Then the product's review are shown
