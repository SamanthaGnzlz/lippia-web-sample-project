@login
Feature: As a potential client I need to log in.

  Background:
    Given the client is on automationtesting page
    When the client clicks on My Account button

  @successfulLogIn
  Scenario: Log-in with valid username and password.
    When the client enters username in username box
    When the client enters password in password box
    When the client clicks on login button
    Then the client is logged in

  @failedLogIn
  Scenario Outline: Log-in with <condition>
    When the client enters username <username> in username box
    When the client enters password <password> in password box
    Then it displays prompt <prompt>

    Examples:
      | username | password   | condition                                 | prompt                                                      |
      | abcd     | 1234       | incorrect username and incorrect password | The password you entered for the username abcd is incorrect |
      | sam2     |            | correct username and empty password       | Password is required                                        |
      |          | }6kK$C;KUK | empty username and valid password         | Username is required                                        |
      |          |            | empty username and empty password         | Username is required                                        |

  @password
  Scenario: Password should be masked
    When the client enters password in password box
    Then the password field should display the characters in bullets

