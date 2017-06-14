Feature: Testing the BBC pages

  Background:
    Given I am on the BBC Home page

  Scenario: Checking the BBC Sports page
    When I click 'SPORT' on the upper navigation bar
    Then I should be redirected to the Sport page

  Scenario: Going to BBC TV page
    When I click 'MORE' on the upper navigation bar
    And On More section I click on 'TV'
    Then I should be redirected to the TV page