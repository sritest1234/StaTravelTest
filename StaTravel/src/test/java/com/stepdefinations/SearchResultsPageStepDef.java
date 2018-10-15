package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SearchResultsPageStepDef extends AbstractMain {

    @Given("^I should see search results page$")
    public void i_should_see_search_results_page() throws Throwable {
        searchresultspage.is_SearchResultsPage_Displayed();

    }

    @Given("^I change the sort order to Price\\(Low-High\\)$")
    public void i_change_the_sort_order_to_Price_Low_High() throws Throwable {
        searchresultspage.change_Sort_Order_Price();

    }
    @Given("^I select view more button to see more results$")
    public void i_select_view_more_button_to_see_more_results() throws Throwable {
        searchresultspage.select_ViewMore_Button();

    }

    @Then("^I verify the total matches found text is equal to the actual number of results displayed$")
    public void i_verify_the_total_matches_found_text_is_equal_to_the_actual_number_of_results_displayed() throws Throwable {

        Assert.assertTrue("the total matches found text is not equal to the actual number of results displayed ",searchresultspage.get_Total_SearchResults_Count()==searchresultspage.verify_Actual_Results());
    }



}
