@myAccount
Feature: As a potential client I want to view my account's information.

  Background:
    Given the client is on automationtesting page
    When the client clicks on My Account button
    When the client enters username in username box
    When the client enters password in password box
    When the client clicks on login button

  @dashboard
  Scenario: Dashboard
    When the client clicks on Dashboard item
    Then the client can view the Dashboard page

  @accountDetails
  Scenario: Account Details
    When the client clicks on Account Details item
    Then the client can view the Account Details page where they can change their information

  @address
  Scenario: Address
    When the client clicks on Addresses item
    Then the client can view the Billing Address and Shipping Address
