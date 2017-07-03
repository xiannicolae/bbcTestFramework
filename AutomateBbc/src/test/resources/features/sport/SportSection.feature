Feature: BBC Sport page

  Background:
    Given User is on the BBC Home page

  Scenario: Checking the BBC Sports page
    When User clicks 'SPORT' on the upper navigation bar
    Then User should be redirected to the Sport page

  Scenario Outline: Opening the most commented article on different sports
    When User opens the BBC Sport page
    And User clicks on main navigation section <Sport>
    Then User clicks on the most commented sport article
    And The sport article is successfully loaded

    Examples:
    | Sport     |
    | Football  |
    | Formula_1 |
    | Tennis    |