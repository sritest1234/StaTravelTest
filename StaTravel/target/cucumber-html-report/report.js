$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VerifySearchResults.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the Search Results",
  "description": "",
  "id": "verify-the-search-results",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4830228090,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify if the “X matches found” text is equal to the actual number of results displayed",
  "description": "",
  "id": "verify-the-search-results;verify-if-the-“x-matches-found”-text-is-equal-to-the-actual-number-of-results-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select the country \"India\" from the AJAX",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I select find a tour button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see search results page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I change the sort order to Price(Low-High)",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select view more button to see more results",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify the total matches found text is equal to the actual number of results displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_in_HomePage()"
});
formatter.result({
  "duration": 81512025,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 22
    }
  ],
  "location": "HomePageStepDef.i_select_the_country_from_the_AJAX(String)"
});
formatter.result({
  "duration": 1336282095,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_select_fina_a_tour_button()"
});
formatter.result({
  "duration": 3330288678,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepDef.i_should_see_search_results_page()"
});
formatter.result({
  "duration": 5719315,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepDef.i_change_the_sort_order_to_Price_Low_High()"
});
formatter.result({
  "duration": 181413206,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepDef.i_select_view_more_button_to_see_more_results()"
});
formatter.result({
  "duration": 281043369,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepDef.i_verify_the_total_matches_found_text_is_equal_to_the_actual_number_of_results_displayed()"
});
formatter.result({
  "duration": 220755471,
  "status": "passed"
});
formatter.after({
  "duration": 117461875,
  "status": "passed"
});
});