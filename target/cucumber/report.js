$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Search.feature");
formatter.feature({
  "name": "This is a feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "This is a scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NotCompleted"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \"https://www.google.com.tr/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search for \"abc\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.java:22"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see relevant search results",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.java:28"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "This is another scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@IamSomeRandomTag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on \"https://www.google.com.tr/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.java:17"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click search for \"abc\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.java:22"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I log these variable to the screen",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I should see systemout for \"output 1\" and \"output 2\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.java:31"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "This is a new scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to write \"sd\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.java:34"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I whatever",
  "keyword": "When "
});
formatter.match({
  "location": "SearchSteps.java:37"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "whatever II",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.java:40"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});