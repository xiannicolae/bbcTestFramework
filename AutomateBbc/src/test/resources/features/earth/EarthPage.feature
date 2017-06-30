Feature: BBC Earth page

  Background:
    Given User is on the BBC Home page

  Scenario: User opens the BBC Earth page
    When User clicks 'EARTH' on the upper navigation bar
    Then I should be redirected to the Earth page

  Scenario: Loading one of the first 3 main articles
    When User opens the BBC Earth page
    And User click on the main story no. '3'
    Then The story is successfully loaded

  Scenario: Social Media options on BBC Earth page
    When User opens the BBC Earth page
    Then User can see the Social Media options to follow BBC Earth
    | Facebook  |
    | Twitter   |
    | Youtube   |
    | Instagram |

