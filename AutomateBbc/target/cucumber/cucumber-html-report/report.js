$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the BBC pages",
  "description": "",
  "id": "testing-the-bbc-pages",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4211919561,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the BBC Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageSteps.goOnTheHomePage()"
});
formatter.result({
  "duration": 7910740037,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Checking the BBC Sports page",
  "description": "",
  "id": "testing-the-bbc-pages;checking-the-bbc-sports-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I click \u0027SPORT\u0027 on the upper navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be redirected to the Sport page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SPORT",
      "offset": 9
    }
  ],
  "location": "topHeaderSteps.clickOnUpperNav(topHeaderInterface$MainMenuSections)"
});
formatter.result({
  "duration": 10220781986,
  "status": "passed"
});
formatter.match({
  "location": "sportsPageSteps.checkIfOnSportsPage()"
});
formatter.result({
  "duration": 102967026,
  "status": "passed"
});
formatter.after({
  "duration": 1401901078,
  "status": "passed"
});
formatter.before({
  "duration": 2459163813,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on the BBC Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "homePageSteps.goOnTheHomePage()"
});
formatter.result({
  "duration": 6438053475,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Going to BBC TV page",
  "description": "",
  "id": "testing-the-bbc-pages;going-to-bbc-tv-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I click \u0027MORE\u0027 on the upper navigation bar",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "On More section I click on \u0027TV\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should be redirected to the TV page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "MORE",
      "offset": 9
    }
  ],
  "location": "topHeaderSteps.clickOnUpperNav(topHeaderInterface$MainMenuSections)"
});
formatter.result({
  "duration": 274060639,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TV",
      "offset": 28
    }
  ],
  "location": "topHeaderSteps.clickOnMoreMenuNav(topHeaderInterface$MoreMenuSections)"
});
formatter.result({
  "duration": 2790160797,
  "status": "passed"
});
formatter.match({
  "location": "tvPageSteps.checkIfOnTvPage()"
});
formatter.result({
  "duration": 79952113,
  "status": "passed"
});
formatter.after({
  "duration": 1467248450,
  "status": "passed"
});
});