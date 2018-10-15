Feature: Verify the Search Results
@test
  Scenario: Verify if the “X matches found” text is equal to the actual number of results displayed

    Given I am in HomePage
    And   I select the country "India" from the AJAX
    And   I select find a tour button
    And   I should see search results page
    And   I change the sort order to Price(Low-High)
    And   I select view more button to see more results
    Then  I verify the total matches found text is equal to the actual number of results displayed