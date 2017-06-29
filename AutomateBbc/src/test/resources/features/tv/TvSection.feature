Feature: Testing the BBC TV page

  Background:
    Given User is on the BBC Home page

  Scenario: Going to BBC TV page
    When User clicks 'MORE' on the upper navigation bar
    And On More section user clicks on 'TV'
    Then User should be redirected to the TV page



