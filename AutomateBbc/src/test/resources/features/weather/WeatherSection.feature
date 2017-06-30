Feature: BBC Weather page

  Background:
    Given User is on the BBC Home page

  Scenario: Going to Weather page
    When User clicks 'WEATHER' on the upper navigation bar
    Then User should be redirected to the Weather page

  Scenario: Comparing temperatures from 2 different locations
    And User opens the BBC Weather page
    When User searches for 'Paris, France' Forecast
    And User checks tomorrow max temperature for 'Paris, France'
    And User searches for 'Gibraltar, Gibraltar' Forecast
    And User checks tomorrow max temperature for 'Gibraltar, Gibraltar'
    Then User gets which is the hottest location tomorrow