package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import cucumber.api.java.en.Given;

public class HomePageStepDef extends AbstractMain {

    @Given("^I am in HomePage$")
    public void i_am_in_HomePage() throws Throwable {
        homepage.is_HomePage_Displayed();

    }

    @Given("^I select the country \"([^\"]*)\" from the AJAX$")
    public void i_select_the_country_from_the_AJAX(String country) throws Throwable {
        homepage.select_Country_From_Ajax(country);

    }

    @Given("^I select find a tour button$")
    public void i_select_fina_a_tour_button() throws Throwable {
        homepage.select_Find_A_Tour_Button();

    }
}
