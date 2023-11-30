@Register
Feature: Registration

  @failedRegister
  Scenario Outline: Register with <condition>
    Given the client is on automationtesting page
    When the client clicks on My Account button
    When the client enters email <email> in email address textbox
    When the client enters password <password> in password textbox
    Then it displays prompt <prompt>

    Examples:
      | email        | password | condition                      | prompt                                |
      | sam@mail.com |          | empty password                 | Please enter an account password.     |
      |              |          | empty email and empty password | Please provide a valid email address. |