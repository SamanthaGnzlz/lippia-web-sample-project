@Smoke
Feature: As a potential client i need to search in google to find a web site

  @Search
  Scenario Outline: The client search by <criteria>
    Given The client is on google page
    When The client search for word <criteria>
    Then The client verify that results are shown properly

    Examples:
      | criteria        |
      | Crowdar Academy |
      | Calidad         |
      | Software        |
      | Testing         |

