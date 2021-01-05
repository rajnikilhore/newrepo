$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/sdet.feature");
formatter.feature({
  "line": 2,
  "name": "Google Search functionality",
  "description": "I want to use this template for my feature file",
  "id": "google-search-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Search functionality",
  "description": "",
  "id": "google-search-functionality;search-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User navigates to google page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Enter String in search box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Result will display",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_navigates_to_google_page()"
});
formatter.result({
  "duration": 8473642400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Enter_String_in_search_box()"
});
formatter.result({
  "duration": 1505554600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.result_will_display()"
});
formatter.result({
  "duration": 168468200,
  "status": "passed"
});
});