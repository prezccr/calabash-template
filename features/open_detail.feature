@detail
Feature: Open detail feature

  Scenario: Login scenario
    Given I am a logged user
    When I scroll down to item 42
    And I press item 42
    Then I see detail page
