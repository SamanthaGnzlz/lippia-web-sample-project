@login @TPFinal
Feature: As a potential client I need to log in.

  Background:
    Given the client is on automationtesting page
    When the client clicks on My Account button

@LogInCaseSensitive
  Scenario: Log-in form is case sensitive
    When the client enter username with a case letter in username textbox
    When the client enter password with a case letter in username textbox
    Then log-in failed

  @Authentication
  Scenario: Authentication
    When the client enters username in username box
    When the client enters password in password box
    When the client clicks on login button
    When the client clicks on logout item
    When the client clicks on back button in browser
    Then the client shouldn't be signed in

