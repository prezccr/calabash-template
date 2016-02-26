Feature: Login feature

  Scenario Outline: Login scenario
    Given I am on the Login screen
    When I enter my credentials <login> and <password>
    And I press login button
    Then I see Logged screen

  Examples:
    | login | password |
    | user1 | password1 |